Feature: Login for LeafTaps

Scenario: Login Positive
Given enter the username as DemoSalesManager
And enter the password as crmsfa
When click on the login button
Then login should be success

Scenario Outline: Login Negative
Given enter the username as <userName>
And enter the password as <passWord>
When click login for failure
But login should be failed

Examples:
|userName|passWord|
|DemoSalesManager1|crmsfa|
|DemoSalesManager|crmsfaa|
























