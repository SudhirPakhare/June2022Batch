Feature: Login Functionality

Background: User cancelled initial Login window
Given User provide browser name as "Chrome" and exe location  
Given User enter url  
Given user cancel initial Login window


@SmokeTest
Scenario: Login functionality with valid credentials
When user navigate on Login tab
When user click on MyProfile
When user enter "8308877313" as username
When user enter "omsairam" as password
When user click on Login button
Then Application shows user profile to user 
