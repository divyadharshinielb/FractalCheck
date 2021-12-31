package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
/* File Name: AddingStripePage.java
 * Purpose: resume learning re-direction with INPROGRESS and COMPLETED-5246
 * Number of Testcases: 3
 * Created by: Mahesh
 * Created on: 15/11/2021
 */

public class ResumeLearningPage extends FractalBasePage {
	private By ResumeCatalogText = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/div[2]/div[2]/div[1]/span[1]");//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/a[1]/div[1]/div[2]/div[2]/div[1]/span[1]
	private By ResumeInsideCatalogText = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]");
	private By lblResource = By.xpath("//span[@class='avg_rat fs16']");
	private By resourceCount = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]");
	private By lblClose = By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[4]/img[1]");
	private By WhatsNewTxt = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public ResumeLearningPage(WebDriver driver) {
		super(driver);
		pageName ="ResumeLearningPage"; 
	}
	/*
	 *function:CompareResumeCatalogText() 
	 *cause: Comparing ResumeCatalog Text
	 */
	public void CompareResumeCatalogText() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		WebElement p=driver.findElement(ResumeCatalogText);
		String catalogText= p.getText();
        System.out.println(""+catalogText);
		waitE(ResumeCatalogText,15);
		click(ResumeCatalogText);
		waitE(ResumeInsideCatalogText,15);
		if(elementExist(ResumeInsideCatalogText)) {
		WebElement p1=driver.findElement(ResumeInsideCatalogText);
		String insideCatalogText= p1.getText();
		verifyText(insideCatalogText,ResumeInsideCatalogText);
		}
		else {
			waitE(lblClose,15);
			click(lblClose);
		}
				
	}
	/*
	 *function:verifyResumeCatalogLabel() 
	 *cause: Verifying Resumecatalolabel page
	 */
	public void verifyResumeCatalogLabel() throws InterruptedException 
	{
//	click(ResumeCatalogText);
	if(elementExist(ResumeInsideCatalogText)) {
	waitE(lblResource,15);
	js.executeScript("window.scrollBy(0,500)");
	verifyText("Resources",lblResource);
	}
	else {
		waitE(lblClose,15);
		click(lblClose);
	}
	}
	/*
	 *function:verifyResumeCount() 
	 *cause: verfying Resume catalog resource count
	 */
	public void verifyResumeCount() throws InterruptedException {
	//	click(ResumeCatalogText);
		if(elementExist(ResumeInsideCatalogText)) {
		waitE(resourceCount,15);
		 WebElement p=driver.findElement(resourceCount);
		String s= p.getText();
		verifyText(s,resourceCount);
	}
	else {
		waitE(lblClose,15);
		click(lblClose);
	}
	
	}
}
