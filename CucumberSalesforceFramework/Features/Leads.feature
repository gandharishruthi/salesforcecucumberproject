Feature:Leads Scenarios Of SalesForce Application
#Testcase20:P21
@Tag1
Scenario:Check Leads Tab
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "LeadsTabLink"
Then  User clicks on  button "xalert"

#TestCase21:P22
@Tag2
Scenario:Leads Select view
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "LeadsTabLink"
Then  User clicks on  button "xalert"
Given User is on "LeadsPage"
And Verify the opitons of dropdown "Viewdropdown"

#TestCase22:P23
@Tag3
Scenario:Defualt view
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "LeadsTabLink"
Then  User clicks on  button "xalert"
Given User is on "LeadsPage"
And User selects  from dropdown "Viewdropdown" "Today's Leads"
And User clicks on  button "Go"
Then  User is on "HomePage"
Then  User clicks on tab "usermenu"
Then User clicks on tab "Logout"
When  User is on "LoginPage"
Then User enters into textbox "UserName" "deera@tekarch.com"
Then User enters into textbox "password" "Mighty$$$12"
And  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "LeadsTabLink"
And User is on "LeadsPage"
And User clicks on  button "Go"






















#TestCase23:P24
@Tag4
Scenario:Leads Default view
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "LeadsTabLink"
Then  User clicks on  button "xalert"
Given User is on "LeadsPage"
And User selects  from dropdown "Viewdropdown" "Today's Leads"
And User clicks on  button "Go"


