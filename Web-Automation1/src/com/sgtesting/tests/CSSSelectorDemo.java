package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCSSSelector();
	//	relativeCSSByTagName();
	//	relativeCSSByTagNameWithIDAttributeValue();
	//	relativeCSSByIDAttributeValue();
	//	relativeCSSByTagNameWithClassAttributeValue();
	//	relativeCSSByClassAttributeValue();
	//	relativeCSSByTagNameWithAttributeNameValueCombination();
	//	relativeCSSByAttributeNameValueCombination();
	//	relativeCSSByTagNameWithMultipleAttributeNameValueCombination();
	//	relativeCSSByTagNameWithPartialAttributeNameValueCombination();
	//	relativeCSSByTagNameWithAttributeNameCombination();
	//	relativeCSSByTagNameWithAttributeNameCombination_1();
	//	relativeCSSByTagNameWithAttributeNameCombination_2();
	//	relativeCSSByTagNameWithAttributeNameCombination_3();
	//	relativeCSSByTagNameWithParentElement();
	//	relativeCSSBynthChildConcept();
		relativeCSSBySiblingConcept();
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
	
	private static void absoluteCSSSelector()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 1: Identify the Element based on <tagname>
	 * Syntax: <tagname>
	 */
	private static void relativeCSSByTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: Identify the Element based on 
	 * tagname with id attribute value
	 * Syntax: <tagname>#<id attribute value>
	 */
	private static void relativeCSSByTagNameWithIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 3: Identify the Element based on 
	 * id attribute value
	 * Syntax: #<id attribute value>
	 */
	private static void relativeCSSByIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 4: Identify the Element based on 
	 * tagname with class attribute value
	 * Syntax: <tagname>.<class attribute value>
	 */
	private static void relativeCSSByTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.submit1btn1")).click();
	}
	
	/**
	 * Case 5: Identify the Element based on 
	 * class attribute value
	 * Syntax: .<class attribute value>
	 */
	private static void relativeCSSByClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".submit1btn1")).click();
	}
	
	/**
	 * Case 6: Identify the Element based on tagname with
	 * attribute Name and attribute value combination
	 * Syntax: <tagname>[attributename='attribute value']
	 */
	private static void relativeCSSByTagNameWithAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	/**
	 * Case 7: Identify the Element based on 
	 * attribute Name and attribute value combination
	 * Syntax: [attributename='attribute value']
	 */
	private static void relativeCSSByAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("[value='Submit']")).click();
	}
	
	/**
	 * Case 8: Identify the Element based on tagname with
	 * Multiple attribute Name and attribute value combination
	 * Syntax: <tagname>[attributename='attribute value'][attributename='attribute value']
	 */
	private static void relativeCSSByTagNameWithMultipleAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();
	}
	
	/**
	 * Case 9: Identify the Element based on tagname with
	 * partial matching of Attribute Value
	 * Syntax: 
	 * <tagname>[attributename ^= 'partial attribute value']
	 * <tagname>[attributename $= 'partial attribute value']
	 * <tagname>[attributename *= 'partial attribute value']
	 */
	private static void relativeCSSByTagNameWithPartialAttributeNameValueCombination()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[id *= 'submit1']")).click();
	}

	/**
	 * Case 10: Identify the Element based on tagname with
	 * attribute Name combination
	 * Syntax: <tagname>[attributename]
	 */
	private static void relativeCSSByTagNameWithAttributeNameCombination()
	{
		//Find Number of Links in the Web Page
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_1()
	{
		//Display All the link Names in the Web Page
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			System.out.println(link.getText());
		}
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_2()
	{
		//Perform click on link in the Web Page based on ends with Text content
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String text=link.getText();
			if(text.endsWith("Insitute"))
			{
				link.click();
				break;
			}
		}
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_3()
	{
		//org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		//element is not attached to the page document
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String text=link.getText();
			if(text.contains("HQ"))
			{
				link.click();
			}
		}
	}
	
	/**
	 * Case 11: Identify the Element based on parent element
	 * Syntax: parent Element
	 */
	private static void relativeCSSByTagNameWithParentElement()
	{
		oBrowser.findElement(By.cssSelector("div#d2 > form#frm2 > input")).click();
	}
	
	/**
	 * Case 12: Identify the Element based on nth Child
	 * Syntax: :nth-child(number)
	 */
	private static void relativeCSSBynthChildConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser12345");
	}
	
	/**
	 * Case 13: Identify the Element based on Sibling approach
	 * Syntax: :<tagname> + <tagname> + <tagname>
	 */
	private static void relativeCSSBySiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input +input")).sendKeys("DemoUser12345");
	}
}
