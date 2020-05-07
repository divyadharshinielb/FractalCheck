package com.origin.fractal.testauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;


public class VenuePage extends FractalBasePage{
	private By userIcon = By.xpath(".//a[@id='dLabel']");
	private By lblLogout = By.xpath(".//a[contains(text(),'Logout')]");
	private By settingsIcon =By.xpath("//div[@class='icon dripicons-gear']");
	private By settingsSelection = By.xpath(".//div[@class='icon-Classroom-settings icon']");//li[@class='ng-scope']//li[7]
	private By addVenue = By.xpath(".//button[@class='md-raised btn btn-lg btn-default text-uppercase']");
	private By venueName =By.name("name");
	private By selectCountry = By.xpath(".//span[contains(text(),'Select Country')]");
	private By selectIndia = By.xpath(".//li[contains(text(),'India')]");
	private By selectCity = By.xpath(".//span[contains(text(),'Select City')]");
	private By selectChennai = By.xpath(".//li[contains(text(),'Chennai')]");
	private By selectBangalore = By.xpath(".//li[contains(text(),'Bangalore')]");
	private By buildingNo = By.name("buildingName");
	private By streetName = By.name("streetName");
	private By saveBtn = By.xpath(".//button[contains(@value,'Add')]");
	private By backBtn = By.xpath(".//button[contains(text(),'Back to VenueList')]");
	private By closeBtn = By.xpath(".//i[contains(@class,'text-right font-size-35')]");
	private By blankVenue = By.xpath(".//div[contains(text(),'Venue name should not be empty')]");
	private By clickBundle = By.xpath(".//span[contains(text(),'Automation Sample')]");
	private By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	private By btnHome = By.xpath("//span[contains(text(),'Home')]");
//	private By draggerBtn= By.xpath(".//div[@id='mCSB_35_scrollbar_vertical']//div[@class='mCSB_draggerContainer']");
	private By draggerBtn= By.xpath("//div[@id='mCSB_26_dragger_vertical']");
	private By searchIcon = By.xpath(".//input[@id='searchVenue']");
	private By cancel = By.xpath(".//button[contains(@class,'md-raised btn btn-cancel margin-r-20 ng-binding')]");
	private By okBtn = By.xpath(".//button[@class='md-raised btn btn-lg btn-secondary text-uppercase ng-binding']");
	private By editIcon = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/i[1]");
	private By deleteIcon = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[2]/i[1]");
	private By editStreet = By.xpath("//input[@id='input_34']");
	private By updateBtn = By.xpath(".//button[contains(@class,'btn btn-default md-raised')]");
	private By backToList = By.xpath(".//button[@class='btn btn-default btn_radius md-raised text-uppercase']");
	private By editCity = By.xpath(".//span[@class='current'][contains(text(),'Chennai')]");
	private By deleteBtn = By.xpath(".//button//span[contains(text(),'Cancel')]");//span[contains(text(),'OK')]
	
	public VenuePage(WebDriver driver) {	
		super(driver);	
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public void logout() {
		click(userIcon);
		wait(5);
		click(lblLogout);
	}
	public void clickMenu() {	
		click(settingsIcon);
		wait(2);
		WebElement element = driver.findElement( By.xpath("//div[@class='icon-Classroom-settings icon']")); Actions
		actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		wait(2);
		click(settingsSelection);
		wait(10);
	}
	public void clickHomeMenu() {
		click(btnMenu);
		wait(10);
		click(btnHome);
		wait(10);
		click(btnMenu);
		wait(10);
	}
	public void createVenue() {
		click(addVenue);
		wait(5);
	}
	public void validVenueName() {
		enterData("Automation Sample",venueName);
	}
	public void countrySelection() {
		click(selectCountry);
		wait(5);
		click(selectIndia);
		wait(5);
		}
	public void citySelection() {
		wait(5);
		click(selectCity);
		wait(5);
		click(selectChennai);
	}
	public void validBuildingName() {
		enterData("No.39",buildingNo);
		wait(5);
		WebElement element = driver.findElement(By.name("streetName"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	//	click(draggerBtn);
	}
	public void validStreetName() {
		enterData("Cambridge road",streetName);
		click(saveBtn);
	//	WebElement okBtn = driver.findElement(By.xpath((".//button[contains(@class,'md-raised btn btn-lg btn-secondary text-uppercase ng-binding')]")));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", okBtn);
		wait(5);
		click(okBtn);
	}
	public void saveButton() {
		click(saveBtn);
		elementExist(saveBtn);
		wait(5);
		click(cancel);
		search();
		wait(10);
		click(By.xpath("//body[@id='target']//div[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//div[1]//div[1]//div[5]//div[2]//i[1]"));
		wait(5);
		click(By.xpath("//span[contains(text(),'OK')]"));
	}
	public void mandatoryCheck() {
		wait(5);
		click(addVenue);
		enterData("",venueName);
		enterData("",buildingNo);
		WebElement element = driver.findElement(By.name("streetName"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		enterData("",streetName);	
	}
	
	public void invalidValidVenue() {
		click(addVenue);
		wait(5);
		enterData("",venueName);
		click(saveBtn);
		wait(5);
		elementExist(blankVenue);
		}
	public void invalidBuildingName() {
		WebElement element1 = driver.findElement(By.xpath("//input[@id='input_3']")); Actions
		actions = new Actions(driver); actions.moveToElement(element1);
		actions.perform();
		wait(10);
		if(elementExist(selectCountry)) {
		click(selectCountry);
		wait(5);
		click(selectIndia);
		wait(5);
		click(selectCity);
		click(selectChennai);
		enterData("No.39",buildingNo);
		}
		WebElement element = driver.findElement(By.name("streetName"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		}
	public void invalidStreetName() {
		wait(5);
		enterData("",streetName);
		click(saveBtn);
		elementExist(blankVenue);
	}
	public void cancelButton() {
		click(cancel);			
		}	
	public void search() {
		enterData("Automation Sample",searchIcon);
	}
	public void editVenue() {
		wait(5);
		enterData("Automation Venue",searchIcon);
		wait(10);
		elementExist(editIcon);
	/*	click(editIcon);
		wait(5);
		click(editCity);
		wait(5);
		click(selectBangalore);
	//	click(updateBtn);
		click(backToList);
*/	}
	public void deleteVenue() {
		wait(5);
		enterData("Automation Venue",searchIcon);
		wait(10);
		elementExist(deleteIcon);
	/*	click(deleteIcon);
		click(deleteBtn);
	*/	
	}
	public void searchFunction() {
		elementExist(searchIcon);
	}
	
}
