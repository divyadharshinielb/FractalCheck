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
		 result ="PASSED";
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
		 result ="PASSED";
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
		 result ="PASSED";
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
		 result ="PASSED";
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
		 result ="PASSED";
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
		 result ="PASSED";
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
		result ="PASSED";
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
	   result ="PASSED";
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
    	 result ="PASSED";
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
    	 result ="PASSED";
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
    	 result ="PASSED";
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
		 result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
		   try {
			   page.verifyLearnPathFilterWhatsNew();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }		
	}
	public void verifyPodcastFilterWhatsNew(){
		result ="PASSED";
		   try {
			   page.verifyPodcastFilterWhatsNew();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
	}
     public void verifyAllFilterRecommAdded(){
		 result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		   result ="PASSED";
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
		   result ="PASSED";
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
		   result ="PASSED";
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
		   result ="PASSED";
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
		   result ="PASSED";
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
		   result ="PASSED";
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
		   result ="PASSED";
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
    	result ="PASSED";
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
    	result ="PASSED";
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
    	result ="PASSED";
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
    	result ="PASSED";
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
    	 result ="PASSED";
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
    	 result ="PASSED";
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
	   	 result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
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
		result ="PASSED";
		   try {
				page.recentlyCount();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}
	 public void verifyCartItemBtn1() {
		   result ="PASSED";
			   try {
			        page.verifyCartItemBtn1();
			   }
			  catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			  }
	   }
	

}
