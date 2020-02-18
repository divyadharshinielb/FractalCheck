package com.origin.fractal.testauto.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.origin.fractal.testauto.steps.AdminLoginSteps;
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
	protected void loginToContentAdmin(WebDriver driver) throws IOException {
		print("Inside testLogin");
		AdminLoginSteps adminloginSteps = new AdminLoginSteps(driver);
		print("Inside testLogin - Page Opened");
		adminloginSteps.loginToContentAdmin();
		wait(5);
	}
	protected void loginToInstructor(WebDriver driver) {
		print("change testLogin");
		LoginSteps loginSteps = new LoginSteps(driver);
		print("Inside testLogin - Page Opened");
		loginSteps.loginToInstructor();
		wait(5);

		}
}
