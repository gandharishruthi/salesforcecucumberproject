package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AccountsPage extends BasePage{
	
	static WebDriver driver;

	public AccountsPage()
	{
	super(driver=BaseTest.getDriver());
	
	addObject("New",By.name("new"));
	addObject("AccountName",By.id("acc2"));
	addObject("AccountType",By.id("acc6"));
	addObject("CustomerPriority",By.id("00NHu00000NHbkf"));
	addObject("Save",By.name("save"));
	//addObject("xalert",By.id("tryLexDialogX"));
	//addObject("xalert",By.xpath("//a[@title='Close']"));
  // addObject("Nothanks",By.id("lexNoThanks"));
	
  // addObject("xalert",By.xpath("//a[@class='dialogClose']"));
	addObject("CreateNewView",By.xpath("//a[contains(text(),'Create New View')]"));
	addObject("ViewName",By.id("fname"));
	addObject("ViewUniqueName",By.id("devname"));
	addObject("Save",By.name("save"));
	addObject("Edit",By.xpath("//a[text()='Edit']"));
	addObject("FilterField",By.xpath("//*[@id='fcol1']"));
	addObject("OperatorField",By.xpath("//*[@id='fop1']"));
	addObject("Value",By.xpath("//*[@id='fval1']"));
	addObject("Save",By.name("save"));
	
	
	addObject("MergeAccounts",By.xpath("//a[contains(text(),'Merge Accounts')]"));
	addObject("Search",By.id("srch"));
	addObject("FindAccounts",By.name("srchbutton"));
	addObject("Next",By.name("goNext"));
	addObject("Merge",By.xpath("//input[@title='Merge']"));
	
	
	//driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity ')]"));
	addObject("AccountWithLastActivity",By.xpath("//a[contains(text(),'Accounts with last activity ')]"));
	addObject("DateField",By.id("ext-gen20"));
	addObject("CreateDate",By.xpath("//div[contains(text(),'Created Date')]"));
	addObject("FromDate",By.id("ext-gen152"));
	addObject("TodayFrom",By.id("ext-comp-1111"));
	addObject("ToDate",By.id("ext-gen154"));
	addObject("TodayTo",By.id("ext-comp-1113"));
	addObject("Saveunsavedreport",By.id("ext-gen49"));
	addObject("Popupreportname",By.id("saveReportDlg_reportNameField"));
	addObject("Popupuniquereportname",By.id("saveReportDlg_DeveloperName"));
	addObject("SaveandRunReport",By.xpath("//button[contains(text(),'Save and Run Report')]"));
	
	
}	
} 