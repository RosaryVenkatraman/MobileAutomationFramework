Feature: Freshbenies Login Page Test

@Sanity
Scenario: Validate login functionality with incorrect credentials

Given app is opened and in login page 
And enter invalid credentials
Then validate whether appropriate error mesage is thrown


@Sanity
Scenario: Validate forgotpassword link presence

Given app is opened and in login page  
Then validate whether the forgotpassword link is present

@Sanity
Scenario: Validate login functionality with correct credentials

Given app is opened and in login page 
And enter valid credentials
Then validate whether homepage is displayed

