
@tag
Feature: Application Login
  
  Background:
  
  Given setup data
  When  launch browser
  Then  gotourl
  
  
  
  
  #reusability of code with "with" and  regular expression {}
  
  
  @smokeTest
  Scenario: User Page Login
    Given User is on login landing Page
    When user enters credentials with "user" and passowrd "7890"
   Then Home page displayed
    
    
    @smokeTest @Regression
    Scenario: Admin Page Login
    Given User is on login landing Page 
    When user enters credentials with admin and passowrd 1234
  	Then Home page displayed
  	
  	
  	#reusability with parameterization
  

    Scenario Outline: Admin Page Login
    Given User is on login landing Page 
    When user enters credentials with "<username>" and passowrd "<password>"
  	Then Home page displayed
  	
  	Examples:	
  	
  	 							| username | password
  								| kavya		 | kavya89
  								| deepa	   | deepa99
  								
  								
  	#datadriven testing
  	
  	Scenario: user has to register
    Given User is on login landing Page 
    When user Signup for application 
    | kavya |
    | shree |
    |kavya@gmail.com|
    |9090909090|
    |female|
    
  	Then Home page displayed
  	
   
