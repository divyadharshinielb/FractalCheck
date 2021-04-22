package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AddingStripePage;

/* File Name: AddingStripeSteps.java
 * Purpose: Check for Stripe Account in admin and user part -FR1-4129
 * Number of Testcases: 4
 * Created by: Mahesh
 * Created on: 16/04/2021
 */
public class AddingStripeSteps extends FractalBaseStep{
	public AddingStripePage page;
	public AddingStripeSteps(WebDriver driver) {
		page = new AddingStripePage(driver);
		fBPage = page;
	} 
/*
	 * function: gotoStripePayment()
	 * covers: It covers navigation of gotoStripePayment function in AddingStripePage 
	 */
	public void gotoStripePayment() {
		result ="PASSED";
		   try {
			page.gotoStripePayment();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
/*
	 * function: page.validationStripeFields()
	 * covers: It covers navigation of page.validationStripeFields function in AddingStripePage 
	 */
	public void validationStripeFields() {
		result ="PASSED";
		   try {
			page.validationStripeFields();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
/*
	 * function: userCheckoutPage()
	 * covers: It covers navigation of userCheckoutPage function in AddingStripePage 
	 */
	public void userCheckoutPage() {
		result ="PASSED";
		   try {
			page.userCheckoutPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

/*
	 * function: userCheckoutPageDetails()
	 * covers: It covers navigation of userCheckoutPageDetailsfunction in AddingStripePage 
	 */
	public void userCheckoutPageDetails() {
		result ="PASSED";
		   try {
			page.userCheckoutPageDetails();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
}
