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
		page.validateCategoryPresence();
	}
	
	public void clickOnCategory() {
		page.clickOnCategory();
	}
	
	public void clickOnLogout() {
		page.clickOnLogout();
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
		page.clickOnMyAccount();
	}

	public void closeMenu() {
		page.closeMenu();
		
	}
	//Added By Manju on Jan_11_19
	public void clickOnMyLearning() {
		page.clickOnMyLearning();
	}
}
