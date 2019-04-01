package com.origin.fractal.testauto.pages;

import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;


public class ValidityContentAdminPage extends FractalBasePage {
	String timestamp1,timestamp2;
	private By Catalog = By.xpath(".//div[@class='icon dripicons-document-edit']");
	private By catalogClick= By.xpath(".//md-tab-item[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple']//span[@class='text-uppercase padding-lr-10 ng-binding ng-scope'][contains(text(),'Catalog Items')]");
	private By addCatalog = By.xpath(".//button[contains(text(),'Add Catalog')]");
	private By bundleAdd = By.xpath(".//span[contains(text(),'Content Bundle')]");
	private By textfield=By.xpath("//textarea[@name='item_name']");
	private By dropDown = By.xpath(".//span[contains(text(),'Select Language')]");
	private By languageChoose = By.xpath(".//*[@id='mCSB_8_container']/div/div[2]/div/div[1]/div/ul/li[3]");
	private By CategorySelection = By.xpath(".//input[@placeholder='Select Category']");
	private By CategorySelected = By.xpath(".//span[@class='ng-binding ng-scope'][contains(text(),'Projects')]");
	private By scrollBar = By.id("mCSB_8_scrollbar_vertical");
	private By itemCode = By.xpath(".//input[@id='itemCode']");
	private By description = By.id("descCatalogName");
	private By continueButton = By.xpath(".//button[contains(text(),'Continue')]");
	private By validityUnlimited = By.xpath(".//label[@id='unlimited']");
	private By priceDropdown = By.xpath(".//span[contains(text(),'Price category')]");
	private By priceFree = By.xpath(".//li[contains(text(),'Free')]");
	private By addBundle = By.xpath(".//i[contains(@title,'Expand Modules')]");
	private By bundleSelection = By.xpath(".//span[@title='who Is A Good Friend']");
	private By createButton = By.xpath(".//button[contains(@value,'Create')]");
	private By saveMessage = By.xpath(".//*[@id=\"mCSB_14_container\"]/div[2]");
	private By daysSceneriao = By.xpath(".//input[@name='validity']");
	private By dropDownClick = By.xpath(".//span[contains(text(),'Day')]");
	private By monthSelection = By.xpath(".//li[contains(text(),'Month')]");
	private By searchText =By.xpath(".//form[@name='quizFormAdd']//input[@placeholder='Search']");
	private By backBtn = By.xpath(".//button[contains(text(),'Back to Catalog Items')]");
	private By closebtn = By.xpath(".//*[@id=\"target\"]/div[3]/div/div/div[1]/button/i");
	private By searchField = By.xpath(".//input[@id='searchCatalog']");
	private By catalogName = By.xpath(".//span[@title='Automation test2']");
	private By EditBtn = By.xpath("//button[contains(text(),'Edit')]");
	private By deleteIcon = By.xpath(".//i[contains(@title,'Delete')]");
	private By deleteOk = By.xpath(".//button/span[contains(text(),'OK')]");
	private By searchCatlog = By.xpath(".//slide[@class='bannerSlick ng-scope']//div//div[@class='direct-banner-title text-white ng-binding'][contains(text(),'Automation test bundle1')]");
	private By unLimited = By.xpath("//*[@id=\"ngview\"]/div[3]/ng-include/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/span[2]/span");
	
	public ValidityContentAdminPage(WebDriver driver) {
		super(driver);
	}
	public void unLimited() {
		click(Catalog);
		wait(5);
		click(catalogClick);
		click(addCatalog);
		click(bundleAdd);
		wait(5);
		enterData("Automation test bundle2",textfield);
		wait(5);
		click(CategorySelection);
		click(CategorySelected);
		click(dropDown);
		click(languageChoose);
		wait(5);
		enterData("KV22",itemCode);
		wait(5);
		scrollInCatalogPage();
		enterData("Automation test bundle desc",description);
		click(continueButton);
		click(validityUnlimited);
		click(priceDropdown);
		wait(5);
		click(priceFree);
		click(addBundle);
		click(bundleSelection);
		click(createButton);
		elementExist(saveMessage);
		wait(5);
		click(backBtn);
		wait(5);
		click(closebtn);
	}
	public void UserLogin() {
		click(searchCatlog);
		verifyText("Unlimited",unLimited);
		
	}
	public void validity() {
		click(Catalog);
		wait(5);
		click(catalogClick);
		click(addCatalog);
		click(bundleAdd);
		wait(5);
		enterData("Automation test bundle1",textfield);
		wait(5);
		click(dropDown);
		click(languageChoose);
		click(CategorySelection);
		click(CategorySelected);
	//	click(scrollBar);
		wait(5);
		enterData("2",itemCode);
		enterData("Automation test bundle desc",description);
		click(continueButton);
		enterData("2",daysSceneriao);
		click(dropDownClick);
		click(monthSelection);
		click(priceDropdown);
		wait(5);
		click(priceFree);
		click(addBundle);
		click(bundleSelection);
		click(createButton);
		elementExist(saveMessage);
		wait(5);
		click(backBtn);
		wait(5);
		click(closebtn);
	}
	public void editCatalog() {
		click(Catalog);
		wait(5);
		click(catalogClick);
		enterData("Automation test bundle2",searchField);
		wait(5);
		click(catalogName);
		click(EditBtn);
		click(validityUnlimited);
		enterData("2",itemCode);
		click(createButton);
		elementExist(saveMessage);
	}
	public void deleteCatalog() {
		click(Catalog);
		wait(5);
		click(catalogClick);
		enterData("Automation test bundle2",searchField);
		wait(5);
		click(deleteIcon);
		click(deleteOk);
		
	}
	public void scrollInCatalogPage() {
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       //Find element by link text and store in variable "Element"        	
	       WebElement Element = driver.findElement(By.xpath(".//div[contains(@class,'banner-image')]"));
	       wait(3);
	       //This will scroll the page till the element is found	
	       js.executeScript("arguments[0].scrollIntoView();", Element);
	       wait(3);
	}
}