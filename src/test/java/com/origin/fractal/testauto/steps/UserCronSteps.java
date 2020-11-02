package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.UserCronPage;

public class UserCronSteps extends FractalBaseStep {
		private UserCronPage page=null; 

		public UserCronSteps(WebDriver driver) {
			page = new UserCronPage(driver);
			fBPage = page;
		}
		
		public void addLearningObjectBtn() {
			result ="PASSED";
			   try {
				page.addLearningObjectBtn();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void elearningCreation() {
			result ="PASSED";
			   try {
				page.elearningCreation();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void videoCreation() {
			result ="PASSED";
			   try {
				page.videoCreation();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void documentCreation() {
			result ="PASSED";
			   try {
				page.documentCreation();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void imageCreation() {
			result ="PASSED";
			   try {
				page.imageCreation();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void assessmentCreation() {
			result ="PASSED";
			   try {
				page.assessmentCreation();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void vlabCreation() {
			result ="PASSED";
			   try {
				page.vlabCreation();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void htmlCreation() {
			result ="PASSED";
			   try {
				page.htmlCreation();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}

}
