package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MyLearningPage;

public class MyLearningSteps extends FractalBaseStep {
	private MyLearningPage page;
	public MyLearningSteps(WebDriver driver) {
		page = new MyLearningPage(driver);
		fBPage = page;
	}
	
	public void verifyMyLearningPage() {
		result ="Passed";
		   try {
				page.verifyMyLearningPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifySubMenu() {
		result ="Passed";
		   try {
				page.verifySubMenu();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
	public void verifyComplStatus() {
		result ="Passed";
		   try {
				page.verifyComplStatus();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCatalogname() {
		result ="Passed";
		   try {
				page.verifyCatalogname();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCourseInBundle() {
		result ="Passed";
		   try {
				page.verifyCourseInBundle();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCatalogDetails() {
		result ="Passed";
		   try {
				page.verifyCatalogDetails();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyAllFilter(){
		result ="Passed";
		   try {
				page.verifyAllFilter();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyBundleFilter(){
		result ="Passed";
		   try {
				page.verifyBundleFilter();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCourseFilter(){
		result ="Passed";
		   try {
				page.verifyCourseFilter();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyResourceFilter(){
		result ="Passed";
		   try {
				page.verifyResourceFilter();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyTickmark(){
		result ="Passed";
		   try {
				page.verifyTickmark();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void verifyListView(){
		result ="Passed";
		   try {
				page.verifyListView();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyGridView(){
		result ="Passed";
		   try {
				page.verifyGridView();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCategory(){
		result ="Passed";
		   try {
				page.verifyCategory();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
	public void verifyCategoryList(){
		result ="Passed";
		   try {
				page.verifyCategoryList();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void verifyRatings(){
		result ="Passed";
		   try {
				page.verifyRatings();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void verifyBundleContents(){
		result ="Passed";
		   try {
				page.verifyBundleContents();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	
	public void verifyCourseContents(){
		result ="Passed";
		   try {
				page.verifyCourseContents();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	

	public void verifyLaunch(){
		result ="Passed";
		   try {
				page.verifyLaunch();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void verifyTopArrowBtn() {
		result ="Passed";
		   try {
				page.verifyTopArrowBtn();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
    }
		public void globalSearchCount() {
			result ="Passed";
			   try {
					page.globalSearchCount();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}

		
}
