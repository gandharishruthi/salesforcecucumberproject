Feature:UserMenu scenarios of Salesforce application
#Testcase:5
Scenario: Select UserMenu from dropdown
Given User is on "LoginPage"
When User enters into textbox "UserName" "deera@tekarch.com"
When User enters into textbox "password" "Mighty$$$12"
Then  User clicks on  button "Login"
When  User is on "HomePage"
Then  User clicks on tab "usermenu"


@Tag1
#Testcase:6
Scenario: Select MyProfile option from UserMenu for username dropdown
Given User is on "LoginPage"
When  User enters into textbox "UserName" "deera@tekarch.com"
When  User enters into textbox "password" "Mighty$$$12"
Then User clicks on  button "Login"
When User is on "HomePage"
Then  User clicks on tab "usermenu"
When User is on "UserMenuPage" 
When  User clicks on tab "Myprofile"
Then User moves to element "Editprofile"
#validate edit profile window
Then User switches to frame "Editprofile1frame"
Then  User clicks on tab "About"
Then User clears the textbox "Lastname"
When User enters into textbox "Lastname" "gandhari"
Then User clicks on  button "Saveall"
#Then User moves to parent window
When  User clicks on link "Postlink"
Then User switches to frame "Textareaframe"
When  User enters into textbox "writepost" "learning selenium automation"
#check the posted text and switch to parent window
Then User clicks on  button "Share"
#check on filelink
Then  User clicks on link "filelink"
Then  User clicks on link "computerlink"
When  User enters into textbox "choosefile" ""C:\\Users\\deeth\\Downloads\\SFDC 37 Testcases (1) (1).xlsx""
Then User clicks on  button "Fileshare"
#uploading photo
When User moves to element "Moderator"
And  User clicks on link0* 8"AddphotoLink"	
Then User switches to frame "Switchtoframe"	
And  User enters into textbox "choosefileoption" ""C:\\Users\\deeth\\OneDrive\\Pictures\\images.jpg""	
And User clicks on  button "Save"
And User clicks on  button "Savephoto"
#photo has been uploaded successfully
 




#Testcase:8
Scenario: Select Developer console option from usermenu for usernmedropdown
Given User is on "LoginPage"
When  User enters into textbox "UserName" "deera@tekarch.com"
When  User enters into textbox "password" "Mighty$$$12"
Then User clicks on  button "Login"
When User is on "HomePage"
Then  User clicks on tab "usermenu"
When User is on "UserMenuPage" 
When  User clicks on tab "DeveloperConsole"
And User close the child window "DeveloperConsolechildwindow";



#Testcase:9
Scenario: Logout option from UserMenu for username dropdown
Given User is on "LoginPage"
When  User enters into textbox "UserName" "deera@tekarch.com"
When  User enters into textbox "password" "Mighty$$$12"
Then User clicks on  button "Login"
When User is on "HomePage"
Then  User clicks on tab "usermenu"
Then User clicks on tab "Logout"
