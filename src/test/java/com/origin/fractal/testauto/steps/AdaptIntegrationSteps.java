package com.origin.fractal.testauto.steps;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AdaptIntegrationPage;
/* File Name: AdaptIntegrationSteps.java
 * Purpose: Check for adapt icon in admin side 
 * Number of Test cases: 1
 * Created by: DivyaDharshini
 * Created on: 30-sept-2020
 */
public class AdaptIntegrationSteps extends FractalBaseStep{
	public AdaptIntegrationPage page;
	public AdaptIntegrationSteps(WebDriver driver) {
		page = new AdaptIntegrationPage(driver);
		fBPage = page;
	}
	/*
	 * function: iconVerification()
	 * covers: It covers navigation of iconVerification()  in AdaptIntegrationPage
	 */
	public void iconVerification() {
		result ="PASSED";
		try {
			page.iconVerification();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}	