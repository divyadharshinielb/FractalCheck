package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.ManageContentItemCodesSteps;
import com.origin.fractal.testauto.steps.ManageContentSteps;
/*
 * File/Class name: ElearningOrientationPage.java
 * Created by: Vignesh 
 * Created on: 10-July-2020
 * Updated on: 14-July-2020
 * Purpose: To check FR1-2539 - e-learning Orientation
 */
public class ElearningOrientationPage extends FractalBasePage {
	ManageContentSteps ManageContentSteps = null;
	ManageContentItemCodesSteps ManageContentItemCodesSteps=null;
	private By btnElearning = By.xpath(".//button/span[contains(text(),'eLearning')]");
	private By lblOritation= By.xpath("//*[text()='Orientation']");
	private By lblOritationAuto= By.xpath("//*[text()='Auto']");
	private By lblOritationLandScape= By.xpath("//*[text()='Landscape']");
	private By lblOritationPortrait= By.xpath("//*[text()='Portrait']");
	private By closeXBtn= By.xpath("//button[@class='close']");
	private By eLearningitemFilter= By.xpath("//a[contains(text(),'elearning')]");//Updated on 24-Feb-2021
	private By eLearningScromPackage= By.xpath("//*[text()='Scorm']");
	private By eLearningXapiPackage= By.xpath("//*[text()='Xapi']");
	private By AutoOrientationSelected =By.xpath("//*[@class='rad ng-valid ng-not-empty ng-dirty ng-touched ng-valid-parse'][@value='AUTO']");
	private By LandScapeOrientationSelected =By.xpath("//*[@class='rad ng-valid ng-not-empty ng-dirty ng-touched ng-valid-parse'][@value='LANDSCAPE']");
	private By PortraitOrientationSelected =By.xpath("//*[@class='rad ng-pristine ng-untouched ng-valid ng-not-empty'][@value='PORTRAIT']");
	private By editBtn = By.xpath("(*//i[@role='button'])[2]");
	private By uploadPackage= By.xpath("//label[contains(@class,'btn btn-tertiary btn-file')]/input");
	private By defaultOrientationSelected =By.xpath("(//div[@class='mCSB_container'])[3]/div[9]/div/div[2]/input");
	private By searchFieldLearnObj = By.xpath("//input[@id='searchObject']");
	private By updateBtn = By.xpath("//*[text()='Update']");
	private By newVersionReqNoBtn = By.xpath("//*[text()='No']");
	private By updateagainNoBtn = By.xpath("//*[text()='No']");
	private By continueBtn = By.xpath("//button[contains(text(),'Continue')]");//Added on 24-Feb-21
	public ElearningOrientationPage(WebDriver driver) {
		super(driver);
		ManageContentSteps = new ManageContentSteps(driver);
		ManageContentItemCodesSteps= new ManageContentItemCodesSteps(driver);
		pageName="eLearningOrientation";
	}

	/* Method name: gotoAddELearning()
	 * Return type: void
	 * Desc: Click on add learning object button and e learning creation
	 */	
	public void gotoAddELearning() { 
		ManageContentItemCodesSteps.goToManagecontent();
		wait(3);
		ManageContentSteps.clickOnCreateLobjButton();
		wait(10);
		moveElementFocusandClick(btnElearning);
		wait(10);
	}

	/* Method name: clickCloseXbutton()
	 * Return type: void
	 * Desc: Click on close X Button
	 */	
	public void clickCloseXbutton() {
		click(closeXBtn);
		wait(3);
	}

	/* Method name: verifyELearningOrientation()
	 * Return type: bool
	 * Desc: Verify the Orientation present in e-learning object
	 */
	public boolean verifyELearningOrientation() {
		gotoAddELearning();
		moveElementFocus(lblOritationPortrait);
//		if(getObj(defaultOrientationSelected).isSelected()==true) {
			if (elementExist(lblOritation) && elementExist(lblOritationAuto) && elementExist(lblOritationLandScape) && 
					elementExist(lblOritationPortrait)) {
				return true;
			}
//		}
		return false;
	}

	/* Method name: verifyOrientationSelection()
	 * Return type: bool
	 * Desc: Verify the Orientation radio button action in e-learning object
	 */
	public boolean verifyOrientationSelection() {
		wait(3);
		if (elementExist(lblOritationAuto) || elementExist(lblOritationLandScape) || elementExist(lblOritationPortrait)) {
			click(lblOritationAuto);
			wait(2);
			click(lblOritationLandScape);
			wait(2);
			click(lblOritationPortrait);
			wait(2);
			clickCloseXbutton();
			return true;
		}
		clickCloseXbutton();
		return false;
	}

