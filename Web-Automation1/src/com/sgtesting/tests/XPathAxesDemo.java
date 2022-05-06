package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonSachinTendulkar();
	//	enterSalaryForPersonWhoIsNextTo2ndRecordFromRahulDravid();
	//	makeTheStatusAsActiveForIndianFreedomFighter();
	//	makeTheStatusActiveForRecordWhichIs2ndPrevioudRecordFromSachin();
	//	basedOnTextFieldDisplayTheAttributeVAlueOfTable();
		basedOnTableMakeStatusACtiveForBhagathSinghRecord();
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
			oBrowser.get("file:///G:/HTML/WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::td/following::td/following::td/following::td/input")).sendKeys("25000");
	}
	
	private static void enterSalaryForPersonWhoIsNextTo2ndRecordFromRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("10000");
	}
	
	private static void makeTheStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}

	private static void makeTheStatusActiveForRecordWhichIs2ndPrevioudRecordFromSachin()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
	}
	
	private static void basedOnTextFieldDisplayTheAttributeVAlueOfTable()
	{
		String str=oBrowser.findElement(By.xpath("//input[@id='edit3']/ancestor::td/ancestor::tr/ancestor::table")).getAttribute("id");
		System.out.println(str);
	}
	
	private static void basedOnTableMakeStatusACtiveForBhagathSinghRecord()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[3]/td[1]/input")).click();
		
	}
}
