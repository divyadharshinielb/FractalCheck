package com.origin.fractal.testauto.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.ManageContentItemCodesSteps;
import com.origin.fractal.testauto.steps.ManageContentSteps;

/* File Name: ELearningObjectWithScorm2004Page.java
 * Purpose: Check to eLearning object with scorm -FR1-2364
 * Created by: Vignesh
 * Created on: 31/Jun/20
 * Updated on: 21/Aug/20
 */

public class ELearningObjectWithScorm2004Page extends FractalBasePage {
	LearningObjectHTMLPage LearningObjectHTMLPage = null;
	ManageContentItemCodesSteps	ManageContentItemCodesSteps =null;
	ManageContentSteps ManageContentSteps = null;
	public By searchFieldLearnObj = By.xpath("//input[@id='searchObject']");
	public By searchFieldCatItem = By.xpath("//*[@id='searchCatalog']");
	public By lblCatalogTab = By.xpath("(//*[contains(text(),'Catalog Items')])[1]");
	public By filterELearning = By.xpath("//a[contains(text(),'elearning')]");//Updated on 25-Feb-2021
	public By btnElearning = By.xpath("//button//*[text()='eLearning']");//Updated on 25-Feb-2021
	public By eLeatningTitleTextArea=By.xpath("//*[@name='elearningName']");
	public By lblscormOption=By.xpath("//label[contains(text(),'Scorm')]");
	public By uploadPackage=By.xpath("//input[@id='elearningFile']");
	public By discriTextArea=By.xpath("//*[contains(@name,'description')]");
	public By deleteLOBtn = By.xpath("(*//i[@role='button'])[3]");
	public By editBtn = By.xpath("((//*[@ng-click=\"learningList.type=='classroom'?viewClassObject($event,learningList,'view') :viewObject($event,learningList,'view')\"])[1]//i)[2]");//Updated on 4-Dec-20
	public By bundleSaveBtn = By.xpath("(//*[text()='Save'])");
	public By InvalidScorm = By.xpath("//*[text()='Invalid scorm package']");
	ArrayList<String> winHandles;
	public By closeXBtn = By.xpath ("//*[(@class='close')]");
	public By updateSaveBtn=By.xpath("(//*[@class='btn_yes_12'])[2]//button[text()='Save']");
	public By NoLOFound = By.xpath("//*[text()='No records found']");
	public By deleteOKBtn = By.xpath("//*[contains(@class, 'md-confirm-button')]");
	public By btnCancel = By.xpath(".//button[contains(text(),'Cancel')]");
	public By updateBtn = By.xpath("//*[text()='Update']");
	public By newVersionReqNoBtn = By.xpath("//*[text()='No']");
	public By updateagainNoBtn = By.xpath("//span[normalize-space()='No']");//Updated on 26-Feb-21
	public By searchfieldUser= By.xpath("//input[@id='theInput']");
	public By continueBtn = By.xpath(" //button[contains(text(),'Continue')]");
	public By continueBtn1 = By.xpath("(//*[text()='Continue'])[1]");
	public By saveBtn = By.xpath("(//*[text()='Save'])[4]");
	public By backcatalogBtn = By.xpath(" //button[contains(text(),'Back to Catalog Items')]");
	public By addBundle = By.xpath(".//i[contains(@title,'Expand Modules')]");
	public By catEditBtn = By.xpath("(//*[@title='Edit'])[1]");
	public By btnSave = By.xpath(".//button[contains(text(),'Save')]");
	public By closeModel = By.xpath(".//button[contains(@class,'close')]");
	//Added on 25-Feb-21
	public By genaralCatagory=By.xpath("//span[@class='ng-binding ng-scope'][normalize-space()='General']");
	public By durationHH = By.xpath("//input[contains(@placeholder,'HH')]");
	public By durationMM = By.xpath("//input[contains(@placeholder,'MM')]");
	public By btnCreateLobj = By.xpath("//button[normalize-space()='Add Learning Object']");//Updated on 26-Feb-21

	public ELearningObjectWithScorm2004Page(WebDriver driver) {
		super(driver);
		LearningObjectHTMLPage=new LearningObjectHTMLPage(driver);
		ManageContentSteps = new ManageContentSteps(driver);
		ManageContentItemCodesSteps = new ManageContentItemCodesSteps(driver);
		pageName="Scorm2004";
	}

