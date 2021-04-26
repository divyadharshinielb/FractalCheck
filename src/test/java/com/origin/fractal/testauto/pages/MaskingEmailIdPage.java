package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
/* File Name: MaskingEmailIdPage.java
 * Purpose: Check for MaskingEmailId in admin and user part -FR1-3960
 * Number of Testcases: 4
 * Created by: Mahesh
 * Created on: 22/04/2021
 */
public class MaskingEmailIdPage extends FractalBasePage  {
	private By btnSettings=By.xpath("//div[@class='icon dripicons-gear']");
	private By btnWhiteLabel=By.xpath("//li[@title='White Labeling']");
	private By lblMasking=By.xpath("//div[contains(text(),'Enable/Disable Masking')]");
	private By lblSwitch=By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/ng-include[1]/form[1]/div[1]/div[17]/div[1]/div[1]/div[2]/div[1]/md-switch[1]/div[1]/div[2]/div[1]");
	private By lblMangeUsers=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/ng-include[1]/div[2]/ul[1]/li[5]/a[1]/div[1]");
	private By txtBusinessUser=By.xpath("//span[contains(text(),'Business User')]");
	private By searchField=By.xpath("//input[@id='searchAllUsersName']");
	private By assignContent=By.xpath("//div//i[@title='Assign Content']");
	private By businessUserMasking=By.xpath("//div[contains(text(),'wint*****************************')]");
	private By closeBtn=By.xpath("//button//i");
	private By directUserProfilelbl=By.xpath("//div[@class='masking_id']");
	private By lblProfile=By.xpath("//button//span//img[@class='logout-height']");
	private By logout=By.xpath("//div//div//ul//li[@role='menuitem'][contains(text(),'Logout')]");
	private By LOGINPRE=By.xpath("//a[contains(text(),'LOGIN')]");
	private By tbUserName = By.xpath(".//input[@name='username']");
	private By tbPassword = By.xpath(".//input[@name='password']");
	private By btnLogin = By.xpath("//input[@type='submit']");
	public By btnCookies = By.xpath("//button[@id='CookieAccept']");
	public MaskingEmailIdPage(WebDriver driver) {
		super(driver);
	}
	/*
	 * function: gotoWhiteLabel()
	 * covers: It covers navigation of gotoWhiteLabel function in AddingStripePage 
	 */
	public void gotoWhiteLabel() {
		wait(5);
		click(btnSettings);
		wait(5);
		click(btnWhiteLabel);
		wait(5);
	}
	/*
	 * function: enableMasking()
	 * covers: It covers navigation of enableMasking function in AddingStripePage 
	 */
	public void enableMasking() {
		click(lblMasking);
		wait(5);
		click(lblSwitch);
	}
	/*
	 * function: adminMaskingVerify()
	 * covers: It covers navigation of adminMaskingVerify function in AddingStripePage 
	 */
	public void adminMaskingVerify() {
		wait(2);
		WebElement element = driver.findElement(lblMangeUsers); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(element);
		actions.perform();
		wait(5);
		click(lblMangeUsers);
		wait(5);
		enterData("Business User",searchField);
		wait(5);
		click(assignContent);
		wait(5);
		verifyText("wint*****************************",businessUserMasking);
		wait(5);
		click(closeBtn);
		wait(2);
	}
	/*
	 * function: userPartMailVerify()
	 * covers: It covers navigation of userPartMailVerify function in AddingStripePage 
	 */
	public void userPartMailVerify() {
		click(lblProfile);
		wait(5);
		verifyText("auto****************************************",directUserProfilelbl);
		wait(2);
		click(logout);
		wait(5);
		click(LOGINPRE);
		wait(2);
		if(elementExist(btnCookies)) {
			click(btnCookies);
		}
		wait(5);
		enterData("automation_directuser@originlearning.com",tbUserName);
		enterData("AutoDU@123",tbPassword);
		click(btnLogin);
		wait(2);;
		
		
	}
}
