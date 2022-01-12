package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

import java.util.concurrent.TimeUnit;
//Importing I/O classes
import java.io.*;
/*
 * File/class Name:AttachmentDownloadFromAssignmentPage.java
 * covers:This page covers all basic functions and Xpath of the Page 
 * Name of developer:A Mohudum Kamil
 * Pre-requisite: 
 * Completed date:11/01/2022
 */
public class AttachmentDownloadFromAssignmentPage extends FractalBasePage {
private By lblCatalogTab = By.xpath("//md-tab-item//span[contains(text(),'Catalog Items')]");
private By searchText = By.xpath("//input[@id='searchCatalog']");
private By lblLpTitle= By.xpath("//span[@title='Botany Assignment LP']");
private By lblAssignmentTitle= By.xpath("//h3[@title='asment1']");
private By downloadLink= By.xpath("//i[@class='icon-Reference-attachment']//following-sibling::a");

private String strUserName= System.getenv().get("USERNAME");
private String strDwldLocation = "C:\\Users\\"+strUserName+"\\Downloads";
private String strFileName = "";
	public AttachmentDownloadFromAssignmentPage(WebDriver driver) {
		super(driver);
	}
	/*
	 * Function name:catalogTab()
	 * Covers:It redirects to the catalogTab page
	 */
	public void catalogTab() throws InterruptedException {
		waitEvOEL(lblCatalogTab, 30);
		click(lblCatalogTab);
	}
	/*
	 * Function name:editCatalog()
	 * Covers:It redirects to the editCatalog page
	 */
	public void viewCatalog() throws InterruptedException {
		waitEpOEL(searchText,30);
		enterData("Botany Assignment LP",searchText);
		waitEeTBC(lblLpTitle,30);
		click(lblLpTitle);
	}
	
	/* Function name:editAssignment()
	 * Covers:edit assignment inside catalog item
	 */
	public void viewAssignment() throws InterruptedException {
		waitEvOEL(lblAssignmentTitle,30);
		click(lblAssignmentTitle);
	}
	/* Function name:downloadAssignment()
	 * Covers:edit assignment inside catalog item
	 */
	public void downloadAttachment() throws InterruptedException, IOException{
		waitEvOEL(downloadLink,30);
		WebElement dwldLink = getObj(downloadLink);
		String strFileNameWPath = dwldLink.getAttribute("href");
		int nIndex = strFileNameWPath.lastIndexOf("/"); //need not escape forward slash
		strFileName = strFileNameWPath.substring(nIndex+1,strFileNameWPath.length());

		 //incase older file exists, we need to delete it.		
	  	File olderFile = new File(strDwldLocation+"\\"+strFileName);
	    if(olderFile.exists())
	    {
	    	if(olderFile.delete())
		    {
		        System.out.println("Existing file deleted successfully");
		    }
		    else
		    {
		        System.out.println("Failed to delete the existing file.");
		        throw new IOException("Failed to delete the existing file.."); 
			}

	    }
		click(downloadLink);
	}
	/* Function name:verifyDownloadAttachment()
	 * Covers:edit assignment inside catalog item
	 */
	public void verifyDownloadAttachment() throws IOException {
		boolean bFileFound = false;
		wait(30); //wait until file download
		//traverse folder
		  //Creating a File object for directory
		  File directoryPath = new File(strDwldLocation);
		  //List of all files and directories
		  String contents[] = directoryPath.list();
		  for(int i=0; i<contents.length; i++) {
			  if(contents[i].equals(strFileName))
			  {
				  	bFileFound = true;
				  	break;
			  }
		  }
		  
		  if(!bFileFound) {
			  throw new FileNotFoundException("Assignment attachment could not be downloaded.");	
		  }
	      
	}

}
