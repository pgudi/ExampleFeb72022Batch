package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1234567");
			Thread.sleep(2000);
			String str=oBrowser.findElement(By.id("username")).getAttribute("value");
			System.out.println(str);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
