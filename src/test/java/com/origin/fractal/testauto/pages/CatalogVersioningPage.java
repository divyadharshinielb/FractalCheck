package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
/* File/Class name: CatalogVersioningPage.java
 * Created by: Vignesh 
 * Created on: 28-Aug-2020
 * Updated Date: 16-Nov-20
 * Purpose: Check FR1-2772 Catalog version
 */
public class CatalogVersioningPage extends FractalBasePage {
	LearningObjectHTMLPage learningPage=null;
	ManageContentPage ManageContentPage = null;
	ManageContentItemCodesPage ManageContentItemCodesPage=null;

	private By btnSave = By.xpath(".//button[contains(text(),'Save')]");
	public By closeModel = By.xpath(".//button[contains(@class,'close')]");
	private By versionCount  = By.xpath("(//button[@id='popover0']//span)[1]");
	private By versionDelete = By.xpath("((//*[@class='popover version-pop version_popover ng-scope am-flip-x right'])//i)[4]");
	private By versionclose = By.xpath("((//*[@class='popover version-pop version_popover ng-scope am-flip-x right'])//i)[1]");
	private By newVersionReqYesBtn = By.xpath("//*[text()='Yes']");
	private By lblCatalogTab = By.xpath("//md-tab-item[2]/span[contains(text(),'Catalog Items')]");
	private By catEditBtn = By.xpath("(//*[@title='Edit'])[1]");
	private By continueBtn = By.xpath("//button[contains(text(),'Continue')]"); 
	private By continueBtn1 = By.xpath("(//*[@class='col-lg-6 col-md-6 col-sm-6 col-xs-6 text-left'])[1]//button"); //for QA
	private By saveBtn = By.xpath("(//*[@class='col-lg-6 col-md-6 col-sm-6 col-xs-6 text-left'])[2]//button");//Updated on 16Nov20
	private By backcatalogBtn = By.xpath(" //button[contains(text(),'Back to Catalog Items')]");
	private By addmodule= By.xpath(".//i[contains(@title,'Expand Modules')]");
	private By deleteLOInCatalog=By.xpath("(((//*[@class='mCustomScrollBox mCS-light mCSB_vertical mCSB_inside'])[4]/div[1]/div/div/div)[1]//div[3]//i)[1]");
	private By searchResultAddModle=By.xpath("(((//*[@class='mCustomScrollBox mCS-light mCSB_vertical mCSB_inside'])[5])/div/div/div/div)[1]");
	private By allUsersUpdateSelectionBtn=By.xpath("(//*[@id='item_completion'])[2]");
	private By updateSaveBtn=By.xpath("(//*[@class='btn btn-primary btn_radius margin-l-20 ng-binding right-version-no btn_save12'][@type='submit'][text()='Save'])[2]");//Updated on 16Nov20
	private By close= By.xpath("(//button/i)[1]");
	private By searchFieldCatItem = By.xpath("//*[@id='searchCatalog']");
	private By LOSearchCatalogAddModule=By.xpath("(//input[@placeholder='Search'])[4]");
	private By learningObjectTab = By.xpath("//*[contains(@class, 'learningObjectTab')]/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item/span[text()='Learning Objects']");
	private By deleteLOBtn = By.xpath("(//*[@role='tabpanel']/div/ng-include/div/div[3]/div/div[1]/div/div/div[5]/i)[2]");//updated on 10-Sep-20
	private By deleteOKBtn = By.xpath("//*[contains(@class, 'md-confirm-button')]");
	private By searchFieldLearnObj = By.xpath("//input[@id='searchObject']");
	private By editBtn = By.xpath("//*[contains(@id,'tab-content-')]/div/ng-include/div/div[3]/div/div[1]/div/div/div[5]/i[1]");
	private By versioingAlertLO= By.xpath("//*[contains(@class, 'catinnerName')]");
	private By versioingAlertLOClose= By.xpath("//*[contains(@class, 'dialogBtn')]//*[@class='closeBtn']");
	private By btnHtml = By.xpath(".//button/span[contains(text(),'HTML')]");
	private By htmlTitleTextArea=By.xpath("//*[@name='htmlName']");
	//	private By htmlLangdropbox=By.xpath("//span[text()='Select Language']");
	//	private By htmlLangEnglish=By.xpath("(//*[@class='list']//li[text()='English'])[3]");
	private By htmlSelectCatagory=By.xpath("//input[contains(@placeholder,'Select Category')]");
	private By htmlGenaralCatagory=By.xpath("(//*[@class='ng-binding ng-scope'][contains(text(),'General')])[3]");
	private By htmlFile=By.xpath("//input[@id='htmlFile']");
	private By htmlAttemptsdropBox=By.xpath("//div[contains(@class,'nice-select select-attempt ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required')]");
	private By htmlUnlimtedAttempts=By.xpath("//li[contains(text(),'Unlimited')]");
	private By htmlDiscriTextArea=By.xpath("//*[@name='htmldescription']");
	private By htmlItemcodetab = By.xpath("//input[@type='text'][@name='item_code']");
	private By htmlDurationHH = By.xpath("//input[contains(@placeholder,'HH')]");
	private By htmlDurationMM = By.xpath("//input[contains(@placeholder,'MM')]");
	private By updateBtn = By.xpath("//*[@type='submit'][text()='Update']");// updated on 23-Oct-20

	public CatalogVersioningPage(WebDriver driver) {
		super(driver);
		ManageContentPage= new ManageContentPage(driver);
		learningPage= new LearningObjectHTMLPage(driver);
		ManageContentItemCodesPage= new ManageContentItemCodesPage(driver);
		pageName="catalogVersioning";
	}

