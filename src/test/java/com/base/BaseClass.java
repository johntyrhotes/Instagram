package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browser)
	{
		switch(browser)
		{
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			case "IE":
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			default:
				System.out.println("please enter a correct browser name from list"
						+ "\n1.Chrome\n2.Firefox\n3.IE\n4.Edge");
				break;
			
		}
	}
	
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties property=new Properties();
		property.load(new FileInputStream("C:\\Users\\johnt\\workspace-eclipse\\Instagram\\Config\\config.properties"));
		String value = (String)property.get(key);
		return value;

	}

}
