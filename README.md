# TestMu SDET Assignment – AI Powered Test Automation Framework

## Overview

This repository contains my submission for the TestMu SDET Assignment.

The project demonstrates a hybrid automation framework built using Java that combines:

- Selenium WebDriver for UI Automation
- TestNG as the test framework
- REST Assured for API Automation
- Extent Reports for reporting
- Google Gemini API for AI-powered failure analysis

The framework follows the Page Object Model (POM) design pattern and is designed to be scalable, maintainable, and easy to extend.

---

# Features

## UI Automation

- Login validation
- Invalid login validation
- Dashboard validation
- Dashboard navigation
- Logout validation

## API Automation

- Create Booking
- Get Booking
- Update Booking
- Delete Booking
- Authentication using Token API

## Reporting

- Extent Reports (**<u>Important:</u>** I have also added Screenshots of report in **<u>test-output/screenshots</u>** )
- Screenshot capture on failure
- Test categorization (UI/API)
- Author and execution information

## AI Integration

Google Gemini is integrated into the framework.

Whenever a test fails, the framework sends:

- Test Name
- Current URL
- Exception
- Failure Message

to Gemini.

Gemini analyzes the failure and provides:

- Root Cause
- Suggested Fix
- Confidence

The generated response is automatically attached to the Extent Report.

(**<u>Important:</u>** I have added Screenshot of this from report in **<u>test-output/screenshots</u>** )

---

# Tech Stack

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- REST Assured
- WebDriverManager
- Extent Reports
- Google Gemini API
- Jackson
- OkHttp

---

# Project Structure

```
src
│
├── main
│   ├── java
│   │   ├── base
│   │   ├── config
│   │   ├── driver
│   │   ├── pages
│   │   ├── reports
│   │   ├── manager
│   │   ├── utils
│   │   └── llm
│
└── test
    ├── java
    │   ├── tests
    │   │   ├── ui
    │   │   └── api
    │   ├── listeners
    │   └── api
    └── resources
```

---

# Design Patterns Used

- Page Object Model (POM)
- Factory Pattern
- Singleton Pattern
- ThreadLocal WebDriver
- Fluent Page Objects

---

# Running the Project

Clone the repository

```
git clone https://github.com/Milan-Gahlyan/testmu-sdet1-milan.git
```

Install dependencies

```
mvn clean install
```

Run all tests

```
mvn clean test
```

Run in parallel

```
mvn clean test
```

(TestNG is configured for parallel execution using class-level parallelism.)

---

# Gemini API Setup

Create an environment variable:

```
GEMINI_API_KEY=<your_api_key>
```

The framework automatically reads the key from the environment and does not require storing secrets in the repository.

---

# Why Gemini API?

The assignment allowed two approaches:

1. AI generates tests before execution.
2. AI analyzes failed tests after execution.

I selected **Option 2** because it provides immediate practical value in a real automation framework. Instead of generating static tests, the framework uses Gemini to analyze failures, identify likely root causes, and suggest fixes directly inside the execution report, helping reduce debugging time.

This choice also demonstrates integration of an external LLM into an existing automation workflow rather than using AI only during development.

---

# Sample AI Output

```
Root Cause:
The assertion intentionally fails because the expected value is false.

Suggested Fix:
Remove the intentional assertion or replace it with the expected validation.

Confidence:
High
```

---

# Future Improvements

- JSON based AI response parsing
- Retry Analyzer
- Docker support
- Jenkins Pipeline
- Allure Reports
- Browser Cross Execution
- GitHub Actions CI/CD

---

# Author

Milan Gahlyan
