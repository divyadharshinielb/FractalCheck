package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.MenuSteps;
/*
 * File: UserInfoImportAndExportPage.java
 * Purpose: The Admin able to Import/Export the xlsx file (FR1-2356)
 * Created by: Vigneshwaran R
 * Created on: 20-Oct-2020
 * Updated on: 03-Nov-2020
 */
public class UserInfoImportAndExportPage extends FractalBasePage{
	public MenuSteps MenuSteps= null;
	private By btnImport = By.xpath("(//button[@class='md-raised btn btn-lg btn-default text-uppercase'])[1]"); 
	private By btnExport = By.xpath("(//button[@class='md-raised btn btn-lg btn-default text-uppercase'])[2]"); 
	private By downloadTemplate= By.xpath("//a[text()='template']");
	private By lblBusinessUser= By.xpath("//*[@for='entuserid']");
	private By lblDirectUser= By.xpath("//*[@for='diruserid']");
	private By lblGroupUser= By.xpath("//*[@for='groupdiruserid']");
	private By userDropBox= By.xpath("(//*[@class='nice-select selectList ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty'])[1]");
	//	private By groupDropBox= By.xpath("(//*[@class='nice-select selectList ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty'])[1]");
	private By btnBrowseFile= By.xpath("//*[@for='cropFileInput']");
	private By uploadFile= By.xpath("//*[@id='cropFileInput']");
	private By uploadedFile= By.xpath("//*[@for='DirFileInput']");
	private By lblLearingHistory= By.xpath("//*[@id='completion_criteria_checkbox']");
	private By btnImportSubmit= By.xpath("//*[@type='submit'][text()='IMPORT']");
	private By lblSuccessfulMsg= By.xpath("//h4[text()='SUCCESS MESSAGE']");
	private By btnOKSuccessfulMsg= By.xpath("//*[@type='button'][text()='OK']");
	private By fileMismatchedText= By.xpath("//*[contains(text(),'mismatched')]");
	private By iconDelete= By.xpath("(//*[@title='Delete'])[1]");
	private By btnDeleteOK= By.xpath("(//*[text()='OK'])[1]");
	private By btnXclose= By.xpath("//*[@class='aside-header']//*[@type='button']");
	private By inputName=By.xpath("//input[@id='searchAllUsersName']");
	//	private By errorMessageFileUploaded= By.xpath("(//*[contains(text(),'Upload Error!')])[2]");
	private By businessAdmin= By.xpath("//li[text()='OLTest']");// Updated on 9-Nov-20
	private By ZeroExportUsers= By.xpath("(//*[text()='Export Users(0)'])[1]");
	private By btnExportsubmit= By.xpath("//button[@type='submit'][text()='EXPORT']");
	private String importedUserName="AutoTest";
	private String fileLocallocation="C:\\sample file\\UserInfoFile.xlsx";
	private String invalidFile="C:\\sample file\\InvalidEmptyfile.xlsx";

	public UserInfoImportAndExportPage(WebDriver driver) {
		super(driver);
		MenuSteps=new MenuSteps(driver);
	}
	/* Method: verifyDownloadTemplate() 
	 * purpose: Check the sample template is Available
	 */
	public boolean verifyDownloadTemplate() {
		MenuSteps.gotoManageUsers();
		elementExist(btnImport);
		elementExist(btnExport);
		click(btnImport);
		wait(3);
		return isClickable(downloadTemplate);
	}
	/* Method: verifyUserRadioBtn();
	 * purpose:check admin is able to select the user radio button
	 */
	public boolean verifyUserRadioBtn() {
		click(lblBusinessUser);
		wait(2);
		click(lblDirectUser);
		wait(2);
		click(lblGroupUser);
		wait(2);
		return isClickable(lblBusinessUser) && isClickable(lblDirectUser) && isClickable(lblGroupUser);
	}

	/* Method: verifyUploadTemplate();
	 * purpose: check admin is able to upload the template
	 */
	public boolean verifyUploadTemplate() {
		click(lblDirectUser);
		wait(2);
		click(lblLearingHistory);
		wait(2);
		isClickable(btnBrowseFile);
		driver.findElement(uploadFile).sendKeys(fileLocallocation);
		wait(3);
		elementExist(uploadedFile);
		wait(2);
		click(btnImportSubmit);
		wait(7);
		return elementExist(lblSuccessfulMsg);
	}

	/* Method: verifyInvalidUploadTemplate();
	 * purpose: check admin is able to upload the template (invalid xlsx file)
	 */
	public boolean verifyInvalidUploadTemplate() {
		click(btnOKSuccessfulMsg);
		wait(3);
		click(btnImport);
		wait(3);
		click(lblDirectUser);
		wait(2);
		click(lblLearingHistory);
		wait(2);
		isClickable(btnBrowseFile);
		driver.findElement(uploadFile).sendKeys(invalidFile);
		wait(3);
		return elementExist(fileMismatchedText);
	}

	/* Method: verifyExportTemplate();
	 * purpose: check admin is able to Export the template 
	 */
	public boolean verifyExportTemplate() {
		click(btnXclose);
		wait(3);
		click(btnExport);
		wait(3);
		click(lblDirectUser);
		wait(2);
		click(lblLearingHistory);
		wait(3);
		return elementExist(By.xpath("//*[@class='text-body ng-binding'][text()='"+importedUserName+"']"));
	}

	/* Method: verifyBtnExportTemplate();
	 * purpose: check admin is able to Export the template is NOT active while zero users found
	 */
	public boolean verifyBtnExportTemplate() {
		click(lblBusinessUser);
		wait(3);
		click(userDropBox);
		wait(2);
		moveElementFocusandClick(businessAdmin);
		wait(3);
		if (elementExist(ZeroExportUsers) ) {
			if(isClickable(btnExportsubmit)==true) {
				return false;
			}
			else
				return true;
		}
		return false;
	}


	/* Method: DeleteUser();
	 * purpose: check admin is able to delete the imported user
	 */
	public void DeleteUser() {
		click(btnXclose);
		wait(3);
		enterData(importedUserName,inputName);
		wait(3);
		click(iconDelete);
		wait(2);
		click(btnDeleteOK);
		wait(3);
	}
}