package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;
/*
 * File: PreLoginSteps.java
 * Purpose: PreLoginSteps (FR1-2994) - Step level code
 * Created by: Mahesh G
 * Updated on: 5-11-2020
 */

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassroomEventPage;
import com.origin.fractal.testauto.pages.ImportExportPage;
import com.origin.fractal.testauto.pages.ManageContentPage;
import com.origin.fractal.testauto.pages.PreLoginPage;

public class PreLoginSteps extends FractalBaseStep {
	private PreLoginPage page;
	public PreLoginSteps(WebDriver driver) {
		page = new PreLoginPage(driver);
		fBPage = page;
	}
	/* Method: LoginPageElements() 
	 * purpose: verify the login page elements
	 */
	public void LoginPageElements() {
		result ="PASSED";
		   try {
			page.LoginPageElements();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: preLoginPageFiltersVerification() 
	 * purpose: verify the prelogin page filters
	 */
	public void preLoginPageFiltersVerification() {
		result ="PASSED";
		   try {
			page.preLoginPageFiltersVerification();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: signUpFunction() 
	 * purpose: verify the signup functionality
	 */
	public void signUpFunction() {
		result ="PASSED";
		   try {
			page.signUpFunction();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: forBusiness() 
	 * purpose: verify the business user page
	 */
	public void forBusiness() {
		result ="PASSED";
		   try {
			page.forBusiness();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: loginFunction() 
	 * purpose: verify the login page
	 */
	public void loginFunction() {
		result ="PASSED";
		   try {
			page.loginFunction();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: clickWhiteLabel() 
	 * purpose: verify the prelogin page filters
	 */
	public void clickWhiteLabel() {
		result ="PASSED";
		   try {
			page.clickWhiteLabel();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: preloginAdmin() 
	 * purpose: verify the prelogin admin page
	 */
	public void preloginAdmin() {
		result ="PASSED";
		   try {
			page.preloginAdmin();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/* Method: wishlistFlowCheck() 
	 * purpose: verify the wishlist Flow user part
	 */
	public void wishlistFlowCheck() {
		result ="PASSED";
		   try {
			page.wishlistFlowCheck();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
}
