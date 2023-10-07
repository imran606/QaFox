
Feature: User Registration

  User should be able to register to the application
  
Background: 
Given User navigate to the registration page
  Scenario: User should be able to register with mandatory fields
   #Given User navigate to the registration page
     When User enter the first name "imran" into the first name textfield
      And User enters the last name "kolkar" into the last name text field
      And User enters the Email "imranrpca7@gmail" into email textfield
      And User enters the Telephone "8970981606" into telephone textfield
      And User enters the password "Onedayimran@06" into password text field
      And user enters the confirmpassaword "Onedayimran@06" into confirmpassword text field
      And Click on privacy policy checkbox
      And click on continue button
     Then Account should got successfully created
@login @smoke @regresion @valiCredentials
  Scenario: Register with all Fields
     #Given User navigate to the registration page
     When User enter the first name "imran" into the first name textfield
      And User enters the last name "kolkar" into the last name text field
      And User enters the Email "imranrpca&@gmail.com" into email textfield
      And User enters the Telephone "8088923252" into telephone textfield
      And User enters the password "Onedayimran@06" into password text field
      And user enters the confirmpassaword "Onedayimran@06" into confirmpassword text field
      And Select Yes for newslettr
      And Click on privacy policy checkbox
      And click on continue button
     Then Account should got successfully created

  Scenario: Register without providing any inputs
     #Given User navigate to the registration page
     When User dont enter any details into the fields
      And click on continue button
     Then Proper error message should be display

  Scenario: register with existing email address
     #Given User navigate to the registration page
     When User enter the first name "imran" into the first name textfield
      And User enters the last name "kolkar" into the last name text field
      And User enters the Email "enter@existingmail.com" into email textfield
      And User enters the Telephone "8088923252" into telephone textfield
      And User enters the password "Onedayimran@06" into password text field
      And user enters the confirmpassaword "Onedayimran@06" into confirmpassword text field
      And Select Yes for newslettr
      And Click on privacy policy checkbox
      And click on continue button
     Then Proper error message should be display
