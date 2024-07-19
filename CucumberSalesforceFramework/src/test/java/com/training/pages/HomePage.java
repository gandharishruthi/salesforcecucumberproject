package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage  extends BasePage{
	static WebDriver driver;

	public HomePage()
	{
	super(driver=BaseTest.getDriver());
	
	addObject("usermenu", By.id("userNavLabel"));
	addObject("Logout",By.xpath("//a[text()='Logout']"));
	//Accounts Tab
	addObject("Accounts",By.xpath("//a[@title='Accounts Tab']"));
	addObject("xalert",By.id("tryLexDialogX"));
	//Opportunities Tab
	addObject("Opportunities",(By.xpath("//a[@title='Opportunities Tab']")));
	
	//Leads Tab
	addObject("LeadsTabLink",(By.id("Lead_Tab")));
	}
	}

