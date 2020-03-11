package com.origin.fractal.testauto.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.FractalLoginPage;

public class FractalLoginSteps extends FractalBaseStep {
	private FractalLoginPage page;

	public FractalLoginSteps(WebDriver driver, String fractalInst, String fractInstUrl) throws IOException {

		page = new FractalLoginPage(driver, fractalInst, fractInstUrl);
		fBPage = page;  
	}

	public void verifyLogoandText() throws IOException {
		result = "FAILED";
		try {
			if (page.loginToFractalInstance()) {
				result = "PASSED";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "FAILED";
		}
	}

	public void verifyUserNameAndPassword() {
		result = "FAILED";
		try {
			page.verifyUserNameAndPassword();
			result = "PASSED";
		} catch (Exception e) {
			e.printStackTrace();
			result = "FAILED";
		}
	}
}