	/* Method name: clickeLearningItemFilter()
	 * Return type: void
	 * Desc: click on elearning item type filter and search a name
	 */
	public void clickeLearningItemFilter(String Name) {
//		wait(5); commented on 4-Dec-20
//		click(eLearningitemFilter); commented on 4-Dec-20
		wait(5); 
		enterData(getLabel(Name),searchFieldLearnObj);	
		wait(10);
//		click(eLearningitemFilter); //Added on 4-Dec-20
		wait(3);
		click(editBtn);
		wait(10);
		//Added on 24-Feb-21
		if (elementExist(continueBtn)) {
			click (continueBtn);
			wait(5);
		}
		//ends
	}

	/* Method name: editLOandselectUploadFilePackageType()
	 * Return type: void
	 * Desc: click on Edit e-learning and select the upload package type
	 */
	public void editLOandselectUploadFilePackageType(String Package) {
		click(editBtn);
		wait(5);
		if(Package.equalsIgnoreCase("scorm1.2")) {
			click(eLearningScromPackage);
			wait(2);
			fileUpload(getLabel("Scrom1.2Package"),uploadPackage);
			wait(2);
		}
		else if(Package.equalsIgnoreCase("Xapi")) {
			click(eLearningXapiPackage);
			wait(2);
			fileUpload(getLabel("XapiPackage"),uploadPackage);
			wait(2);
		}
		else {
			print("Package selecting is NOT present");
		}
	}

	/* Method name: updateAnElearning()
	 * Return type: void
	 * Desc: Update the Learning Object
	 */
	public void updateAnElearning() {
		wait(2);
		click(updateBtn);
		wait(2);
		click(newVersionReqNoBtn);
		wait(3);
		click(updateagainNoBtn);
		wait(3);
	}

	/* Method name: selectAuto()
	 * Return type: void
	 * Desc: click on Auto
	 */
	public void selectAuto(String Name) {
		clickeLearningItemFilter(Name);
		moveElementFocusandClick(lblOritationAuto);
		wait(2);
		updateAnElearning();
		clickeLearningItemFilter(Name);
	}

	/* Method name: selectLandscape()
	 * Return type: void
	 * Desc: click on Landscape
	 */
	public void selectLandscape(String Name) {
		moveElementFocusandClick(lblOritationLandScape);
		wait(2);
		updateAnElearning();
		clickeLearningItemFilter(Name);
	}

	/* Method name: selectPortrait()
	 * Return type: void
	 * Desc: click on Portrait
	 */
	public void selectPortrait(String Name) {
		moveElementFocusandClick(lblOritationPortrait);
		wait(2);
		updateAnElearning();
		clickeLearningItemFilter(Name);
	}

	/* Method name: verifyAutoOrientation()
	 * Return type: bool
	 * Desc: Click auto orientation and Update the Learning Object
	 */
	public boolean verifyAutoOrientation(String Name) {
		try{
			wait(3);
			selectAuto(Name);
//			if(getObj(AutoOrientationSelected).isSelected()==true) {
			if(elementExist(lblOritationAuto)) {
				return true;
			}
			return false;
		}
		catch(Exception e) {
			return false;
		}
	}

	/* Method name: verifyLandScapeOrientation()
	 * Return type: bool
	 * Desc: Click Landscape orientation and Update the Learning Object
	 */
	public boolean verifyLandScapeOrientation(String Name) {
		try{
			wait(3);
			selectLandscape(Name);
//			if(getObj(LandScapeOrientationSelected).isSelected()==true) {
			if(elementExist(lblOritationLandScape)) {
				return true;
			}
			return false;
		}
		catch(Exception e) {
			return false;
		}
	}

	/* Method name: verifyLandScapeOrientation()
	 * Return type: bool
	 * Desc: Click Portrait orientation and Update the Learning Object
	 */
	public boolean verifyPortraitOrientation(String Name) {
		try{
			wait(3);
			selectPortrait(Name);
//			if(getObj(PortraitOrientationSelected).isSelected()==true ) {
			if(elementExist(lblOritationPortrait)) {
				return true;
			}
			return false;
		}
		catch(Exception e) {
			return false;
		}
	}

	//Added on 22Sep20
	/* Method name: preRequisite()
	 * Return type: void
	 * Desc: preRequisite- Click Portrait orientation and Update the Learning Object
	 */
	public void preRequisite(String Name) {
		clickeLearningItemFilter(Name);
		wait(30);
		if(getObj(PortraitOrientationSelected).isSelected()==true) {
			click(closeXBtn);
			wait(3);
		}
		else {
			moveElementFocusandClick(lblOritationPortrait);
			updateAnElearning();
		}
	}
	//Ends

}