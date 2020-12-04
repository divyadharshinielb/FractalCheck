package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
/* File Name: RenewButtonPage.java
 * Purpose: Renew Button  -FR1-2777,FR1-2496
 * Number of Testcases: 5
 * Created by: DivyaDharshini
 * Created on: 03-July-2020
 */
public class RenewButtonPage extends FractalBasePage{
	public By searchbar =  By.xpath("//input[@name='searchterm']");
	public By renewbtnsearch = By.xpath("//button[text()='RENEW']");
	public By daysleftLbl = By.xpath("//p[@class='cheaddes padding-t-5 padding-b-15']/span");
	public By bundleImage = By.xpath("//h1[@title='Renew Check1']");
	public By myLearning = By.xpath("//a[text()='MY LEARNING']");	
	public By scrollImg = By.xpath("//div[@class='scrollup']");
	public By gridView = By.xpath("//i[@class='icon-list font-16']");
	public By completedLbl = By.xpath("//li[text()='COMPLETED']");
	public By whatsNewViewAll = By.xpath("//a[contains(text(),'VIEW ALL')]");//a[contains(text(),'VIEW ALL')]/..
	public By whatsNewDueDateLbl = By.xpath("//a[contains(text(),'Automation_Renew')]/../../../../p[contains(@class,'due_date myfont')]");
	public By whatsNewRenewBtn = By.xpath("//a[contains(text(),'Automation_Renew')]/../../../div/a/button");
	public By catalogTitle = By.xpath("//a[contains(text(),'Automation_Renew')]");
	public By homeLogo = By.xpath("//img[@class='logo-height']");
	public By categoryBtn = By.xpath("//a[contains(text(),'CATEGORIES')]");
	public By generalLbl = By.xpath("//a[contains(text(),'General')]");
	public By gridIcon = By.xpath("//i[@class='icon-list font-16']");
	public By gridDudeDateLbl = By.xpath("//a[contains(text(),'Automation_Renew')]/../../../p[contains(text(),'DUE DATE IS OVER')]");
	public By gridRenewBtn = By.xpath("//a[contains(text(),'Automation_Renew')]/../../../../../div/div/a/button");
	public By completedDueDateLbl = By.xpath("//a[contains(text(),'Renew Check1')]/../../../../p[contains(text(),'DUE DATE IS OVER')]");
	public By expiredLbl = By.xpath("//a[contains(text(),'Renew Check1')]/../../../../p[contains(text(),'EXPIRED')]");
	public RenewButtonPage(WebDriver driver) {
		super(driver);
	}
	/*
	 *function: searchpageRenewButton()
	 * cause: Verify renew button in search page 
	 */
	public void searchpageRenewButton() {
		wait(5);
		click(searchbar);
		enterData("automation_renew",searchbar);
		driver.findElement(searchbar).sendKeys(Keys.ENTER);
		wait(2);
		elementExist(gridRenewBtn);
		elementExist(gridDudeDateLbl);
		verifyText("Due date is over",gridDudeDateLbl);
		verifyText("RENEW",gridRenewBtn);
		click(catalogTitle);
		wait(2);
		elementExist(renewbtnsearch);
		click(homeLogo);
		wait(2);
		//commented this functionality 
		/*	if(elementExist(renewbtnsearch)) {
		click(bundleImage);
		wait(2);
		String daysleft = getText(daysleftLbl);
        String number = "";
        String letter = "";
        for (int i = 0; i < daysleft.length(); i++) {
               char a = daysleft.charAt(i);
               if (Character.isDigit(a)) {
                     number = number + a;

               } else {
                     letter = letter + a;

               }
        }
    //    System.out.println("Alphates in string:"+letter);
     //   System.out.println("Numbers in String:"+number);
       int numbernew = Integer.parseInt(number);
//print("chdhcd"+numbernew);
String renewnumber=String.valueOf(numbernew);
		click(renewbtnsearch);
		String reneweddays = renewnumber+letter;
		verifyText(reneweddays,daysleftLbl);
	}
		 */
	}
	/*
	 *function: inprogressRenewbtnCheck()
	 * Verify renew button in inprogress page  
	 */
	public void inprogressRenewbtnCheck() {
		click(myLearning);
		wait(2);
		scrollToElement(catalogTitle);
		verifyText("Due date is over",whatsNewDueDateLbl);
		verifyText("RENEW", whatsNewRenewBtn);
		elementExist(gridIcon);
		click(gridIcon);
		wait(2);
		verifyText("Due date is over",gridDudeDateLbl);
		verifyText("RENEW",gridRenewBtn);
		isClickable(gridRenewBtn);
	}
	/*
	 *function: completedRenewbtnCheck()
	 * Verify renew button in completed page  
	 */
	public void completedRenewbtnCheck() {
		click(myLearning);
		wait(2);
		click(completedLbl);
		scrollToElement(completedDueDateLbl);
		verifyText("Due date is over",completedDueDateLbl);
		verifyText("Expired", expiredLbl);
		click(homeLogo);
		wait(2);
	}
	/*
	 *function: whatsnewRenewBtnCheck()
	 * Verify renew button in whatsnew page 
	 */
	public void whatsnewRenewBtnCheck() {

		scrollToElement(whatsNewDueDateLbl);
		elementExist(whatsNewViewAll);
		wait(2);
		//check for renew button and duedate label in dasboard
		verifyText("Due date is over",whatsNewDueDateLbl);
		verifyText("RENEW", whatsNewRenewBtn);
		isClickable(whatsNewViewAll);
		click(whatsNewViewAll);
		wait(2);
		verifyText("Due date is over",whatsNewDueDateLbl);
		verifyText("RENEW", whatsNewRenewBtn);
		click(catalogTitle);
		wait(2);
		verifyText("RENEW", renewbtnsearch);
		elementExist(daysleftLbl);
		click(homeLogo);

	}
	/*
	 *function: categoryRenewBtnCheck()
	 * cause: Verify renew button after selecting category  
	 */
	public void categoryRenewBtnCheck() {
		click(categoryBtn);
		click(generalLbl);
		wait(5);
		elementExist(whatsNewDueDateLbl);
		elementExist(whatsNewRenewBtn);
		verifyText("Due date is over",whatsNewDueDateLbl);
		verifyText("RENEW", whatsNewRenewBtn);
		isClickable(whatsNewRenewBtn);
		click(gridIcon);
		wait(2);
		verifyText("Due date is over",gridDudeDateLbl);
		verifyText("RENEW",gridRenewBtn);
		isClickable(gridRenewBtn);

	}

}