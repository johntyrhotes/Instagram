package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	
	@Before
	public void beforeAll() throws FileNotFoundException, IOException {
		launchBrowser(getPropertyFileValue("browser"));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
	}
	
	@After
	public void afterAll(Scenario scenario) {
		
		if(scenario.isFailed())
		{
			TakesScreenshot ss=(TakesScreenshot)driver;
			byte[] screenShot=ss.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "Picture/img", "Every Scenario");
		}
		

	}
	
	

}
