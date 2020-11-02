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
		 result ="Passed";
		   try {
				page.verifyAccountPageLabels();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="Failed";
		   }

	}
	public void verifyProfileDetails() {
		 result ="Passed";
		   try {
				page.verifyProfileDetails();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="Failed";
		   }

	}
	public void verifyEmptyProfileValidation() {
		 result ="Passed";
		   try {
				page.verifyEmptyProfileValidation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="Failed";
		   }
	
	}

	public void verifyAfterCancelValidation() {
		 result ="Passed";
		   try {
				page.verifyAfterCancelValidation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="Failed";
		   }

	}
	public void verifyFieldValidation() {
		 result ="Passed";
		   try {
				page.verifyFieldValidation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="Failed";
		   }
	
	}
	public void changePassword() {
		 result ="Passed";
		   try {
				page.changePassword();	
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="Failed";
		   }
	
	}
	public void afterChangePassword() {
		 result ="Passed";
		   try {
				page.afterChangePassword();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="Failed";
		   }
	
		
	}
}