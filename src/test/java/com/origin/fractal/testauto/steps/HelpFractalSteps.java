package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.HelpFractalPage;
/* File Name: HelpFractalSteps.java
 * Purpose: Check Help Link  - FR1-3780
 * Number of Testcases: 6
 * Created by: DivyaDharshini
 * Created on: 05-02-2021
 */
public class HelpFractalSteps extends FractalBaseStep {
	private HelpFractalPage page;
	public HelpFractalSteps(WebDriver driver) {
		page = new HelpFractalPage(driver);
		fBPage = page;
	}
	/*
	 * function: helpLink()
	 * covers: It covers navigation of helpLink() function in HelpFractalPage
	 */

	public void helpLink() {
		result ="PASSED";
		try {
			page.helpLink();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: learnerViewAllCheck()
	 * covers: It covers navigation of learnerViewAllCheck() function in HelpFractalPage
	 */
	public void learnerViewAllCheck() {
		result ="PASSED";
		try {
			page.learnerViewAllCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: instructorViewAllCheck()
	 * covers: It covers navigation of instructorViewAllCheck() function in HelpFractalPage
	 */
	public void instructorViewAllCheck() {
		result ="PASSED";
		try {
			page.instructorViewAllCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: businessAdminViewAllCheck()
	 * covers: It covers navigation of businessAdminViewAllCheck() function in HelpFractalPage
	 */
	public void businessAdminViewAllCheck() {
		result ="PASSED";
		try {
			page.businessAdminViewAllCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: siteAdminAccountCheck()
	 * covers: It covers navigation of siteAdminAccountCheck() function in HelpFractalPage
	 */
	public void siteAdminAccountCheck() {
		result ="PASSED";
		try {
			page.siteAdminAccountCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: siteAdminSettingCheck()
	 * covers: It covers navigation of siteAdminSettingCheck() function in HelpFractalPage
	 */
	public void siteAdminSettingCheck() {
		result ="PASSED";
		try {
			page.siteAdminSettingCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: siteAdminClassroomCheck()
	 * covers: It covers navigation of siteAdminClassroomCheck() function in HelpFractalPage
	 */
	public void siteAdminClassroomCheck() {
		result ="PASSED";
		try {
			page.siteAdminClassroomCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: siteAdminReportsCheck()
	 * covers: It covers navigation of siteAdminReportsCheck() function in HelpFractalPage
	 */
	public void siteAdminReportsCheck() {
		result ="PASSED";
		try {
			page.siteAdminReportsCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}
