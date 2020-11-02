package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class UserCronPage extends FractalBasePage {
	
	private By addLearningObjectBtn = By.xpath("//button[contains(text(),'Add Learning Object')]");
	private By elearningBtn = By.xpath("//button[@type='button']//span[contains(text(),'eLearning')]");
	private By titleNameField= By.xpath("//input[@id='input_2']");//input[@type='text'][@class='padding-b-0 ng-pristine md-input ng-empty ng-invalid ng-invalid-required ng-valid-minlength ng-valid-maxlength ng-touched']
	private By selectCategory= By.xpath("//input[@placeholder='Select Category']");
	private By lblGeneral= By.xpath("//span//span[contains(text(),'General')]");
	private By selectLanguage= By.xpath("//span[contains(text(),'Select Language')]");
	private By lblEnglish= By.xpath("//div[@class='select-background learningobjectslist float-left select-180']//li[@class='option'][contains(text(),'English')]");
	private By uploadScromBtn= By.xpath("//label//input[@type='file']");//label[contains(text(),'Upload Scorm Package')]//input[@type='file']
	private By lblAttempt= By.xpath("//div//span[contains(text(),'Attempt')]");
	private By lblAttemptNumber= By.xpath("//div//ul//li[contains(text(),'Unlimited')]");
	private By lblDescription= By.xpath("//textarea[@name='elearningdescription']");//textarea[@id='input_18']
	private By lblItemCode= By.xpath("//input[@name='item_code']");
	private By lblHH= By.xpath("//input[@placeholder='HH']");
	private By lblMM= By.xpath("//input[@placeholder='MM']");
	private By lblSave= By.xpath("//button[@class='btn btn-default md-raised ng-binding']");//button[@type='submit'][contains(text(),'Save')]
	private By videoBtn= By.xpath("//span[@class='padding-l-0 ng-binding'][contains(text(),'Video')]");
	private By videoInputField= By.xpath("//input[@id='input_51']");
	private By documentBtn= By.xpath("//span[contains(text(),'Document')]");
	private By documentInputField= By.xpath("//input[@id='input_61']");
	private By lblpages= By.xpath("//input[@name='pages']");
	private By imageBtn= By.xpath("//span[contains(text(),'Image')]");
	private By imageInputField= By.xpath("//input[@id='input_70']");
	private By assessmentBtn= By.xpath("//span[contains(text(),'Assessment')]");
	private By assessmentInputField= By.xpath("//input[@id='input_79']");
	private By vlabBtn= By.xpath("//span[contains(text(),'vLab')]");
	private By vlabInputField= By.xpath("//input[@id='input_88']");
	private By lblLTIProvider= By.xpath("//span[contains(text(),'Select LTI Provider')]");
	private By lblLearnOnDemand= By.xpath("//li[contains(text(),'Learn on Demand')]");
	private By labCode= By.xpath("//input[@id='input_89']");
	private By audioBtn= By.xpath("//span[@class='padding-l-0'][contains(text(),'Audio')]");
	private By audioInputField= By.xpath("//input[@id='input_98']");
	private By htmlBtn= By.xpath("//span[@class='padding-l-0'][contains(text(),'HTML')]");
	private By htmlInputField= By.xpath("//input[@id='input_109']");
	private By closeBtn= By.xpath("//div[@id='addObject']//i[contains(@class,'text-right font-size-35')]");
	
	
	private String filename="C:\\sample file\\Origin_Scorm_2004_Final.xlsx";
	private String filename1="C:\\\\sample file\\\\small.mp4";
	
	public UserCronPage(WebDriver driver) {
		super(driver);
	}
	public void addLearningObjectBtn() {
		wait(5);
	click(addLearningObjectBtn);
	}
	public void elearningCreation() {
		wait(5);
	click(elearningBtn);
	wait(5);
	enterData("abc",titleNameField);
	wait(2);
	click(selectCategory);
	wait(2);
	click(lblGeneral);
	wait(2);
	click(selectLanguage);
	wait(2);
	click(lblEnglish);
	wait(2);
//	uploadBrowseFile(filename);
	WebElement element = driver.findElement(lblMM); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(2);
	click(lblAttempt);
	wait(2);
	click(lblAttemptNumber);
	wait(2);
	enterData("abc",lblDescription);
	wait(2);
	enterData("abc",lblItemCode);
	wait(2);
	enterData("00",lblHH);
	wait(2);
	enterData("50",lblMM);
	wait(5);
	click(lblSave);
	wait(5);
	click(closeBtn);
	
	}
	public void videoCreation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
	click(videoBtn);
	wait(5);
	enterData("abc",videoInputField);
	wait(2);
	click(selectCategory);
	wait(2);
	click(lblGeneral);
	wait(2);
	click(selectLanguage);
	wait(2);
	click(lblEnglish);
	wait(2);
	uploadBrowseFile(filename);
	WebElement element = driver.findElement(lblItemCode); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(2);
	enterData("abc",lblDescription);
	wait(2);
	enterData("abc",lblItemCode);
	wait(5);
	click(lblSave);
	wait(5);
	click(closeBtn);
	
	}
	
	public void documentCreation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
	click(documentBtn);
	wait(5);
	enterData("abc",documentInputField);
	wait(2);
	click(selectCategory);
	wait(2);
	click(lblGeneral);
	wait(2);
	click(selectLanguage);
	wait(2);
	click(lblEnglish);
	wait(2);
	uploadBrowseFile(filename1);
	WebElement element = driver.findElement(lblMM); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(2);
	enterData("abc",lblDescription);
	wait(2);
	enterData("abc",lblItemCode);
	wait(2);
	enterData("00",lblHH);
	wait(2);
	enterData("50",lblMM);
	wait(2);
	enterData("2",lblpages);
	wait(5);
	click(lblSave);
	
	}
	
	public void imageCreation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
	click(imageBtn);
	wait(5);
	enterData("abc",imageInputField);
	wait(2);
	click(selectCategory);
	wait(2);
	click(lblGeneral);
	wait(2);
	click(selectLanguage);
	wait(2);
	click(lblEnglish);
	wait(2);
	uploadBrowseFile(filename);
	WebElement element = driver.findElement(lblMM); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(2);
	enterData("abc",lblDescription);
	wait(2);
	enterData("abc",lblItemCode);
	wait(2);
	enterData("00",lblHH);
	wait(2);
	enterData("50",lblMM);
	wait(5);
	click(lblSave);
	
	}
	
	public void assessmentCreation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
	click(assessmentBtn);
	wait(5);
	enterData("abc",assessmentInputField);
	wait(2);
	click(selectCategory);
	wait(2);
	click(lblGeneral);
	wait(2);
	click(selectLanguage);
	wait(2);
	click(lblEnglish);
	wait(2);
	uploadBrowseFile(filename);
	WebElement element = driver.findElement(lblMM); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(2);
	click(lblAttempt);
	wait(2);
	click(lblAttemptNumber);
	wait(2);
	enterData("abc",lblDescription);
	wait(2);
	enterData("abc",lblItemCode);
	wait(2);
	enterData("00",lblHH);
	wait(2);
	enterData("50",lblMM);
	wait(5);
	click(lblSave);
	wait(5);
	click(closeBtn);
	
	}
	
	public void vlabCreation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
	click(vlabBtn);
	wait(5);
	enterData("abc",vlabInputField);
	wait(2);
	click(selectCategory);
	wait(2);
	click(lblGeneral);
	wait(2);
    click(lblLTIProvider);
    wait(2);
    click(lblLearnOnDemand);
    wait(2);
    enterData("12346",labCode);
    wait(2);
	WebElement element = driver.findElement(lblMM); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(2);
	enterData("abc",lblDescription);
	wait(2);
	enterData("abc",lblItemCode);
	wait(2);
	enterData("00",lblHH);
	wait(2);
	enterData("50",lblMM);
	wait(5);
	click(lblSave);
	wait(5);
	click(closeBtn);
	
	}
	
	public void audioCreation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
		WebElement element1 = driver.findElement(audioBtn); Actions
		actions1 = new Actions(driver); actions1.moveToElement(element1);
		actions1.perform();
	click(audioBtn);
	wait(5);
	enterData("abc",audioInputField);
	wait(2);
	click(selectCategory);
	wait(2);
	click(lblGeneral);
	wait(2);
	click(selectLanguage);
	wait(2);
	click(lblEnglish);
	wait(2);
	uploadBrowseFile(filename);
	WebElement element = driver.findElement(lblItemCode); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(2);
	enterData("abc",lblDescription);
	wait(2);
	enterData("abc",lblItemCode);
	wait(5);
	click(lblSave);
	wait(5);
	click(closeBtn);
	
	}
	
	public void htmlCreation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
		WebElement element1 = driver.findElement(audioBtn); Actions
		actions1 = new Actions(driver); actions1.moveToElement(element1);
		actions1.perform();
	click(htmlBtn);
	wait(5);
	enterData("abc",htmlInputField);
	wait(2);
	click(selectCategory);
	wait(2);
	click(lblGeneral);
	wait(2);
	click(selectLanguage);
	wait(2);
	click(lblEnglish);
	wait(2);
	uploadBrowseFile(filename);
	WebElement element = driver.findElement(lblDescription); Actions
	actions = new Actions(driver); actions.moveToElement(element);
	actions.perform();
	wait(2);
	click(lblAttempt);
	wait(2);
	click(lblAttemptNumber);
	wait(2);
	enterData("abc",lblDescription);
	wait(2);
	WebElement element2 = driver.findElement(lblMM); Actions
	actions2 = new Actions(driver); actions2.moveToElement(element2);
	actions1.perform();
	enterData("abc",lblItemCode);
	wait(2);
	enterData("00",lblHH);
	wait(2);
	enterData("50",lblMM);
	wait(5);
	click(lblSave);
	
	}
	
	
	public void uploadBrowseFile(String filename) {
		wait(2);
		driver.manage().window().maximize();
		driver.findElement(uploadScromBtn).sendKeys(filename);
		wait(10);
	}

}
