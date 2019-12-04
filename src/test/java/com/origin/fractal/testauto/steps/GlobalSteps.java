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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		
		result ="Passed";
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
		result ="Passed";
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
		
		result ="Passed";
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
		
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
		result ="Passed";
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
