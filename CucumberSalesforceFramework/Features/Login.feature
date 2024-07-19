Feature:Login scenarios of salesforce application
@Tag1
#Testcase:1
Scenario:Login into application with valid username and clear password
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
Then User clicks on  button "Login"
And check the error message "errormessage" "Please enter your password."

@Tag2
#Testcase:2
Scenario:Login into application with valid username and password
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
@Tag5
#Testcase4B:P5
Scenario: Login into application with invalid username and password
Given User is on "LoginPage" 
When User enters into textbox "UserName" "areed@tekarch.com"
When User enters into textbox "password" "12Mighty"
Then  User clicks on  button "Login"
And check the error message "errormessage1" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
@Tag4
#TestCase4A:P4
Scenario:  ckecking forgotpassword scenario
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User clicks on tab "forgotpassword"
When User enters into textbox "UserName1" "deera@tekarch.com"
Then User clicks on  button "Continue"
@Tag3
#Testcase3
Scenario: loin into application with valid username and password and rememberme butoon and click on usermenu ,logout of the application

Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "RememberMe"
Then  User clicks on  button "Login"
When User is on "HomePage"
Then User clicks on tab "usermenu"
Then  User clicks on  button "Logout"
