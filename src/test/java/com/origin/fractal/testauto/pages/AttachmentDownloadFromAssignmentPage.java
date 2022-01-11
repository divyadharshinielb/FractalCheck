package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

import java.util.concurrent.TimeUnit;
//Importing I/O classes
import java.io.*;
/*
 * File/class Name:CatalogUpdatePage.java
 * covers:This page covers all basic functions and Xpath of the CatalogUpdatePage 
 * Name of developer:Mahesh G
 * Completed date:25/6/2020
 */
public class AttachmentDownloadFromAssignmentPage extends FractalBasePage {
	private By lblCatalogTab = By.xpath("//md-tab-item//span[contains(text(),'Catalog Items')]");
	private By searchText = By.xpath("//input[@id='searchCatalog']");
	private By editIcon= By.xpath("//body//div//i[@title='Edit']");
	private By catalogTitleTextArea= By.xpath("//textarea[@id='catalogItemName']");
	private By continueBtn= By.xpath("//button[contains(text(),'Continue')]");
	private By lblSaveBtn= By.xpath("//span[contains(text(),'Save')]");
	private By saveBtn= By.xpath("//button//span[contains(text(),'Save')]");
	private By closeBtn= By.xpath("//i[@data-icon='9']");
	private By lblNewUsers= By.xpath("//label[contains(text(),'New users')]");
	private By lblInprogressUsers= By.xpath("//label[contains(text(),'In-progress users')]");
	private By lblAllUsers= By.xpath("//label[contains(text(),'All users')]");
	private By lblSave= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[18]/div[1]/button[1]");
	private By lblProfileIcon= By.xpath("//span[@class='loggeduserbg ng-binding']");
	private By lbllogout= By.xpath("//div[@ng-click='logOut()']");
	private By tbUserName = By.xpath(".//input[@name='username']");
	private By tbPassword = By.xpath(".//input[@name='password']");
	private By btnLogin = By.xpath("//input[@type='submit']");
	private By updatedCatalogName= By.xpath("//a[@class='a-link'][@href='/mylearningdetails/e8e36185-eda6-d2f7-7ccc-73c353d64843']");
	private By lblMylearning= By.xpath("//a[@href='/mylearning'][contains(text(),'MY LEARNING')]");
	private By lblDelete= By.xpath("//i[contains(@class,'icon float-right padding-r-10 delete_highlight text-bcbcbc cursor-pointer')]");
	private By lblUserProfileIcon= By.xpath("//img[@class='logout-height']");
	private By lblUserLogout= By.xpath("//li[@role='menuitem'][contains(text(),'Logout')]");
	private By expandBtn= By.xpath("//i[@title='Expand Modules']");
	private By catalogFilter= By.xpath("//div//div[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required']");
	private By alertMsg= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[15]/div[1]");
	private By lblLpTitle= By.xpath("//span[@title='Botany Assignment LP']");
	private By lblAssignmentTitle= By.xpath("//h3[@title='asment1']");
	private By downloadLink= By.xpath("//i[@class='icon-Reference-attachment']//following-sibling::a");
	private By downloadFileName= By.xpath("//i[@class='icon-Reference-attachment']//following-sibling::a/@href");
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
		waitEvOEL(searchText,30);
		enterData("Botany Assignment LP",searchText);
		waitEvOEL(lblLpTitle,30);
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
	public void downloadAttachment() throws InterruptedException{
		waitEvOEL(downloadLink,30);
		click(downloadLink);
	}
	/* Function name:verifyDownloadAttachment()
	 * Covers:edit assignment inside catalog item
	 */
	public void verifyDownloadAttachment() throws IOException {
		boolean bFileFound = false;
		WebElement dwldLink = getObj(downloadLink);
		String strFileNameWPath = dwldLink.getAttribute("href");
		wait(30); //wait until file download
		//traverse folder
		String strDwldLocation = "C:\\Users\\mohudumkamil.a\\Downloads";
		int nIndex = strFileNameWPath.lastIndexOf("/"); //need not escape forward slash
		String strFileName = strFileNameWPath.substring(nIndex+1,strFileNameWPath.length());
	      //Creating a File object for directory
	      File directoryPath = new File(strDwldLocation);
	      //List of all files and directories
	      String contents[] = directoryPath.list();
	      for(int i=0; i<contents.length; i++) {
	    	  if(contents[i].equals(strFileName))
	    	  {
	    		  	bFileFound = true;
	    		  	File file = new File(strDwldLocation+"\\"+strFileName);
	    	        if(file.delete())
	    	        {
	    	            System.out.println("File deleted successfully");
	    	        }
	    	        else
	    	        {
	    	            System.out.println("Failed to delete the file");
	    	        }
	    		  break;
	    	  }
	      }
	      
	      if(!bFileFound) {
	    	  throw new FileNotFoundException("Assignment attachment could not be downloaded.");	
	      }
	      
	}

}
