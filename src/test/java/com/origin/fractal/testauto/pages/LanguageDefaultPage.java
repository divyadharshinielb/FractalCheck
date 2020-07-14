package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
/* File Name: LanguageDefaultPage.java
 * Purpose: Check for Default language in admin and user part - FR1-2367
 * Created by: DivyaDharshini
 * Created on: 25-June-2020
 */

public class LanguageDefaultPage extends FractalBasePage{
	private By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	private By settingsIcon =By.xpath("//div[@class='icon dripicons-gear']");
	private By closebtn = By.xpath("//button[@class='close']");
	private By btnHome = By.xpath("//span[contains(text(),'Home')]");
	private By languageicon = By.xpath("//li[@title='Language']//div[1]");
	private By whatsnewviewall = By.xpath("//a[contains(text(),'VIEW ALL')]");
	private By whatsnewdropdown = By.xpath("//div[@class='Dropdown-placeholder is-selected']");
	private By alllanguagewhatsnewdropdown = By.xpath("//div[text()='ALL LANGUAGES']");
	private By alllanguagedropdownoption = By.xpath(".//div[@class='Dropdown-menu']/div[text()='ALL LANGUAGES']");
	//private By whatsnewdropdownoption = By.xpath("//div[@class='Dropdown-option is-selected']");
	private By engmylearningdropdown = By.xpath("//div[@class='Dropdown-control']/div[contains(text(),'English')]");
	private By lblMyLearning = By.xpath(".//a[contains(text(),'MY LEARNING')]");
	private By contentlanguageselect = By.xpath("//div[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty']/span[contains(text(),'English')]");
	private By btnaddlearnobj = By.xpath("//button[contains(text(),'Add Learning Object')]");
	private By btnelearn = By.xpath("//i[@class='icon  text-right font-size-27']/../../span[contains(text(),'eLearning')]");
	private By englishtext = By.xpath("//div[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required']/span[contains(text(),'English')]");
	private By managecontentlbl = By.xpath("//span[contains(text(),'Manage Content')]");
	private By btnvideo = By.xpath("//i[@class='icon text-right font-size-27']/../../span[contains(text(),'Video')]");
	private By catalogitemlbl = By.xpath("//span[contains(text(),'Catalog Items')]");
	private By bundlelbl = By.xpath("//i[@class='icon  text-right font-size-27 text-ddd']/../../div/span[contains(text(),'Content Bundle')]");
	private By addcatalogitembtn = By.xpath("//button[contains(text(),'Add Catalog')]");
	private By learningpathlbl = By.xpath("//i[@class='icon  text-right font-size-27 text-ddd']/../../div/span[contains(text(),'Learning path')]");
	private By closebtncatalog = By.xpath("//i[@class='icon  text-right font-size-35 padding-r-30 padding-t-10']/..");
	private By selectLanguage = By.xpath("//span[text()='Select Language']");
	private By languagename = By.xpath("//input[@name='langname']");
	private By afarlanguageselect = By.xpath("//span[contains(text(),'Afar')]");
	private By createLanguagebtn = By.xpath("//button[contains(text(),'Create')]");
	private By languagecode = By.xpath("//input[@name='langcode']");
	private By afarlanguage = By.xpath("//span[contains(text(),'Akan')]");
	private By allLanguageLbl = By.xpath("//div[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']/span[contains(text(),'All Languages')]");
	private By completedtab = By.xpath("//li[text()='COMPLETED']");
	public LanguageDefaultPage(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;

	/*
	 *function: clickLanguageicon()
	 * cause: Click language icon and check for language fields
	 */

	public void clickLanguageicon() {
		click(btnMenu);
		wait(10);
		click(btnHome);
		wait(10);
		click(btnMenu);
		wait(10);
		js.executeScript("window.scrollBy(0,1000)");
		click(settingsIcon);
		wait(5);
		elementExist(languageicon);
		click(languageicon);	
	}
	/*
	 *function: learningitemLanguageCheck()
	 * cause:Check for the language text in learning items page 
	 */

	public void learningitemLanguageCheck() {
		click(btnMenu);
		wait(2);
		click(managecontentlbl);
		wait(2);
		if(elementExist(allLanguageLbl)==true) {
			verifyText("All Languages",allLanguageLbl);
			click(btnaddlearnobj);
			wait(2);
			click(btnelearn);
			wait(2);
			verifyText("Select Language",selectLanguage);
			click(closebtn);
			click(btnaddlearnobj);
			wait(2);
			click(btnvideo);
			wait(2);
			verifyText("Select Language",selectLanguage);
			wait(2);
			click(closebtn);

		}
		else if (elementExist(contentlanguageselect)==true) {


			verifyText("English",contentlanguageselect);
			click(btnaddlearnobj);
			wait(2);
			click(btnelearn);
			wait(2);
			verifyText("English",englishtext);
			click(closebtn);
			click(btnaddlearnobj);
			wait(2);
			click(btnvideo);
			wait(2);
			verifyText("English",englishtext);
			wait(2);
			click(closebtn);
		}
	}
	/*
	 *function: catalogitemLanguageCheck()
	 * cause: Check for language in catalog item page
	 */

	public void catalogitemLanguageCheck() {
		click(catalogitemlbl);
		wait(2);
		if(elementExist(allLanguageLbl)==true)
		{
			verifyText("All Languages",allLanguageLbl);
			click(addcatalogitembtn);
			wait(2);
			click(bundlelbl);
			wait(2);
			elementExist(selectLanguage);
			verifyText("Select Language",selectLanguage);
			click(closebtncatalog);
			wait(2);
			click(addcatalogitembtn);
			click(learningpathlbl);
			verifyText("Select Language",selectLanguage);
			click(closebtncatalog);
		}
		else if(elementExist(contentlanguageselect)==true) {
			verifyText("English",contentlanguageselect);
			click(addcatalogitembtn);
			wait(2);
			click(bundlelbl);
			verifyText("English",englishtext);
			wait(2);
			click(closebtncatalog);
			wait(2);
			click(addcatalogitembtn);
			click(learningpathlbl);
			verifyText("English",englishtext);
			wait(2);
			click(closebtncatalog);
		}
	}
	/*
	 *function: whatsnewEnglishCheck()
	 * cause: Check for language in whatsnewsection
	 */

	public void whatsnewEnglishCheck() {

		scrollToElement(whatsnewviewall);
		wait(5);
		click(whatsnewviewall);
		wait(5);
		elementExist(whatsnewdropdown);
		wait(2);
		if(elementExist(alllanguagewhatsnewdropdown)==true) {
			verifyText("ALL LANGUAGES",alllanguagewhatsnewdropdown);
			click(whatsnewdropdown);
			elementExist(alllanguagewhatsnewdropdown);
		}
		else {
			verifyText("English",whatsnewdropdown);
			click(whatsnewdropdown);
			elementExist(whatsnewdropdown);
		}	
	}
	/*
	 *function: inprogressEnglishCheck()
	 * cause: Check for language text in in-progress section
	 */

	public void inprogressEnglishCheck() {
		click(lblMyLearning);
		wait(2);
		Languagecheck();

	}
	/*
	 *function: completedEnglishCheck()
	 * cause: Check for language text in completed section
	 */

	public void completedEnglishCheck() {
		wait(2);
		scrollToElement(lblMyLearning);
		wait(2);
		click(lblMyLearning);
		wait(2);
		click(completedtab);
		Languagecheck();
	}
	/*
	 * function: Languagecheck()
	 * Cause: Check for the english/all language text -common function for both inprogress and completed section
	 * 
	 */
	public void Languagecheck() {
		if(elementExist(engmylearningdropdown)==true) {
			scrollToElement(engmylearningdropdown);
			wait(2);
			elementExist(engmylearningdropdown);
			wait(2);
			verifyText("English",engmylearningdropdown);
			wait(2);
			click(engmylearningdropdown);
			wait(2);
			elementExist(engmylearningdropdown);
		}
		else if((elementExist(alllanguagewhatsnewdropdown)==true)){
			scrollToElement(alllanguagewhatsnewdropdown);
			wait(2);
			elementExist(alllanguagewhatsnewdropdown);
			wait(2);
			verifyText("ALL LANGUAGES",alllanguagewhatsnewdropdown);
			wait(2);
			click(alllanguagewhatsnewdropdown);
			wait(2);
			elementExist(alllanguagedropdownoption);
		}

	}
	/*
	 * function: createLanguage
	 * Cause: Check for creation of language
	 */

	public void createLanguage() {
		clickLanguageicon();
		wait(2);
		click(selectLanguage);
		click(languagename);
		click(afarlanguageselect);
		verifyText("aa", languagecode);
		click(createLanguagebtn);
		elementExist(afarlanguage);
	}

}