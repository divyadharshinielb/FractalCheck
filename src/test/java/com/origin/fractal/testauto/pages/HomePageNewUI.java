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
	private By termsLink = By.xpath(".//div[contains(@class,'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/../div/p/a[2]");//edited by dhanushiya
	private By contactsLink = By.xpath(".//div[contains(@class,'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/../div/p/a[3]");//edited by dhanushiya
	private By privacyPage = By.xpath("//span[contains(text(),'PRIVACY POLICY')]");
	private By termsPage = By.xpath(".//span[contains(text(),'Terms & Conditions')]");//edited by dhanushiya
	private By contactsPage = By.xpath(".//span[contains(text(),'contact us')]");//edited by dhanushiya
	private By lblHome = By.xpath("//span[contains(text(),'Home')]");
	private By supportLink = By.xpath(".//body/div[@id='root']/div[@id='page-container']/footer[@id='footer']/div[1]/div[1]/div[1]/div[3]/div[1]/p[1]/a[4]");//a[contains(text(),'| Support')]//div[contains(@class,'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/../div/p/a[4]
	private By carosalBtn = By.xpath(".//body/div[@id='root']/div[@id='page-container']/main[@id='content-wrap']/div[1]/div[1]/div[2]/div[2]//div/ul[@class='control-dots']");
	MyLearningPage myLearning = new MyLearningPage(driver);
    public HomePageNewUI(WebDriver driver) {
		super(driver);
		pageName ="HomePage";
}
	public void verifyResumeLearningLabeltext() {
		wait(5);
		click(btnContinue);
		wait(5);
		myLearning.verifyMyLearningLabels();
	}
	
		public void commonFunction() {
		//	WebElement element = driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]")); 
		//	if(BrowserFactory.getOS() == "win") {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element= driver.findElement(By.xpath(".//div[contains(@class, 'text-right col-lg-12 col-md-12 col-xs-12 col-sm-12')]/p/a[3]"));
				js.executeScript("arguments[0].scrollIntoView();", Element);
			wait(5);
		//	}
			}
			public void verifyFooterLinks() {
			commonFunction();
			verifyText("| Terms",termsLink);
			verifyText("| Contact",contactsLink);
			wait(5);
			WebElement element = driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]")); 
			if(BrowserFactory.getOS() == "win") {
			Actions actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			}
			click(privacyLink);
			wait(5);
			verifyText("PRIVACY POLICY",privacyPage);
		//	click(lblHome);
			wait(5);
			commonFunction();
			click(termsLink);
			wait(5);
			verifyText("Terms & Conditions",termsPage);
		//	click(lblHome);
			wait(5);
			commonFunction();
			wait(5);
			click(contactsLink);
			wait(5);
			verifyText("contact us",contactsPage);
			wait(5);
			//edit by divya based on reviewing testcases
			commonFunction();
			click(supportLink);
			}
			public void CarosalImgCheck()
			{
				wait(2);
				elementExist(carosalBtn);
				wait(3);
				click(carosalBtn);
			}
	}
	


