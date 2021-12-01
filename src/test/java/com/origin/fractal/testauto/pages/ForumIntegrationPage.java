package com.origin.fractal.testauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;
/* File Name: ForumIntegrationPage.java
 * Purpose: FR1-5148- Forum Task - Discussion Report and delete
 * Number of Testcases: 3
 * Created by: DivyaDharshini R
 * Created on: 25-12-2021
  */
public class ForumIntegrationPage extends FractalBasePage{
	CatalogItemPage page = new CatalogItemPage(driver);
public By searchBar = By.xpath("//input[@id='theInput']");
public By lblDiscussion = By.xpath("//li[contains(text(),'Discussion')]");
public By searchCatalogItem = By.xpath("//a[contains(text(),'Forum -- Auto -- Test')]/..");
public By startDiscussionBtn = By.xpath("//button[contains(text(),'START A DISCUSSION')]");
public By topicName = By.xpath("//input[@name='threadname']");
public By descriptiontxt = By.xpath("//body[@id='tinymce']");
public By inputFile = By.xpath("//input[@accept='image/jpeg,image/png']");
String fileLocation = "C:\\Users\\origin.OLSCHN-PC-0229\\Pictures\\BrowseFIleImg.jpg";
public By postDiscussBtn = By.xpath("//button[contains(text(),'POST DISCUSSION')]");
public By okBtn = By.xpath("//button[contains(text(),'OK')]");
public By userProfileBtn = By.xpath("//div[@class='user-profile-letter']");
public By logoutBtn = By.xpath("//li[contains(text(),'Logout')]");
public By preloginBtn = By.xpath("//a[contains(text(),'LOGIN')]");
public By loginBtn = By.xpath("//input[@value='LOGIN']");
public By userNameField = By.xpath("//label[contains(text(),'Username')]/../input");
public By passwordField = By.xpath("//label[contains(text(),'Password')]/../input");
public By lblComment = By.xpath("//div[contains(text(),'Description for catalog')]");
public By reportBtn = By.xpath("//div[contains(text(),'Description for catalog')]/../../div/button[contains(text(),'Report')]");
public By reportedBtn = By.xpath("//div[contains(text(),'description for catalog')]/../../div/button[contains(text(),'Reported')]");
public By adminSearch = By.xpath("//input[@id='searchCatalog']");
public By catalogItem = By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/ng-include[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]");
public By adminDiscussion = By.xpath("//span[contains(text(),'Discussions')]");
public By discussionDelete = By.xpath("//div[contains(text(),'Automation DirectUser')]/../../../div/div/div/i");
public By commentUser = By.xpath("//div[contains(text(),'Automation DirectUser')]");
public By deleteOkBtn = By.xpath("//span[contains(text(),'OK')]/..");
private By adminprofile = By.xpath("//span[@class='loggeduserbg ng-binding']");
private By adminLogout = By.xpath("//a[contains(text(),'Logout')]");

public ForumIntegrationPage(WebDriver driver) {
		super(driver);
	}


/*
 * function: user1AddDiscussion()
 * covers: It covers the discussion comments
 */
	public void user1AddDiscussion() {
		click(searchBar);
		enterData("forum",searchBar);
		driver.findElement(By.xpath("//input[@id='theInput']")).sendKeys(Keys.ENTER);
		wait(5);
		click(searchCatalogItem);
		wait(5);
		click(lblDiscussion);
		click(startDiscussionBtn);
		wait(2);
		enterData("Topic",topicName);
		driver.switchTo().frame(0);
		click(descriptiontxt);
		enterData("Description for catalog", descriptiontxt);
		driver.switchTo().defaultContent();
	    fileUpload(inputFile,fileLocation);
		click(postDiscussBtn);
		wait(2);
		click(okBtn);
		userLogout();
	}
	/*
	 * function: userLogout()
	 * covers: It covers the user logout
	 */
 public void userLogout() {
	 scrollToElement(userProfileBtn);
	 wait(2);
	 click(userProfileBtn);
	 wait(2);
	 click(logoutBtn);
	 wait(5);
 }
 /*
	 * function: user2ReportDiscussion()
	 * covers: It covers the user reporting the discussion
	 */
	public void user2ReportDiscussion() {
		click(preloginBtn);
		wait(2);
		enterData("subalakshmi.s004@gmail.com",userNameField);
		enterData("Suba@123",passwordField);
		click(loginBtn);
		wait(5);
		enterData("forum",searchBar);
		driver.findElement(By.xpath("//input[@id='theInput']")).sendKeys(Keys.ENTER);
		wait(5);
		click(searchCatalogItem);
		wait(5);
		click(lblDiscussion);
		wait(2);
		scrollToElement(lblComment);
		click(reportBtn);
		wait(2);
		elementExist(reportedBtn);
		userLogout();
	}
	/*
	 * function: deleteCommentsAdmin()
	 * covers: It covers deletion of the comment reported by user
	 */
	public void deleteCommentsAdmin()  {
		wait(2);
		page.clickManageContents();
		page.clickCatalogitem();
		click(adminSearch);
		enterData("Forum",adminSearch);
		wait(5);
		click(catalogItem);
		click(adminDiscussion);
		wait(2);
		scrollToElement(commentUser);
		click(discussionDelete);
		wait(2);
		click(deleteOkBtn);
		wait(2);
		scrollToElement(adminprofile);
		click(adminprofile);
		wait(5);
		click(adminLogout);
		wait(2);
	}
	
}