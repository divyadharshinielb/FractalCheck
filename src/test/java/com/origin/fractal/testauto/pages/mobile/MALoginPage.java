package com.origin.fractal.testauto.pages.mobile;

import org.openqa.selenium.By;

import com.origin.fractal.testauto.FractalAppPage;
import com.origin.fractal.testauto.steps.mobile.MAWhatsNewSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MALoginPage extends FractalAppPage {
	private By tbUserName = By.id("com.originkonnect.app:id/username");
	private By tbPassword = By.id("com.originkonnect.app:id/password");
	private By lblForgotPassword = By.id("com.originkonnect.app:id/textView5");
	private By btnLogin = By.id("com.originkonnect.app:id/login_btn");
	//added by Mahesh from here
	private By btnLogout= By.id("com.originkonnect.app:id/logout");
	private By lblYes= By.id("com.originkonnect.app:id/btnAdd1");
	private By lblNo= By.id("com.originkonnect.app:id/btnAdd");
    private By menuBtn= By.id("com.originkonnect.app:id/action_bar_back");
    private By backBtn= By.id("com.originkonnect.app:id/close_btn");
    private By lblEmailId= By.id("com.originkonnect.app:id/enter_email");
    private By lblSend= By.id("com.originkonnect.app:id/send_button");
    private By lblEmailError= By.id("com.originkonnect.app:id/userInput");
    private By tbEmailId= By.id("com.originkonnect.app:id/enter_email");
    private By okBtn= By.id("com.originkonnect.app:id/btnAdd1");
    private By blankPassword= By.id("com.originkonnect.app:id/userInput");
    private By blankUserName= By.id("com.originkonnect.app:id/userInput");
    private By inValid= By.id("com.originkonnect.app:id/userInput");
    private By blankUserNamePassword= By.id("com.originkonnect.app:id/userInput");
    String[]  userName= {"", "saraswathi@originlearning.com","saraswathir@originlearning.com","saraswathi@originlearning.com"};
    String[]  passWord={ "","Passw0rd","P@ssw0rd","P@ssw0rd"}; 
    private By lblTitle = By.id("com.originkonnect.app:id/action");
    private By noInternetlbl= By.id("com.originkonnect.app:id/nointernet");
    //Added by mahesh till here
    private By pageTitle = By.id("com.originkonnect.app:id/action");//Added by Manju Priya A on Dec-27-18
    private By animSplashScreen = By.id("com.originkonnect.app:id/animation_view");//Added by Manju Priya A on Dec-31-18-copy id from my code
    private By clickAllow = By.xpath("");//Added by Manju Priya A on Jan_11_19 for ios
	public MALoginPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
		this.setLocators();	
	}

	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			/*---OLD tbUserName = By.xpath("//XCUIElementTypeImage[@name=\"iconUsername\"]/preceding-sibling::XCUIElementTypeTextField");
			tbPassword = By.xpath("//XCUIElementTypeImage[@name=\"iconPassword\"]/following-sibling::XCUIElementTypeSecureTextField");
			btnLogin = By.name("LOGIN");*/
			tbUserName = By.xpath("//XCUIElementTypeImage[contains(@name,'iconUsername')]/../XCUIElementTypeTextField");
			tbPassword = By.xpath("//XCUIElementTypeImage[contains(@name,'iconPassword')]/../XCUIElementTypeSecureTextField");
			//btnLogin = By.name("LOGIN");
			blankPassword= By.xpath("//XCUIElementTypeImage[contains(@name,'warningOutline')]/../../*//XCUIElementTypeStaticText");
			blankUserName = By.xpath("//XCUIElementTypeImage[contains(@name,'warningOutline')]/../../*//XCUIElementTypeStaticText");
			inValid = By.xpath("//XCUIElementTypeImage[contains(@name,'warningOutline')]/../../*//XCUIElementTypeStaticText");
			blankUserNamePassword = By.xpath("//XCUIElementTypeImage[contains(@name,'warningOutline')]/../../*//XCUIElementTypeStaticText");
			okBtn = By.xpath("//XCUIElementTypeButton[contains(@name,'OK')]");
			pageTitle = By.xpath("//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[1]/../XCUIElementTypeStaticText[1]");
			animSplashScreen = By.xpath("//XCUIElementTypeApplication[contains(@name,'Origin Fractal')]");
			/*End of - added by Manju Priya A on Dec-27-18*/
			clickAllow = By.xpath("//XCUIElementTypeButton[@name='Allow']");
			//Added by Manju Priya A on Jan-04-19
			menuBtn = By.xpath("//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[1]");
			lblYes = By.xpath("//XCUIElementTypeButton[@name='YES']");//Name can be btnYes, since it is a button
			lblNo = By.xpath("//XCUIElementTypeButton[@name='NO']");
			btnLogin = By.xpath("//XCUIElementTypeButton[contains(@name,'LOGIN')]");
			//edit by divya
			btnLogout = By.xpath("/XCUIElementTypeApplication[@name=\"Origin Fractal\"]/XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton"); //XCUIElementTypeStaticText[@name="LOGOUT"]
			//Added by Manju Priya A on Jan-05-19
			noInternetlbl = By.xpath("//XCUIElementTypeButton[contains(@name,'OK')]/../XCUIElementTypeStaticText[1]");
		}
	}
	
	public void doLogin() {
		wait(5);
		typeIntoElement("automation_directuser@originlearning.com",getObj(tbUserName));
		wait(5);
		typeIntoElement("AutoDU@123",getObj(tbPassword));
		wait(5);
		click(getObj(btnLogin));
		//Added bY Manju Priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			if(elementExist(clickAllow)) {
				wait(5);
				click(clickAllow);
			}
		}
		wait(5);
	}
	
	public void clickForgetPassword() {
		wait(10);
		MobileElement me = getObj(lblForgotPassword);
		print(getTextOfElement(me));
//		TouchAction ta = new TouchAction((AppiumDriver<MobileElement>) appDriver);
//		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(me))).perform();
		me.click();
//		me.click();
		wait(10);
	}
	//***mahesh start****//
		public void clickYesBtn() {
			click(getObj(menuBtn));
			wait(5);
			click(getObj(btnLogout));
			wait(5);
			click(getObj(lblYes));
			wait(5);
			
		}
		
		
		//******Login scenario*************//
		public void blankPasswordVerification() {
			typeIntoElement (userName[1],getObj(tbUserName));
			typeIntoElement (passWord[0],getObj(tbPassword));
			click(btnLogin);
			elementExist(blankPassword);
			verifyText("Username/Password cannot be blank.",getObj(blankPassword));
			click(getObj(okBtn));
			wait(5);
		}
		public void blankUserName() {
			typeIntoElement (userName[0],getObj(tbUserName));
			typeIntoElement (passWord[1],getObj(tbPassword));
			click(getObj(btnLogin));
			elementExist(blankUserName);
			verifyText("Username/Password cannot be blank.",getObj(blankUserName));
			click(getObj(okBtn));
			wait(5);
		}

		public void inValid() {
			clear(tbUserName);
			typeIntoElement (userName[2],getObj(tbUserName));
			clear(tbPassword);
			typeIntoElement (passWord[2],getObj(tbPassword));
			click(getObj(btnLogin));
			elementExist(inValid);
			verifyText("Username or password is incorrect.",getObj(inValid));
			click(getObj(okBtn));
			wait(5);
			}
		public void blankUserNamePassword() {
			clear(tbUserName);
			typeIntoElement (userName[0],getObj(tbUserName));
			clear(tbPassword);
			typeIntoElement (passWord[0],getObj(tbPassword));
			click(getObj(btnLogin));
			elementExist(blankUserNamePassword);
			verifyText("Username/Password cannot be blank.",getObj(blankUserNamePassword));
			click(getObj(okBtn));
			wait(5);
		}
