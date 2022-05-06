package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserScenarioDemo {

	public static WebDriver oBrowser=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		String filename=null;
		try
		{
			filename="G:\\ExampleAutomation\\Automation\\Web-Automation1\\ObjectMap\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userspageimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userspageadduser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userspagefirstname")).sendKeys("demo");
			oBrowser.findElement(objectmap.getLocator("userspagelastname")).sendKeys("User1");
			oBrowser.findElement(objectmap.getLocator("userspageemail")).sendKeys("demo@gmail.com");
			oBrowser.findElement(objectmap.getLocator("userspageusername")).sendKeys("demoUser1");
			oBrowser.findElement(objectmap.getLocator("userspagepassword")).sendKeys("Welcome1");
			oBrowser.findElement(objectmap.getLocator("userspageretypepwd")).sendKeys("Welcome1");
			Thread.sleep(4000);
			oBrowser.findElement(objectmap.getLocator("userspagecreateuser")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userspagelistuser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userspagedeleteuser")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
