package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ResumeLearningPage;
/* File Name: ResumeLearningSteps.java
 * Purpose: resume learning re-direction with INPROGRESS and COMPLETED-5246
 * Number of Testcases: 3
 * Created by: Mahesh
 * Created on: 15-11-2021
 */

public class ResumeLearningSteps extends FractalBaseStep {
	public ResumeLearningPage page=null;


	public ResumeLearningSteps(WebDriver driver) {
		page = new ResumeLearningPage(driver);
		fBPage = page;
	}
	/*
	 * function: CompareResumeCatalogText()
	 * covers: It covers Comparing ResumeCatalog Text
	 */
	public void CompareResumeCatalogText() {
		result ="PASSED";
		   try {
			page.CompareResumeCatalogText();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
 }/*
	 * function: verifyResumeCatalogLabel()
	 * covers: It covers Verifying Resumecatalolabel page
	 */
	public void verifyResumeCatalogLabel() {
		result ="PASSED";
		   try {
			page.verifyResumeCatalogLabel();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	/*
	 * function: verifyResumeCount()
	 * covers: It covers verfying Resume catalog resource count
	 */
	public void verifyResumeCount() {
		result ="PASSED";
		   try {
			page.verifyResumeCount();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
}
