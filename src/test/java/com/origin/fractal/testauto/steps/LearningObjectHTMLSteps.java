package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.LearningObjectHTMLPage;
/* File Name: LearningObjectHTMLSteps.java
 * Purpose: Check to HTML Learning object -FR1-2207 -Step level codes
 * Created by: Vignesh
 * Created on: 19/Jun/20
 * Updated on: 17/Nov/20 - Last update few xpaths and waiting time increased....
 */
public class LearningObjectHTMLSteps extends FractalBaseStep {
	LearningObjectHTMLPage HTMLPage=null;
	public LearningObjectHTMLSteps(WebDriver driver) {
		HTMLPage=new LearningObjectHTMLPage(driver);
	}

	/* Function Name: createHtmllearningobject()
	 * Action: click add html learning object and create a html learning object
	 */
	public void verifyCreateHtmlLearningObject() {
		try{result="FAILED";
		if(HTMLPage.verifyCreateHtmlLearningObject()==true) {
			result="PASSED";
		}}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyDeleteHTMLLearnignobject()
	 * Action: Remove the HTML-LO in bundle and delete the HTML-LO if exists 
	 * If the LO doesn't exist, then exception will be thrown. That also should be PASSED, as the LO object doesn't exist.
	 */
	public void verifyDeleteHTMLLearnignobject(){
		try{result="FAILED";
		if(HTMLPage.verifyDeleteHTMLLearnignobject()==true) {
			result="PASSED";
		}}
		catch(Exception e) {
			result="FAILED";
		}
	}
	/* Function Name: verifyEditAndCancelHTMLLearningObject()
	 * Action: Edit a HTML learning Object
	 */ 
	public void verifyEditAndCancelHTMLLearningObject() {
		try{result="FAILED";
		if(HTMLPage.verifyEditAndCancelHTMLLearningObject()==true) {
			result="PASSED";
		}}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyFilterAndSearchHtmlLO()
	 * Action: TO check the Search and filter on HTML learning object
	 */ 
	public void verifyFilterAndSearchHtmlLO() {
		try{result="FAILED";
		if(HTMLPage.verifyFilterAndSearchHtmlLO()==true) {
			result="PASSED";
		}}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: createandEditCatalogBundleWithHTML()
	 * Action: Create a Bundle with HTML learning object
	 */ 
	public void createandEditCatalogBundleWithHTML(String action) {
		try{result="FAILED";
		HTMLPage.createandEditCatalogBundleWithHTML(action);
		result="PASSED";
		}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: userSearchHTMLLOAndLaunchHTML()
	 * action: User search the HTML LO and launch the HTML LO
	 */
	public void userSearchHTMLLOAndLaunchHTML() {
		try{result="FAILED";
		if(HTMLPage.userSearchHTMLLOAndLaunchHTML()==true) {
			result="PASSED";
//			HTMLPage.userLogout();
		}}
		catch(Exception e) {
			result="FAILED";
		}
	}

}
