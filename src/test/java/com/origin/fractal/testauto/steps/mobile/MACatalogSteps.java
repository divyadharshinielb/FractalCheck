package com.origin.fractal.testauto.steps.mobile;


import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.mobile.*;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MACatalogSteps extends FractalBaseStep{
	private MACatalogPage page;

	public MACatalogSteps(AppiumDriver<MobileElement> appDriver) {
		page = new MACatalogPage(appDriver);
	}

	public void validateCatalogPageTile() {
		result = "Passed";
		try {
			page.validateCatalogPageTile();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	
	public void verifyBuyPresence() {
		result = "Passed";
		try {
			page.verifyBuyPresence();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyPopularCategory() {
		result = "Passed";
		try {
			page.verifyPopularCategory();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyWhatsNewContents() {
		result = "Passed";
		try {
			page.verifyWhatsNewContents();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}

	public void verifyFilterExist() {
		result = "Passed";
		try {
			page.verifyFilterExist();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}

	public void verifyBuyButton() {
		result = "Passed";
		try {
			page.verifyBuyButton();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyCategory() {
		result = "Passed";
		try {
			page.verifyCategory();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyListView() {
		result = "Passed";
		try {
			page.verifyListView();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyGridView() {
		result = "Passed";
		try {
			page.verifyGridView();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}

	public void verifyBundleFilter() {
		result = "Passed";
		try {
			page.verifyBundleFilter();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyLpathFilter() {
		result = "Passed";
		try {
			page.verifyLpathFilter();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyCourseFilter() {
		result = "Passed";
		try {
			page.verifyCourseFilter();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyResourceFilter() {
		result = "Passed";
		try {
			page.verifyResourceFilter();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}

	public void verifyAllFilter() {
		result = "Passed";
		try {
			page.verifyAllFilter();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyLangFilter() {
		result = "Passed";
		try {
			page.verifyLangFilter();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
}
