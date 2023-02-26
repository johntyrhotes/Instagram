package com.testrunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import com.base.BaseClass;
import com.reports.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\johnt\\workspace-eclipse\\Instagram\\src\\test\\resources\\Features\\TC1_Login.feature",
glue="com.stepdefinition",monochrome=true,publish=true,dryRun=false,snippets=SnippetType.CAMELCASE,tags="@Login",
stepNotifications=true,plugin= {"pretty","json:C:\\Users\\johnt\\workspace-eclipse\\Instagram\\target\\output.json"})
public class TestRunnerClass extends BaseClass {
	
	@AfterClass
	public static void GenerateReport() throws FileNotFoundException, IOException
	{
		GenerateReport.generateJVMReport(System.getProperty("user.dir")+"\\target\\output.json");
		driver.quit();
		
	}

}
