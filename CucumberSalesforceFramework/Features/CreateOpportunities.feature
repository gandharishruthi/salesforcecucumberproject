Feature:Create opportunities scenarios of salesforce application

@Testcase15:P16
@Tag1
Scenario: Opportunities Dropdown
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Opportunities"
#Then  User clicks on  button "xalert"
Then User close the alert "xalert"
Given User is on "OpportunitiesPage"
And Verify the opitons of dropdown "ViewOpprtunity"



@TestCase16:P17
@Tag2
Scenario:Create a new Opportunity
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Opportunities"
Then User close the alert "xalert"
Given User is on "OpportunitiesPage"
Then  User clicks on  button "New"
Then User clears the textbox "OpportunityName"
When User enters into textbox "OpportunityName" "Technology Partner"
Then User clears the textbox "AccountName"
When User enters into textbox "AccountName" "gandharishruthi"
Then  User clicks on  button "CloseDate"
Then  User clicks on  button "ToDay"
Then User clears the textbox "Probability"
When User enters into textbox "Probability" "50"
And User selects  from dropdown "Stage" "Qualification"
And User selects  from dropdown "LeadSource" "Web"
Then  User clicks on  button "Save"


@TestCase17:P18
@Tag3
Scenario:Test Opportunity Pipeline Report
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Opportunities"
Then User close the alert "xalert"
Given User is on "OpportunitiesPage"
When  User clicks on tab "OpportunityPipeLineReport"


@TestCase18:P19
@Tag4
Scenario:Test Stuck Opportunities Report
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Opportunities"
Then User close the alert "xalert"
Given User is on "OpportunitiesPage"
Then  User clicks on tab "StuckOpportunities"


@TestCase19:P20
@Tag5
Scenario:Test Quarterly Summary Report
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
When  User clicks on tab "Opportunities"
Then User close the alert "xalert"
Given User is on "OpportunitiesPage"
Then  User clicks on tab "IframeQuarterly"
And User selects  from dropdown "Interval" "Current FQ"
And User selects  from dropdown "Include" "Open Opportunities"
Then  User clicks on  button "RunReport"







