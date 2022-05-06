package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowsersDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlePopups();
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
	
	private static void handlePopups()
	{
		try
		{
			System.out.println("Before click on link,# of popups :"+getPopUpsCount());
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(2000);
			System.out.println("After click on link,# of popups :"+getPopUpsCount());
			if(getPopUpsCount()>0)
			{
				popupBrowsers();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopUpsCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	private static void popupBrowsers()
	{
		String parentBrowser;
		Object popups[];
		try
		{
			parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			popups=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				String title=oBrowser.getTitle();
				System.out.println("Title :"+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("URL :"+url);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
