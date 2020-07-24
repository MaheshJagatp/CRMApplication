Feature: Automate CRM Application

Background: 
Given When User Enters URL 
When User Enter UserName and Password
Then User Successfully Enters In Application


Scenario:
Given User Click On Contact Page
When User Checkes all Buttons are availiable On Contact Page
Then Contact Page Have All Buttons




Scenario Outline: Creates New Contacts in Contact Page

Given User Click On Contact Page
When User Click On New Button to Create Contacts
And User Provides Details "<FirstName>" and "<LastName>" and "<MiddleName>"  and "<Email>"  and "<Description>" and "<Day>"  and "<Year>"
Then User Create Contact Successfully

Examples:
|FirstName  | LastName  | MiddleName  |Email             |  Description | Day |  Year|
|AKSHAY     |JAGTAP     |SURESH       |Akjagtap@gmail.com|NEW CONTACT   |12   |1998  |