package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.GlobalPage;
import com.origin.fractal.testauto.pages.HomePage;

public class GlobalSteps extends FractalBaseStep {
	private GlobalPage page=null;


	public GlobalSteps(WebDriver driver) {
		page = new GlobalPage(driver);
		fBPage = page;
	}


	//Added by Dhanushiya.K
	public void backButtonCheckClassroomEvent() {
		result ="PASSED";
		   try {
				page.backButtonCheckClassroomEvent() ;
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
		
	}//ended by Dhanushiya.k

	public void GlobalSearchforClassroomandClassroomsKeyword() {
		result ="PASSED";
		   try {
				page.GlobalSearchforClassroomandClassroomsKeyword() ;
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}

	public void GlobalSearchforimageandimages() {
		result ="PASSED";
		   try {
				page.GlobalSearchforimageandimages();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}

	public void GlobalSearchforAudioandAudios() {
		
		result ="PASSED";
		   try {
				page.GlobalSearchforAudioandAudios();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void GlobalSearchforVideoandVideos() {
		result ="PASSED";
		   try {
				page.GlobalSearchforVideoandVideos();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}

	public void GlobalSearchforDocumentandDocuments() {
		result ="PASSED";
		   try {
				page.GlobalSearchforDocumentandDocuments();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void GlobalSearchforVlabsandVlabs() {
		result ="PASSED";
		   try {
				page.GlobalSearchforVlabsandVlabs();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}

	public void GlobalSearchforAssessmentandAssessments() {
		
		result ="PASSED";
		   try {
				page.GlobalSearchforAssessmentandAssessments();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}

	public void GlobalSearchforElearningandElearnings() {
		result ="PASSED";
		   try {
				page.GlobalSearchforElearningandElearnings();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
		
	}

	public void GlobalSearchforBundleandBundles() {
		
		result ="PASSED";
		   try {
				page.GlobalSearchforBundleandBundles();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
		
	}

	public void GlobalSearchforPodcastandPodcasts() {
		
		result ="PASSED";
		   try {
				page.GlobalSearchforPodcastandPodcasts();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
	}

	public void GlobalSearchforLearningpathandLearningpaths() {
		result ="PASSED";
		   try {
				page.GlobalSearchforLearningpathandLearningpaths() ;
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
		
	}

	public void GlobalSearchforCourseandCourses() {
		result ="PASSED";
		   try {
				page.GlobalSearchforCourseandCourses() ;
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
	}

	public void GlobalSearchforResourceandResources() {
		result ="PASSED";
		   try {
				page.GlobalSearchforResourceandResources() ;
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
		
	}

	public void GlobalSearchwithRandomcharacterandIntegers() {
		result ="PASSED";
		   try {
				page.GlobalSearchwithRandomcharacterandIntegers();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }	
		
	}

	public void GlobalSearchwithSpecialcharacters() {
		result ="PASSED";
		   try {
				page.GlobalSearchwithSpecialcharacters();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }		
		
	}

	public void GlobalSearchwithUnavailableKeyword() {
		result ="PASSED";
		   try {
				page.GlobalSearchwithUnavailableKeyword();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }		
		
	}

	public void GlobalSearchwithDoubleandTabspace() {
		result ="PASSED";
		   try {
				page.GlobalSearchwithDoubleandTabspace();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }		
		
	}

}
