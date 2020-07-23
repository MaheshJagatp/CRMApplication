Feature: Companies Page Test

  Background: 
    Given When User Enters URL
    When User Enter UserName and Password
    Then User Successfully Enters In Application

  Scenario: Test to check Companies Page is Open
    When User on Home Page
    When User Click on Companies Otions
    Then Comapines DashBord is Open

  Scenario: Test to check Action button are present on Dash Bord
    When User on Comapines Dash Bord
    Then New button is display

  Scenario: Test to check Action button are present on Dash Bord
    When User on Comapines Dash Bord
    Then Export button is display

  Scenario: Test to check Action button are present on Dash Bord
    When User on Comapines Dash Bord
    Then Show filter button is display

  Scenario: Test to Check New Button Function
    When User on Comapines Dash Bord
    When User Click on New Button then New Comapany Form will Open
 

  Scenario: Test to Check Export Button Function
    When User on Comapines Dash Bord
    When User Click on Export Button
    Then Export Permission Box is Open

 
  Scenario: Test to check Show Filter Button Function
    When User on Comapines Dash Bord
    And User Click on Show Filter Button
    Then Filter window will open
    
  @CurrentTest
  Scenario: Test to check Export function for Comapnies Page
    When User on Comapines Dash Bord
    When User Click on Export Button
    Then Export Permission Box is Open
    When User Click on Export Permission Box Ok Button
    Then User Go To Document Page 
    And  User Open Export File Folder
    And  Check with New File is created with name Comapnies export and current time
    
    
