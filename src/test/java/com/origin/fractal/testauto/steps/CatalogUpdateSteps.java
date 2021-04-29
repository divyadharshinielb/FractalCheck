package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.CatalogUpdatePage;

/*
 * File/class Name:CatalogUpdateSteps.java
 * covers:This page covers all steps functions of CatalogUpdatePage 
 * Name of developer:Mahesh G
 * Completed date:25/6/2020
 */

public class CatalogUpdateSteps extends FractalBaseStep {
	private CatalogUpdatePage page=null; 

	public CatalogUpdateSteps(WebDriver driver) {
		page = new CatalogUpdatePage(driver);
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
	/* Function name:editCatalog() Covers:It navigates to editCatalog function in CatalogUpdatePage*/
	public void editCatalog() {
		result ="PASSED";
		try {
			page.editCatalog();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:updateEditCatalog() Covers:It navigates to updateEditCatalog function in CatalogUpdatePage*/
	public void updateEditCatalog() {
		result ="PASSED";
		try {
			page.updateEditCatalog();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:radioBtnchecked() Covers:It navigates to radioBtnchecked function in CatalogUpdatePage*/
	public void radioBtnchecked(){
		result ="PASSED";
		try {
			page.radioBtnchecked();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:UpdateDetailsUserPart() Covers:It navigates to UpdateDetailsUserPart function in CatalogUpdatePage*/
	public void UpdateDetailsUserPart(){
		result ="PASSED";
		try {
			page.UpdateDetailsUserPart();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:saveValidation() Covers:It navigates to saveValidation function in  CatalogUpdatePage*/
	public void saveValidation() {
		result ="PASSED";
		try {
			page.saveValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}
