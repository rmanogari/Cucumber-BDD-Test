Feature: Application Login

Background:
Given validate the browser
When Browser is triggered
Then check if browser is started

@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

@RegTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with username <Username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username  |password  |
|user1     |pass1     |
|user2     |pass2     |
|user3     |pass3     |
|user4     |pass4     |
