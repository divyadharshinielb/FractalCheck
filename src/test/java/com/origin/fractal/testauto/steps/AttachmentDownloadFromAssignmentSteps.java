package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AttachmentDownloadFromAssignmentPage;

/*
 * File/class Name:CatalogUpdateSteps.java
 * covers:This page covers all steps functions of CatalogUpdatePage 
 * Name of developer:Mahesh G
 * Completed date:25/6/2020
 */

public class AttachmentDownloadFromAssignmentSteps extends FractalBaseStep {
	private AttachmentDownloadFromAssignmentPage page=null; 

	public AttachmentDownloadFromAssignmentSteps(WebDriver driver) {
		page = new AttachmentDownloadFromAssignmentPage(driver);
		fBPage = page;
	}
	/* Function name:catalogTab() Covers:It navigates to catalogTab function in CatalogUpdatePage*/
	public void catalogTab() {
		result ="PASSED";
		try {
			page.catalogTab();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:viewCatalog() Covers:It navigates to catalog view page*/
	public void viewCatalog() {
		result ="PASSED";
		try {
			page.viewCatalog();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:editCatalog() Covers:It navigates to assignment view page*/
	public void viewAssignment() {
		result ="PASSED";
		try {
			page.viewAssignment();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:downloadAttachment Covers:It downloads the attachment from assignment*/
	public void downloadAttachment() {
		result ="PASSED";
		try {
			page.downloadAttachment();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:verifyDownloadAttachment() Covers:It verifies the attachment is downloaded correctly*/
	public void verifyDownloadAttachment() {
		result ="PASSED";
		try {
			page.verifyDownloadAttachment();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}
