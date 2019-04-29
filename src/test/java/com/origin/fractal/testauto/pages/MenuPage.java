package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class MenuPage extends FractalBasePage{
	private By userIcon = By.xpath(".//a[@id='dLabel']");
	private By lblLogout = By.xpath(".//a[contains(text(),'Logout')]");
	private By manageContents = By.xpath("//span[contains(text(),'Manage Content')]");
	private By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	private By btnPayment = By.xpath("//a[@href='#payment/settings']//i[@data-icon='P']");
	private By btnScroll= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/ng-include[1]/div[2]/ul[1]/li[7]/ul[1]/div[1]/div[2]/div[1]");
	private By btnDropDown1 =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[1]/div[1]/md-input-container[1]/div[1]");
	private By btnPaypal = By.xpath("//md-input-container[1]/div[1]/ul/li[@data-value='paypal']");
	private By btnSave =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[1]/div/*/button[contains(text(),'Save')]");
	private By btnSettings=By.xpath("//div[@class='icon dripicons-gear']");
	private By clientText=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[1]/div[3]/md-input-container[1]/input[1]");
	private By emailText=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[1]/div[4]/md-input-container[1]/input[1]");
	private By clientSecretText=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/form[1]/div[1]/div[5]/md-input-container[1]/input[1]");
	private By globalSearch=By.xpath("//input[@placeholder='Search']");
	private By lblErrorMsg=By.xpath("//div[contains(@class,'text-danger ng-scope')]");
	private String reboxBtn="//ng-include[1]/div[1]/div[2]/div";
    private String reboxCatTitle="]/div[1]/div[1]/div[2]/h3[1]";
    private By btnLoadMore = By.xpath(".//div/ng-include/*//div/button[contains(text(),'Load More')]");
    public MenuPage(WebDriver driver) {
		super(driver);
	}
	public void logout() {
		click(userIcon);
		wait(5);
		click(lblLogout);
	}
	public void clickMenu() {
		click(btnMenu);
	}
	public void gotoManageContents() {
		click(manageContents);
	}
	public void gotoPaymentConfiguration() {
		click(btnSettings);
		//	click(btnScroll);
			wait(10);
			click(btnPayment);
			wait(10);
			click(btnDropDown1);
			wait(10);
			click(btnPaypal);
			wait(10);
			enterData("AYgAXxd1WKn1QKyhdpesNV2jqY5eQqIyN7f5ywO3dy4eRAoQSvXwIKajXkw6ZFlFBvaixe56TKa-RFz8",clientText);
		    enterData("rashim-facilitator@gmail.com",emailText);
		    enterData("EMKzG8XxRDcFb0ckn4raTWnJde9JG_LQVgzYOeFw7a2O7fLM_PoFu7cXlqZ53PsgmozsVINVPEN_UknH",clientSecretText);
			click(btnSave);
	}
	//****Devlopement in progress***//
	public void searchFieldAsset() {
		click(globalSearch);
		wait(15);	
		Actions action=new Actions(driver);
	    action.sendKeys("auto123").sendKeys(Keys.ENTER).build().perform();
	    wait(15);
	   verifyText("No Records Found",lblErrorMsg);
	   clear(globalSearch);
	   click(globalSearch);
	   action.sendKeys("es").sendKeys(Keys.ENTER).build().perform();
	    wait(15);
	    if( elementExist(btnLoadMore)){
	    click(btnLoadMore);
	    }
/*	    String[] expectedItems=verifySearchCataloItems(reboxBtn,reboxCatTitle);
	    for(String a:expectedItems) {
			System.out.println("---->"+a);
	    }
*/	}
	//*****end*****//
	public void searchFieldItemCode() {
		click(globalSearch);
		wait(15);	
		Actions action=new Actions(driver);
	    action.sendKeys("auto123").sendKeys(Keys.ENTER).build().perform();
	    wait(15);
	   verifyText("No Records Found",lblErrorMsg);
	   clear(globalSearch);
	   click(globalSearch);
	   action.sendKeys("23121").sendKeys(Keys.ENTER).build().perform();
	    wait(15);
	    if( elementExist(btnLoadMore)){
	    	click(btnLoadMore);
	    }
/*	    String[] expectedItems=verifySearchCataloItems(reboxBtn,reboxCatTitle);
	    for(String a:expectedItems) {
			System.out.println("---->"+a);
	    }
*/	}
}
