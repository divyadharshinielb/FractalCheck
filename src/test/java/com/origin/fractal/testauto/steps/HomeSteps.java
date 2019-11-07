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
		result ="Passed";
		   try {
			   page.clickContinueBtn();
				wait(5);
		       page.clickOnHome();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		}
   public void verifyNavTORcntAddedCoursesRtnToHome() {
	   result ="Passed";
	   try {
			page.rcntAddedCourses(); 
			   page.clickOnHome();
	   }
	   catch(Exception e)
	   {
		e.printStackTrace();   
		result="FAILED";
	   }
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

    public void verifyAllFilterWhatsNew(){
    	 result ="Passed";
		   try {
			page.verifyAllFilterWhatsNew();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyBundleFilterWhatsNew(){
		 result ="Passed";
		   try {
			 page.verifyBundleFilterWhatsNew();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyCourseFilterWhatsNew(){
		result ="Passed";
		   try {
			  page.verifyCourseFilterWhatsNew();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void verifyResourceFilterWhatsNew(){
		result ="Passed";
		   try {
			   page.verifyResourceFilterWhatsNew();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
	}
	public void verifyLearnPathFilterWhatsNew (){
		result ="Passed";
		   try {
			   page.verifyLearnPathFilterWhatsNew();
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
	
	   public void whatsNewSectionAttributes() {
		   result ="Passed";
		   try {
		    	page.whatsNewSectionAttributes();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	
	    }
	   public void verifyResumeLearningText() {
		   result ="Passed";
		   try {
			page.verifyResumeLearningText();
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
		   try {
			   page.verifyLogoImg();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
    }
   /****************************/
    public void verifyNextBtn() {
    	result ="Passed";
		   try {
			   page.verifyNextBtn();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
    }
    	
    public void verifyPreviousBtn() {
    	result ="Passed";
		   try {
				page.verifyPreviousBtn();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
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
	public void verifyCatalogFilterDashboard() {
		result ="Passed";
		   try {
				page.verifyCatalogFilterDashboard();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void verifyCatalogFilterMylearning() {
		result ="Passed";
		   try {
				page.verifyCatalogFilterMylearning();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	   public void verifyCatalogFilterCategories() {
		   result ="Passed";
		   try {
				page.verifyCatalogFilterCategories();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	   }
	   public void verifyCatalogFilterSearch(){
		   result ="Passed";
		   try {
				page.verifyCatalogFilterSearch();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	   }

	

}
