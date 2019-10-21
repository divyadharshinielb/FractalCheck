package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassroomCCPage;

public class ClassroomCCSteps extends FractalBaseStep {
	private ClassroomCCPage page;

	public ClassroomCCSteps(WebDriver driver) {
		page = new ClassroomCCPage(driver);
		fBPage = page;
	}
	//Added by Vignesh (WVI) on 04-Oct-19 & Updated on 14-Oct-19 

	public void addClassroomCClblSelection() {
		result ="PASSED";
		try {
			page.addClassroomCClblSelection();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void editClassroomCClblSelection() {
		result ="PASSED";
		try {
			page.editClassroomCClblSelection();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyAddClassroomCCLabelstxt() {
		try {
			page.verifyCCTexts();
			if (page.booleanresult == true) {
				result ="PASSED";
			}
			else if (page.booleanresult == true) {
				result ="FAILED";
			}
			else {
				result = "FAILED";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyEditClassroomCCLabelstxt() {
		try {
			page.verifyEditCCTexts();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == true) {
				result ="FAILED";
			}
			else {
				result = "FAILED";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}		

}