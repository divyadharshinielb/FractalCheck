package com.origin.fractal.testauto.steps;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.RenewButtonPage;
/* File Name: RenewButtonSteps.java
 * Purpose: Renew Button  - FR1-2777,FR1-2496
 * Number of Test cases: 5
 * Created by: DivyaDharshini
 * Created on: 03-July-2020
 */
public class RenewButtonSteps extends FractalBaseStep{
	public RenewButtonPage page;
	public RenewButtonSteps(WebDriver driver) {
		page = new RenewButtonPage(driver);
		fBPage = page;
	}
	/*
	 * function: searchpageRenewButton()
	 * covers: It covers navigation of searchpageRenewButton()  in RenewButtonPage
	 */
	public void searchpageRenewButton() {
		result ="PASSED";
		try {
			page.searchpageRenewButton();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: inprogressRenewbtnCheck()
	 * covers: It covers navigation of inprogressRenewbtnCheck()  in RenewButtonPage
	 */
	public void inprogressRenewbtnCheck() {
		result ="PASSED";
		try {
			page.inprogressRenewbtnCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: completedRenewbtnCheck()
	 * covers: It covers navigation of completedRenewbtnCheck()  in RenewButtonPage
	 */
	public void completedRenewbtnCheck() {
		result ="PASSED";
		try {
			page.completedRenewbtnCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: whatsnewRenewBtnCheck()
	 * covers: It covers navigation of whatsnewRenewBtnCheck()  in RenewButtonPage
	 */
	public void whatsnewRenewBtnCheck() {
		result ="PASSED";
		try {
			page.whatsnewRenewBtnCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: categoryRenewBtnCheck()
	 * covers: It covers navigation of categoryRenewBtnCheck()  in RenewButtonPage
	 */
	public void categoryRenewBtnCheck() {
		result ="PASSED";
		try {
			page.categoryRenewBtnCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}
