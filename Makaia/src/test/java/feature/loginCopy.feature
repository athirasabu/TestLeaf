Feature: Login for LeafTaps
Background:
Given open the browser
And launch the Url
And set the timeouts
And maximize the browser

Scenario: Login Positive
And enter the username as DemoCSR
And enter the password as crmsfa
When click on the login button
Then login should be success












