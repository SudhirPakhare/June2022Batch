Feature: Manage Address Functionality

Background: User cancelled initial Login window
Given User provide browser name as "Chrome" and exe location  
Given User enter url
Given user cancel initial Login window
When user navigate on Login tab
When user click on MyProfile
When user enter "8308877313" as username
When user enter "omsairam" as password
When user click on Login button


@RegressionTest
Scenario: Manage Address functionality with valid credentials


When user click on manage Address
When user click on Add new Address
When user send "Sudhir Pakhare" as name
When User send "9834581591" as Mobile Number
When user send "431107" as Pincode 
When user send "Urben" as Locality
When user send "At-Paithan Tal-Paithan Dist-ch.Sambhajinagar" as Address
When user send "Rajmata Jijau lab,Near of ZP school, navin Kavsan" as Landmark
When user send "8308877313" as Ulternate mobile number
When user click on Home button
When User click on Save button
Then Application shows user address save 
