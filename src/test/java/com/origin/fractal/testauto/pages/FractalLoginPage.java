package com.origin.fractal.testauto.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;

public class FractalLoginPage extends FractalBasePage {
	private By tbUserNameNewUI = By.xpath("//input[@name='username']");
	private By tbPasswordNewUI = By.xpath("//input[@name='password']");
	private By btnLoginNewUI = By.xpath("//input[@value='Login']");
	private By logoWVF=By.xpath("//*[contains(@class, 'logo')]");
	private By signInWith=By.xpath("//div[text()='Sign in with']");


	public FractalLoginPage(WebDriver driver) throws IOException {
		super(driver);
		pageName ="FractalWVFInstance"; 
		String baseUrl=getLabel("winVinayaInstanceUrl");
		goTo(baseUrl);
	}
	
	public boolean loginToWVFInstance() throws IOException {
		if(elementExist(logoWVF) && elementExist(signInWith)) {
			print("The Logo and Text are present");
			return true;
		}
		else
		{
			print("The Text and logo are NOT present");			
		}
		return false;
	}
	
	public void verifyUserNameAndPassword() {
		enterData(getLabel("winVinayaUser_Username"),tbUserNameNewUI);
		enterData(getLabel("winVinayaUser_Password"),tbPasswordNewUI);
		click(btnLoginNewUI);
		wait(5);
	}
}
