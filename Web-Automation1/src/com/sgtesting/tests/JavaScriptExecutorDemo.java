package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		displayTitle();
		displayURL();
		displayLinksCount();
	//	enterValueInTextField1();
	//	enterValueInTextField2();
	//	clickOnButtonField1();
	//	clickOnButtonField2();
	//	clickOnCheckBox1();
	//	clickOnCheckBox2();
	//	clickOnRadioButton1();
	//	clickOnRadioButton2();
		selectItemsFromDropDown();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///G:/HTML/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void displayTitle()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title :"+title);
	}
	
	private static void displayURL()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL :"+url);
	}
	
	private static void displayLinksCount()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		long links=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("# of Links :"+links);
	}
	
	private static void enterValueInTextField1()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
	}
	
	private static void enterValueInTextField2()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("uid1user1name1"));
		js.executeScript("arguments[0].value='DemoUser2';", oEle);
	}
	
	private static void clickOnButtonField1()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	
	private static void clickOnButtonField2()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
		js.executeScript("arguments[0].click();", oEle);
	}
	
	private static void clickOnCheckBox1()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk2linux').click();");
	}
	
	private static void clickOnCheckBox2()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("chk1windows"));
		js.executeScript("arguments[0].click();", oEle);
	}
	
	private static void clickOnRadioButton1()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad1chrome').click();");
	}
	
	private static void clickOnRadioButton2()
	{
		JavascriptExecutor js= (JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
		js.executeScript("arguments[0].click();", oEle);
	}
	
	private static void selectItemsFromDropDown()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String strScript="var kk=document.getElementById('tools');";
		strScript+="for(var i=0;i<kk.length;i++)";
		strScript+="{";
		strScript+="if(kk.options[i].text='Selenium WebDriver')";
		strScript+="{";
		strScript+="kk.options[i].selected='1';";
		strScript+="}";
		strScript+="}";
		js.executeScript(strScript);		
				
	}

}
