package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
/* File Name: UserPaginationSteps.java
 * Purpose: Check for pagination in user side -FR1-2498
 * Number of Testcases: 5
 * Created by: DivyaDharshini
 * Created on: 08-Aug-2020

 */
import com.origin.fractal.testauto.pages.UserPaginationPage;
/* File Name: UserPaginationSteps.java
 * Purpose: Check for pagination in User side -FR1-2498
 * Number of Test cases: 5
 * Created by: DivyaDharshini
 * Created on: 08-Aug-2020
 */
public class UserPaginationSteps extends FractalBaseStep {

	public UserPaginationPage page;
	public UserPaginationSteps(WebDriver driver) {
		page = new UserPaginationPage(driver);
		fBPage = page;
	}
	//userpagination
	/*
	 * function: categoryLoadMore()
	 * covers: It covers navigation of categoryLoadMore() in UserPaginationPage
	 */
	public void categoryLoadMore() {
		result ="PASSED";
		try {
			page.categoryLoadMore();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: catalogpageWithCategoryFilter()
	 * covers: It covers navigation of catalogpageWithCategoryFilter() in UserPaginationPage
	 */
	public void categoryLoadMoreWithFilter() {
		result ="PASSED";
		try {
			page.categoryLoadMoreWithFilter();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: whatsnewLoadMore()
	 * covers: It covers navigation of whatsnewLoadMore() in UserPaginationPage
	 */
	public void whatsnewLoadMore() {
		result ="PASSED";
		try {
			page.whatsnewLoadMore();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: whatsnewWithFilter()
	 * covers: It covers navigation of whatsnewWithFilter() in UserPaginationPage
	 */
	public void whatsnewWithFilter() {
		result ="PASSED";
		try {
			page.whatsnewWithFilter();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: globalsearchLoadMore()
	 * covers: It covers navigation of globalsearchLoadMore() in UserPaginationPage
	 */
	public void globalsearchLoadMore() {
		result ="PASSED";
		try {
			page.globalsearchLoadMore();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}

}