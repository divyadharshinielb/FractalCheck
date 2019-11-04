package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class HomePageNewUI extends FractalBasePage {
	private By btnContinue = By.xpath("//span[@class='continue_button']");
	private By privacyLink = By.xpath("//a[contains(text(),'Privacy')]");
	private By termsLink = By.xpath(".//div[contains(@class,'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/../div/p/a[2]");//edited by dhanushiya
	private By contactsLink = By.xpath(".//div[contains(@class,'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/../div/p/a[3]");//edited by dhanushiya
	private By privacyPage = By.xpath("//span[contains(text(),'PRIVACY POLICY')]");
	private By termsPage = By.xpath(".//span[contains(text(),'Terms & Conditions')]");//edited by dhanushiya
	private By contactsPage = By.xpath(".//span[contains(text(),'contact us')]");//edited by dhanushiya
	private By lblHome = By.xpath("//span[contains(text(),'Home')]");
	MyLearningPage myLearning = new MyLearningPage(driver);
    public HomePageNewUI(WebDriver driver) {
		super(driver);
		pageName ="HomePage";
}
	public void verifyResumeLearningLabeltext() {
		click(btnContinue);
	//	myLearning.verifyMyLearningLabels();
	}
	
		public void commonFunction() {
			WebElement element = driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			wait(5);
			}
			public void verifyFooterLinks() {
			commonFunction();
			verifyText("| Terms",termsLink);
			verifyText("| Contact",contactsLink);
			wait(5);
			click(privacyLink);
			verifyText("PRIVACY POLICY",privacyPage);
			click(lblHome);
			wait(5);
			commonFunction();
			click(termsLink);
			verifyText("TERMS & CONDITIONS",termsPage);
			click(lblHome);
			wait(5);
			commonFunction();
			wait(5);
			click(contactsLink);
			wait(5);
			verifyText("CONTACT US",contactsPage);
			}
	}
	


