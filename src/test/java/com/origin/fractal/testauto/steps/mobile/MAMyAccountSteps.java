package com.origin.fractal.testauto.steps.mobile;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.mobile.MAMyAccountPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MAMyAccountSteps extends FractalBaseStep{//extends by Jan_16_19
	private MAMyAccountPage page;

	public MAMyAccountSteps(AppiumDriver<MobileElement> appDriver) {
		page = new MAMyAccountPage(appDriver);
	}
	//Jan_16_19
	public void verifyUserDeatils() {
		result = "Passed";
		try {
			page.verifyUserDeatils();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Jan_16_19
	public void verifyFirstLastNameWithSpace(String fName, String lName) {
		result = "Passed";
		try {
			page.verifyFirstLastNameWithSpace(fName, lName);
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Jan_16_19
	public void verifyFirstLastNameWithNos(String fName, String lName) {
		result = "Passed";
		try {
			page.verifyFirstLastNameWithNos(fName, lName);
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Jan_16_19
	public void verifyFirstLastNameWithSpecialChars(String fName, String lName) {
		result = "Passed";
		try {
			page.verifyFirstLastNameWithSpecialChars(fName, lName);
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Jan_16_19
	public void verifyWithValidCredential(String fName, String lName) {
		result = "Passed";
		try {
			page.verifyWithValidCredential(fName, lName);
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	/*Starts - added by Manju Priya A on Jan-22-19*/
	public void verifyInvalidPassCredentials(String fName, String lName) {
		result = "Passed";
		try {
			page.verifyInvalidPassCredentials(fName, lName);
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	/*Ends - added by Manju Priya A on Jan-22-19*/
	
}
