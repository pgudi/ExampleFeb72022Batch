package com.sgtesting.actitime.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@Given("^I launch a Chrome browser$")
	public void I_launch_a_Chrome_browser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@And("^I navigate the URL of the application$")
	public void I_navigate_the_URL_of_the_application()
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
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@And("^I enter the username in username text field$")
	public void I_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@When("^I enter the password in Password text field$")
	public void I_enter_the_password_in_Password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@And("^I click on login button$")
	public void I_click_on_login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@Then("^I find the Home Page$")
	public void I_find_the_Home_Page()
	{
		WebElement oEle=null;
		try
		{
			oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());	
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@When("^I click on logout link$")
	public void I_click_on_logout_link()
	{
		WebElement oEle=null;
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@And("^I minimize the flyout window$")
	public void I_minimize_the_flyout_window()
	{
		WebElement oEle=null;
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@Then("^I find the Login Page$")
	public void I_find_the_Login_Page()
	{
		String expected="actiTIME - Login";
		try
		{
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Created Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 */
	@And("^I close the Application$")
	public void I_close_the_Application()
	{
		String expected="actiTIME - Login";
		try
		{
			oBrowser.quit();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
