package com.stepdefinition;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManage;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TC1_LoginStep extends BaseClass {

	PageObjectManage pom=new PageObjectManage();
	
	@Given("User is in the Instagram Login Page")
	public void userIsInTheInstagramLoginPage() {
		
//		launchBrowser("Chrome");
//		driver.get("https://www.instagram.com/accounts/login/");
//		driver.manage().window().maximize();
		    
	}
	@When("User Giving Valid Crdentials using {string} and {string}")
	public void userGivingValidCrdentialsUsingAnd(String username, String password) throws InterruptedException {
		pom.getLoginPage().instaLoginMethod(username, password);

	}
	@Then("User Should Navigate to Home Page and Verify the Message {string}")
	public void userShouldNavigateToHomePageAndVerifyTheMessage(String string) throws InterruptedException {
		
		pom.getLoginPage().getSecurity1().click();
		pom.getLoginPage().getSecurity2().click();
		Assert.assertEquals("Verify Login Page Success Message",string, pom.getLoginPage().getInstaLoginVerify().getText());
	    
	}



}
