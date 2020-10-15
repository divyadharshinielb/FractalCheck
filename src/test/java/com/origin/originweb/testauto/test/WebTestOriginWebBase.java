package com.origin.originweb.testauto.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.origin.originweb.testauto.pages.OriginLearningLoadPage;

public class WebTestOriginWebBase extends OriginWebBaseTest {
	@BeforeMethod
	public void beforeMethod() {
	}
	protected void goToUrl(WebDriver driver) {
		print("Inside testLogin");
		OriginLearningLoadPage samplePage = new OriginLearningLoadPage(driver);
		print("Inside testLogin - Page Opened");
		samplePage.goToURL();
	}
	@AfterMethod
	public void afterMethod() {
		print("This is Origin learning Web Test afterMethod");
		if(driver!=null)
			driver.quit();
	}

}
