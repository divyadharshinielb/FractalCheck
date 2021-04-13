package com.origin.fractal.testauto.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.ManageContentItemCodesSteps;
import com.origin.fractal.testauto.steps.ManageContentSteps;
/* File Name: LearningObjectHTMLPage.java
 * Purpose: Check to HTML Learning object -FR1-2207
 * Created by: Vignesh
 * Created on: 18/Jun/20
 * Updated on: 31/July/20
 */
public class LearningObjectHTMLPage extends FractalBasePage {
	//	MenuPage menuPage = null;
	ManageContentSteps ManageContentSteps = null;
	ManageContentItemCodesSteps ManageContentItemCodesSteps=null;
	public By learningObjectTab = By.xpath("//*[contains(@class, 'learningObjectTab')]/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item/span[text()='Learning Objects']");
	public By btnHtml = By.xpath(".//button/span[contains(text(),'HTML')]");
	public By htmlTitleTextArea=By.xpath("//*[@name='htmlName']");
	public By htmlLangdropbox=By.xpath("//span[text()='Select Language']");
	public By htmlLangEnglish=By.xpath("(//*[@class='list']//li[text()='English'])[3]");
	public By htmlSelectCatagory=By.xpath("//input[contains(@placeholder,'Select Category')]");
	public By htmlGenaralCatagory=By.xpath("//span[@class='ng-binding ng-scope'][normalize-space()='General']");//Updated on 2-Mar-21
	public By htmlFile=By.xpath("//input[@id='htmlFile']");
	public By htmlAttemptsdropBox=By.xpath("//div[contains(@class,'nice-select select-attempt ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required')]");
	public By htmlUnlimtedAttempts=By.xpath("//li[contains(text(),'Unlimited')]");
	public By htmlDiscriTextArea=By.xpath("//*[@name='htmldescription']");
	public By htmlItemcodetab = By.xpath("//input[@type='text'][@name='item_code']");
	public By htmlDurationHH = By.xpath("//input[contains(@placeholder,'HH')]");
	public By htmlDurationMM = By.xpath("//input[contains(@placeholder,'MM')]");
	public By sucessfullyNotification =By.xpath("//div[contains(text(),' has been added successfully')]");
	public By backToLOBtn = By.xpath("//button[text()='Back to Learning Objects']");// LO= learning object
	public By deleteLOBtn = By.xpath("(*//i[@role='button'])[2]");
	public By deleteOKBtn = By.xpath("//*[contains(@class, 'md-confirm-button')]");
	public By NoLOFound = By.xpath("//*[text()='No records found']");
	public By htmlPopupWindow = By.xpath("//*[contains(@class, 'md-dialog-content')]");
	public By htmlPopupWindowCloseXBtn = By.xpath("//*[contains(@class, 'dripicons-cross')]");
	public By htmlLOFilter = By.xpath("//a[contains(text(),'html')]");//Updated on 17-Feb-2021
	public By htmlLOSearchCatalogAddModule=By.xpath("(//input[@placeholder='Search'])[4]");
	public By deleteLOInCatalog=By.xpath("(((//*[@class='mCustomScrollBox mCS-light mCSB_vertical mCSB_inside'])[4]/div[1]/div/div/div)[1]//div[3]//i)[1]");
	public By searchResultAddModle=By.xpath("(((//*[@class='mCustomScrollBox mCS-light mCSB_vertical mCSB_inside'])[5])/div/div/div/div)[1]");
	public By allUsersUpdateSelectionBtn=By.xpath("//label[normalize-space()='All users']");
	public By updateSaveBtn=By.xpath("(//*[text()='Save'])[2]");
	public By launchBtn = By.xpath("//button[contains(text(),'Launch')]");
	public By closeXBtn= By.xpath("//*[@id='close']");
	ArrayList<String> winHandles;
	public By btnSave = By.xpath(".//button[contains(text(),'Save')]");
	public By closeModel = By.xpath(".//button[contains(@class,'close')]");
	public By editBtn = By.xpath("(//i[@role='button'])[1]");
	public By btnCancel = By.xpath(".//button[contains(text(),'Cancel')]");
	public By updateBtn = By.xpath("//*[text()='Update']");
	public By newVersionReqNoBtn = By.xpath("//*[text()='No']");
	public By updateagainNoBtn = By.xpath("//*[text()='No']");
	public By searchFieldLearnObj = By.xpath("//input[@id='searchObject']");
	public By searchFieldCatItem = By.xpath("//*[@id='searchCatalog']");
	public By lblCatalogTab = By.xpath("//md-tab-item[2]/span[contains(text(),'Catalog Items')]");
	public By catEditBtn = By.xpath("(//*[@title='Edit'])[1]");
	public By searchfieldUser= By.xpath("//input[@id='theInput'][@class='cat_search']");//Updated on 7-Jan-21
	public By continueBtn = By.xpath(" //button[contains(text(),'Continue')]");
	public By continueBtn1 = By.xpath("(//*[text()='Continue'])[1]");
	public By saveBtn = By.xpath("(//*[text()='Save'])[4]");
	public By backcatalogBtn = By.xpath(" //button[contains(text(),'Back to Catalog Items')]");
	public By addBundle = By.xpath(".//i[contains(@title,'Expand Modules')]");
	public By close= By.xpath("(//button/i)[1]");
	public LearningObjectHTMLPage(WebDriver driver) {
		super(driver);
		//		menuPage = new MenuPage(driver);
		ManageContentSteps = new ManageContentSteps(driver); 
		ManageContentItemCodesSteps= new ManageContentItemCodesSteps(driver);
		pageName="HtmlLearningObject";
	}

