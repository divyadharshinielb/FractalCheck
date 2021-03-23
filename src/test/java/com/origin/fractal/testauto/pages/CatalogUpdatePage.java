package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

/*
 * File/class Name:CatalogUpdatePage.java
 * covers:This page covers all basic functions and Xpath of the CatalogUpdatePage 
 * Name of developer:Mahesh G
 * Completed date:25/6/2020
 */
public class CatalogUpdatePage extends FractalBasePage {
	private By lblCatalogTab = By.xpath("//md-tab-item//span[contains(text(),'Catalog Items')]");
	private By searchText = By.xpath("//input[@id='searchCatalog']");
	private By editIcon= By.xpath("//body//div//i[@title='Edit']");
	private By catalogTitleTextArea= By.xpath("//textarea[@id='catalogItemName']");
	private By continueBtn= By.xpath("//button[contains(text(),'Continue')]");
	private By lblSaveBtn= By.xpath("//span[contains(text(),'Save')]");
	private By saveBtn= By.xpath("//button//span[contains(text(),'Continue')]");
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
	private By prelogin = By.xpath("//a[contains(text(),'LOGIN')]");
	public CatalogUpdatePage(WebDriver driver) {
		super(driver);
	}
	/*
	 * Function name:catalogTab()
	 * Covers:It redirects to the catalogTab page
	 */
	public void catalogTab() {
		wait(5);
		click(lblCatalogTab);
	}
	/*
	 * Function name:editCatalog()
	 * Covers:It redirects to the editCatalog page
	 */
	public void editCatalog() {
		wait(5);
		enterData("Catalogupdate_for_automation_testing",searchText);
		wait(10);
		click(editIcon);
		wait(6);
		click(closeBtn);
		wait(2);
	}
	/*
	 * Function name:updateEditCatalog()
	 * Covers:It covers text for new user,in progress user and all user
	 */
	public void updateEditCatalog() {
		click(By.xpath("//span[contains(text(),'bundles')]"));
		wait(5);
		enterData("Assigned_catalog_update_for_auttomation_testing",searchText);
		wait(30);
		click(By.xpath("//span[contains(text(),'bundles')]"));
		wait(5);
		click(editIcon);
		wait(5);
		enterData("Assigned_catalog_update_for_auttomation_testing1",catalogTitleTextArea);
		wait(5);
		click(continueBtn);
		wait(5);
		click(saveBtn);
		wait(5);
		click(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/md-dialog-content[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[3]/span[1]/div[2]/button[1]"));
		verifyText("New users",lblNewUsers);
		verifyText("In-progress users",lblInprogressUsers);
		verifyText("All users",lblAllUsers); 
		wait(2);
		verifyText("This action affect 1 in-progress user.",alertMsg);
		wait(5);
	}
	/*
	 * Function name:radioBtnchecked()
	 * Covers:It clicks radio button for allusers and in progress
	 */
	public void radioBtnchecked() {
		wait(5);
		click(lblAllUsers);
		wait(5);
		click(lblInprogressUsers);
		wait(5);

	}
	/*
	 * Function name:userLogIn()
	 * Covers:It redirects to the user login page
	 */
	public void userLogIn() {
		wait(5);
		if(elementExist(prelogin)) {
		click(prelogin);
		}
		wait(5);
		enterData("automation_directuser@originlearning.com",tbUserName);
		wait(5);
		enterData("AutoDU@123",tbPassword);
		wait(5);
		click(btnLogin);
	}
	/*
	 * Function name:UpdateDetailsUserPart()
	 * Covers:It covers catalog name changes in user part
	 */
	public void UpdateDetailsUserPart() {
		click(closeBtn);
		wait(5);
		updateEditCatalog();
		radioBtnchecked();
		wait(5);
		//	click(lblSave);
		click(closeBtn);
		wait(5);
		click(lblProfileIcon);
		wait(5);
		click(lbllogout);
		wait(5);
		userLogIn();
		wait(5);
		/*	click(lblMylearning);
		wait(6);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(updatedCatalogName); 
		js.executeScript("arguments[0].scrollIntoView();",element );
		wait(5);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(lblUserProfileIcon); 
		js1.executeScript("arguments[0].scrollIntoView();",element1 );
		 */	wait(5);
		 click(lblUserProfileIcon);
		 wait(5);
		 click(lblUserLogout);

	}
	/*
	 * Function name:saveValidation()
	 * Covers:It deletes catalog item and checks the save validation
	 */
	public void saveValidation() {
		wait(5);
		catalogTab();
		wait(5);
		enterData("Auto_Bundle_Check_HTML_Learningobject",searchText);
		wait(10);
		click(editIcon);
		wait(5);
		click(continueBtn);
		wait(5);
		click(lblDelete);
		wait(5);
		click(expandBtn);
		wait(5);
	/*	click(catalogFilter);
		wait(5);
		click(lblSaveBtn);
		wait(5);
	*/}
}
