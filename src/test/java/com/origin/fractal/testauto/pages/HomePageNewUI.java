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
	private By termsLink = By.xpath("//a[contains(text(),'| Terms')]");
	private By contactsLink = By.xpath("//a[contains(text(),'| Contact')]");
	private By privacyPage = By.xpath("//span[contains(text(),'PRIVACY POLICY')]");
	private By termsPage = By.xpath(".//span[contains(text(),'TERMS & CONDITIONS')]");
	private By contactsPage = By.xpath("//span[contains(text(),'CONTACT US')]");
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
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'| Contact')]")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			wait(5);
			}
			public void verifyFooterLinks() {
			commonFunction();
			verifyText("| Terms",termsLink);
			verifyText("| Contact",contactsLink);
			click(privacyLink);
			verifyText("PRIVACY POLICY",privacyPage);
			click(lblHome);
			wait(5);
			commonFunction();
			click(termsLink);
			wait(5);
			verifyText("Terms & Conditions",termsPage);
			click(lblHome);
			wait(5);
			commonFunction();
			wait(5);
			click(contactsLink);
			wait(5);
			verifyText("CONTACT US",contactsPage);
			}
	}
	


