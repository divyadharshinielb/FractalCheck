package com.origin.fractal.testauto.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.origin.fractal.testauto.steps.LoginSteps;


public class FractalBaseWebTest extends FractalBaseTest {
	
	protected void login(WebDriver driver) {
		print("Inside testLogin");
		LoginSteps loginSteps = new LoginSteps(driver);
		print("Inside testLogin - Page Opened");
		loginSteps.doLogin();
		wait(5);
		
	}
	protected void login1(WebDriver driver) {
		print("change testLogin");
		LoginSteps loginSteps = new LoginSteps(driver);
		print("Inside testLogin - Page Opened");
		loginSteps.doLogin1();
		wait(5);
		
	}
	@BeforeMethod
	public void beforeMethod() {
		// do nothing
	}

	@AfterMethod
	public void afterMethod() {
		print("This is fractalBaseWebTest afterMethod");

		if(driver!=null)
			driver.quit();
	}
	/*Starts - Added by Manjupriya A on Feb_07_19  for Admin*/
	protected void loginToContentAdmin(WebDriver driver) {
		print("Inside testLogin");
		LoginSteps loginSteps = new LoginSteps(driver);
		print("Inside testLogin - Page Opened");
		loginSteps.loginToContentAdmin();
		wait(5);
	}
	/*Ends - Added by Manjupriya A on Feb_07_19  for Admin*/
}
