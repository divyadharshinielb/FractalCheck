package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.HomePage;


public class HomeSteps extends FractalBaseStep {
	private HomePage page=null;


	public HomeSteps(WebDriver driver) {
		page = new HomePage(driver);
		fBPage = page;
	}

	public void verifySubHeaders() {
		 result ="Passed";
		   try {
				page.verifySubHeaders();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }

	}
	public void verifyCategories() {
		 result ="Passed";
		   try {
				page.verifyCategories();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }

	}
	
	public void verifyBellNotification() {
		 result ="Passed";
		   try {
				page.verifyBellNotification();
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
	public void verifyCoverageText() {
		 result ="Passed";
		   try {
				page.verifyCoverageText();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyContinueText() {
		 result ="Passed";
		   try {
				page.verifyContinueText();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void clickContinueBtnRetToHome() {
		page.clickContinueBtn();
		       page.clickOnHome();
		}
    public void verifyNavTORcntAddedCoursesRtnToHome() {
		   	page.rcntAddedCourses(); 
		   page.clickOnHome();
		   }
    public void verifyRcntAdded_CoursesText() {
    	 result ="Passed";
		   try {
			 	page.verifyRcntAdded_CoursesText();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
    }
    public void verifyTopArrBtn() {
    	 result ="Passed";
		   try {
			 	page.verifyTopArrBtn();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
    }

    public void verifyAllFilterRcntAdded(){
    	 result ="Passed";
		   try {
			page.verifyAllFilterRcntAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyBundleFilterRcntAdded(){
		 result ="Passed";
		   try {
			 page.verifyBundleFilterRcntAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCourseFilterRcntAdded(){
		result ="Passed";
		   try {
			  page.verifyCourseFilterRcntAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyResourceFilterRcntAdded(){
		result ="Passed";
		   try {
			   page.verifyResourceFilterRcntAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
	}
	public void verifyLearnPathFilterRcntAdded (){
		result ="Passed";
		   try {
			   page.verifyLearnPathFilterRcntAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }		
	}
     public void verifyAllFilterRecommAdded(){
		 result ="Passed";
		   try {
			   page.verifyAllFilterRecommAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }		
	}
	public void verifyBundleFilterRecommAdded(){
		result ="Passed";
		   try {
			  page.verifyBundleFilterRecommAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
	}
	public void verifyCourseFilterRecommAdded(){
		result ="Passed";
		   try {
			  page.verifyCourseFilterRecommAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }			
	}
	public void verifyResourceFilterRecommAdded(){
		result ="Passed";
		   try {
			   page.verifyResourceFilterRecommAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyLearnPathFilterRecommAdded(){
		result ="Passed";
		   try {
			   page.verifyLearnPathFilterRecommAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void verifyAllFilterMostAdded(){
		result ="Passed";
		   try {
			  page.verifyAllFilterMostAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		}
	public void verifyBundleFilterMostAdded(){
		result ="Passed";
		   try {
			  page.verifyBundleFilterMostAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCourseFilterMostAdded(){
		result ="Passed";
		   try {
			page.verifyCourseFilterMostAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyResourceFilterMostAdded(){
		result ="Passed";
		   try {
			   page.verifyResourceFilterMostAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyLearnPathFilterMostAdded(){
		result ="Passed";
		   try {
			  page.verifyLearnPathFilterMostAdded();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void verifyHomePageData() {
		   result ="Passed";
		   try {
				page.verifyHomePageData();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	

	}
	public void verifyLearningInprogress() {
		   result ="Passed";
		   try {
				
				page.verifyLearningInprogress();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }

	}
	public void verifyMyLearningLabeltext() {
		   result ="Passed";
		   try {
				page.verifyMyLearningLabeltext();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	

	}

	public void verifyViewAllPage() {
		   result ="Passed";
		   try {
				page.verifyViewAllPage();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
	}

	public void verifyFooterLinks() {
		   result ="Passed";
		   try {
				page.verifyFooterLinks();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }

	}
	
	   public void recentlyAddedsectionAttributes() {
		   result ="Passed";
		   try {
		    	page.recentlyAddedsectionAttributes();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
	    }
	   public void verifyEnrolledText() {
		   page.verifyEnrolledText();
	   }
	   public void verifyAllLanguage() {
	   page.verifyAllLanguage();
	   }
	   public void verifyLearningInProgressText() {
		   result ="Passed";
		   try {
			page.verifyLearningInProgressText();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		   }
		
	 /******29/11/2018**************/
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
    public void verifyLogoImg() {
    	result ="Passed";
    	try{
    		page.verifyLogoImg();
    	}catch(Exception e)
		{
    		e.printStackTrace();   
    		result="FAILED";
		}
    }
   /****************************/
    public void verifyNextBtn() {
    	page.verifyNextBtn();
    }
    public void verifyPreviousBtn() {
    	page.verifyPreviousBtn();
    }
    public void verifyWishListBtn() {
    	 result ="Passed";
		   try {
			page.verifyWishListBtn();;
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
    }
    public void verifyCartItemBtn() {
    	 result ="Passed";
		   try {
		     page.verifyCartItemBtn();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
    }


	public void ViewAllRcntAddedBtn() {
	   	 result ="Passed";
			   try {
					page.ViewAllRcntAddedBtn();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }

	}

	public void firstTwoCatalogItemsTitleCompare() {
		result ="Passed";
		   try {
				page.firstTwoCatalogItemsTitleCompare();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }

	}
	public void lastFourCatalogItemsTitleCompare() {
		result ="Passed";
		   try {
				page.lastFourCatalogItemsTitleCompare();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void mostPopularCount() {
		result ="Passed";
		   try {
				page.mostPopularCount();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}

	public void recentlyCount() {
		result ="Passed";
		   try {
				page.recentlyCount();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	public void CarosalImgCheck() {
		result ="Passed";
		   try {
	        	page.CarosalImgCheck();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	

}
