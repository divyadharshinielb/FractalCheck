package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AdminPaginationPage;
/* File Name: AdminPaginationSteps.java
 * Purpose: Check for pagination in admin side -FR1-2497
 * Number of Testcases: 4
 * Created by: DivyaDharshini
 * Created on: 28-July-2020
 */

public class AdminPaginationSteps extends FractalBaseStep {

	public AdminPaginationPage page;
	public AdminPaginationSteps(WebDriver driver) {
		page = new AdminPaginationPage(driver);
		fBPage = page;
	}
	/*
	 * function: paginationLearningObject()
	 * covers: It covers navigation of paginationLearningObject function in AdminPaginationPage
	 */
	public void paginationLearningObject() {
		result ="PASSED";
		try {
			page.paginationLearningObject();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: learningobjectWithCategoryFilter()
	 * covers: It covers navigation of learningobjectWithCategoryFilter function in AdminPaginationPage
	 */
	public void learningobjectWithCategoryFilter() {
		result ="PASSED";
		try {
			page.learningobjectWithCategoryFilter();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: paginationCatalogPage()
	 * covers: It covers navigation of paginationCatalogPage function in AdminPaginationPage
	 */
	public void paginationCatalogPage() {
		result ="PASSED";
		try {
			page.paginationCatalogPage();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: catalogpageWithCategoryFilter()
	 * covers: It covers navigation of catalogpageWithCategoryFilter function in AdminPaginationPage
	 */
	public void catalogpageWithCategoryFilter() {
		result ="PASSED";
		try {
			page.catalogpageWithCategoryFilter();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}


}