	/* Function Name: goToManagecontent()
	 * Action: Goto manage content 
	 * Return type: null
	 */
	public void goToManagecontent(){
		ManageContentItemCodesSteps.goToManagecontent();
	}

	/* Function Name: createHtmllearningobject()
	 * Action: click add html learning object and create a html learning object
	 * Return type: bool
	 */
	public boolean verifyCreateHtmlLearningObject() {
		By htmlOName=By.xpath("//*[text()='"+getLabel("HtmlName")+"']");
		goToManagecontent();
		ManageContentSteps.clickOnCreateLobjButton();
		wait(2);
		moveElementFocusandClick(btnHtml);
		wait(2);
		enterData(getLabel("HtmlName"),htmlTitleTextArea);
		click(htmlSelectCatagory);
		moveElementFocusandClick(htmlGenaralCatagory);
		click(htmlLangdropbox);
		click(htmlLangEnglish);
		fileUpload(getLabel("HtmlFileLocation"),htmlFile);
		wait(2);
		moveElementFocusandClick(htmlAttemptsdropBox);
		moveElementFocusandClick(htmlUnlimtedAttempts);
//		commented on 20-Jan-21
		//moveElementFocusandClick(htmlDiscriTextArea);//Added on 5-Jan-21
		//Endds
		enterData(getLabel("HtmlName"),htmlDiscriTextArea);
		enterData(getLabel("HtmlName"),htmlItemcodetab);
		enterData(getLabel("DurationHH"),htmlDurationHH);
		enterData(getLabel("DurationMM"),htmlDurationMM);
		wait(10);//Updated on 22-Feb-2021
		click(btnSave);
		wait(5);
		if(elementExist(sucessfullyNotification)) {
			click(backToLOBtn);
			wait(2);
//			click(closeModel);
//			wait(2);
			if(elementExist(htmlOName)) {
				click(htmlOName);
				wait(2);
				if(elementExist(htmlPopupWindow)) {
					click(htmlPopupWindowCloseXBtn);
					wait(2);
					return true;
				}
			}
		}
		return false;
	}

	/* Function Name: verifyEditAndCancelHTMLLearningObject()
	 * Action: Edit a HTML learning Object
	 * Return type: bool
	 */
	public boolean verifyEditAndCancelHTMLLearningObject() {
		By editedhtmlOName=By.xpath("//*[text()='"+getLabel("editHtmlName")+"']");
		wait(2);
		click(editBtn);
		wait(2);
		click(btnCancel);
		wait(2);
		click(editBtn);
		wait(2);
		enterData(getLabel("editHtmlName"),htmlTitleTextArea);
		wait(2);
		click(updateBtn);
		wait(2);
		click(newVersionReqNoBtn);
		wait(3);
		click(updateagainNoBtn);
		wait(5);
		if(elementExist(editedhtmlOName)) {
			return true;
		}
		return false;
	}

