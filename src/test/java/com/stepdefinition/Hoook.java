package com.stepdefinition;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.helperclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hoook extends BaseClass {
	@Before(order=1)
	public void beforeAction() {
		WebDriverManager.chromedriver().setup();
		launchBrowser();
		launchUrl("http://adactin.com/HotelApp/index.php");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Before(order=2)
	public void before() {
		System.out.println(new Date());
	}

	@After(order=2)
	public void afterAction(Scenario sc) {
		if (sc.isFailed()) {
			TakesScreenshot t = (TakesScreenshot) driver;
			byte[] as = t.getScreenshotAs(OutputType.BYTES);
			sc.embed(as, "image/png");
		}
	pageQuit();
	}

	@Before(order=1)
	public void after() {
		System.out.println(new Date());
	}
}
