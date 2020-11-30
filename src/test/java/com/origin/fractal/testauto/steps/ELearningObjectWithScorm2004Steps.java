package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ELearningObjectWithScorm2004Page;
import com.origin.fractal.testauto.pages.LearningObjectHTMLPage;
/* File Name: ELearningObjectWithScorm2004Steps.java
 * Purpose: Check to eLearning object with scorm -FR1-2364 -Step level codes
 * Created by: Vignesh
 * Created on: 30/Nov/20
 */
public class ELearningObjectWithScorm2004Steps extends FractalBaseStep {
	ELearningObjectWithScorm2004Page Scorm2004Page = null;
	LearningObjectHTMLPage HTMLPage = null;
	public ELearningObjectWithScorm2004Steps(WebDriver driver) {
		Scorm2004Page = new ELearningObjectWithScorm2004Page(driver);
		HTMLPage=new LearningObjectHTMLPage(driver);
	}

	/* Function Name: verifyCreateELearningObjectWithscorm2004()
	 * Action: click add e-learning object and create a e-learning object with scorm2004
	 */
	public void verifyCreateELearningObjectWithscorm2004() {
		try{result="FAILED";
		if(Scorm2004Page.verifyCreateELearningObjectWithscorm2004()==true) {
			result="PASSED";
		}}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyInvalidscorm2004()
	 * Action: check invalid scrom file function 
	 */
	public void verifyInvalidscorm2004(){
		try{result="FAILED";
		if(Scorm2004Page.verifyInvalidscorm2004()==true) {
			result="PASSED";
		}}
		catch(Exception e) {
			result="FAILED";
		}

	}
	/* Function Name: verifyDeleteELearnignobjectWithscorm2004()
	 * Action: Remove the elearning-LO in bundle and delete the elarning -LO if exists 
	 * If the LO doesn't exist, then exception will be thrown. That also should be PASSED, as the LO object doesn't exist.
	 */
	public void verifyDeleteELearnignobjectWithscorm2004(){
		try{result="FAILED";
		if(Scorm2004Page.verifyDeleteELearnignobjectWithscorm2004()==true) {
			result="PASSED";
		}}
		catch(Exception e) {
			result="PASSED";
		}
	}

	/* Function Name: verifyEditAndCancelELearningObjectWithscorm2004()
	 * Action: Edit a e-learning Object with scorm 2004
	 */ 
	public void verifyEditAndCancelELearningObjectWithscorm2004() {
		try{result="FAILED";
		if(Scorm2004Page.verifyEditAndCancelELearningObjectWithscorm2004()==true) {
			result="PASSED";
		}}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: createandEditCatalogBundleWithHTML()
	 * Action: Create a Bundle with HTML learning object
	 */ 
	public void createandEditCatalogBundleWitheLearningWithscorm2004(String action) {
		try{result="FAILED";
		Scorm2004Page.createandEditCatalogBundleWithscorm2004(action);
		result="PASSED";
		//		HTMLPage.adminLogout();
		}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyPreviewscorm2004()
	 * Action: Create a Bundle with HTML learning object
	 */ 
	public void verifyPreviewscorm2004(){
		try{result="FAILED";
		Scorm2004Page.verifyPreviewscorm2004();
		result="PASSED";
		}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: userSearchElearningobjectWithscorm2004AndLaunch()
	 * Action: User Search Elearning object With scorm2004 And Launch HTML
	 */
	public void userSearchElearningobjectWithscorm2004AndLaunch() {
		try{result="FAILED";
		Scorm2004Page.userSearchElearningobjectWithscorm2004AndLaunch();
		result="PASSED";
		//		HTMLPage.userLogout();
		}
		catch(Exception e) {
			result="FAILED";
		}
	}
}
