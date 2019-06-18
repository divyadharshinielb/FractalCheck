package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AccountPage;
import com.origin.fractal.testauto.pages.AccountPageNewUI;

public class AccountStepsNewUI extends FractalBaseStep{
private AccountPageNewUI page=null;
	
	public AccountStepsNewUI(WebDriver driver) {
		page = new AccountPageNewUI(driver);
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
			result="FAILED";
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
			result="FAILED";
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
			result="FAILED";
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
			result="FAILED";
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
			result="FAILED";
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
			result="FAILED";
		   }		
	}
}
