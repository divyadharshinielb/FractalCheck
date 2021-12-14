package com.origin.fractal.testauto.steps.mobile;


import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.mobile.*;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MAMenuOptionsSteps extends FractalBaseStep{//extends by Jan_16_19
	private MAMenuOptionsPage page;

	public MAMenuOptionsSteps(AppiumDriver<MobileElement> appDriver) {
		page = new MAMenuOptionsPage(appDriver);
	}

	public void validateCategoryPresence() {
		result = "Passed";
		try
		{
			page.validateCategoryPresence();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
		
	}
	
	public void clickOnCategory() {
		result = "Passed";
		try
		{
			page.clickOnCategory();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	
	public void clickOnLogout() {
	//	page.clickOnLogout();
		result = "Passed";
		try
		{
			page.clickOnLogout();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Jan_19_19
	public void verifyMenusFunctionality() {
		result = "Passed";
		try
		{
			page.verifyMenusFunctionality();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Jan_19_19
	public void verifyCloseMenuFunctionality() {
		result = "Passed";
		try {
			page.verifyCloseMenuFunctionality();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void clickOnMyAccount() {
		result = "Passed";
		try {
			page.clickOnMyAccount();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}

	public void closeMenu() {
		result = "Passed";
		try {
			page.closeMenu();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
		
		
	}
	//Added By Manju on Jan_11_19
	public void clickOnMyLearning() {
		result = "Passed";
		try {
			page.clickOnMyLearning();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
}
