package com.training.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	
	public HashMap<String,By> ObjectRepo = new HashMap<String,By>();
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	public void addObject(String LogicalName, By by)
	{
		ObjectRepo.put(LogicalName,by);
	}
	
	private WebElement getelement(String LogicalName)
	{
		By by=ObjectRepo.get(LogicalName);
		WebElement element=driver.findElement(by);
		return element;
	}
	public void enterintotextbox(String LogicalName, String value)
	{try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		WebElement element=getelement(LogicalName);
		waitforelement(element);
		element.sendKeys(value);
	}
	public void clickonbutton(String LogicalName) 
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element=getelement(LogicalName);
		
		waitforelement(element);
		element.click();
	}
	public void clickontab(String LogicalName)
	{
		WebElement element=getelement(LogicalName);
		
		waitforelement(element);
		element.click();
		
	}
	public void clickonlink(String LogicalName)
	{
		WebElement element=getelement(LogicalName);
		waitforelement(element);
		element.click();
	}
	public String checkerrormessage(String LogicalName) {
		WebElement element=getelement(LogicalName);
		String actualerrormessage=element.getText();
		return actualerrormessage;
	}
	
	public void movetoelement(String LogicalName) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element=getelement(LogicalName);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		waitforelement(element);
		element.click();}
	
	public void closethechildwindow(String LogicalName) {
		
		Set<String> allwindowhandles=driver.getWindowHandles();;
		Iterator<String> it=allwindowhandles.iterator();
		String Parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		
	}
	public void closethealert(String LogicalName)  {
		
		
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement element=getelement(LogicalName);
		waitforelement(element);
		
		element.click();
		
	}
	public void selectfromdropdown(String LogicalName,String value)
	{
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		WebElement element=getelement(LogicalName);
		waitforelement(element);
		Select selectdropdown= new Select(element);
		selectdropdown.selectByVisibleText(value);
		
	}

	public void cleartextbox(String LogicalName)	
	{
		WebElement element=getelement(LogicalName);
		waitforelement(element);
		element.clear();
	}
	
	public void switchtoparentwindow() {
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}
	
		
		public void waitforelement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

		public void verifytheoptionsofdropdown(String LogicalName) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		WebElement element=getelement(LogicalName);
		waitforelement(element);
		Select select=new Select(element);
		List<WebElement> list=select.getOptions();
		System.out.println("the dropdown has Options of");
		for(WebElement options: list)
		System.out.println(options.getText());	
		}
	
	
	public void switchestoframe(String LogicalName)
	{	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	WebElement element=getelement(LogicalName);
	waitforelement(element);
		driver.switchTo().frame(element);
		
		
	}
	
		
		
		
		/*public void verifytheoptionsofdropdown	
		WebElement viewdropdown=driver.findElement(By.id("fcf"));
		Select select=new Select(viewdropdown);
		List<WebElement> list=select.getOptions();
		System.out.println("the dropdown has Options of");
		for(WebElement options: list)
		System.out.println(options.getText());
		}
*/

	}
	
/*Select list=new Select(element);
List<WebElement> options=list.getOptions();
System.out.println("the dropdown options are:");
for(WebElement option: options)
 System.out.println(option.getText());*/




/*Actions edit=new Actions(driver);
edit.moveToElement(editprofile).build().perform();
editprofile.click();*/
	





	