	/* Function Name: verifyDeleteHTMLLearnignobject()
	 * Action: remove the HTML-LO in bundle and delete the HTML-LO
	 */
	public void verifyDeleteELearnignobjectWithscorm2004() {
		By scormLOName=By.xpath("//*[contains(text(),'"+getLabel("eLearningName")+"')]");
		//		ManageContentItemCodesSteps.goToManagecontent();
		//commented on 7-Sep-20
		createandEditCatalogBundleWithscorm2004("Remove LO");
		//ends
		click(LearningObjectHTMLPage.learningObjectTab);
		wait(2);
		click(filterELearning);
		wait(5);
		enterData(getLabel("eLearningName"),searchFieldLearnObj);
		wait(5);
		click(deleteLOBtn);
		wait(2);
		click(deleteOKBtn);
		wait(5);//Updated on 16-Nov-20

	}

	/* Function Name: verifyCreateELearningObjectWithscorm2004()
	 * Action: click add e-learning object with scorm and create/delete a e-learning object
	 * Return type: bool
	 */
	public boolean verifyCreateELearningObjectWithscorm2004() {
		By scormLOName=By.xpath("//*[text()='"+getLabel("eLearningName")+"']");
		ManageContentItemCodesSteps.goToManagecontent();
		wait(10);
		//		ManageContentSteps.clickOnCreateLobjButton();
		wait(10);//Added on 26-Feb-21
		moveElementFocusandClick(btnCreateLobj);
		wait(10);
		moveElementFocusandClick(btnElearning);
		wait(5);
		enterData(getLabel("eLearningName"),eLeatningTitleTextArea);
		click(LearningObjectHTMLPage.htmlSelectCatagory);
		moveElementFocusandClick(genaralCatagory);// Updated on 25-Feb-21
		//		click(LearningObjectHTMLPage.htmlLangdropbox);//commented on 22-Sep-20
		//		click(LearningObjectHTMLPage.htmlLangEnglish);
		click(lblscormOption);
		fileUpload(getLabel("scormFileLocation"),uploadPackage);
		wait(2);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlAttemptsdropBox);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlUnlimtedAttempts);
		moveElementFocus(discriTextArea);
		enterData(getLabel("eLearningName"),discriTextArea);//Added on 25-Nov-20
		moveElementFocus(LearningObjectHTMLPage.htmlItemcodetab);//Added on 25-Nov-20
		enterData(getLabel("eLearningName"),LearningObjectHTMLPage.htmlItemcodetab);
		enterData("00",durationHH);// Updated on 25-Feb-21
		enterData("30",durationMM);// Updated on 25-Feb-21
		wait(10);// Updated pn 26-Nov-20
		click(btnSave);
		wait(50);
		if(elementExist(LearningObjectHTMLPage.sucessfullyNotification)) {
			click(LearningObjectHTMLPage.backToLOBtn);
			wait(2);
			click(closeModel);
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
		wait(3);
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
		if (elementExist(newVersionReqNoBtn)) {
			click(newVersionReqNoBtn);
			wait(3);
			click(updateagainNoBtn);
			wait(5);
		}
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
		ManageContentItemCodesSteps.goToManagecontent();
		wait(10);
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
		wait(5);
		if (action.equalsIgnoreCase("Add scorm2004")) {
			enterData(getLabel("eLearningName"),LearningObjectHTMLPage.htmlLOSearchCatalogAddModule);
			wait(5);
		}
		click(LearningObjectHTMLPage.searchResultAddModle);
		wait(3);
		click(continueBtn1);
		wait(2);
		click(saveBtn);
		wait(5);
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
		By scormLOName=By.xpath("//*[text()='"+getLabel("eLearningName")+"']");
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
		By scormlO=By.xpath("(//*[contains(text(),'"+getLabel("eLearningName")+"')])[2]"); //Updated on 26-Feb-21
		wait(10);
		click(searchfieldUser);
		enterData(getLabel("eLearningName"),searchfieldUser);
		driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
		wait(3);
		moveElementFocusandClick(scormlO);
		wait(3);
		driver.switchTo().frame(0);
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
		ManageContentItemCodesSteps.goToManagecontent();
		wait(10);
		ManageContentSteps.clickOnCreateLobjButton();
		wait(10);
		moveElementFocusandClick(btnElearning);
		wait(3);
		enterData("CheckInvalidScorm2004file",eLeatningTitleTextArea);
		click(LearningObjectHTMLPage.htmlSelectCatagory);
		moveElementFocusandClick(LearningObjectHTMLPage.htmlGenaralCatagory);
		//		click(LearningObjectHTMLPage.htmlLangdropbox);//commented on 22-Sep-20
		//		click(LearningObjectHTMLPage.htmlLangEnglish);
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
		wait(60);
		if(elementExist(InvalidScorm)) {
			moveElementFocusandClick(closeXBtn);
			wait(3);
			return true;
		}
		moveElementFocusandClick(closeXBtn);
		wait(2);
		return false;
	}
}