package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
/* Created By: Vignesh
 * Created on: 30-Sep-20
 * Updated on: 18-Nov-20
 * FileName: AdminSettingPage.java
 * Purpose: Test on Admin setting side (Automation dashboard tasks)
 */
public class AdminSettingPage extends FractalBasePage  {
	//	private By btnMenu = By.xpath("(//ng-include[@id='header1']/*//div[contains(@title,'Menu')])[1]");
	private By btnSettings=By.xpath("//div[@class='icon dripicons-gear']");
	private By classroomSettings = By.xpath ("//li[@class='settings']//a[@href='#classroom/settings']");
	private By lblVenueTab = By.xpath ("(//*[text()='Venue'])[1]");
	private By btnAddVenue = By.xpath ("(//*[text()='Add Venue'])[1]");
	private By lblInstructors = By.xpath ("(//*[text()='Instructors'])[1]");
	private By btnInstructor = By.xpath ("(//*[text()='Add Instructor'])[1]");
	private By lblVILT = By.xpath ("(//*[text()='VILT CONFIGURATION'])[1]");
	private By btnVILT = By.xpath ("(//*[text()='Add Configuration'])[1]");
	private By categorySettings = By.xpath("//li[@class='settings']//a[@href='#categories']");
	private By addCategoryBtn = By.xpath("//*[contains(text(),'Add Category')]");
	private By categoryName = By.xpath("//input[@ng-model='category.name']");
	private By categoryDescription = By.xpath("//*[@ng-model='category.description']");
	private By categoryCreateBtn = By.xpath("//*[text()='Create'][@type='submit']");
	private String cateName = "createCategories";
	private String cateDescri = "CreateDescription";
	private By createdCategory=By.xpath("//*[contains(text(),'"+cateName+"')]");// updated on 20-Nov-20
	private By deleteCategory=By.xpath("(//*[@title='Delete'])[1]");
	private By deleteOKBtn=By.xpath("//button//*[text()='OK']");
	private By manageRole = By.xpath("//li[@class='settings']//a[@href='#manageRoles']");
	private By addManageRoleBtn = By.xpath("//*[text()='Add Role']");
	private By manageRoleTitle = By.xpath("//*[@ng-model='roleName']");
	private By parentRoleSelect = By.xpath("(//*[text()='Select Role'])[2]");
	private By parentRoleLearnAdmin = By.xpath("//li[text()='Learning Administrator']");
	private By accessArea = By.xpath("(//label[contains(text(),'Manage Content')])");
	private By submitBtn = By.xpath("(//*[contains(text(),'Submit')])");
	private By backToRoleBtn = By.xpath("(//*[contains(text(),'Back to Roles List')])");
	private By roleDeteleBtn = By.xpath("(//*[@ng-repeat='userslist in dirusers | filter:search']//i[@ng-click='userConfirmDelete(userslist)'])[8]");//Updated on 27-Nov-20
	private String roleName="createManageRole";
	private By roleNameXpath = By.xpath("//*[contains(text(),'"+roleName+"')]");
	private By currencyMenu = By.xpath("//li[@class='settings']//a[@href='#content/currency']");
	private By editCurrency = By.xpath("//*[@title='Edit']");
	private By changeCurrency = By.xpath("//*[@ng-click='$mdAutocompleteCtrl.clear($event)']");
	private By USCurrency = By.xpath("//*[text()='US Dollar']");
	private By EuroCurrency = By.xpath("//*[text()='Euro']");
	private By IndianCurrency = By.xpath("//*[text()='INR']");
	private By closeXCurrency = By.xpath("//*[@class='close']");
	private By languageSettings=By.xpath("//li[@class='settings']//a[@href='#content/language']");
	private By languageSelect=By.xpath("//*[text()='Select Language']");
	private By languageName=By.xpath("//*[@name='langname']");
	private String lang="Tamil";
	private By selectLanguage=By.xpath("//*[@role='button']//*[contains(text(),'Tamil')]");
	private By notificationSettings=By.xpath("//li[@class='settings']//a[@href='#notification/settings']");
	private By popupNotificationSettings=By.xpath("(//*[@class='md-thumb md-ink-ripple'])[1]");
	private By mailNotificationSettings=By.xpath("(//*[@class='md-thumb md-ink-ripple'])[2]");
	private By whiteLabel=By.xpath("//li[@class='settings']//a[@href='#whitelabel']");
	private By brandingTab=By.xpath("(//*[text()='Branding'])[2]");
	private By Logo=By.xpath("(//*[contains(text(),'Logo Image')])[1]");
	private By socialLogin=By.xpath("(//*[contains(text(),'Enable/Disable Social Login')])[1]");
	private By SaveBtn=By.xpath("//*[text()='Save'][@type='submit']");
	private By updatedText=By.xpath("//*[contains(text(),'successfully')]");
	public AdminSettingPage(WebDriver driver) {
		super(driver);
	}

