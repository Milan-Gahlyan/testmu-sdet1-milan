/*
 Assignment Task 2

 I chose the "AI-assisted failure analysis" approach instead of
 AI-generated test creation because it integrates directly into the
 execution pipeline. When a test fails, Gemini analyzes the failure,
 identifies the probable root cause, and suggests a fix.

 This provides immediate debugging assistance without modifying or
 generating test code, making it more practical for day-to-day
 automation workflows.
*/

package com.testmu.llm;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testmu.config.ConfigReader;
import okhttp3.*;

import java.io.IOException;

public final class GeminiClient {

    private static final OkHttpClient client =
            new OkHttpClient.Builder()
                    .connectTimeout(java.time.Duration.ofSeconds(30))
                    .readTimeout(java.time.Duration.ofSeconds(60))
                    .writeTimeout(java.time.Duration.ofSeconds(30))
                    .build();

    private static final ObjectMapper mapper =
            new ObjectMapper();

    private GeminiClient() {
    }

    public static AIAnalysis analyze(String prompt) {

        try {

            String apiKey =
                    ConfigReader.get("gemini.api.key");

            String model =
                    ConfigReader.get("gemini.model");

            String url =
                    "https://generativelanguage.googleapis.com/v1beta/models/"
                            + model
                            + ":generateContent?key="
                            + apiKey;

            String json =
                    """
                    {
                      "contents":[
                        {
                          "parts":[
                            {
                              "text":%s
                            }
                          ]
                        }
                      ]
                    }
                    """
                            .formatted(
                                    mapper.writeValueAsString(prompt)
                            );

            RequestBody body =
                    RequestBody.create(
                            json,
                            MediaType.parse("application/json"));

            Request request =
                    new Request.Builder()
                            .url(url)
                            .post(body)
                            .build();

            Response response =
                    client.newCall(request).execute();

            if (!response.isSuccessful()) {

                return new AIAnalysis(
                        "Gemini API Error : "
                                + response.code());

            }

            String responseBody =
                    response.body().string();

            JsonNode root =
                    mapper.readTree(responseBody);

            String text =
                    root.path("candidates")
                            .get(0)
                            .path("content")
                            .path("parts")
                            .get(0)
                            .path("text")
                            .asText();

            return new AIAnalysis(text);

        } catch (IOException e) {

            e.printStackTrace();

            return new AIAnalysis(
                    e.toString()
            );

        }

    }

}