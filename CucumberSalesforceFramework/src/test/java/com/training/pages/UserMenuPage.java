package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserMenuPage extends BasePage {
	
     static WebDriver driver;

		public UserMenuPage()
		{
		super(driver=BaseTest.getDriver());
	//addObject("UserName",By.id("username"));
	     //testcase6
		addObject("Myprofile",(By.xpath("//a[contains(text(),'My Profile')]")));
		addObject("Editprofile",(By.xpath("//img[@alt='Edit Profile']")));
		//addObject("Editprofile",(By.xpath("//img[@alt='Edit Profile']")));
		//addObject("Editprofilewindow",By.id("contactInfoTitle"));
  addObject("Editprofileframe",By.xpath("//iframe[@id='contactInfoContentId']"));
addObject("About",By.xpath("//a[contains(text(),'About')]"));
addObject("lastname",By.id("lastName"));
addObject("Saveall",By.xpath("//input[@value='Save All']"));
addObject("Post",By.linkText("Post"));
addObject("Textareaframe",By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
addObject("Writepost",By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));	
addObject("Share",By.xpath("//input[@id='publishersharebutton']"));	
addObject("Filelink",By.id("publisherAttachContentPost"));
addObject("Computerlink",By.id("chatterUploadFileAction"));
addObject("Choosefile",By.id("chatterFile"));
addObject("Fileshare",By.id("publishersharebutton"));
addObject("moderator",By.id("displayBadge"));
addObject("Addphotolink",By.id("uploadLink"));
addObject("Switchtoframe",By.xpath("//iframe[@id='uploadPhotoContentId']"));
addObject("Choosefileoption",By.id("j_id0:uploadFileForm:uploadInputFile"));
addObject("Save",By.id("j_id0:uploadFileForm:uploadBtn"));
addObject("Savephoto",By.id("j_id0:j_id7:save"));
//addObject("Editprofileframe",By.xpath("//iframe[@id='contactInfoContentId']"));
//Developerconsoletestcase

 addObject("DeveloperConsole",(By.xpath("//a[contains(text(),'Developer Console')]"))) ; 
 addObject("DeveloperCosnolechildwindow",(By.id("editors-body")));
		
		   
		}
		}
	
	




