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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
		try {
			page.gotoNotification();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	//Added by vignesh on (2/Mar/2020)
	public void gotoManageUsers() {
		result ="PASSED";
		try {
			page.gotoManageUsers();
		}
		catch(Exception e)
		{
			result="FAILED";
		}
	}
	//Added by vignesh on 17-Dec-20
		public void gotoReports() {
			result ="PASSED";
			   try {
		    page.gotoReports();
			   } catch(Exception e){  
				result="FAILED";
			   }
		}
}
