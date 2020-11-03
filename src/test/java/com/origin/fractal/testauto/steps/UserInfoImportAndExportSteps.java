package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.UserInfoImportAndExportPage;
/*
 * File: UserInfoImportAndExportSteps.java
 * Purpose: The Admin able to Import/Export the xlsx file (FR1-2356) - Step level code
 * Created by: Vigneshwaran R
 * Created on: 20-Oct-2020
 * Updated on: 03-Nov-2020
 */
public class UserInfoImportAndExportSteps extends FractalBaseStep {
	public UserInfoImportAndExportPage importPage=null;
	public UserInfoImportAndExportSteps(WebDriver driver) {
		importPage=new UserInfoImportAndExportPage(driver);
	}

	/* Method: verifyDownloadTemplate() 
	 * purpose: Check the sample template is Available
	 */
	public void verifyDownloadTemplate() {
		result="FAILED";
		try{
			if(importPage.verifyDownloadTemplate()==true) {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Method: verifyUserRadioBtn();
	 * purpose:check admin is able to select the user radio button
	 */
	public void verifyUserRadioBtn() {
		result="FAILED";
		try{
			if(importPage.verifyUserRadioBtn()==true) {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Method: verifyUploadTemplate();
	 * purpose: check admin is able to upload the template
	 */
	public void verifyUploadTemplate() {
		result="FAILED";
		try{
			if(importPage.verifyUploadTemplate()==true) {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Method: verifyInvalidUploadTemplate();
	 * purpose: check admin is able to upload the template (invalid xlsx file)
	 */
	public void verifyInvalidUploadTemplate() {
		result="FAILED";
		try{
			if(importPage.verifyInvalidUploadTemplate()==true) {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Method: verifyExportTemplate();
	 * purpose: check admin is able to Export the template 
	 */
	public void verifyExportTemplate() {
		result="FAILED";
		try{
			if(importPage.verifyExportTemplate()==true) {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Method: verifyBtnExportTemplate();
	 * purpose: check admin is able to Export the template is NOT active while zero users found
	 */
	public void verifyBtnExportTemplate() {
		result="FAILED";
		try{
			if(importPage.verifyBtnExportTemplate()==true) {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Method: DeleteUser();
	 * purpose: check admin is able to delete the imported user
	 */
	public void DeleteUser() {
		result="FAILED";
		try{
			importPage.DeleteUser();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
}