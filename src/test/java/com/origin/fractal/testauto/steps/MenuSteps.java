package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MenuPage;

public class MenuSteps extends FractalBaseStep{
	public MenuPage page;
	public MenuSteps(WebDriver driver) {
		page = new MenuPage(driver);
		fBPage = page;
	}
	public void logout() {
		result ="Passed";
		   try {
			page.logout();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void clickMenu() {
		result ="Passed";
		   try {
			page.clickMenu();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void gotoManageContents() {
		result ="Passed";
		   try {
			page.gotoManageContents();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void gotoPaymentConfiguration() {
		result ="Passed";
		   try {
			page.gotoPaymentConfiguration();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void searchFieldAsset() {
		result ="Passed";
		   try {
			page.searchFieldAsset();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void searchFieldItemCode() {
		result ="Passed";
		   try {
			page.searchFieldItemCode();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void gotoClassroomCreation() {
		result ="Passed";
		   try {
			page.gotoClassroomCreation();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
public void gotoNotification() {
		result ="Passed";
		   try {
	    page.gotoNotification();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
}
