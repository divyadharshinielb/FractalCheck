package com.origin.fractal.testauto.pages.mobile;

import org.openqa.selenium.By;

import com.origin.fractal.testauto.FractalAppPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class MAWhatsNewPage extends FractalAppPage {
	private By txtWhatsNew = By.id("com.originkonnect.app:id/textView1");
	private By btnLater = By.id("com.originkonnect.app:id/close_btn");
	private By pageTitle = By.id("com.originkonnect.app:id/action");//Added by Manju Priya A on Jan_11_19
	public MAWhatsNewPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);

		this.setLocators();
	}

	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			/*txtWhatsNew = By.xpath("//XCUIElementTypeStaticText[@name='WHAT\'S NEW?']");
			btnLater = By.name("LATER");*/
			txtWhatsNew = By.xpath("//XCUIElementTypeStaticText[@name='WHAT\'S NEW?']");
			btnLater = By.name("LATER");
			pageTitle = By.xpath("//XCUIElementTypeImage[contains(@name,'menuButton')]/../XCUIElementTypeStaticText");
		}
	}
	public void validateWhatsNewPage() {
		if(elementExist(txtWhatsNew))
		{
		wait(3);
		verifyText("WHAT'S NEW?", getObj(txtWhatsNew));
		click(getObj(btnLater));
		System.out.println("clicked");
		}

	}


	public void clickLater() {
		if(elementExist(btnLater)){
			click(getObj(btnLater));
		}
	}
	/*Starts - added by Manju Priya A on Jan_11_19*/
	public void verifyWhatsNewLaterBtn() {
		if(elementExist(btnLater)) {
			click(getObj(btnLater));
			verifyText("CATALOG", getObj(pageTitle));//Changed from lblMyLearning to pageTitle By Manju Priya A On Dec_31_18
		}
	}
	/*Ends - added by Manju Priya A on Jan_11_19*/
	
	


}
