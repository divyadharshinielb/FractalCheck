package com.origin.fractal.testauto.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
/* File Name: ClassLearningObjectPage.java
 * Purpose: FR1-3774 - Class Learning object creation and deletion
 * Number of Testcases: 3
 * Created by: DivyaDharshini R
 * Created on: 05-03-2021
 * Updated on: 25-03-2021
 */
public class ClassLearningObjectPage extends FractalBasePage {
	DocumentValidationPage page;
	public By classLOBtn = By.xpath("//button/span[contains(text(),'Class')]");
	public By titleError = By.xpath("//div[contains(text(),'Title should not be empty')]");
	public By saveBtn = By.xpath("//button[contains(text(),'Save')]");
	public By categoryError = By.xpath("//div[contains(text(),'Category should not be empty')]");
	public By languageError = By.xpath("//div[contains(text(),'Language should not be empty')]");
	public By descError = By.xpath("//div[contains(text(),'Description should not be empty')]");
	public By linkError = By.xpath("//div[contains(text(),'Link Code should not be empty')]");
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
	public By deleteIcon = By.xpath("//div[contains(text(),'ClassLOCHECKEdit')]/../../../div/i[2]");
	public By searchBar = By.xpath("//input[@id='searchObject']");
	public By editIcon = By.xpath("//div[contains(text(),'ClassLOCHECK')]/../../../div/i[contains(@data-template-url1,'editObj.html')]");
	public By updateBtn = By.xpath("//button[contains(text(),'Update')]");
	public By okBtn = By.xpath("//button/span[contains(text(),'OK')]");
	public By userSearchBar = By.xpath("//input[@id='theInput']");
	public By catalogItem = By.xpath("//a[contains(text(),'Automation_Timeline')]/..");
	public By greenIcon = By.xpath("//i[contains(@class,'icon-r_green_arrow font-36 cp')]");
	public By classLo = By.xpath("//div[contains(text(),'Automation_ClassLO')]");
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
		verifyText("Link Code should not be empty",linkError);
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
		enterData("httpsfs",linkInput);
		enterData("asdfasdf",descInput);
		enterData("itemCodeInput",itemCodeInput);
		enterData("00",lblHour);
		enterData("30",lblMinute);
		click(saveBtn);
		verifyText("Invalid Link",invalidLinkError);
		//click(closeBtn);
	}
	/*
	 * Function name: classLOCreation()
	 * Covers:It covers creation of a Class LO
	 */
	public void classLOCreation() {
		wait(2);
		classLOInvalidLinkValidation();
		clear(linkInput);
		enterData("https://google.com",linkInput);
		wait(2);
		click(saveBtn);
		wait(2);
		elementExist(backToLOBtn);
		wait(2);
		click(closeBtn);
		wait(5); 
	}
	/*
	 * Function name:editAndDeleteClassLO()
	 * Covers:It covers edit and delete of a class LO 
	 */
	public void editAndDeleteClassLO() {
		enterData("ClassLOCHECK",searchBar);
		wait(5);
		click(editIcon);
		wait(2);
		clear(titleInput);
		enterData("ClassLOCHECKEdit",titleInput);
		clear(linkInput);
		enterData("https://google.com",linkInput);

		click(updateBtn);
		wait(2);
		enterData("ClassLOCHECKEdit",searchBar);
		wait(5);
		click(deleteIcon);
		wait(5);
		click(okBtn);
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
