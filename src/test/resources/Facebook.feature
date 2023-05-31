Feature: FaceBook page testing

@New
Scenario: Check Login Functionality

Given Facebook page is open
When User enters <username> and <password>
And Click on the login button
Then Close the browser

Examples:
|username|password|
|user1|pwd1|
|user2|pwd2|
|user3|pwd3|