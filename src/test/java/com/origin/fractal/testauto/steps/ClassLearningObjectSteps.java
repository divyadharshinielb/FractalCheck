package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassLearningObjectPage;
/* File Name: ClassLearningObjectSteps.java
 * Purpose: FR1-3774 - Class Learning object creation and deletion
 * Number of Testcases: 3
 * Created by: DivyaDharshini R
 * Created on: 05-03-2021
 * Updated on: 25-03-2021
 * Edited based on FR1-4627 - 13/11/2021
 */
public class ClassLearningObjectSteps extends FractalBaseStep {
	private ClassLearningObjectPage page;
	public ClassLearningObjectSteps(WebDriver driver) {
		page = new ClassLearningObjectPage(driver);
		fBPage = page;
	}
	/*
	 * function: classLOCreation()
	 * covers: It covers navigation of classLOCreation() function in ClassLearningObjectPage
	 */

	public void classLOCreation() {
		result ="PASSED";
		try {
			page.classLOCreation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: classLOInvalidLinkValidation()
	 * covers: It covers navigation of classLOInvalidLinkValidation() function in ClassLearningObjectPage
	 */
	public void classLOInvalidLinkValidation() {
		result ="PASSED";
		try {
			page.classLOInvalidLinkValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: classLOEmptyFieldValidation()
	 * covers: It covers navigation of classLOEmptyFieldValidation() function in ClassLearningObjectPage
	 */
	public void classLOEmptyFieldValidation() {
		result ="PASSED";
		try {
			page.classLOEmptyFieldValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: editAndDeleteClassLO()
	 * covers: It covers navigation of editAndDeleteClassLO() function in ClassLearningObjectPage
	 */
	public void editAndDeleteClassLO() {
		result ="PASSED";
		try {
			page.editAndDeleteClassLO();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: userPartClassLO()
	 * covers: It covers navigation of userPartClassLO() function in ClassLearningObjectPage
	 */
	public void userPartClassLO() {
		result ="PASSED";
		try {
			page.userPartClassLO();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}



}