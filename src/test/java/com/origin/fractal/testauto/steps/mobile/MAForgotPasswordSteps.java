package com.origin.fractal.testauto.steps.mobile;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.mobile.MAForgotPasswordPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MAForgotPasswordSteps extends FractalBaseStep{
	private MAForgotPasswordPage page;
	   
	   public MAForgotPasswordSteps(AppiumDriver<MobileElement> appDriver) {
			page = new MAForgotPasswordPage(appDriver);
		}
	   public void verifyForgotPassword() {
		   result = "Passed";
		   try{
			   page.verifyForgotPassword();
		   }catch(Exception e) {
			   result = "FAILED";
			   e.printStackTrace();
		   }
		}
		public void verifyEmailError() {
		   result = "Passed";
		   try{
			   page.verifyEmailError();
		   }catch(Exception e) {
			   result = "FAILED";
			   e.printStackTrace();
		   }
		}
		//******mahesh20/12/2018*********//
		public void verifyNewPassError() {
			result = "Passed";
			   try{
				   page.verifyNewPassError();
			   }catch(Exception e) {
				   result = "FAILED";
				   e.printStackTrace();
			   }
		}
		//*****************//
		//Starts - Added by Manju Priya A on jan_17_19
				public void verifyWithInvalidDBEmail() {
				   result = "Passed";
				   try{
					   page.verifyWithInvalidDBEmail();
				   }catch(Exception e) {
					   result = "FAILED";
					   e.printStackTrace();
				   }
				}
				public void verifyOTPSentPopup() {
				   result = "Passed";
				   try{
					   page.verifyOTPSentPopup();
				   }catch(Exception e) {
					   result = "FAILED";
					   e.printStackTrace();
				   }
				}
				public void verifyConfirmPassPage() {
				   result = "Passed";
				   try{
					   page.verifyConfirmPassPage();
				   }catch(Exception e) {
					   result = "FAILED";
					   e.printStackTrace();
				   }
				}
				public void verifyInvalidOTPErrorMsg() {
				   result = "Passed";
				   try{
					   page.verifyInvalidOTPErrorMsg();
				   }catch(Exception e) {
					   result = "FAILED";
					   e.printStackTrace();
				   }
				}
				public void verifyOTPReceivedToEmail() {
				   result = "Passed";
				   try{
					   page.verifyOTPReceivedToEmail();
				   }catch(Exception e) {
					   result = "FAILED";
					   e.printStackTrace();
				   }
				}
				public void verifyOTPWorkfFine() {
				   result = "Passed";
				   try{
					   page.verifyOTPWorkfFine();
				   }catch(Exception e) {
					   result = "FAILED";
					   e.printStackTrace();
				   }
				}
				public void verifyChangePassPage() {
				   result = "Passed";
				   try{
					   page.verifyChangePassPage();
				   }catch(Exception e) {
					   result = "FAILED";
					   e.printStackTrace();
				   }
				}
				public void verifyPasswordChange() {
				   result = "Passed";
				   try{
					   page.verifyPasswordChange();
				   }catch(Exception e) {
					   result = "FAILED";
					   e.printStackTrace();
				   }
				}
				//Ends - Added by Manju Priya A on jan_17_19
}
