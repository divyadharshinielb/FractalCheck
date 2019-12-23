package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AccountPage;



public class AccountSteps extends FractalBaseStep {
	private AccountPage page=null;
	
	public AccountSteps(WebDriver driver) {
		page = new AccountPage(driver);
		fBPage = page;
	}

	public void verifyAccountPageLabels() {
		 result ="PASSED";
		   try {
				page.verifyAccountPageLabels();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }

	}
	public void verifyProfileDetails() {
		 result ="PASSED";
		   try {
				page.verifyProfileDetails();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }

	}
	public void verifyEmptyProfileValidation() {
		 result ="PASSED";
		   try {
				page.verifyEmptyProfileValidation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
	}

	public void verifyAfterCancelValidation() {
		 result ="PASSED";
		   try {
				page.verifyAfterCancelValidation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }

	}
	public void verifyFieldValidation() {
		 result ="PASSED";
		   try {
				page.verifyFieldValidation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
	}
	public void changePassword() {
		 result ="PASSED";
		   try {
				page.changePassword();	
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
	}
	public void afterChangePassword() {
		 result ="PASSED";
		   try {
				page.afterChangePassword();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
		
	}
}