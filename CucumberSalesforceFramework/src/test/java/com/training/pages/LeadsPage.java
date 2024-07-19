package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LeadsPage extends BasePage{

 static WebDriver driver;

	public LeadsPage()
	{
	super(driver=BaseTest.getDriver());
	
	addObject("Viewdropdown",By.id("fcf"));
    addObject("Go",By.name("go"));
	
	
	
	}
}