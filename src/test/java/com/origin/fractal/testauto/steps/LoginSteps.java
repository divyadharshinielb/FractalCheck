package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.LoginPage;

public class LoginSteps extends FractalBaseStep {

	private LoginPage page;

	public LoginSteps(WebDriver driver) {
		page = new LoginPage(driver);
		fBPage = page;
	}

	public void doLogin() {
		result ="PASSED";
		try {
			page.doLogin();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void loginToContentAdmin() {
		result ="PASSED";
		try {
			page.loginToContentAdmin();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void loginToInstructor() {
		result ="PASSED";
		try {
			page.loginToInstructor();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	public void loginPageVerification() {
		result ="PASSED";
		try {
			page.loginPageVerification();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	//Starts - Added by Mahesh on Feb_06_19
	public void verifypasswordField() {
		result ="PASSED";
		try {
			page.verifypasswordField();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	//end

	public void rememberMe() {
		result ="PASSED";
		try {
			page.rememberMe();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void registerFunction() {
		result ="PASSED";
		try {
			page.registerFunction();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void blankPasswordVerification() {
		result ="PASSED";
		try {
			page.blankPasswordVerification();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void blankUserName() {
		result ="PASSED";
		try {
			page.blankUserName();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void inValid() {
		result ="PASSED";
		try {
			page.inValid();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void doLogin1() {
		result ="PASSED";
		try {
			page.doLogin1();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	//Added by vignesh on 5-Nov-20
	public void doLoginUser() {
		result ="FAILED";
		try {
			page.doLoginUser();
			result="PASSED";
		}
		catch(Exception e)
		{
			result="FAILED";
		}
	}
	//Ends

	public void inValidPassword() {
		result ="PASSED";
		try {
			page.inValidPassword();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	public void verifySearchLink() {
		result ="PASSED";
		try {
			page.verifySearchLink();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void googleBtn() {
		result ="PASSED";
		try {
			page.googleBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void facebookButton() {
		result ="PASSED";
		try {
			page.facebookButton();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	//Added by vignesh (WVI) on 10/April/20
	public void siteAdminLoginwithcookies() {
		page.siteAdminLoginwithcookies();
	}
	public void siteAdminLogin() {
		page.siteAdminLogin();
	}
	public void loginInstructorwithCookies(String instUserID,String instPassword) {
		page.loginInstructorwithCookies(instUserID,instPassword);
	}
	public void loginInstructor(String instUserID,String instPassword) {
		page.loginInstructor(instUserID,instPassword);
	}
	//Ends
	
	//Added by vignesh (WVI) on 16-Nov-20
		public void logOutUser() {
			try {
				page.logOutUser();
			}catch(Exception e) {
				print("Logout issue found");
			}
			wait(3);
		}
		
		/* Function name: adminLogout()
		 * Action: admin logout
		 * Return Type: void
		 */
		public void adminLogout() {
			try{page.adminLogout();
			wait(5);
			}catch(Exception e){
				result="FAILED";
			}
		}
		//Ends
}
