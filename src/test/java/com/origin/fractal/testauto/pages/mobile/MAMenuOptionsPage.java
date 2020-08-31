package com.origin.fractal.testauto.pages.mobile;

import org.openqa.selenium.By;

import com.origin.fractal.testauto.FractalAppPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class MAMenuOptionsPage extends FractalAppPage {
	private By txtCatalog = By.id("com.originkonnect.app:id/catalog_text");
	private By btnLogout = By.id("com.originkonnect.app:id/logout");
	private By btnLogoutYes = By.id("com.originkonnect.app:id/btnAdd1");
	private By btnMenu = By.id("com.originkonnect.app:id/action_bar_back");
	private By btnMenu1=By.id("com.originkonnect.app:id/new_menu");
	private By btnChange = By.id("com.originkonnect.app:id/change_client");
	private By btnCatalog = By.id("com.originkonnect.app:id/catalog_text");
	private By btnMyLearning = By.id("com.originkonnect.app:id/mylearning_text");
	private By btnMyAcc = By.id("com.originkonnect.app:id/myaccount");
	private By btnClose = By.id("com.originkonnect.app:id/close_btn");
	private By lblSelectSubs = By.id("com.originkonnect.app:id/textView3");//Select Subscription
	private By insFractalDemo = By.xpath("//android.widget.ImageView[@content-desc='Fractal Demo']");
	private By lblTitle = By.id("com.originkonnect.app:id/action");//MY LEARNING//CATALOG//MY ACCOUNT
	private By btnNo = By.id("com.originkonnect.app:id/btnAdd");
	
	private By lblTitleMyAccount = By.xpath("com.originkonnect.app:id/action");;//Added By manju Priya A on Jan_02_18 for IOS
	private By btnMenuMyAcc = By.xpath("com.originkonnect.app:id/action_bar_back");//Added By manju Priya A on Jan_02_18 for IOS
	
	public MAMenuOptionsPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
		this.setLocators();
	}
	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			
