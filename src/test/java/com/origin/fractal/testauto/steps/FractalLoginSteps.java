package com.origin.fractal.testauto.steps;

import java.io.IOException;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.FractalLoginPage;

import jxl.common.Assert;

public class FractalLoginSteps extends FractalBaseStep {

	private FractalLoginPage page;

	public FractalLoginSteps(WebDriver driver) throws IOException {
		page = new FractalLoginPage(driver);
		fBPage = page;
	}
	public void verifyLogoandText() throws IOException {
		result="FAILED";
		try {
			if(page.loginToWVFInstance()) {
				result="PASSED"; 
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			result="FAILED";
		}
	}
	@Test
	public void verifyUserNameAndPassword() {
		result="FAILED";
		try {
			page.verifyUserNameAndPassword();
			result="PASSED";	
		}
		catch(NoSuchWindowException e) {
			e.printStackTrace();
			result="FAILED";
				
		}
		
	}
}