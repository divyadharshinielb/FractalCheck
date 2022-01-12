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
		try {
			page.doLogin();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Could not open login page";
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
	//Added by vignesh (WVI) on 10/April/20 and Updated on 25-Nov-20
		public void siteAdminLoginwithcookies() {
			result ="PASSED";
			try{
				page.siteAdminLoginwithcookies();
			}catch(Exception e){
				result="FAILED";
			}
		}
		public void siteAdminLogin() {
			result ="PASSED";
			try{
				page.siteAdminLogin();
			}catch(Exception e){
				result="FAILED";
			}
		}
		public void loginInstructorwithCookies(String instUserID,String instPassword) {
			result ="PASSED";
			try{
				page.loginInstructorwithCookies(instUserID,instPassword);
			}catch(Exception e){
				result="FAILED";
			}
		}
		public void loginInstructor(String instUserID,String instPassword) {
			result ="PASSED";
			try{
				page.loginInstructor(instUserID,instPassword);
			}catch(Exception e){
				result="FAILED";
			}
		}
		//Ends

		//Added by vignesh (WVI) on 16-Nov-20 and Updated on 25-Nov-20
		public void logOutUser() {
			result ="PASSED";
			try {
				page.logOutUser();
			}catch(Exception e) {
				print("Logout issue found");
				result="FAILED";
			}
			wait(3);
		}

		/* Function name: adminLogout()
		 * Action: admin logout
		 * Return Type: void
		 */
		public void adminLogout() {
			result ="PASSED";
			try{page.adminLogout();
			wait(5);
			}catch(Exception e){
				result="FAILED";
			}
		}
		//Ends

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
}
