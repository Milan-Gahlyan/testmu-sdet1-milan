# AI Generated Test Cases

This document contains the test scenarios generated using AI during the design phase of the automation framework.

Only scenarios relevant to the public demo applications (OrangeHRM and Restful Booker) were selected for implementation.

---

# Module: Login

Feature: Login Functionality

Scenario: Successful Login
Given the user is on the Login page
When the user enters valid credentials
And clicks Login
Then the Dashboard should be displayed

---

Scenario: Invalid Password
Given the user is on the Login page
When the user enters a valid username
And an invalid password
Then an error message should be displayed

---

Scenario: Invalid Username
Given the user is on the Login page
When the user enters an invalid username
And a valid password
Then an error message should be displayed

---

Scenario: Invalid Username and Password
Given the user is on the Login page
When the user enters invalid credentials
Then login should fail

---

Scenario: Empty Username
Given the user is on the Login page
When the username field is empty
And a valid password is entered
Then validation should be displayed

---

Scenario: Empty Password
Given the user is on the Login page
When a valid username is entered
And password is empty
Then validation should be displayed

---

Scenario: Empty Credentials
Given the user is on the Login page
When no credentials are entered
Then validation messages should appear

---

Scenario: Username With Leading Spaces
Given the user is on the Login page
When the username contains leading spaces
Then login behavior should be validated

---

Scenario: Password Case Sensitivity
Given the user enters the correct username
When password case is changed
Then login should fail

---

Scenario: Forgot Password Link
Given the Login page is displayed
When the Forgot Password link is clicked
Then the reset password page should open

---

Scenario: Logout
Given the user is logged in
When Logout is selected
Then the Login page should be displayed

---

Scenario: Session Validation
Given the user logs in successfully
When the browser is refreshed
Then the session should remain active

---

# Module: Dashboard

Feature: Dashboard

Scenario: Dashboard loads successfully

Given the user logs in
Then Dashboard should be displayed

---

Scenario: Sidebar should be visible

Given Dashboard is loaded
Then Sidebar should be displayed

---

Scenario: User Menu should be visible

Given Dashboard is loaded
Then User menu should be visible

---

Scenario: Navigate to Admin

Given Dashboard is loaded
When Admin menu is clicked
Then Admin page should open

---

Scenario: Navigate to PIM

Given Dashboard is loaded
When PIM menu is clicked
Then PIM page should open

---

Scenario: Navigate to Leave

Given Dashboard is loaded
When Leave menu is clicked
Then Leave page should open

---

Scenario: Navigate to Recruitment

Given Dashboard is loaded
When Recruitment menu is clicked
Then Recruitment page should open

---

Scenario: Navigate to Time

Given Dashboard is loaded
When Time menu is clicked
Then Time page should open

---

Scenario: Navigate to My Info

Given Dashboard is loaded
When My Info menu is clicked
Then My Info page should open

---

Scenario: Dashboard Widgets Visible

Given Dashboard is loaded
Then all default widgets should be visible

---

Scenario: Quick Launch Section

Given Dashboard is loaded
Then Quick Launch section should be displayed

---

Scenario: User Dropdown Opens

Given Dashboard is loaded
When User dropdown is clicked
Then dropdown options should appear

---

Scenario: Logout From Dashboard

Given Dashboard is loaded
When Logout is clicked
Then Login page should open

---

Scenario: Dashboard URL Validation

Given Dashboard is loaded
Then URL should contain "dashboard"

---

Scenario: Browser Refresh

Given Dashboard is loaded
When browser is refreshed
Then Dashboard should still be visible

---

# Module: REST API

Feature: Booking API

Scenario: Generate Authentication Token

Given valid credentials
When Auth API is invoked
Then token should be returned

---

Scenario: Create Booking

Given booking payload
When Create Booking API is called
Then booking should be created

---

Scenario: Retrieve Booking

Given an existing booking
When Get Booking API is called
Then booking details should be returned

---

Scenario: Update Booking

Given an existing booking
When Update Booking API is called
Then booking should be updated

---

Scenario: Delete Booking

Given an existing booking
When Delete Booking API is called
Then booking should be deleted

---

Scenario: Invalid Booking ID

Given an invalid booking id
When Get Booking API is called
Then proper response should be returned

---

Scenario: Invalid Authentication

Given invalid credentials
When Auth API is invoked
Then authentication should fail

---

Scenario: Missing Mandatory Fields

Given incomplete payload
When Create Booking API is called
Then API response should be validated

---

Scenario: Invalid Data Type

Given invalid request payload
When Create Booking API is called
Then validation response should be verified

---

Scenario: Update Non-existing Booking

Given a non-existing booking
When Update API is called
Then proper error response should be returned

---

Scenario: Delete Non-existing Booking

Given a non-existing booking
When Delete API is called
Then proper error response should be returned

---

Scenario: Verify Response Time

Given Create Booking API
When request is executed
Then response time should be within acceptable limits

---

# Summary

## Total AI Generated Test Cases

| Module | Test Cases |
|---------|-----------:|
| Login | 12 |
| Dashboard | 15 |
| REST API | 12 |
| **Total** | **39** |

---

# Note

The AI generated additional scenarios that were intentionally not automated because they required functionality not available in the public demo applications or depended on environment-specific behavior.

The implemented automation suite focuses on scenarios that are stable, repeatable, and suitable for execution against publicly accessible demo environments.