//*****end*********//

		public void clickOnLogout() {
			click(lblTitle);
			click(btnLogout);
			click(lblYes);
			
		}

		public void noInternetErrorVerify() {
			verifyText("No Internet Connection!",getObj(noInternetlbl));
			
		}
		//Updtaed by Manju Priya A on Jan_11_19
		public void verifyValidLogin() {
			//edit by divya
			wait(3);
			clear(tbUserName);
			wait(3);
			clear(tbPassword);
			wait(3);
			doLogin();
			MASelectInstancePage selIns = new MASelectInstancePage(appDriver);
			selIns.selectFractal();
			//What's New Screen MAWhatsNewSteps
			MAWhatsNewSteps mAWNS = new MAWhatsNewSteps(appDriver);
			wait(5);
			mAWNS.clickLater();
			if(verifyText("CATALOG", pageTitle)) {
				print("PASSED: Logged in successfully for valid username and Password");
			}else {
				print("FAILED: Not Logged in successfully for valid username and Password");
			}
		}
		public void verifySplashScreen() {
			elementExist(animSplashScreen);
		}	
		public void verifyLogoutWithNoBtn() {
			click(getObj(menuBtn));
			wait(5);
			click(getObj(btnLogout));
			wait(5);
			click(getObj(lblNo));
			wait(5);
			verifyText("LOGOUT",btnLogout);
		}
		public void verifyLogoutWithYesBtn() {
			click(getObj(menuBtn));
			wait(10);
			click(getObj(btnLogout));
			wait(5);
			click(getObj(lblYes));
			wait(5);
			//edit b divya
			verifyText("LOGIN",btnLogin);
		}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
