
package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public  class LoginPage  extends BasePage{

static WebDriver driver;

public LoginPage()
{
super(driver=BaseTest.getDriver());
addObject("UserName",By.id("username"));
addObject("password",By.id("password"));
addObject("Login",By.id("Login"));

addObject("forgotpassword",By.id("forgot_password_link"));
addObject("UserName1",By.id("un"));
addObject("Continue",By.id("continue"));
addObject("RememberMe",By.id("rememberUn"));
addObject("errormessage",By.xpath("//div[contains(text(),'Please enter your password')]"));
addObject("errormessage1",By.id("error"));
}
}
