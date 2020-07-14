// Created by Veeresh on 02/Apr/2020
package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class ClassroomSettingsInstructorPage extends FractalBasePage {
	//	MenuPage menuPage;
	public By iconSiteAdminSettings = By.id("settings_div");
	public By btnClassroomSettings = By.xpath("//*[@title='Classroom Settings']/a");
	public By lblInstructors = By.xpath("//*[@id='step-8'][text()='Instructors']");
	public By btnAddInstructor = By.xpath("//*[text()='Add Instructor']");
	public By enterFirstName = By.xpath("//*[@name='name']");
	public By enterLastName = By.xpath("//*[@name='lname']");
	public By enterEmailTextArea = By.xpath("//*[@type='email']");
	public By skillSetDiv = By.xpath("//*[contains(@class, 'skillset-tooltip')]");
	public By lblCountry = By.xpath("(//*[@class='current'])[1]");
	public By selectCountry = By.xpath("//li[text()='India']");
	//	public By selectCountry = By.xpath("(//*[contains(text(),'India')])[27]");
	public By lblCity = By.xpath("(//*[@class='current'])[2]");
	public By selectCity = By.xpath("//li[text()='Bangalore']");
	public By lblTimeZone = By.xpath("(//*[@class='current'])[3]");
	//	public By selectTimeZone = By.xpath("//li[contains(text(),'IST India Standard Time (GMT+5:30)')]");
	public By selectTimeZone = By.xpath("//li[contains(text(), 'CET European Central Time (GMT+1:00)')]");
	public By lblInstSkillSet = By.xpath("(//*[@placeholder='Skillset'])[3]");
	public By selectInstSkill = By.xpath("//span[@class='ng-binding ng-scope'][contains(text(),'Coaching')]");
	public By btnSave = By.xpath("//button[text()='Save']");
	public By btnBackToList = By.xpath("//button[text()='BACK TO LIST']");
	public By userEmailInList = By.xpath("(//h3)[2]/span");
	//	public By btnDelete = By.xpath("(//*[@title='Delete Instructor'])[1]");
	public By btnDelete = By.xpath("//button[contains(text(),'DELETE')]");
	public By alertMsgOkBtn = By.xpath("//button[@class='md-primary md-confirm-button md-button md-default-theme md-ink-ripple']");
	public By emailAlreadyExists=By.xpath("//span[text()='Email Id Already Exists.']"); 
	public By btnClose=By.xpath("//*[contains(@class, 'close')]");
	public static boolean boolResult;
	WebElement element;
	Actions actions;

	public ClassroomSettingsInstructorPage(WebDriver driver) {
		super(driver);
		//		menuPage = new MenuPage(driver);
		pageName = "InstructorBellNotification";
	}

	public void gotoClassroomSettings() {
		//		menuPage.clickMenu();
		element = driver.findElement(iconSiteAdminSettings);
		actions = new Actions(driver);
		actions.moveToElement(element).perform();
		wait(2);
		element = driver.findElement(btnClassroomSettings);
		actions = new Actions(driver);
		actions.moveToElement(element).perform();
		wait(2);
		click(btnClassroomSettings);
		click(lblInstructors);
	}

	public boolean checkInstructorExists(String MailID) {
		wait(2);
		click(btnAddInstructor);
		wait(2);
		click(enterEmailTextArea);
		clear(enterEmailTextArea);
		wait(2);
		enterData(getLabel(MailID), enterEmailTextArea);
		wait(2);
		if (elementExist(emailAlreadyExists)) {
			print("PASSED: The mail id already has an instructor account");
			click(btnClose);
			wait(2);
			boolResult=true;
			return true;
		} else{
			print("FAILED: The mail id  has NOT an instructor account");
			click(btnClose);
			return false;
		}
	}
	public boolean verifyAddInstructors(String firstName,String lastName, String mailID) {
		//		driver.navigate().refresh();
		click(lblInstructors);
		click(btnAddInstructor);
		click(enterFirstName);
		enterData(getLabel(firstName), enterFirstName);
		click(enterLastName);
		enterData(getLabel(lastName), enterLastName);
		click(enterEmailTextArea);
		clear(enterEmailTextArea);
		enterData(getLabel(mailID), enterEmailTextArea);
		wait(2);
		if (elementExist(emailAlreadyExists)) {
			click(btnClose);
			boolResult = true;
			return true;
		} 
		else {
			element = driver.findElement(skillSetDiv);
			actions.moveToElement(element).perform();
			wait(2);
			click(lblCountry);
			click(selectCountry);
			click(lblCity);
			click(selectCity);
			click(lblTimeZone);
			click(selectTimeZone);
			click(lblInstSkillSet);
			click(selectInstSkill);
			click(btnSave);
			click(btnBackToList);
			wait(5);
			if (getText(userEmailInList) != null) {
				print("PASSED: The Instructors details is present in Instructors list.");
				boolResult = true;
				return true;
			}
			print("FAILED: The Instructors details is NOT present in Instructors list.");
			return false; 
		}
	}
	public boolean verifyDeleteInstructors() {
		if (boolResult == true) {
			click(userEmailInList);
			wait(3);
			click(btnDelete);
			click(alertMsgOkBtn);
			wait(5);
			if (getText(userEmailInList) != null) {
				print("PASSED: After Deleted, The Instructors details was presented in Instructors list.");
				return true;
			} else {
				print("FAILED: After Deleted, The Instructors details is wasn't presented in Instructors list.");
				return false;
			}
		} else {
			print("FAILED: The Instructors is NOT added in Instructors list. So NOT able to delete the Instructors.");
			return false;
		}
	}
}
