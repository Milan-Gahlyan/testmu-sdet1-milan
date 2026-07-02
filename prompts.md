# Prompt Engineering Log

This document contains every prompt used during the development of the AI-assisted automation framework.

The prompts are listed in chronological order exactly as they were used during development, along with observations and refinements.

---

# Module 1 – Login Test Generation

## Prompt Version 1

Generate Selenium test cases for the OrangeHRM Login page.

Cover:
- Valid Login
- Invalid Login
- Empty Username
- Empty Password
- Logout

Generate them in Gherkin format.

---

### Observation

The generated scenarios covered only basic positive and negative flows.

Missing:

- Forgot Password
- Invalid Username
- Invalid Password
- Session related scenarios

---

## Prompt Version 2

Generate comprehensive Selenium automation test cases for the OrangeHRM Login module.

Requirements:

- Positive scenarios
- Negative scenarios
- Boundary scenarios
- Validation scenarios

Return the result in Gherkin format.

---

### Observation

The output was much more complete and covered validation scenarios that were initially missing.

The refined prompt was used to create the final Login test scenarios.

---

# Module 2 – Dashboard Test Generation

## Prompt Version 1

Generate Dashboard test cases for OrangeHRM.

---

### Observation

The generated output was too generic.

It included several scenarios that could not be automated on the public demo environment.

---

## Prompt Version 2

Generate Dashboard automation test cases for OrangeHRM.

Only include scenarios that are realistic for the public demo application.

Focus on:

- Navigation
- Menu validation
- Dashboard widgets
- User menu
- Logout
- Page visibility

Return in Gherkin format.

---

### Observation

The generated scenarios closely matched the available functionality of the demo application.

These scenarios were selected for implementation.

---

# Module 3 – REST API Test Generation

## Prompt Version 1

Generate REST Assured CRUD test cases for Restful Booker.

---

### Observation

Only CRUD operations were generated.

Authentication flow was missing.

---

## Prompt Version 2

Generate production-style REST Assured API test cases for Restful Booker.

Include:

- Authentication
- Create Booking
- Get Booking
- Update Booking
- Delete Booking

Generate independent automation scenarios.

---

### Observation

The refined prompt produced reusable automation scenarios and included authentication before update and delete operations.

---

# Module 4 – AI Failure Analysis

## Prompt Version 1

Analyze the following failed Selenium automation test.

Return the root cause.

---

### Observation

The response was inconsistent.

Sometimes the model returned paragraphs instead of structured information.

---

## Prompt Version 2

You are an Expert QA Automation Engineer.

Analyze the failed automation test.

Provide:

1. Root Cause

2. Suggested Fix

3. Confidence (High / Medium / Low)

Test Name:
<TEST_NAME>

Current URL:
<CURRENT_URL>

Exception:
<STACK_TRACE>

Keep the response within 150 words.

---

### Observation

The response became much more structured and easier to display inside the Extent Report.

This prompt was selected for the final implementation.

---

# Final Production Prompt

You are an Expert QA Automation Engineer.

Analyze the failed automation test.

Provide:

- Root Cause
- Suggested Fix
- Confidence

Input includes:

- Test Name
- Current URL
- Exception
- Failure Message

Return concise and actionable recommendations suitable for inclusion in an automation report.

---

# Summary

## Number of prompt iterations

- Login Module : 2
- Dashboard Module : 2
- REST API Module : 2
- Failure Analysis : 2

Total Prompt Iterations: 8

---

# Key Learning

Prompt refinement significantly improved the quality of generated output.

Adding clear constraints (module scope, expected format, and response structure) reduced ambiguity and produced responses that could be directly integrated into the automation framework.