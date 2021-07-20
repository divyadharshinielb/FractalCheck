package com.origin.fractal.testauto.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.origin.fractal.testauto.FractalBasePage;

public class FractalLoginPage extends FractalBasePage {
	private By tbUserNameNewUI = By.xpath("//input[@name='username']");
	private By tbPasswordNewUI = By.xpath("//input[@name='password']");
	private By btnLoginNewUI = By.xpath("//input[@value='LOGIN']");
	private By logoDiv = By.xpath("//*[contains(@class, 'logo')]");
	// private By signInWith=By.xpath("//*[text()='Sign in with']");
	// private By loginDiv = By.xpath("//html/body/div/div/main/div/div/div/div[2]/div/div[2]");
	private By btnCookies = By.xpath("//button[@id='CookieAccept']");
	private By lblUser = By.xpath("//div[@class='user-profile-letter']");//img[@class='logout-height']
	private By btnLoginNewUI1 = By.xpath("//button[@class='fm-btn']");
	private By lblUser1= By.xpath("//img[@id='userAvatar']");
	private By lblSubscriptionPage= By.xpath("//p[@class='choose-right-plan']");

	public FractalLoginPage(WebDriver driver, String fractalInst, String fractInstUrl) throws IOException {
		super(driver);
		pageName = fractalInst; 
		String baseUrl = getLabel(fractInstUrl);  
		goTo(baseUrl);
	}

	public boolean loginToFractalInstance() throws IOException {
		/*wait(5);
		if(elementExist(logoDiv)) {
			return true;
		}*/
		return false;
	}

	public void verifyUserNameAndPassword() {
		//wait(5);
		if (elementExist(btnCookies)) {
			click(btnCookies); 
			wait(2);
		}
		WebDriverWait wait=new WebDriverWait(driver, 300);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(tbUserNameNewUI));
		enterData(getLabel("Username"), tbUserNameNewUI);
		enterData(getLabel("Password"), tbPasswordNewUI);
		click(btnLoginNewUI);
		wait(5);
		if (elementExist(lblUser)) { 
			wait(2);
		    click(lblUser);
		}
		else{
			wait(2);
			elementExist(lblSubscriptionPage);
		}
		
	}
	public void verifyUserNameAndPassword1() {
		//wait(5);
		if (elementExist(btnCookies)) {
			click(btnCookies); 
			wait(2);
		}
		WebDriverWait wait=new WebDriverWait(driver, 300);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(tbUserNameNewUI));
		enterData(getLabel("Username"), tbUserNameNewUI);
		enterData(getLabel("Password"), tbPasswordNewUI);
		click(btnLoginNewUI1);
		wait(5);
		click(lblUser1);
		
	}
}
