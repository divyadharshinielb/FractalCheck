package com.origin.fractal.testauto.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.origin.fractal.testauto.FractalBasePage;
/* File Name: ClassLearningObjectPage.java
 * Purpose: FR1-3774 - Class Learning object creation and deletion
 * Number of Testcases: 3
 * Created by: DivyaDharshini R
 * Created on: 05-03-2021
 * Updated on: 25-03-2021
 * Edited based on FR1-4627 - 13/11/2021
 */
public class ClassLearningObjectPage extends FractalBasePage {
	DocumentValidationPage page;
	public By classLOBtn = By.xpath("//button/span[contains(text(),'Class')]");
	public By titleError = By.xpath("//div[contains(text(),'Title should not be empty')]");
	public By saveBtn = By.xpath("//button[contains(text(),'Save')]");
	public By categoryError = By.xpath("//div[contains(text(),'Category should not be empty')]");
	public By languageError = By.xpath("//div[contains(text(),'Language should not be empty')]");
	public By descError = By.xpath("//div[contains(text(),'Description should not be empty')]");
	public By linkError = By.xpath("//div[contains(text(),'Link should not be empty')]");
	public By itemCodeError = By.xpath("//div[contains(text(),'Item Code should not be empty')]");
	public By durationError = By.xpath("//div[contains(text(),'Duration should not be empty')]");
	public By closeBtn = By.xpath("//body/div[@id='addObject']/div[1]/div[1]/div[1]/button[1]/i[1]");
	public By titleInput = By.xpath("//label[contains(text(),'Title')]/../input");
	public By selectCategoryBtn = By.xpath("//span[contains(@placeholder,'Select Category')]/../input");
	public By selectCategoryOption = By.xpath("//li[@class='ui-select-choices-group']/div/span/span[contains(text(),'Management')]");
	public By selectCategoryOption2 = By.xpath("//li[@class='ui-select-choices-group']/div/span/span[contains(text(),'General')]");
	public By selectLanguageBtn = By.xpath("//span[contains(text(),'Select Language')]");
	public By selectLanguageOption= By.xpath("//span[contains(text(),'Select Language')]/../ul/li[contains(text(),'English')]");
	public By linkInput = By.xpath("//label[contains(text(),'Link')]/../input");
	public By descInput = By.xpath("//label[contains(text(),'Description')]/../div/textarea");
	public By itemCodeInput = By.xpath("//label[contains(text(),'Item Code')]/../input");
	public By lblHour = By.xpath("//input[contains(@placeholder,'HH')]");
	public By lblMinute = By.xpath("//input[contains(@placeholder,'MM')]");
	public By invalidLinkError = By.xpath("//div[contains(text(),'Invaild Link')]");
	public By backToLOBtn = By.xpath("//button[contains(text(),'Back to Learning Objects')]");
	public By deleteIcon = By.xpath("//div[contains(text(),'ClassLOCHECKEdit')]/../../../div[6]/i");
	public By searchBar = By.xpath("//input[@id='searchObject']");
	public By editIcon = By.xpath("//div[contains(text(),'ClassLOCHECK')]/../../../div/i[contains(@data-template-url1,'editObj.html')]");
	public By updateBtn = By.xpath("//button[contains(text(),'Update')]");
	public By okBtn = By.xpath("//button/span[contains(text(),'OK')]");
	public By userSearchBar = By.xpath("//input[@id='theInput']");
	public By catalogItem = By.xpath("//a[contains(text(),'Automation_Timeline')]/..");
	public By greenIcon = By.xpath("//i[contains(@class,'icon-r_green_arrow font-36 cp')]");
	public By classLo = By.xpath("//div[contains(text(),'Automation_ClassLO')]");
	public By noBtn = By.xpath("//button/span[contains(text(),'No')]");
	public By noLOBtn = By.xpath("//button[contains(text(),'No')]");
	public By linkInputCheck = By.xpath("//input[contains(@ng-model,'class.link')]");
	public By noRecordsDiv = By.xpath("//div[contains(text(),'No records found')]");
	public ClassLearningObjectPage(WebDriver driver) {
		super(driver);

		page=new DocumentValidationPage(driver);
	}
	/*
	 * Function name: classLOEmptyFieldValidation()
	 * Covers:It covers validation of a class LO 
	 */
	public void classLOEmptyFieldValidation() {
		page.addLearningObjectBtn();
		wait(5);
		click(classLOBtn);
		wait(5);
		click(saveBtn);
		verifyText("Title should not be empty",titleError);
		verifyText("Category should not be empty",categoryError);
		verifyText("Language should not be empty",languageError);
		verifyText("Description should not be empty",descError);
		verifyText("Link should not be empty",linkError);
		verifyText("Item Code should not be empty",itemCodeError);
		verifyText("Duration should not be empty",durationError);
		click(closeBtn);
		wait(2);
	}
	/*
	 * Function name:classLOInvalidLinkValidation()
	 * Covers:It covers validation of a class LO 
	 */
	public void classLOInvalidLinkValidation() {
		page.addLearningObjectBtn();
		wait(10);
		click(classLOBtn);
		wait(2);
		enterData("ClassLOCHECK",titleInput);
		click(selectCategoryBtn);
		wait(2);
		click(selectCategoryOption);
		click(selectCategoryOption2);
		click(selectLanguageBtn);
		wait(2);
		click(selectLanguageOption);
		enterData("google.com",linkInput);
		wait(2);
		enterData("Description for Class Lo",descInput);
		enterData("Class123",itemCodeInput);
		enterData("00",lblHour);
		enterData("30",lblMinute);
		click(saveBtn);
		//uncomment this line on checking with saras mam
	//	verifyText("Invalid Link",invalidLinkError);
		//click(closeBtn);
	}
	/*
	 * Function name: classLOCreation()
	 * Covers:It covers creation of a Class LO
	 */
	public void classLOCreation() {
		wait(2);
		classLOInvalidLinkValidation();
		elementExist(backToLOBtn);
		wait(2);
		click(closeBtn);
		wait(5); 
	}
	/*
	 * Function name:editAndDeleteClassLO()
	 * Covers:It covers edit and delete of a class LO 
	 */
	public void editAndDeleteClassLO() throws Exception {
		enterData("ClassLOCHECK",searchBar);
		wait(5);
		click(editIcon);
		wait(2);
		//clear(titleInput);
		enterData("ClassLOCHECKEdit",titleInput);
		//clear(linkInput);
		elementExist(linkInput);
		//getText(By.xpath("//input[contains(@ng-model,'class.link')]"));
		String linkvalue = getAttributeValuePassword(linkInputCheck);
		if(verifyText("http://google.com",linkvalue)== true) {
			print("The https value is appended to the link");
			click(updateBtn);
			wait(2);
			click(noBtn);
			click(noLOBtn);
			enterData("ClassLOCHECKEdit",searchBar);
			//wait(10);
			explicitWait(10,deleteIcon);
			click(deleteIcon);
			wait(5);
			click(okBtn);	
			wait(5);
			enterData("ClassLOCHECKEdit",searchBar);
			explicitWait(10,noRecordsDiv);
			verifyText("No records found",noRecordsDiv);
		}
		else {
			throw new Exception();
		}
	}
	public void explicitWait(int sec,By element) {
		WebDriverWait wait = new WebDriverWait (driver, sec);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	}
	/*
	 * Function name:userPartClassLO()
	 * Covers:It covers the presence of class LO in user part
	 */
	public void userPartClassLO() {
		click(userSearchBar);
		enterData("Automation_Timeline",userSearchBar);
		driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
		wait(5);
		scrollToElement(catalogItem);
		wait(2);
		click(catalogItem);
		wait(2);
		scrollToElement(classLo);
		elementExist(greenIcon);
		elementExist(classLo);
	}

}
