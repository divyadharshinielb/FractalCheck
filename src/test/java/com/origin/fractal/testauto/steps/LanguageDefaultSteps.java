package com.origin.fractal.testauto.steps;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.LanguageDefaultPage;
/* File Name: LanguageDefaultSteps.java
 * Purpose: Check for Default language in admin and user part - FR1-2367
 * Created by: DivyaDharshini
 * Created on: 25-June-2020
 */

public class LanguageDefaultSteps extends FractalBaseStep{
	public LanguageDefaultPage page;
	public LanguageDefaultSteps(WebDriver driver) {
		page = new LanguageDefaultPage(driver);
		fBPage = page;
	}
	/*
	 * function: clickLanguageicon()
	 * covers: It covers navigation of clickLanguageicon function in LanguageDefaultPage
	 */
	public void clickLanguageicon() {
		result ="PASSED";
		try {
			page.clickLanguageicon();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: inprogressEnglishCheck()
	 * covers: It covers navigation of inprogressEnglishCheck function in LanguageDefaultPage
	 */
	public void inprogressEnglishCheck() {
		result ="PASSED";
		try {
			page.inprogressEnglishCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: learningitemLanguageCheck()
	 * covers: It covers navigation of learningitemLanguageCheck function in LanguageDefaultPage
	 */
	public void learningitemLanguageCheck() {
		result ="PASSED";
		try {
			page.learningitemLanguageCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: catalogitemLanguageCheck()
	 * covers: It covers navigation of catalogitemLanguageCheck function in LanguageDefaultPage
	 */
	public void catalogitemLanguageCheck() {
		result ="PASSED";
		try {
			page.catalogitemLanguageCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/*
	 * function: Classroomcreate()
	 * covers: It covers navigation of classroomcreate function in LanguageDefaultPage
	 */
	public void whatsnewEnglishCheck() {
		result ="PASSED";
		try {
			page.whatsnewEnglishCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: createLanguage()
	 * covers: It covers navigation of createLanguage function in LanguageDefaultPage
	 */
	public void createLanguage() {
		result ="PASSED";
		try {
			page.createLanguage();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: completedEnglishCheck()
	 * covers: It covers navigation of completedEnglishCheck function in LanguageDefaultPage
	 */
	public void completedEnglishCheck() {
		result ="PASSED";
		try {
			page.completedEnglishCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}
