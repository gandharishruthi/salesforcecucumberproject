
Feature:CreateAccount Scenarios of salesforce application
@Tag1
#Testcase:10 

Scenario: Create an account
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Accounts"
#Then  User clicks on  button "xalert"
Then User close the alert "xalert"
Given User is on "AccountsPage"
Then  User clicks on  button "New"
When User enters into textbox "AccountName" "dee red"
And User selects  from dropdown "AccountType" "Technology Partner"
And User selects  from dropdown "CustomerPriority" "High"
Then User clicks on  button "Save"

@Tag2
#Testcase11:12
Scenario:Create New View
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Accounts"
Then  User clicks on  button "xalert"
Given User is on "AccountsPage"
Then  User clicks on  button "CreateNewView"
Then User enters into textbox "ViewName" "SSView"
Then User enters into textbox "ViewUniqueName" "GGUnique"
Then User clicks on  button "Save"
@Tag3
#TestCase12:13
Scenario:Edit view
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Accounts"
Then  User clicks on  button "xalert"
Given User is on "AccountsPage"
Then  User clicks on  button "Edit"
#Then User clears the textbox "ViewName"
When User enters into textbox "ViewName" "SSNewview"
Then User moves to element "FilterField"
And User selects  from dropdown "FilterField" "Account Name"
And User selects  from dropdown "OperatorField" "contains"
And User enters into textbox "Value" "a"
Then User clicks on  button "Save"

@Tag4
#TestCase13:14
Scenario:Merge Accounts

Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Accounts"
Then  User clicks on  button "xalert"
Given User is on "AccountsPage"
Then  User clicks on  button "MergeAccounts"
Then  User clicks on  button "Search"
When User enters into textbox "Search" "shruthi"
Then  User clicks on  button "FindAccounts"
Then  User clicks on  button "Next"
Then  User clicks on  button "Merge"
@Tag5
#TestCase14:15
Scenario:Create Account Report

Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Accounts"
Then  User clicks on  button "xalert"
Given User is on "AccountsPage"
Then  User clicks on tab "AccountWithLastActivity"
Then  User clicks on  button "DateField"
Then  User clicks on  button "CreateDate"
And User clicks on  button "FromDate" 
And User clicks on  button "TodayFrom"
And User clicks on  button "ToDate" 
And User clicks on  button "TodayTo"
Then User clicks on  button "Saveunsavedreport"
Then User clears the textbox "Popupreportname"
When User enters into textbox "Popupreportname" "specialReport8"
Then User clears the textbox "Popupuniquereportname"
When User enters into textbox "Popupuniquereportname" "specialuniqueReport8"
Then User clicks on  button "SaveandRunReport"












