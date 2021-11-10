package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;


public class DownloadContentPage extends FractalBasePage {
private By addLearningObjectBtn = By.xpath("//button[contains(text(),'Add Learning Object')]");
private By videoBtn= By.xpath("//span[@class='padding-l-0 ng-binding'][contains(text(),'Video')]");
private By lblDownload= By.xpath("//label[@id='downloading_content']");
private By lblDownloadText= By.xpath("//h6[contains(text(),'If checked, a DOWNLOAD button will appear for this')]");	
private By closeBtn= By.xpath("//div[@id='addObject']//i[contains(@class,'text-right font-size-35')]");
private By documentBtn= By.xpath("//span[contains(text(),'Document')]");
private By lblMM= By.xpath("//input[@placeholder='MM']");
private By imageBtn= By.xpath("//button//span[contains(text(),'Image')]");
private By linkRadioBtn= By.xpath("//label[contains(text(),'Link')]");
private By videoUrlTextField= By.xpath("//input[@ng-model='video.url']");
private By lblItemCode= By.xpath("//input[@name='item_code']");

private By searchText= By.xpath("//input[@id='theInput']");
private By audioCatalog= By.xpath("//a[@class='a-link']");
private By resumeLearning= By.xpath("//span[@class='vid clearfix']");
private By audioLearningObject= By.xpath("//h1[contains(@title,'AutoTC_Itemcode_Bundle')]");
private By downloadIcon= By.xpath("//div[@id='loname']/../div/div/div[2]/span[1]");

public DownloadContentPage(WebDriver driver) {
		super(driver);
	}
  public void addLearningObjectBtn() {
	wait(5);
   click(addLearningObjectBtn);
     }
  /* Function name: videoCreation()
	 * Action: Verify video creation to enable downloadable option
	 * Return Type: void
	 */
	public void videoCreation() {
	wait(5);
	click(videoBtn);
	WebElement element = driver.findElement(lblDownload); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(5);
	verifyText("Downloadable",lblDownload);
	wait(5);
	click(lblDownload);
	wait(5);
	verifyText("If checked, a DOWNLOAD button will appear for this content in the player.",lblDownloadText);
	wait(5);
	click(closeBtn);
	}
	/* Function name: imageCreation()
	 * Action: Verify image creation to enable downloadable option
	 * Return Type: void
	 */
	public void imageCreation() {
	wait(5);
	addLearningObjectBtn();
	wait(5);
	click(imageBtn);
	wait(5);
	WebElement element = driver.findElement(lblMM); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	elementExist(lblDownload);
	wait(2);
	click(closeBtn);
	}
	/* Function name: downloableOption()
	 * Action: Verify downloadble option exist or not
	 * Return Type: void
	 */
	public void downloableOption() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
		click(videoBtn);
		wait(5);
		click(linkRadioBtn);
		wait(5);
		enterData("https://www.youtube.com/watch?v=hBh_CC5y8-s",videoUrlTextField);
		WebElement element = driver.findElement(lblItemCode); Actions
		actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		elementExist(lblDownload);
		wait(2);
		
		
	}
	/* Function name: verifyAudio()
	 * Action: Verify audio file able to download or not
	 * Return Type: void
	 */
	public void verifyAudio() {
		wait(5);
		enterData("AutoTC_Itemcode_Bundle",searchText);
		wait(2);
		driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
		wait(5);
		click(audioLearningObject);
		wait(10);
		scrollToElement(By.xpath("//div[contains(text(),'Audio')]"));
		click(By.xpath("//div[contains(@class,'masonry-bundlename ellipsis cp conte-nam ')]"));
		wait(10);
		click(downloadIcon);
		print("download clicked");
		wait(5);
		
	}
	
}
