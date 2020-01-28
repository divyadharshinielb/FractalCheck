package com.origin.fractal.testauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class ReportPage extends FractalBasePage{
	 private By btnReports = By.xpath("//a[@href='#reports']//div[@class='icon']");
	 private By lblContent = By.xpath("//span[@class='text-uppercase padding-lr-10 ng-scope'][contains(text(),'Content')]");
	 private By lblUsers = By.xpath("//span[@class='text-uppercase padding-lr-10 ng-scope'][contains(text(),'Users')]");
	 private By lblUsername = By.xpath("//ng-include[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/md-autocomplete[1]/md-autocomplete-wrap[1]/input[1]");
	 private By lblGroupNameUser = By.xpath("//ng-include[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/span[1]");
	 private By btnGenerate = By.xpath("//div[@class='padding-tb-10 text-center']//button[@class='btn btn-default btn_radius text-decoration-none'][contains(text(),'Generate')]");
	 private By lblHighlight = By.xpath("//span[@class='highlight']");
	 private By lblRadiobtn = By.xpath("//ng-include[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/md-radio-group[1]/md-radio-button[1]/div[1]/div[1]");
	 private By lblGroupNameContent = By.xpath("//ng-include[1]/div[1]/div[5]/div[3]/div[2]/div[1]/div[9]");
	 private By lblCatalogName = By.xpath("//ng-include[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/md-autocomplete[1]/md-autocomplete-wrap[1]/input[1]");
	 private By btnGenerate1 = By.xpath("//ng-include[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div/button");
	 public ReportPage(WebDriver driver) {
		super(driver);
	}
	
	 public void verifyGroupName() {
			click(btnReports);
			wait(5);
			click(lblUsers);
			wait(5);
			click(lblUsername);
			wait(5);
			enterData("automation_directuser",lblUsername);
			wait(10);
			click(lblHighlight);
			Actions action=new Actions(driver);
		//    action.sendKeys("automation_directuser@originlearning.com").sendKeys(Keys.ENTER).build().perform();
			wait(5);
			click(btnGenerate);
			/*wait(15);	
		    action.sendKeys("automation_directuser@originlearning.com").sendKeys(Keys.ENTER).build().perform();
			wait(5);
			click(btnGenerate);
			wait(20);*/
			if(elementExist(lblGroupNameUser)) {
			String lblGroupNameUser1=getText(lblGroupNameUser);
			verifyText(lblGroupNameUser1,lblGroupNameUser);
			}
			click(lblContent);
			wait(5);
			click(lblRadiobtn);
			wait(5);
			click(lblCatalogName);
			wait(5);
			/*enterData("Bundle for Category check",lblCatalogName);
			wait(10);
			click(lblHighlight);
			wait(10);
			click(btnGenerate1);
			wait(5);
			if(elementExist(lblGroupNameContent)) {
			String lblGroupNameContent1=getText(lblGroupNameContent);
			verifyText(lblGroupNameContent1,lblGroupNameContent);*/
		}
}
