Feature: Validation of LoginPage in FaceBook Application

Background: 
Given User Lanuch FaceBook Application 
When User verify login page is displayed

Scenario: TC01_Validation of login page with invalid credentials
When User enters invalid username and password  
And User click login button
Then User verify error message displayed

#Scenario: TC02_Validation of Signup text in Facebook
#When User click CreateNew Account button
#Then User verify sign up text is displayed
#
#Scenario Outline: TC03_Validation of login with mulitple invalid credentials
#When User enters invalid "<username>" ,and "<password>" 
#And User click login button
#Then User verify error message is displayed
#
#Examples: 
#|username|password|
#|john|Jacky@0123|
#|Rose|Jasimine123|



