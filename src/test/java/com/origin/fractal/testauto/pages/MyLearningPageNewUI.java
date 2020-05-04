package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class MyLearningPageNewUI extends FractalBasePage {
	private By lblResumeLearning = By.xpath("//div[contains(text(),'RESUME LEARNING')]");
	private By lblAll = By.xpath("//button[@class='btn btn active']");//button[contains(text(),'All')]
	private By lblCourses = By.xpath("//button[contains(text(),'COURSE')]");
	private By lblResources = By.xpath("//button[contains(text(),'RESOURCE')]");
	private By lblBundles = By.xpath("//button[contains(text(),'BUNDLE')]");
	private By lblLearningPath = By.xpath("//button[contains(text(),'LEARNING PATHS')]");
	private By lblCatnameInside = By.xpath("//span[@class='three-line-clamp']");
	private By lobjCount = By.xpath("//span[@class='obj_count']");
	private By lblDurationInCat = By.xpath("//div[contains(@class,'flcolor')]//i[@class='drip_icon'][contains(text(),'a')]");
	private By lblValidTillInCat = By.xpath("//span[contains(text(),'Validity')]");
	private By overViewMore = By.xpath("//p[contains(@class,'talignr vmore')]");
	private By lbloverview = By.xpath("//span[@class='pl-30']");
	private By lblHome = By.xpath("//span[contains(text(),'Home')]");
	private By lblContinue = By.xpath("//span[@class='continue_button']");
	private By lblMyLearning = By.xpath("//a[contains(text(),'MY LEARNING')]");
	public MyLearningPageNewUI(WebDriver driver) {
		super(driver);
		pageName = "MyLearningPageNewUI";
	}

	public void verifySubMenu() {
		  wait(5);
		click(lblHome);
         wait(5);
         click(lblMyLearning);
         wait(15);
		verifyText("ALL", lblAll);
		wait(5);
		verifyText("COURSES", lblCourses);
		wait(5);
		//verifyText("RESOURCES", lblResources);
		wait(5);
		verifyText("BUNDLES", lblBundles);
		wait(5);
		verifyText("LEARNING PATHS", lblLearningPath);
	}
	public void verifyCatalogname() {
/*		click(clickCatalog);
*/		  wait(5);
         click(lblHome);
         wait(5);
         click(lblContinue);
         wait(15);
         //edit by divya
		verifyText(" Origin Spectrum", lblCatnameInside);
	}
	public void verifyMyLearningLabels() {
		wait(5);
	/*	verifyPartialLabelText("catalogTitle", lblCatnameInside);
		wait(5);
		verifyPartialLabelText("lobjCount", lobjCount);
		wait(5);
		verifyPartialLabelText("lblDuration", lblDurationInCat);
		wait(5);
		verifyPartialLabelText("lblValidity", lblValidTillInCat);
		wait(5);
	*/	verifyPartialLabelText("lbloverview", lbloverview);
		wait(2);
		click(lblHome);
	}
}

