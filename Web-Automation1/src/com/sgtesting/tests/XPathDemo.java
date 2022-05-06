package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPath();
	//	relativeXPathUsingTagName();
	//	relativeXPathUsingTagNameandIndex();
	//	relativeXPathUsingTagNameWithAttributeNameValue();
	//	relativeXPathUsingTagNameWithAttributeValueAlone();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValue();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueOROperator();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueAndOperator();
	//	relativeXPathUsingAttributeNameValueCombination();
	//	relativeXPathUsingPartialMatchingOfAttributeValue();
	//	relativeXPathUsingTagNameWithAttributeName();
	//	relativeXPathUsingTagNameWithAttributeName_1();
	//	relativeXPathUsingTagNameWithAttributeName_2();
	//	relativeXPathUsingTagNameWithAttributeName_3();
	//	relativeXPathUsingTagNameWithTextContent();
		relativeXPathUsingTagNameWithPartialTextContent();
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
			oBrowser.get("file:///G:/HTML/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 1: Identify the Element using <tagname>
	 * Syntax: //<tagname>
	 */
	private static void relativeXPathUsingTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 2: Identify the Element using <tagname> with index
	 * Syntax: //<tagname>[index]
	 */
	private static void relativeXPathUsingTagNameandIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 3: Identify the Element using <tagname> with 
	 * Attribute name and attribute value combination
	 * Syntax: //<tagname>[@attributename='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 4: Identify the Element using <tagname> with 
	 * Attribute name and attribute value combination
	 * Syntax: //<tagname>[@*='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//input[@*='pass1word1']")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 5: Identify the Element using <tagname> with 
	 * Multiple Attribute name and attribute value combination
	 * Syntax: //<tagname>[@attributename='attributevalue'][@attributename='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1'][@id='pwd1pass1word1']")).sendKeys("DemoUser2");
	}
	
	/**
	 * case 6: Identify the Element using <tagname> with 
	 * Multiple Attribute name and attribute value combination using or operator
	 * Syntax: //<tagname>[@attributename='attributevalue' or @attributename='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='submit1btn1' or @value='Submit']")).click();
	}
	
	/**
	 * case 7: Identify the Element using <tagname> with 
	 * Multiple Attribute name and attribute value combination using and operator
	 * Syntax: //<tagname>[@attributename='attributevalue' and @attributename='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='submit1btn1' and @value='Submit']")).click();
	}
	
	/**
	 * case 8: Identify the Element using 
	 * Attribute name and attribute value combination 
	 * Syntax: //*[@attributename='attributevalue']
	 */
	private static void relativeXPathUsingAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	
	/**
	 * case 9: Identify the Element using <tagname> with
	 * partial matching of attribute value 
	 * starts-with(@attributename,'partialattributevalue')
	 * ends-with(@attributename,'partialattributevalue')
	 * contains(@attributename,'partialattributevalue')
	 * Syntax: //<tagname>[starts-with(@attributename,'partialattributevalue')]
	 * Syntax: //<tagname>[ends-with(@attributename,'partialattributevalue')]
	 * Syntax: //<tagname>[contains(@attributename,'partialattributevalue')]
	 */
	private static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit1')]")).click();
	}
	
	/**
	 * case 10: Identify the Element using <tagname> with Attribute name 
	 * Syntax: //<tagname>[@attributename]
	 */
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		//find out number of links in the application
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_1()
	{
		//Display the link text of the each link
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String str=link.getText();
			System.out.println(str);
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_2()
	{
		//Perform click operation on a link based on ends-with text content
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String str=link.getText();
			if(str.endsWith("Insitute"))
			{
				link.click();
				break;
			}
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_3()
	{
		// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		// element is not attached to the page document
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String str=link.getText();
			if(str.endsWith("HQ"))
			{
				link.click();
			}
		}
	}
	
	/**
	 * case 11: Identify the Element using text content
	 * Syntax: //<tagname>[text()='text content']
	 */
	private static void relativeXPathUsingTagNameWithTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='SeleniumHQ']")).click();
	}
	
	/**
	 * case 12: Identify the Element using partial matching of text content
	 * starts-with(text(),'partial text content')
	 * ends-with(text(),'partial text content')
	 * contains(text(),'partial text content')
	 * Syntax: //<tagname>[starts-with(text(),'partial text content')]
	 * Syntax: //<tagname>[ends-with(text(),'partial text content')]
	 * Syntax: //<tagname>[contains(text(),'partial text content')]
	 */
	private static void relativeXPathUsingTagNameWithPartialTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'Sel')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
	}

}
