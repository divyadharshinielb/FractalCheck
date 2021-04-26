package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MaskingEmailIdPage;
/* File Name: MaskingEmailId.java
 * Purpose: Check for MaskingEmailId in admin and user part -FR1-3960
 * Number of Testcases: 4
 * Created by: Mahesh
 * Created on: 22/04/2021
 */
public class MaskingEmailIdSteps extends FractalBaseStep {
	public MaskingEmailIdPage page;
	public MaskingEmailIdSteps(WebDriver driver) {
		page = new MaskingEmailIdPage(driver);
		fBPage = page;
	} 
	/*
	 * function: gotoWhiteLabel()
	 * covers: It covers navigation of gotoWhiteLabel function in MaskingEmailpage 
	 */
	public void gotoWhiteLabel() {
		result ="PASSED";
		   try {
			page.gotoWhiteLabel();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/*
	 * function: enableMasking()
	 * covers: It covers navigation of enableMasking function in MaskingEmailpage 
	 */
	public void enableMasking() {
		result ="PASSED";
		   try {
			page.enableMasking();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/*
	 * function: adminMaskingVerify()
	 * covers: It covers navigation of adminMaskingVerify function in MaskingEmailpage 
	 */
	public void adminMaskingVerify() {
		result ="PASSED";
		   try {
			page.adminMaskingVerify();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/*
	 * function: userPartMailVerify()
	 * covers: It covers navigation of userPartMailVerify function in MaskingEmailpage 
	 */
	public void userPartMailVerify() {
		result ="PASSED";
		   try {
			page.userPartMailVerify();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
}
