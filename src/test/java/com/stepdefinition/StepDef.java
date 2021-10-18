package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class StepDef {
	
	WebDriver driver;
	
	@Given("^User able to open chrome browser$")
	public void user_able_to_open_chrome_browser()  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	    
	}

	@Given("^Put \"([^\"]*)\" and go to login page$")
	public void put_and_go_to_login_page(String arg1)  {
	    
	    driver.get(arg1);
	}

	@When("^User able to click Sign in button$")
	public void user_able_to_click_Sign_in_button()  {
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/header/div/div/div[1]/div[2]/ul/li[4]/a/div/p")).click();
	    
	}

	@When("^User able to use valid username \"([^\"]*)\"$")
	public void user_able_to_use_valid_username(String arg1)  {
	    
	    driver.findElement(By.xpath("//*[@id=\"input-email-address\"]")).sendKeys(arg1);
	}

	@When("^User able to put valid  password \"([^\"]*)\"$")
	public void user_able_to_put_valid_password(String arg1)  {
	    
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(arg1);
	}

	@When("^User able to click signin button$")
	public void user_able_to_click_signin_button()  {
	    
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/form/button")).click();
	}

	@When("^closing the browser$")
	public void closing_the_browser()  {
	    
	    driver.quit();
	}

}