	/* Function: verifyCreateandDeleteCategory()
	 * Purpose: Create and delete the Category
	 */
	public void verifyCreateandDeleteCategory() throws InterruptedException {
		wait(20);
		moveElementFocus(btnSettings);
		wait(3);
		moveElementFocusandClick(categorySettings);
		wait(3);
		click(addCategoryBtn);
		wait(3);
		enterData(cateName,categoryName);
		wait(2);
		enterData(cateDescri,categoryDescription);
		wait(5);
		click(categoryCreateBtn);
		wait(10);
		if(elementExist(createdCategory)==true) {
			moveElementFocusandClick(deleteCategory);
			wait(2);
			click(deleteOKBtn);
			wait(5);
		}

	}

	/* Function: checkClassroomSettings()
	 * Purpose: check the Admin classroom settings
	 */
	public void checkClassroomSettings() {
		wait(2);
		moveElementFocus(btnSettings);
		wait(3);
		moveElementFocusandClick(classroomSettings);
		elementExist(lblVenueTab);
		click(lblVenueTab);
		wait(2);
		elementExist(btnAddVenue);
		elementExist(lblInstructors);
		click(lblInstructors);
		wait(2);
		elementExist(btnInstructor);
		click(lblVILT);
		wait(2);
		elementExist(btnVILT);
		wait(2);
	}

	/* Function: verifyAddandDeleteManageRole()
	 * Purpose: Add and delete the Manage Roles
	 */
	public void verifyAddandDeleteManageRole() {
		wait(5);
		moveElementFocus(btnSettings);
		wait(3);
		moveElementFocusandClick(manageRole);
		click(addManageRoleBtn);
		wait(3);
		enterData(roleName,manageRoleTitle);
		wait(2);
		click(parentRoleSelect);
		wait(2);
		click(parentRoleLearnAdmin);
		wait(2);
		click(accessArea);
		wait(2);
		click(submitBtn);
		wait(3);
		click(closeXCurrency);
		wait(5);
		if (elementExist(roleNameXpath)==true) {
			moveElementFocusandClick(roleDeteleBtn);
			wait(2);
			click(deleteOKBtn);
			wait(5);
		}
	}

	/* Function: verifyCurrency()
	 * Purpose: Verify the currency settings
	 */
	public void verifyCurrency() {
		wait(3);
		moveElementFocus(btnSettings);
		wait(2);
		moveElementFocusandClick(currencyMenu);
		wait(3);
		click(editCurrency);
		wait(3);
		click(changeCurrency);
		wait(2);
		elementExist(USCurrency);
		elementExist(EuroCurrency);
		elementExist(IndianCurrency);
		wait(2);
		click(closeXCurrency);
		wait(3);
	}

	/* Function: verifyAddandDeleteLanguage()
	 * Purpose: Create and delete the language
	 */
	public void verifyAddandDeleteLanguage() {
		wait(3);
		moveElementFocus(btnSettings);
		wait(2);
		moveElementFocusandClick(languageSettings);
		wait(3);
		click(languageSelect);
		wait(3);
		enterData(lang,languageName);
		wait(2);
		click(selectLanguage);
		wait(2);
		click(categoryCreateBtn);
		wait(5);
		if(elementExist(selectLanguage)==true) {
			click(deleteCategory);
			wait(2);
			click(deleteOKBtn);
			wait(5);
		}
	}

	/* Function: verifyNotificationSettings()
	 * Purpose: verify the notification settings
	 */
	public void verifyNotificationSettings() {
		wait(2);
		moveElementFocus(btnSettings);
		wait(3);
		moveElementFocusandClick(notificationSettings);
		wait(2);
		elementExist(popupNotificationSettings);
		moveElementFocusandClick(popupNotificationSettings);
		wait(2);
		elementExist(mailNotificationSettings);
		moveElementFocusandClick(mailNotificationSettings);
	}

	/* Function: verifyWhiteLabel()
	 * Purpose: verify the White label settings
	 */
	public void verifyWhiteLabel() {
		wait(3);
		moveElementFocus(btnSettings);
		wait(2);
		moveElementFocusandClick(whiteLabel);
		elementExist(brandingTab);
		click(brandingTab);
		elementExist(Logo);
		elementExist(socialLogin);
		click(popupNotificationSettings);
		wait(5);
		click(SaveBtn);
		//		wait(3);
		//		elementExist(updatedText);
	}
}
