package com.origin.originweb.testauto.test;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


import com.origin.originweb.testauto.steps.OriginFractalLoadSteps;
import com.wv.auto.framework.utils.Reporter;

public class WebTestOriginFractalWebBase extends OriginFractalWebBaseTest {
	@BeforeMethod
	public void beforeMethod() {
		print("This is Origin Fractal WebSite Load Test beforeMethod");
	}
	protected void goToUrl(WebDriver driver) throws  FindFailed  {
		print("Inside testLogin");
		OriginFractalLoadSteps Page = new OriginFractalLoadSteps(driver);
		print("Inside testLogin - Page Opened");
		Page.goToURL();
	}	

	@AfterMethod
	public void JenkisMail () {
		if(Reporter.jenkinsResult!=0) {
//			Assert.assertTrue(Reporter.jenkinsMail==0);
			Assert.assertEquals(Reporter.jenkinsResult, 0, "FAILED");
		}
	}

	@AfterSuite
	public void afterMethod() {
		print("This is Origin Fractal Web Test afterMethod");
		if(driver!=null)
			driver.quit();
	}

}
