package com.testmu.api.client;

import com.testmu.config.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public final class RestClient {

    private RestClient() {
    }

    static {
        RestAssured.baseURI = ConfigReader.get("api.base.url");
    }

    public static Response get(String endpoint) {

        return given()

                .contentType("application/json")

                .when()

                .get(endpoint);

    }

    public static Response delete(String endpoint) {

        return given()

                .contentType("application/json")

                .when()

                .delete(endpoint);

    }

    public static Response post(String endpoint, Object body) {

        return given()

                .contentType("application/json")

                .body(body)

                .when()

                .post(endpoint);

    }

    public static Response put(String endpoint, Object body) {

        return given()

                .contentType("application/json")

                .body(body)

                .when()

                .put(endpoint);

    }

}