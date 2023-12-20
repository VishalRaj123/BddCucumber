Feature: Check Application

Scenario: Reset Credentials

Given user on login page "https://www.facebook.com"
Then User Open Chrome browser and launch application
When user_enter_Username_and_Password()
And click on reset button

