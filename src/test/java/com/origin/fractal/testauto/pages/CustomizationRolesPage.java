package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
/* File Name: CustomizationRolesPage.java
 * Purpose: Check for creation and mapping of custom roles to user - FR1-2361
 * Number of Testcases: 9
 * Created by: DivyaDharshini
 * Created on: 02-June-2020
 */
public class CustomizationRolesPage extends FractalBasePage{
	private By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	private By settingsIcon =By.xpath("//div[@class='icon dripicons-gear']");
	private By settingsSelection = By.xpath("//li[@title='Manage Roles']//div[1]");
	private By managerolebreadcrumb = By.xpath("(//span[text()='Manage Roles'])[2]");
	private By manageroleheader = By.xpath("//h1[contains(text(),'Manage Roles')]");
	private By addrolebtn = By.xpath("//button[contains(text(),'Add Role')]");
	private By rolenamefield = By.xpath("//label[contains(text(),'Role name')]");
	private By parentrolefield = By.xpath("//label[contains(text(),'Parent Role')]");
	private By selectrolefield = By.xpath("//span[contains(text(),'Select Role')]");
	private By closebtn = By.xpath("//button[contains(text(),'Close')]");
	private By submitbtn = By.xpath("//button[contains(text(),'Submit')]");
	private By closeicon = By.xpath("//i[@class='icon']");
	private By rolenameinput = By.xpath("//label[contains(text(),'Role name')]/../input");
	private By errormsg = By.xpath("//div[@class='text-danger ng-scope']");
	private By guestuseroption = By.xpath("//li[contains(text(),'Guest User')]");
	private By learnadminoption = By.xpath("//li[contains(text(),'Learning Administrator')]");
	private By managecontentlbl = By.xpath("//label[contains(text(),'Manage Content')]");
	private By manageuserlbl = By.xpath("//label[contains(text(),'Manage Users')]");
	private By managereportlbl = By.xpath("//label[contains(text(),'Manage Reports')]");
	private By manageclassroomlbl = By.xpath("//label[contains(text(),'Manage Classroom')]");
	private By enrollcontentlbl = By.xpath("//label[contains(text(),'Enrolled Content')]");
	private By newrolelbl = By.xpath("//label[contains(text(),'New Role Added Successfully.')]");
	private By backrolebtn = By.xpath("//button[contains(text(),'Back to Roles List')]");
	private By learnercustomrole = By.xpath("//span[contains(text(),'Automationrolecheck')]");
	private By guestcustomrole = By.xpath("//span[contains(text(),'AutomationGuestuser')]");
	private By manageuserlist = By.xpath("//li[@title='Manage Users']");
	private By searchUsers = By.xpath("//input[@id='searchAllUsersName']");	
	private By clickroles = By.xpath("//input[@type='search']");
	private By lblProfile = By.xpath(".//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]");  //*[@id='dLabel']/span
	private By directuserlbl = By.xpath("//span[text()[normalize-space()='Automation Directuser']]");
	private By circleicon = By.xpath("//div[@class='gototopCircle']");
	private By roledeleteicon = By.xpath("//span[@class='close ui-select-match-close']/../../../span/span/span/span[contains(text(),'Automationrolecheck')]/../../span[contains(@class,'close ui-select-match-close')]");//span[@class='close ui-select-match-close']/../../../span[5]/span/span[@class='close ui-select-match-close']
	private By editusericon = By.xpath("//span[text()[normalize-space()='Automation Directuser']]/../../../../div/div/i[contains(@title,'Edit')]");//div/i[@class='icon text-right text-gray font-size-18 pointer']
	private By roleaddbtn = By.xpath("//span[contains(text(),'Automationrolecheck')]");
	private By manageroledeleteicon = By.xpath("//span[contains(text(),'Automationrolecheck')]/../../../../div[4]/i[3]");
	private By manageroleokbtn = By.xpath("//span[contains(text(),'OK')]/..");
	private By adminprofile = By.xpath("//span[@class='loggeduserbg ng-binding']");
	private By adminLogout = By.xpath("//a[contains(text(),'Logout')]");
	private By automationrolebtn = By.xpath("//button[contains(text(),'Automationrolecheck')]");
	private By automationuserdiv = By.xpath("//span[text()[normalize-space()='Automation Directuser']]");
	private By manageuserediticon = By.xpath("//span[text()[normalize-space()='Automation Directuser']]/../../../../div/div/i[contains(@title,'Edit')]");
	private By btnHome = By.xpath("//span[contains(text(),'Home')]");
	public CustomizationRolesPage(WebDriver driver) {
		super(driver);
		pageName = "CustomizationRolesPage";
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	/*
	 *function:clickSettingsicon() 
	 *cause: Click setting icon in admin page
	 */
	public void clickSettingsicon() {
		wait(5);
		click(btnMenu);
		wait(10);
		click(btnHome);
		wait(10);
		click(btnMenu);
		wait(10);
		js.executeScript("window.scrollBy(0,1000)");
		click(settingsIcon);
		wait(5);

	}
	/*
	 *function: clickManageroles()
	 * cause: Click manageroles icon and check for manage role header
	 */
	public void clickManageroles() {
	//	click(settingsIcon);
		wait(5);
		click(settingsSelection);
		wait(10);
		verifyText(getLabel("manageroles"),managerolebreadcrumb);
		elementExist(manageroleheader);
		verifyText(getLabel("manageroles"),manageroleheader);
	}
	/*
	 * function - addCustomRoleField()
	 * cause - Check for the fields in Role creation page
	 */
	public void addCustomRoleField() {
		click(addrolebtn);
		wait(2);
		elementExist(rolenamefield);
		wait(2);
		elementExist(parentrolefield);
		elementExist(selectrolefield);
		elementExist(closebtn);
		elementExist(submitbtn);
		elementExist(closeicon);

	}
	/*
	 * function - roleNameValidation()
	 * cause - Validation with special character and numbers in custom role
	 */
	public void roleNameValidation() {
		enterData("!@#$%**", rolenameinput);
		click(selectrolefield);
		wait(2);
		click(learnadminoption);
		click(managecontentlbl);
		click(submitbtn);
		elementExist(errormsg);
		verifyText("The Role name should be in alphabets",errormsg);
		clear(rolenameinput);
		verifyText("The Role name should not be empty.",errormsg);
		enterData("123344456", rolenameinput);
		elementExist(errormsg);
		verifyText("The Role name should be in alphabets",errormsg);
		click(closeicon);
	}
	/*
	 * function - roleCreationwithLearningadmin()
	 * cause - Creation of custom role with Learning admin as parent role
	 */
	public void roleCreationwithLearningadmin() {
		click(addrolebtn);
		enterData(getLabel("rolename"),rolenameinput);
		wait(5);
		click(selectrolefield);
		wait(2);
		elementExist(learnadminoption);
		wait(2);
		elementExist(guestuseroption);
		click(learnadminoption);
		click(managecontentlbl);
		click(manageuserlbl);
		click(managereportlbl);
		click(manageclassroomlbl);
		click(submitbtn);
		elementExist(newrolelbl);
		elementExist(backrolebtn);
		click(backrolebtn);
	}
	/*
	 * function - RoleCreationwithGuestuser()
	 * cause - Creation of a custom role as Guest user
	 */
	public void RoleCreationwithGuestuser() {
		click(addrolebtn);
		wait(2);
		enterData("AutomationGuestuser",rolenameinput);
		click(selectrolefield);
		wait(2);
		click(guestuseroption);
		elementExist(enrollcontentlbl);
		click(enrollcontentlbl);click(submitbtn);
		elementExist(newrolelbl);
		elementExist(backrolebtn);
		click(backrolebtn);
		scrollToElement(circleicon);
		elementExist(learnercustomrole);
		elementExist(guestcustomrole);
	}
	/*
	 * function - roleMappingToDirectUser()
	 * cause - The role is mapped to the direct user in admin side
	 */
	public void roleMappingToDirectUser() {
		wait(5);
		click(btnMenu);
		wait(2);
		click(manageuserlist);
		wait(2);
		click(searchUsers);
		wait(7);
		enterData("automation",searchUsers);
		wait(10);
		//click(directuserlbl);
		wait(2);
		click(editusericon);
		//click(editusericon);
		wait(7);
		click(clickroles);
		wait(2);
		click(roleaddbtn);
		wait(2);
		click(submitbtn);

	}
	/*
	 * function - deleteAssignedRole()
	 * cause - Delete the custom role after assigning to user
	 */
	public void deleteAssignedRole() {
		scrollToElement(learnercustomrole);
		elementExist(learnercustomrole);
		wait(5);
		click(manageroledeleteicon);
		wait(5);
		click(manageroleokbtn);
		wait(10);
		click(manageroleokbtn);
		wait(5);
	}
	/*
	 * function - adminLogout()
	 * cause - Logout from admin
	 */
	public void adminLogout() {
		//wait time is given as user updated message occurs after updating roles
		wait(10);
		click(adminprofile);
		wait(5);
		click(adminLogout);
		wait(10);
	}
	/*
	 * function - deleteUnassignedRole()
	 * cause - Delete the custom role after unassigning the role 
	 */
	public void deleteUnassignedRole() {
		scrollToElement(learnercustomrole);
		elementExist(learnercustomrole);
		wait(2);
		click(manageroledeleteicon);
		wait(5);
		click(manageroleokbtn);
	}
	/*
	 * function - customRolemapForDirectUser()
	 * cause - Map to the created custom role 
	 */
	public void customRolemapForDirectUser() {
		click(lblProfile);
		wait(5);
		elementExist(automationrolebtn);
		click(automationrolebtn);
		wait(10);
		elementExist(btnMenu);
	}
	/*
	 * function - unassignRole()
	 * cause - The custom role created is unassigned for the user
	 */
	public void unassignRole() {

		click(btnMenu);
		click(manageuserlist);
		wait(7);
		click(searchUsers);
		enterData("Automation Directuser",searchUsers);
		wait(10);
	//	click(automationuserdiv);
		wait(2);
		click(manageuserediticon);
		wait(2);
		click(roledeleteicon);
		wait(2);
		click(submitbtn);

	}
}
