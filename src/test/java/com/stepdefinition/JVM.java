package com.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVM {
 
	public static void generateJVM(String json) {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\JVMREPORT");
		Configuration c=new Configuration(f, "ADACTIN");
		c.addClassifications("PLATFORM NAME","WINDOWS ");
		c.addClassifications("PLATFORM VERSION"," 10");
		c.addClassifications("PLATFORM BROWSER","GOOGLE CHROME");
		c.addClassifications("TESTER ","KRISHNA");
		
		List<String> jsonfiles=new ArrayList<String>();
		jsonfiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonfiles, c);
		r.generateReports();
	}
}
