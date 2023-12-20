Feature: Sing in

Scenario: Sign in with valid credential

Given user on login page "https://www.facebook.com"
When user enters username as "abc " and password as "xyz"
And click on login button
Then user should be on login page
