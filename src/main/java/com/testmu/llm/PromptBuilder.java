package com.testmu.llm;

public final class PromptBuilder {

    private PromptBuilder() {
    }

    public static String build(String testName,
                               Throwable throwable,
                               String url) {

        return """
You are an Expert QA Automation Engineer.

Analyze the failed automation test.

Provide:

1. Root Cause
2. Suggested Fix
3. Confidence (High/Medium/Low)

Test:
%s

Current URL:
%s

Exception:
%s

Keep the answer within 150 words.
"""
                .formatted(
                        testName,
                        url,
                        throwable.toString()
                );
    }

}