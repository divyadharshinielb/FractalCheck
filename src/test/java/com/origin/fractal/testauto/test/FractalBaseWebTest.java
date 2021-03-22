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
	//Added by vignesh on 5-Nov-20
	protected void doLoginUser(WebDriver driver) {
		print("change testLogin");
		LoginSteps loginSteps = new LoginSteps(driver);
		print("Inside testLogin - Page Opened");
		loginSteps.doLoginUser();
		wait(5);	
	}
	//Ends
	
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
	
	//Added by vignesh (WVI) on 10/April/2020
			protected void siteAdminLoginwithcookies(WebDriver driver) {
				print("Inside testLogin");
				LoginSteps loginSteps = new LoginSteps(driver);
				print("Inside testLogin - Page Opened");
				loginSteps.siteAdminLoginwithcookies();
				wait(5);
			}
			protected void siteAdminLogin(WebDriver driver) {
				print("Inside testLogin");
				LoginSteps loginSteps = new LoginSteps(driver);
				print("Inside testLogin - Page Opened");
				loginSteps.siteAdminLogin();
				wait(5);
			}
			protected void loginInstructorwithCookies(WebDriver driver,String instUserID,String instPassword) {
				print("Inside testLogin");
				LoginSteps loginSteps = new LoginSteps(driver);
				print("Inside testLogin - Page Opened");
				loginSteps.loginInstructorwithCookies(instUserID,instPassword);
				wait(5);
			}
			protected void loginInstructor(WebDriver driver,String instUserID,String instPassword) {
				print("Inside testLogin");
				LoginSteps loginSteps = new LoginSteps(driver);
				print("Inside testLogin - Page Opened");
				loginSteps.loginInstructor(instUserID,instPassword);
				wait(5);
			}
		//Ends
			//added by mahesh
			protected void preLogin(WebDriver driver) throws IOException {
				print("Inside testLogin");
				AdminLoginSteps adminloginSteps = new AdminLoginSteps(driver);
				print("Inside testLogin - Page Opened");
				adminloginSteps.preLogin();
				wait(5);
			}
}
