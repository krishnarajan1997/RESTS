package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepdefinition.JVM;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources"},glue= {"com.stepdefinition"},monochrome=true,dryRun=false,plugin= {"html:Report","pretty","html:Report","json:Report//output.json","junit:Report//out.xml"})
public class TestRunner {
	@AfterClass
	public static void rep() {
		// TODO Auto-generated method stub
//JVM.generateJVM("C:\\Users\\DELL\\eclipse-workspace\\Hook\\Report\\output.json");
}}
//plugin= {"html:Report","json:Report//output.json","rerun:src//test//resources//Report/failed.txt"}