package com.wv.auto.framework.app;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wv.auto.framework.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.android.AndroidKeyCode; Investigate
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public abstract class AppBasePage extends BasePage {
	protected AppiumDriver<MobileElement> appDriver;
	protected WebDriverWait wdwait;
	protected int timeOut;
	protected String env;
	protected String platform="android";
	protected String part1 = "//android.widget.ListView/android.widget.RelativeLayout[contains(@index,'";
	protected String part2= "')]";
	@AndroidFindBy(id = "space") // changed name to id
	MobileElement keySpace;

	@iOSFindBy(xpath = "//UIANavigationBar[1]/UIAStaticText[1]")
	@AndroidFindBy(className = "android.widget.TextView")
	private MobileElement lblHeader;

	@iOSFindBy(xpath = "//UIANavigationBar[1]/UIAButton[1]")
	@AndroidFindBy(className = "android.widget.ImageButton")
	private MobileElement btnBack;

	protected AppBasePage(AppiumDriver<MobileElement> appDriver) {

		this.driver = appDriver;
		this.appDriver = appDriver;

	}
	
public void setPlatform(WebDriver driver) {
		
		if(driver instanceof IOSDriver)
		platform = "ios";
	}
	
	public MobileElement getObj(By objLoc) {
		print("In AppBasePage getObj " + objLoc.toString());
		
		MobileElement me = (MobileElement)driver.findElement(objLoc);
		return me;
	}

	public String getScreenHeaderText() {
		waitForVisibilityOfEelement(lblHeader);
		return getTextOfElement(lblHeader).trim();
	}

	protected Boolean isElementPresent(MobileElement element) {

		boolean found;
		try {
			if (platform.equals("android"))
				found = element.isDisplayed();
			else
				found = element.isEnabled();
		} catch (WebDriverException e) {
			found = false;
		}
		return found;

	}

	protected MobileElement waitForVisibilityOfEelement(MobileElement element) {

		return (MobileElement) wdwait.until(ExpectedConditions.visibilityOf(element));

	}

	protected Boolean waitForInvisibilityOfEelement(MobileElement element) {

		return wdwait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));

	}

	protected MobileElement waitForPresenceOfEelement(By by) {

		return (MobileElement) wdwait.until(ExpectedConditions.presenceOfElementLocated(by));

	}
	
	protected MobileElement waitForClickableEelement(MobileElement me) {

		return (MobileElement) wdwait.until(ExpectedConditions.elementToBeClickable(me));

	}


	protected Alert waitForAlert() {

		return wdwait.until(ExpectedConditions.alertIsPresent());

	}

	protected void click(MobileElement element) {
		print("The displayed result is : " +element.isDisplayed());
		element.click();

	}

	protected void tapOnElement(MobileElement element) {

//    	appDriver.tap(1, element, 1);

	}

//    protected void swipeOnElement(SwipeElementDirection direction,MobileElement element){
//    
//    	element.swipe(direction, 500);
//    	wait(2);
//    
//    	
//    }

	// It's slower, types value into text field, as user does
	protected void typeIntoElement( String txtValue, MobileElement element) {
		//Condition added by manju priya A on Jan_18_19
		if(platform.equalsIgnoreCase("ios")) {
			element.sendKeys(txtValue);
			hideKeyboard();//This is for IOS
		}else {
			enterData(txtValue, element);
		}
	}
	// It's slower, types value into password field, as user does
	//Added by Manju Priya A on Jan_18_19
	protected void typeOTPIntoElement( String txtValue, MobileElement element) {

		element.sendKeys(txtValue);
		//hideKeyboard();

	}
	protected String getTextOfElement(MobileElement element) {

		String text = null;
		if (isElementPresent(element))
			text = element.getText().trim();

		return text;

	}

	protected String getAttributeOfElement(MobileElement element, String attributeName) {

		waitForVisibilityOfEelement(element);
		return element.getAttribute(attributeName);

	}

	protected String switchToAlertAndGetText() {
		try {
			wdwait.until(ExpectedConditions.alertIsPresent());
		} catch (TimeoutException t) {
		}

		return appDriver.switchTo().alert().getText();

	}

	protected void switchToAlertAndAccept() {

		wdwait.until(ExpectedConditions.alertIsPresent());

		appDriver.switchTo().alert().accept();

	}

	public boolean isKeyboardDisplayed() {

		try {

			waitForVisibilityOfEelement(keySpace);

		} catch (Exception e) {
		}

		return keySpace.isDisplayed();

	}

	public void hideKeyboard() {

        appDriver.hideKeyboard();
		wait(1);
	}

	public void launchApp() {

		try {
			appDriver.launchApp();
		} catch (org.openqa.selenium.WebDriverException e) {
		}

	}

//    public void clickOnAndroidHomeKey(){
//        ((AndroidDriver) appDriver).pressKeyCode(AndroidKeyCode.HOME);
//    }

	public void clickOnBackButton() {
		tapOnElement(btnBack);
		wait(1);
	}

//    public void clickOnAndroidBackSoftKey() {
//        ((AndroidDriver) appDriver).pressKeyCode(AndroidKeyCode.BACK);
//        wait(1);
//    }

	public void startAndroidMapActivity() {

//        ((AndroidDriver) appDriver).startActivity("com.coulombtech." + env , "com.cp.activity.map.MapActivity", null, null);
	}

	public void closeApp() {

		appDriver.closeApp();

	}

	public void resetApp() {

		appDriver.resetApp();

	}
	//Added by karpagavalli from here
		public int getItemsCount(String objPath1, String objPath2) {
			boolean status = true;
			int count =0;
			int i=0;
			String wholeObjPath = "";
			do {
				wholeObjPath =part1+i+part2;
				if(elementExist(By.xpath(wholeObjPath))) {
					count = count + 1;
					i = i+1;
					status = true;
				}else {
					status = false;
				}
			}while(status);
			return count;
		}
		//Add this in fractal app page
		public void verifyItemsCount(int actualCount, int expCount) {
			if(comapareInteger(actualCount,expCount)) {
				print("PASSED: The actual count is "+actualCount+" and expected count is "+expCount);
			}else {
				print("FAILED: The actual count is "+actualCount+" and expected count is "+expCount);
			}
		}
		//Add this in fractal base page
		public boolean comapareInteger(int actualCount, int expCount) {
			boolean status = true;
			if(actualCount == expCount) {
				status = true;
			}else {
				status = false;
			}
			return status;
		}
		//Added by karpagavalli till here
		//Added by Manju Priya A on Jan_22_19
		public boolean comapreArrayWithSetLength(String[] array, Set<String> set) {
			if(array.length == set.size()) {
				return true;
			}
			else {
				return false;
			}
		}
}
