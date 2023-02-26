package com.reports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class GenerateReport {
	
	public static void generateJVMReport(String jsonFile) throws FileNotFoundException, IOException{
		
		File file=new File(System.getProperty("user.dir")+"\\target");
		
		Configuration configuration=new Configuration(file,"Instagram");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("Version","1.1.1.1");
		configuration.addClassifications("OS","Windows-11");
		configuration.addClassifications("Sprint","30");
		
		
		ArrayList<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder rb=new ReportBuilder(jsonFiles,configuration);
		rb.generateReports();
		
	
	}
	

}
