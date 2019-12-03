package com.origin.fractal.testauto.steps.mobile;


import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.mobile.MASelectInstancePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MASelectInstanceSteps extends FractalBaseStep{
	private MASelectInstancePage page;

	public MASelectInstanceSteps(AppiumDriver<MobileElement> appDriver) {
		page = new MASelectInstancePage(appDriver);
	}

	public void validateInstanceSelectionPage() {
		page.validateInstanceSelectionPage();
	}
	
	public void swipeInstances() {
		page.swipeInstances();
	}
	
	public void selectFractal() {
		page.selectFractal();
	}
	public void selectFractalDemo() {
		page.selectFractalDemo();
	}

	public void verifyInstances() {
		result = "Passed";
		try{
			page.verifyInstances();
		}catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyFractalSelection() {
		result = "Passed";
		try{
			page.verifyFractalSelection();
		}catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyFractalDemoSelection() {
		result = "Passed";
		try{
			page.verifyFractalDemoSelection();
		}catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
}
