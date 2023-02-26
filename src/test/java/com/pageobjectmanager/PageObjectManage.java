package com.pageobjectmanager;

import com.pages.LoginPage;

public class PageObjectManage {
	
	private LoginPage loginPage;
	
	public LoginPage getLoginPage()
	{
		return (loginPage==null?loginPage=new LoginPage():loginPage);
	}

}
