package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
import com.wv.auto.framework.BrowserFactory;

public class HomePageNewUI extends FractalBasePage {
	private By btnContinue = By.xpath("//div[@class='resume_learn']//div[@class='row']");//span[@class='continue_button']
	private By privacyLink = By.xpath("//a[contains(text(),'Privacy')]");
	//edit by divya private By termsLink = By.xpath("//a[contains(text(),'| Terms')]");
	private By termsLink = By.xpath(".//div[contains(@class, 'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/p/a[2]");
	//edit by divya private By contactsLink = By.xpath("//a[contains(text(),'| Contact')]");
	private By contactsLink = By.xpath(".//div[contains(@class, 'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/p/a[3]");
	private By privacyPage = By.xpath("//span[contains(text(),'PRIVACY POLICY')]");
	
	//edit by divya
	private By termsPage = By.xpath(".//span[contains(text(),'Terms & Conditions')]");
	// edit by divya
	private By contactsPage = By.xpath("//span[contains(text(),'contact us')]");
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
			//edit by divya WebElement element = driver.findElement(By.xpath("//a[contains(text(),'| Contact')]")); 
		//	WebElement element = driver.findElement(By.xpath(".//div[contains(@class, 'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/p/a[3]"));
		//	if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element= driver.findElement(By.xpath(".//div[contains(@class, 'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/p/a[3]"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
		//	}
			wait(5);
			}
			public void verifyFooterLinks() {
				wait(5);
			commonFunction();
			verifyText(" | Terms",termsLink);
			verifyText(" | Contact",contactsLink);
			click(privacyLink);
			wait(5);
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
	


