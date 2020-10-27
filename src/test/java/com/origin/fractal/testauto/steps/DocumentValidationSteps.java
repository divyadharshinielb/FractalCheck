package com.origin.fractal.testauto.steps;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.DocumentValidationPage;
/* File Name: DocumentValidationSteps.java
 * Purpose: Check document creation with different file formats  -FR1-2775,FR1-2776
 * Number of Test cases: 9
 * Created by: DivyaDharshini
 * Updated  on: 27-10-2020
 */
public class DocumentValidationSteps extends FractalBaseStep{
	public DocumentValidationPage page;
	public DocumentValidationSteps(WebDriver driver) {
		page = new DocumentValidationPage(driver);
		fBPage = page;
	}
	/*
	 * function: documentCreation()
	 * covers: It covers navigation of documentCreation() in DeleteEventandClassroomPage
	 */
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
	/*
	 * function: editDocument()
	 * covers: It covers navigation of editDocument() in DeleteEventandClassroomPage
	 */
	
	public void editDocument() {
		result ="PASSED";
		try {
			page.editDocument();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: previewDocument()
	 * covers: It covers navigation of previewDocument() in DeleteEventandClassroomPage
	 */
	
	public void previewDocument() {
		result ="PASSED";
		try {
			page.previewDocument();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: deleteDocumentAfterMap()
	 * covers: It covers navigation of deleteDocumentAfterMap() in DeleteEventandClassroomPage
	 */
	
	public void deleteDocumentAfterMap() {
		result ="PASSED";
		try {
			page.deleteDocumentAfterMap();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	
	
	/*
	 * function: emptyFieldValidation()
	 * covers: It covers navigation of emptyFieldValidation() in DeleteEventandClassroomPage
	 */
	
	public void emptyFieldValidation() {
		result ="PASSED";
		try {
			page.emptyFieldValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/*
	 * function: documentCreationWithPDF()
	 * covers: It covers navigation of documentCreationWithPDF()  in DeleteEventandClassroomPage
	 */
	
	public void documentCreationWithPDF() {
		result ="PASSED";
		try {
			page.documentCreationWithPDF();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/*
	 * function: mapCatalogItem()
	 * covers: It covers navigation of mapCatalogItem()  in DeleteEventandClassroomPage
	 */
	
	public void mapCatalogItem() {
		result ="PASSED";
		try {
			page.mapCatalogItem();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/*
	 * function: podcastValidation()
	 * covers: It covers navigation of podcastValidation() in DeleteEventandClassroomPage
	 */
	
	public void podcastValidation() {
		result ="PASSED";
		try {
			page.podcastValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void userDocumentCheck() {
		result ="PASSED";
		try {
			page.podcastValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}	
	}
	/*
	 * function: userDownloadButtonCheck()
	 * covers: It covers navigation of userDownloadButtonCheck() in DeleteEventandClassroomPage
	 */
	
	public void userDownloadButtonCheck() {
		result ="PASSED";
		try {
			page.podcastValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: documentWithLinkValidation()
	 * covers: It covers navigation of documentWithLinkValidation() in DeleteEventandClassroomPage
	 */
	
	public void documentWithLinkValidation() {
		result ="PASSED";
		try {
			page.documentWithLinkValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: documentCreationWithXLFile()
	 * covers: It covers navigation of documentCreationWithXLFile() in DeleteEventandClassroomPage
	 */
	
	public void documentCreationWithXLFile() {
		result ="PASSED";
		try {
			page.documentCreationWithXLFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}