//			txtCatalog = By.xpath("//XCUIElementTypeStaticText[@name='CATALOG']/preceding-sibling::XCUIElementTypeButton)");
			/*txtCatalog = By.xpath("//XCUIElementTypeStaticText[@name='MY CONTENT']/preceding-sibling::XCUIElementTypeButton)");
			btnLogout = By.xpath("//XCUIElementTypeStaticText[@name='LOGOUT']/../XCUIElementTypeButton[2]");
			btnLogoutYes = By.xpath("//XCUIElementTypeButton[@name='YES']");*/
			
			txtCatalog = By.xpath("//XCUIElementTypeStaticText[@name='CATALOG']/preceding-sibling::XCUIElementTypeButton)");
			txtCatalog = By.xpath("//XCUIElementTypeStaticText[@name='MY CONTENT']/preceding-sibling::XCUIElementTypeButton)");
			//btnLogout = By.xpath("//XCUIElementTypeStaticText[contains(@name,'LOGOUT')]");
			btnLogoutYes = By.xpath("//XCUIElementTypeButton[@name='YES']");
			/*Starts - added by Manju Priya A on Dec-21-18*///XCUIElementTypeImage[contains(@name,'menuButton')]
			btnMenu = By.xpath("//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[1]");
			//btnMyAcc = By.xpath("//XCUIElementTypeStaticText[contains(@name,'LOGOUT')]");//checking
			btnMyAcc = By.xpath("//XCUIElementTypeStaticText[contains(@value,'MY ACCOUNT')]/../XCUIElementTypeButton[1]");//Update on Dec_31_18-working fine
			//btnMyAcc = By.xpath("//XCUIElementTypeImage[@name='AccountIcon']/../XCUIElementTypeStaticText[1]");//not working//XCUIElementTypeStaticText[contains(@name,'MY ACCOUNT')]
			/*Starts - added by Manju Priya A on Dec-26-18*/
			btnChange = By.xpath("//XCUIElementTypeStaticText[contains(@value,'CHANGE')]");
			insFractalDemo = By.xpath("//XCUIElementTypeStaticText[@name='Select Subscription']/../*//XCUIElementTypeCollectionView");//same xpath for fractal and fractalDemo.
			btnCatalog = By.xpath("//XCUIElementTypeImage[contains(@name,'CatalogIcon')]/../XCUIElementTypeButton[1]");
			btnLogout = By.xpath("//XCUIElementTypeStaticText[contains(@name,'LOGOUT')]");
			btnMyLearning = By.xpath("//XCUIElementTypeImage[contains(@name,'MylearningIcon')]/../XCUIElementTypeButton[1]");
			btnNo = By.xpath("//XCUIElementTypeButton[contains(@name,'NO')]");
			lblSelectSubs = By.xpath("//XCUIElementTypeStaticText[@name='Select Subscription']");
			lblTitle = By.xpath("//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[1]/../XCUIElementTypeStaticText[1]");//MY LEARNING//CATALOG//MY ACCOUNT
			lblTitleMyAccount = By.xpath("//XCUIElementTypeButton[@name='menuButton']/../XCUIElementTypeStaticText[1]");
			btnMenuMyAcc =	By.xpath("//XCUIElementTypeButton[@name='menuButton']");
			btnClose = By.xpath("//XCUIElementTypeButton[contains(@name,'close')]");
			/*Ends - added by Manju Priya A on Dec-26-18*/
		}
	}

	public void validateCategoryPresence() {
		wait(3);
		verifyText("CATALOG", getObj(txtCatalog));

	}


	public void clickOnCategory() {
		click(getObj(txtCatalog));

	}
	
	public void clickOnLogout() {
		wait(10);
		click(getObj(btnLogout));
		wait(10);
		click(getObj(btnLogoutYes));

	}
	
	public void clickOnMyAccount() {
		click(getObj(btnMyAcc));

	}
	public void closeMenu() {
		wait(3);
		click(btnClose);
	}
	public void verifyMenusFunctionality() {
		wait(3);
		//verifyChangeInsMenu();
		verifyMyLearningMenu();
		wait(3);
		verifycatalogMenu();
		wait(3);
		verifyMyAccMenu();
	}
	public void verifyCloseMenuFunctionality() {
		//Updated by Manju Priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			click(btnMenuMyAcc);
			click(btnCatalog);
		}else {
			click(btnMenu);
		}
		click(btnMenu);
		closeMenu();
		verifyMenuPage("MY ACCOUNT",lblTitle);
	}
	public void verifyChangeInsMenu() {
		click(btnMenu);
		click(btnChange);
		verifyMenuPage("Select Subscription",lblSelectSubs);
		click(insFractalDemo);
	}
	public void verifyMyLearningMenu() {
		wait(10);
		click(btnMenu1);
		wait(2);
		click(btnMyLearning);
		verifyMenuPage("MY LEARNING",lblTitle);
	}
	public void verifycatalogMenu() {
		wait(10);
		click(btnMenu);
		click(btnCatalog);
		wait(5);
		verifyMenuPage("CATALOG",lblTitle);
	}
	public void verifyLogoutMenu() {
		click(btnMenu);
		click(btnLogout);
		verifyText("NO",btnNo);
		click(btnNo);
	}
	public void verifyMyAccMenu() {
		wait(10);
		click(btnMenu);
		click(btnMyAcc);
		//Updated on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			verifyMenuPage("MY ACCOUNT",lblTitleMyAccount);
		}else {
			verifyMenuPage("MY ACCOUNT",lblTitle);
		}
	}
	public void verifyMenuPage(String actual, By objLoc) {
		if(elementExist(objLoc) && verifyText(actual,objLoc)) {
			print("PASSED : The expected page is " + actual
					+ " , the actual page is " + getText(objLoc));
		}else {
			print("FAILED : The expected page is " + actual
					+ " , the actual page is " + getText(objLoc));
		}
	}
	//Added By Manju on Jan_11_19
	public void clickOnMyLearning() {
		click(getObj(btnMyLearning));

	}
}
