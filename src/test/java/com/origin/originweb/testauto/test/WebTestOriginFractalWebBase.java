package com.origin.originweb.testauto.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.origin.originweb.testauto.pages.OriginFractalLoadPage;
import com.origin.originweb.testauto.steps.OriginFractalLoadSteps;

public class WebTestOriginFractalWebBase extends OriginFractalWebBaseTest {
	@BeforeMethod
	public void beforeMethod() {
	}
	protected void goToUrl(WebDriver driver) {
		print("Inside testLogin");
		OriginFractalLoadSteps Page = new OriginFractalLoadSteps(driver);
		print("Inside testLogin - Page Opened");
		Page.goToURL();
	}
	@AfterMethod
	public void afterMethod() {
		print("This is Origin Fractal Web Test afterMethod");
		if(driver!=null)

			driver.quit();
	}

}
