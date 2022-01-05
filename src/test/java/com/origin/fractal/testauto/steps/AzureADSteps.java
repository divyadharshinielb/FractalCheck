package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AzureADPage;

/* File Name: AzureADSteps.java
 * Purpose: Check for AzureAD -FR1-5236
* Number of Testcases: 2
* Created by: Mahesh
* Created on: 30-12-2021
*/
public class AzureADSteps extends FractalBaseStep{ 
	public AzureADPage page;
	public AzureADSteps(WebDriver driver) {
		page = new AzureADPage(driver);
		fBPage = page;
	} 
	/*
	 * function: enableSSO()
	 * covers: It covers navigation of enableSSO
	 */
	public void enableSSO() {
		result ="PASSED";
		   try {
			page.enableSSO();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/*
	 * function: verifySSOBtn()
	 * covers: It covers navigation of verifySSOBtn
	 */
	public void verifySSOBtn() {
		result ="PASSED";
		   try {
			page.verifySSOBtn();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
}
