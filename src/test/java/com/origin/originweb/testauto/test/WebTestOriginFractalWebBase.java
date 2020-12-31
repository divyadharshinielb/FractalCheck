package com.origin.originweb.testauto.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.origin.originweb.testauto.steps.OriginFractalSteps;
import com.wv.auto.framework.utils.Reporter;

public class WebTestOriginFractalWebBase extends OriginFractalWebBaseTest {
	@BeforeMethod
	public void beforeMethod() {
	}
	protected void goToUrl(WebDriver driver) {
		print("Inside testLogin");
		OriginFractalSteps Page = new OriginFractalSteps(driver);
		print("Inside testLogin - Page Opened");
		Page.goToURL();
	}
	@AfterMethod
	public void JenkisMail () {
		if(Reporter.jenkinsMail!=0) {
//			Assert.assertTrue(Reporter.jenkinsMail==0);
			Assert.assertEquals(Reporter.jenkinsMail, 0, "FAILED");
		}
	}

	@AfterSuite
	public void afterMethod() {
		print("This is Origin Fractal Web Test afterMethod");
		if(driver!=null)
			driver.quit();
	}

}
