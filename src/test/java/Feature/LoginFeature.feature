Feature: Testing the Login Feature of Active Time Application

Background:
# it is used to perform repeated Action and to removed the redundant code for faster execution
#precondition itself
Given The brower is launched
And  The Apllication is loaded

Scenario: Testing the login feature with valid data

#precondition itself
#Given The brower is launched
#And  The Apllication is loaded

#Representing  the Action of Test cases
When The user Enters the valid user name

And The user Enter the valid password
And The user Click on Login button

#Representating previous Action
Then Dashbord will Display




Scenario: Testing the forgotten password link
#precondition itself (removed by me because common initial steps are there so i used background keyword.)
When User Click on forgotten password link
Then Forgotten your password component will display
