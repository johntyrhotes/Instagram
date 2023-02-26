package com.pages;

import java.util.concurrent.TimeUnit;

import com.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement instaUsername;
	
	@FindBy(name="password")
	private WebElement instaPassword;
	
	@FindBy(xpath="//div[text()='Log in']")
	private WebElement instaLogin;
	
	@FindBy(xpath="//a[text()='johntyrhotes']")
	private WebElement instaLoginVerify;
	
	@FindBy(xpath="//button[text()='Not now']")
	private WebElement security1;
	
	@FindBy(xpath="//button[text()='Not Now']")
	private WebElement security2;
	
	public WebElement getInstaUsername()
	{
		return instaUsername;
	}

	public WebElement getInstaPassword() {
		return instaPassword;
	}

	public WebElement getInstaLogin() {
		return instaLogin;
	}
	
	public WebElement getInstaLoginVerify() {
		return instaLoginVerify;
	}
	
	
	public WebElement getSecurity1() {
		return security1;
	}

	public WebElement getSecurity2() {
		return security2;
	}

	public void instaLoginMethod(String username,String password) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		getInstaUsername().sendKeys(username);
		getInstaPassword().sendKeys(password);
		getInstaLogin().click();
//		Thread.sleep(2000);

	}
	

}

