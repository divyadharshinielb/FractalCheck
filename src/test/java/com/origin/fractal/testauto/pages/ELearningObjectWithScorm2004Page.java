package com.origin.fractal.testauto.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;

/* File Name: ELearningObjectWithScorm2004Page.java
 * Purpose: Check to eLearning object with scorm -FR1-2364
 * Created by: Vignesh
 * Created on: 31/Jun/20
 * Updated on: 30/Nov/20
 */

public class ELearningObjectWithScorm2004Page extends FractalBasePage {
	LearningObjectHTMLPage LearningObjectHTMLPage = null;
	ManageContentItemCodesPage ManageContentItemCodesPage = null;
	ManageContentPage ManageContentPage = null;
	public By searchFieldLearnObj = By.xpath("//input[@id='searchObject']");
	public By searchFieldCatItem = By.xpath("//*[@id='searchCatalog']");
	public By lblCatalogTab = By.xpath("(//*[contains(text(),'Catalog Items')])[1]");
	public By filterELearning = By.xpath("//a[normalize-space()='elearning']");
	public By btnElearning = By.xpath(".//button/span[contains(text(),'eLearning')]");
	public By eLeatningTitleTextArea=By.xpath("//*[@name='elearningName']");
	public By lblscormOption=By.xpath("(//label[contains(text(),'Scorm')])[1]");
	public By uploadPackage=By.xpath("//input[@id='elearningFile']");
	public By discriTextArea=By.xpath("//*[contains(@name,'description')]");
	public By deleteLOBtn = By.xpath("(*//i[@role='button'])[3]");
	public By editBtn = By.xpath("(*//i[@role='button'])[2]");
	public By bundleSaveBtn = By.xpath("(//*[text()='Save'])");
	public By InvalidScorm = By.xpath("//*[text()='Invalid scorm package']");
	ArrayList<String> winHandles;
	public By closeXBtn = By.xpath ("//*[(@class='close')]");
	public By updateSaveBtn=By.xpath("(//*[text()='Save'])[2]");//Updated on 21-Sep-20
	public By NoLOFound = By.xpath("//*[text()='No records found']");
	public By deleteOKBtn = By.xpath("//*[contains(@class, 'md-confirm-button')]");
	public By btnCancel = By.xpath(".//button[contains(text(),'Cancel')]");
	public By updateBtn = By.xpath("//*[text()='Update']");
	public By newVersionReqNoBtn = By.xpath("//*[text()='No']");
	public By updateagainNoBtn = By.xpath("//*[text()='No']");
	public By searchfieldUser= By.xpath("//input[@id='theInput']");
	public By continueBtn = By.xpath(" //button[contains(text(),'Continue')]");
	public By continueBtn1 = By.xpath("//span[normalize-space()='Save']");
	public By saveBtn = By.xpath("(//*[text()='Save'])[4]");
	public By backcatalogBtn = By.xpath(" //button[contains(text(),'Back to Catalog Items')]");
	public By addBundle = By.xpath(".//i[contains(@title,'Expand Modules')]");
	public By catEditBtn = By.xpath("(//*[@title='Edit'])[1]");
	public By btnSave = By.xpath(".//button[contains(text(),'Save')]");
	public By closeModel = By.xpath(".//button[contains(@class,'close')]");

	public ELearningObjectWithScorm2004Page(WebDriver driver) {
		super(driver);
		LearningObjectHTMLPage=new LearningObjectHTMLPage(driver);
		ManageContentItemCodesPage = new ManageContentItemCodesPage(driver); 
		ManageContentPage = new ManageContentPage(driver);
		pageName="Scorm2004";
	}

	/* Function Name: verifyDeleteHTMLLearnignobject()
	 * Action: remove the HTML-LO in bundle and delete the HTML-LO
	 * Return type: boolean
	 */
	public boolean verifyDeleteELearnignobjectWithscorm2004() {
		By scormLOName=By.xpath("//*[contains(text(),'"+getLabel("eLearningName")+"')]");
		ManageContentItemCodesPage.goToManagecontent();

		createandEditCatalogBundleWithscorm2004("Remove LO");

		click(LearningObjectHTMLPage.learningObjectTab);
		wait(2);
		click(filterELearning);
		wait(5);
		enterData(getLabel("eLearningName"),searchFieldLearnObj);
		wait(5);
		click(deleteLOBtn);
		wait(2);
		click(deleteOKBtn);
		wait(10);//Updated on 16-Nov-20
		if(elementExist(scormLOName)) {
			return false;
		}
		return true;		
	}