	/* Function Name: verifyFilterAndSearchHtmlLO()
	 * Action: TO check the Search and filter on HTML learning object
	 * Return type: bool
	 */
	public boolean verifyFilterAndSearchHtmlLO() {
		By htmlOName=By.xpath("//*[text()='"+getLabel("HtmlName")+"']");
		By editedhtmlOName=By.xpath("//*[text()='"+getLabel("editHtmlName")+"']");
		click(htmlLOFilter);
		wait(2);
		enterData(getLabel("HtmlName"),searchFieldLearnObj);
		wait(2);
		if(elementExist(editedhtmlOName) || elementExist(htmlOName)) {
			return true;
		}
		return false;
	}

	/* Function Name: createandEditCatalogBundleWithHTML()
	 * Action: Create a Bundle with HTML learning object
	 * Return type: void
	 */
	public void createandEditCatalogBundleWithHTML(String action) {
		wait(5);
		click(lblCatalogTab);
		wait(10);
		enterData("zAutoBundleHTMLLearningObject",searchFieldCatItem);//Updated on 5-Jan-21
		wait(20);//Updated on 7-Jan-21
		//		enterData("AutoBundleHTMLLearn",searchFieldCatItem);//Updated on 5-Jan-21
		//		wait(5);
		click(catEditBtn);
		wait(5);
		click(continueBtn);
		wait(5);
		moveElementFocusandClick(deleteLOInCatalog);
		click(addBundle);
		if (action.equalsIgnoreCase("ADD HTML")) {
			enterData(getLabel("editHtmlName"),htmlLOSearchCatalogAddModule);
			wait(2);
		}
		click(searchResultAddModle);
		wait(2);
		click(continueBtn1);
		wait(5);
		click(saveBtn);
		wait(3);
		click(allUsersUpdateSelectionBtn);
		wait(3);
		moveElementFocusandClick(updateSaveBtn);
		wait(5);
		click(close);
		wait(5);	
	}

	//	/* Function Name: adminLogout()
	//	 * Action: Admin logout
	//	 * Return type: void
	//	 */
	//	public void adminLogout(){
	//		ManageContentItemCodesSteps.adminLogout();
	//		wait(5);
	//	}
	//
	//	/* Function Name: userLogout()
	//	 * Action: User logout
	//	 * Return type: void
	//	 */
	//	public void userLogout(){
	//		ManageContentItemCodesSteps.userLogout();
	//		wait(5);
	//	}

	/* Function Name: verifyDeleteHTMLLearnignobject()
	 * Action: remove the HTML-LO in bundle and delete the HTML-LO
	 * Return type: boolean
	 */
	public boolean verifyDeleteHTMLLearnignobject() {
//		goToManagecontent();
		By htmlOName=By.xpath("//*[contains(text(),'"+getLabel("editHtmlName")+"')]");
		goToManagecontent();
		wait(5);
		createandEditCatalogBundleWithHTML("Remove LO");
		wait(5);
		click(learningObjectTab);
		wait(10);
		enterData(getLabel("editHtmlName"),searchFieldLearnObj);
		wait(20);
		click(deleteLOBtn);
		wait(2);
		click(deleteOKBtn);
		wait(5);
		//Commented on 19-Jan-2021
//		if(elementExist(NoLOFound)) {
//			wait(5);
//			return true;
//		}
		wait(5);
		return true;		
	}

	/* Function Name: userSearchHTMLLOAndLaunchHTML()
	 * Action: User search the HTML LO and launch the HTML LO
	 * Return type: boolean
	 */
	public boolean userSearchHTMLLOAndLaunchHTML() {
		By htmlOName=By.xpath("//h1[contains(text(),'"+getLabel("editHtmlName")+"')]");//Updated on 7-Jan-21
		print("Object name"+htmlOName);
		moveElementFocusandClick(searchfieldUser);
		enterData(getLabel("editHtmlName"),searchfieldUser);
		wait(2);
		driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
		wait(3);
		moveElementFocusandClick(htmlOName);
		wait(3);
		driver.switchTo().frame(1);
		click(launchBtn);
		wait(2);
		winHandles = new ArrayList<String>(driver.getWindowHandles());
		if(winHandles.size()==2) {
			driver.switchTo().window((String) winHandles.get(winHandles.size()-1));
			driver.close();
			wait(5);
			winHandles = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window((String) winHandles.get(winHandles.size()-1));
			driver.switchTo().parentFrame();
			click(closeXBtn);
			wait(2);
			return true;
		}
		return false;
	}
}