	/* Function Name: createLearningObject()
	 * Action: create the learning object
	 * Return type: void
	 */
	public void createLearningObject() {
		ManageContentItemCodesPage.goToManagecontent();
		wait(2);
		ManageContentPage.clickOnCreateLobjButton();
		wait(2);
		moveElementFocusandClick(btnHtml);
		wait(2);
		enterData(getLabel("learningObjectName"),htmlTitleTextArea);
		click(htmlSelectCatagory);
		moveElementFocusandClick(htmlGenaralCatagory);
		//		click(htmlLangdropbox);
		//		click(htmlLangEnglish);
		fileUpload(learningPage.getLabel("HtmlFileLocation"),htmlFile);
		wait(2);
		moveElementFocusandClick(htmlAttemptsdropBox);
		moveElementFocusandClick(htmlUnlimtedAttempts);
		enterData(getLabel("learningObjectName"),htmlDiscriTextArea);
		enterData(getLabel("learningObjectName"),htmlItemcodetab);
		enterData(learningPage.getLabel("DurationHH"),htmlDurationHH);
		enterData(learningPage.getLabel("DurationMM"),htmlDurationMM);
		wait(5);
		click(btnSave);
		wait(10);
		if(elementExist(learningPage.sucessfullyNotification)) {
			click(learningPage.backToLOBtn);
			wait(3);
			click(closeModel);
			wait(2);
		}
	}

	/* Function Name: createVersioningLearningObject()
	 * Action: create the learning object version
	 * Return type: void
	 */
	public void createVersioningLearningObject() {
		enterData(getLabel("learningObjectName"),searchFieldLearnObj);
		wait(5);
		click(editBtn);
		wait(3);		
		enterData(getLabel("learningObjectNameVersion"),htmlTitleTextArea);
		wait(5);
		click(updateBtn);
		wait(3);
		click(newVersionReqYesBtn);
		wait(3);
		click(close);
		wait(3);
		//		elementExist(versionCount);
		//		click(versionCount);
		//		wait(3);
		//		click(versionclose);
		//		wait(2);
	}

	/* Function Name: editCatalogToIncludeLearningObject()
	 * Action: Edit a Catalog item with learning object with version 
	 * Return type: boolean
	 */
	public boolean editCatalogToIncludeLearningObject(String action, String catalog) {
		try{
			ManageContentItemCodesPage.goToManagecontent();
			wait(3);
			click(lblCatalogTab);
			wait(5);//Updated on 16Nov20
			enterData(getLabel("catalogNameBundle"),searchFieldCatItem);
			wait(3);
			moveElementFocusandClick(catEditBtn);
			wait(3);
			click(continueBtn);
			wait(2);
			moveElementFocusandClick(deleteLOInCatalog);
			click(addmodule);
			if (action.equalsIgnoreCase("ADD") && catalog.equalsIgnoreCase("Ver")) {
				enterData(getLabel("learningObjectName"),LOSearchCatalogAddModule);
				wait(2);
				click(searchResultAddModle);
				wait(2);
				enterData(getLabel("learningObjectNameVersion"),LOSearchCatalogAddModule);
				wait(2);
				click(searchResultAddModle);
			}
			else {
				wait(2);
				moveElementFocusandClick(deleteLOInCatalog);
				wait(5);
				enterData("m",LOSearchCatalogAddModule);
				click(searchResultAddModle);
			}
			wait(3);
			click(continueBtn1);
			//			wait(3);
			//			click(saveBtn);
			wait(5);
			//If user enrolled the catalog item 
			if(elementExist(allUsersUpdateSelectionBtn)) {
				click(allUsersUpdateSelectionBtn);
				wait(3);
				moveElementFocusandClick(updateSaveBtn);
				wait(10);
			}
			click(backcatalogBtn);
			wait(3);
			return true;
		}catch(Exception e) {
			click(close);
			wait(3);
			return false;
		}
	}

	/* Function Name: deleteVersionLearningObject()
	 * Action: Delete the learning object version
	 * Return type: void
	 */
	public void deleteVersionLearningObject(String action, String catalog) {
		//		learningPage.goToManagecontent();
		editCatalogToIncludeLearningObject(action,catalog);
		click(learningObjectTab);
		enterData(getLabel("learningObjectNameVersion"),searchFieldLearnObj);
		wait(7);
		moveElementFocusandClick(versionCount);
		wait(3);
		moveElementFocusandClick(versionDelete);
		wait(2);
		moveElementFocusandClick(deleteOKBtn);
		wait(3);
	}

	/* Function Name: deleteLearningObject()
	 * Action: Delete the learning object 
	 * Return type: void
	 */
	public void deleteLearningObject(String action, String catalog) {
		//		learningPage.goToManagecontent();
		//		editCatalogToIncludeLearningObject(action,catalog);
		click(learningObjectTab);
		enterData(getLabel("learningObjectNameVersion"),searchFieldLearnObj);
		wait(5);
		if(verifyNonExistense(versionCount)) {
			click(deleteLOBtn);
			wait(2);
			click(deleteOKBtn);
			wait(3);
		}
	}

	/* Function Name: verifyAssignedCatalogDetails()
	 * Action: check the catalog items details when editing the Learning object
	 * Return type: void
	 */
	public boolean verifyAssignedCatalogDetails() {
		//		learningPage.goToManagecontent();
		click(learningObjectTab);
		enterData(getLabel("learningObjectNameVersion"),searchFieldLearnObj);
		wait(2);
		click(editBtn);
		wait(3);
		if(elementExist(versioingAlertLO)) {
			wait(2);
			click(versioingAlertLOClose);
			wait(2);
			return true;
		}
		click(closeModel);
		wait(2);
		return false;
	}



}
