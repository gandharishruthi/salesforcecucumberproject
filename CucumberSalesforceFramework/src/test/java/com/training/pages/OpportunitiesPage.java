package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class OpportunitiesPage extends BasePage {


static WebDriver driver;

public OpportunitiesPage()
{
super(driver=BaseTest.getDriver());

//Testcase15
addObject("ViewOpprtunity",By.id("fcf"));


//Testcase16
addObject("New",By.name("new"));
addObject("OpportunityName",By.id("opp3"));
addObject("AccountName",By.id("opp4"));
addObject("Stage",By.id("opp11"));
addObject("CloseDate",By.id("opp9"));
addObject("ToDay",By.xpath("//a[text()='Today']"));
addObject("Probability",By.id("opp12"));
addObject("LeadSource",By.id("opp6"));
addObject("Save",By.name("save"));


//Testcase17

addObject("OpportunityPipeLineReport",By.xpath("//a[text()='Opportunity Pipeline']"));



//TestCase18

addObject("StuckOpportunities",By.xpath("//a[text()='Stuck Opportunities']"));

//TestCase19

addObject("IframeQuarterly",By.xpath("//h3[text()='Quarterly Summary']"));
addObject("Interval",By.id("quarter_q"));
addObject("Include",By.id("open"));
addObject("RunReport",By.xpath("//input[@value='Run Report']"));

}

}








