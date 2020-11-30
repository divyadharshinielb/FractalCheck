package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.CatalogVersioningPage;
/* File Name: CatalogVersioningSteps.java
 * Purpose: Check FR1-2772 Catalog version -Step level codes
 * Created by: Vignesh
 * Created on: 28/Aug/20
 * Updated on 30/Nov/20
 */

public class CatalogVersioningSteps extends FractalBaseStep {
	CatalogVersioningPage page=null;
	public CatalogVersioningSteps(WebDriver driver) {
		page=new CatalogVersioningPage(driver);
	}

	/* Function Name: createLearningObject()
	 * Action: create the learning object
	 */
	public void createLearningObject() {
		result="FAILED";
		try{
			page.createLearningObject();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: createVersioningLearningObject()
	 * Action: create the learning object version
	 */
	public void createVersioningLearningObject() {
		result="FAILED";
		try{
			page.createVersioningLearningObject();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: editCatalogToIncludeLearningObject()
	 * Action: Create a Catalog items with learning object
	 */
	public void editCatalogToIncludeLearningObject(String action, String bundle) {
		result="FAILED";
		try{
			// Updated on 10Sep20
			if(page.editCatalogToIncludeLearningObject(action, bundle)==true)
				result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	//ends

	/* Function Name: deleteLearningObject()
	 * Action: Delete the learning object version
	 */
	public void deleteLearningObject(String action,String catalog) {
		result="FAILED";
		try{
			page.deleteLearningObject(action, catalog);
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: deleteVersionLearningObject()
	 * Action: Delete the learning object 
	 */
	public void deleteVersionLearningObject(String action,String catalog) {
		result="FAILED";
		try{
			page.deleteVersionLearningObject(action, catalog);
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyAssignedCatalogDetails()
	 * Action: check the catalog items details when editing the Learning object
	 */
	public void verifyAssignedCatalogDetails() {
		result="FAILED";
		try{
			if(page.verifyAssignedCatalogDetails()==true) {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
	}
}