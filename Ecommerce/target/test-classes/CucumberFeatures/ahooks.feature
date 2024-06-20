
@tag
Feature: Application Login


 Background:
  
  Given setup data
  When  launch browser
  Then  gotourl

  @smokeTest  @UserLogin
  Scenario: User Page Login
    Given User is on login landing Page
    When user enters credentials with "user" and passowrd "7890"
   Then Home page displayed
    
    
    @AdminLogin @Regression
    Scenario: Admin Page Login
    Given User is on login landing Page 
    When user enters credentials with admin and passowrd 1234
  	Then Home page displayed
