# AI Usage Log

## Model

Gemini 2.5 Flash

## Purpose

Analyze failed Selenium and REST Assured automation tests.

## Prompt Strategy

The framework sends:

- Test Name
- Current URL
- Exception
- Failure Stack Trace

Gemini returns:

- Root Cause
- Suggested Fix
- Confidence

The response is attached to the Extent Report for debugging assistance.