	/* Function Name: verifyCreateELearningObjectWithscorm2004()
	 * Action: click add e-learning object with scorm and create/delete a e-learning object
	 * Return type: bool
	 */
	public boolean verifyCreateELearningObjectWithscorm2004() {
		By scormLOName=By.xpath("//*[text()='"+getLabel("eLearningName")+"']");
		ManageContentItemCodesPage.goToManagecontent();
		wait(2);
		ManageContentPage.clickOnCreateLobjButton();
		wait(2);
		moveElementFocusandClick(btnElearning);
		wait(2);
		enterData(getLabel("eLearningName"),eLeatningTitleTextArea);
		click(LearningObjectHTMLPage.htmlSelectCatagory);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlGenaralCatagory);
		click(LearningObjectHTMLPage.htmlLangdropbox);
		click(LearningObjectHTMLPage.htmlLangEnglish);
		click(lblscormOption);
		fileUpload(getLabel("scormFileLocation"),uploadPackage);
		wait(2);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlAttemptsdropBox);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlUnlimtedAttempts);
		moveElementFocus(discriTextArea);
		enterData(getLabel("eLearningName"),discriTextArea);//Added on 25-Nov-20
		moveElementFocus(LearningObjectHTMLPage.htmlItemcodetab);//Added on 25-Nov-20
		enterData(getLabel("eLearningName"),LearningObjectHTMLPage.htmlItemcodetab);
		enterData(LearningObjectHTMLPage.getLabel("DurationHH"),LearningObjectHTMLPage.htmlDurationHH);
		enterData(LearningObjectHTMLPage.getLabel("DurationMM"),LearningObjectHTMLPage.htmlDurationMM);
		wait(10);// Updated pn 26-Nov-20
		click(btnSave);
		wait(50);
		if(elementExist(LearningObjectHTMLPage.sucessfullyNotification)) {
			click(LearningObjectHTMLPage.backToLOBtn);
			wait(2);
			//			click(closeModel);
			wait(2);
			if(elementExist(scormLOName)) {
				return true;
			}
		}
		return false;
	}

	/* Function Name: verifyEditAndCancelELearningObjectWithscorm2004()
	 * Action: Edit a e-learning Object with scorm2004
	 * Return type: bool
	 */
	public boolean verifyEditAndCancelELearningObjectWithscorm2004() {
		By editscormLOName=By.xpath("//*[text()='"+getLabel("editeLearningName")+"']");
		wait(2);
		click(editBtn);
		wait(2);
		click(btnCancel);
		wait(2);
		click(editBtn);
		wait(2);
		enterData(getLabel("editeLearningName"),eLeatningTitleTextArea);
		//waiting time increased on 7-Sep-20
		wait(5);
		//ends
		click(updateBtn);
		wait(2);
		click(newVersionReqNoBtn);
		wait(3);
		click(updateagainNoBtn);
		wait(5);
		if(elementExist(editscormLOName)) {
			return true;
		}
		return false;
	}


	/* Function Name: createandEditCatalogBundleWithscorm2004()
	 * Action: Create a Bundle with e-learning object with scorm2004
	 * Return type: void
	 */
	public void createandEditCatalogBundleWithscorm2004(String action) {
		wait(5);
		ManageContentItemCodesPage.goToManagecontent();
		wait(5);
		click(lblCatalogTab);
		//Waiting time increased on 7-Sep-20
		wait(10);
		//ends
		enterData(getLabel("eLearningBundleName"),searchFieldCatItem);
		wait(10);
		click(catEditBtn);
		wait(2);
		click(continueBtn);
		wait(2);
		moveElementFocusandClick(LearningObjectHTMLPage.deleteLOInCatalog);
		wait(2);
		click(addBundle);
		wait(2);
		if (action.equalsIgnoreCase("Add scorm2004")) {
			enterData(getLabel("eLearningName"),LearningObjectHTMLPage.htmlLOSearchCatalogAddModule);
			wait(2);
		}
		click(LearningObjectHTMLPage.searchResultAddModle);
		wait(2);
		click(continueBtn1);
		wait(2);
		//		click(saveBtn);
		//		wait(5);
		click(LearningObjectHTMLPage.allUsersUpdateSelectionBtn);
		wait(3);
		click(updateSaveBtn);
		wait(3);
		click(backcatalogBtn);
		wait(2);
	}

	/* Function Name: verifyPreviewscorm2004()
	 * Action: Preview the e-learning object with scorm2004
	 * Return type: boolean
	 */
	public boolean verifyPreviewscorm2004(){
		By scormLOName=By.xpath("//*[text()='"+getLabel("editeLearningName")+"']");
		enterData(getLabel("eLearningName"),searchFieldLearnObj);
		wait(5);
		click(scormLOName);
		wait(5);
		if(elementExist(LearningObjectHTMLPage.htmlPopupWindow)) {
			click(LearningObjectHTMLPage.htmlPopupWindowCloseXBtn);
			wait(2);
			return true;
		}
		return false;
	}

	/* Function Name: userSearchElearningobjectWithscorm2004AndLaunch()
	 * Action: User Search Elearning object With scorm2004 And Launch HTML
	 * Return type: boolean
	 */
	public boolean userSearchElearningobjectWithscorm2004AndLaunch() {
		By scormlO=By.xpath("(//*[contains(text(),'"+getLabel("editeLearningName")+"')])[2]");
		click(searchfieldUser);
		enterData(getLabel("editeLearningName"),searchfieldUser);
		driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
		wait(3);
		moveElementFocusandClick(scormlO);
		wait(5);
		driver.switchTo().frame(1);
		wait(2);
		click(LearningObjectHTMLPage.launchBtn);
		wait(2);
		winHandles = new ArrayList<String>(driver.getWindowHandles());
		if(winHandles.size()==2) {
			driver.switchTo().window((String) winHandles.get(winHandles.size()-1));
			wait(5);
			driver.close();
			wait(5);
			winHandles = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window((String) winHandles.get(winHandles.size()-1));
			driver.switchTo().parentFrame();
			wait(3);
			click(LearningObjectHTMLPage.closeXBtn);
			return true;
		}
		return false;
	}

	/* Function Name: verifyInvalidscorm2004()
	 * Action: check Invalid scorm file function 
	 * Return type: bool
	 */
	public boolean verifyInvalidscorm2004() {
		ManageContentItemCodesPage.goToManagecontent();
		ManageContentPage.clickOnCreateLobjButton();
		wait(2);
		moveElementFocusandClick(btnElearning);
		wait(2);
		enterData("CheckInvalidScorm2004file",eLeatningTitleTextArea);
		click(LearningObjectHTMLPage.htmlSelectCatagory);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlGenaralCatagory);
		click(LearningObjectHTMLPage.htmlLangdropbox);
		click(LearningObjectHTMLPage.htmlLangEnglish);
		click(lblscormOption); 
		fileUpload(getLabel("invaildScormLocation"),uploadPackage);
		wait(2);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlAttemptsdropBox);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlUnlimtedAttempts);
		moveElementFocusandClick(discriTextArea);// entered on 16-Nov-20
		enterData("Check Invalid scorm2004 file",discriTextArea);
		wait(2);
		enterData("Check Invalid",LearningObjectHTMLPage.htmlItemcodetab);
		//waiting time increased on 7-Sep-20
		wait(10);
		//Ends
		enterData(LearningObjectHTMLPage.getLabel("DurationHH"),LearningObjectHTMLPage.htmlDurationHH);
		enterData(LearningObjectHTMLPage.getLabel("DurationMM"),LearningObjectHTMLPage.htmlDurationMM);
		wait(2);
		click(btnSave);
		wait(50);
		if(elementExist(InvalidScorm)) {
			moveElementFocusandClick(closeXBtn);
			wait(2);
			return true;
		}
		moveElementFocusandClick(closeXBtn);
		wait(2);
		return false;
	}
}