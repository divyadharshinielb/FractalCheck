package com.origin.fractal.testauto.steps.mobile;


import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.mobile.*;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MAWhatsNewSteps extends FractalBaseStep{
	private MAWhatsNewPage page;

	public MAWhatsNewSteps(AppiumDriver<MobileElement> appDriver) {
		page = new MAWhatsNewPage(appDriver);
	}

	public void validateWhatsNewPage() {
		page.validateWhatsNewPage();
	}
	
	public void clickLater() {
		page.clickLater();
	}
	/*Starts - added by Manju Priya A on Jan_11_19*/
	public void verifyWhatsNewLaterBtn() {
		result = "Passed";
		try{
			page.verifyWhatsNewLaterBtn();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	/*Ends - added by Manju Priya A on Jan_11_19*/
	
}
