package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ForgotPasswordPage;

public class ForgotPasswordSteps extends FractalBaseStep{
	private ForgotPasswordPage page=null;
	public ForgotPasswordSteps(WebDriver driver) {
		page = new ForgotPasswordPage(driver);
		fBPage = page;
	}
	
	public void clickForgotPasswordLink() {
		result ="PASSED";
		   try {
			   page.clickForgotPasswordLink();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyForgotPasswordLabels() {
		result ="PASSED";
		   try {
				page.verifyForgotPasswordLabels();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
}
