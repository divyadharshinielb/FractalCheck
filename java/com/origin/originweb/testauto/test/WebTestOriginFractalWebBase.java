package com.origin.originweb.testauto.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.origin.originweb.testauto.pages.OriginFractalLoadPage;

public class WebTestOriginFractalWebBase extends OriginFractalWebBaseTest {
	@BeforeMethod
	public void beforeMethod() {
	}
	protected void goToUrl(WebDriver driver) {
		print("Inside testLogin");
		OriginFractalLoadPage Page = new OriginFractalLoadPage(driver);
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
