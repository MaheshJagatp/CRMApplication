Feature: Automate CRM Application

Background: 
Given When User Enters URL 
When User Enter UserName and Password
Then User Successfully Enters In Application


Scenario Outline: Creates New Contacts in Contact Page

Given User Click On Contact Page
When User Click On New Button to Create Contacts
And User Provides Details "<First Name>" and "< Last Name>" and "<Middle Name>" and "<Company Name>" and "<Email>" and "<Status>" and "<Description>" and "<Day>" and "<Month>" and "<Year>"
Then User Create Contact Successfully

Examples:
|First Name | Last Name | Middle Name | Company Name | Email            | Status | Description | Day | Month | Year|
|AKSHAY     |JAGTAP     |SURESH       |SCHILDER      |Akjagtap@gmail.com|  NEW   |NEW CONTACT  | 12  |12     | 1998|