Feature: going to verify the adactin webpage
 Scenario:  verify the login page with valid data
 Given enter the valid data to username and password	
 When click the login button
 Then verify the outcome result
 
 Scenario: verify the login page invalid data
 Given Enter  invalid user and password	
 When Click login
 Then check the result
 
 Scenario: check the login page with invalid password
 Given pass the data to username only
 When click the log button in page
 Then Check the outcome result