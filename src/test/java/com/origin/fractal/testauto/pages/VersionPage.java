package com.origin.fractal.testauto.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
import com.wv.auto.framework.BrowserFactory;

public class VersionPage extends FractalBasePage{
	private By version1=By.xpath("//a[contains(text(),'iOS 12.4.1')]");
	private By version = By.xpath("//*[@id=\'mw-content-text\']/div/table[2]/tbody/tr[13]/td[1]/a");
	private By objBox=By.xpath("//table[@class='wikitable']//tr[3]//td[1]");
	
	public VersionPage(WebDriver driver) {
		super(driver);
		pageName ="VersionPage";
		String baseUrlV ="https://support.apple.com/en-in/HT201222"; 
		//String baseUrl1="https://en.wikipedia.org/wiki/IOS_version_history";this for wikipedia
		goTo(baseUrlV);
		
	}
	public void VersionCheck() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[3]/tbody/tr/th")); 
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
		Actions actions = new Actions(driver); 
		actions.moveToElement(element);
		actions.perform();
		}
		wait(10);
		System.out.println("The version is being displayed"+version);
		elementExist(version);
		getAttributeValue(version);
		verifyText("13.0 Beta 5",version);
		/*WebElement TogetRows = driver.findElement(By.xpath("//table[2]"));
		List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
		String result = TotalRowsList.size() == 13 ? "Success" : "Failure"; 
		System.out.println(result);*/
		WebElement ToGetColumns = driver.findElement(By.xpath("//table[2]"));
		List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("tr"));
		System.out.println("Total Number of Columns in the table are: "+TotalColsList.size());
		String result = TotalColsList.size() == 13 ? "Success" : "Failure"; 
		System.out.println(result);
	}

	public void VersionCheck1() {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'tvOS 12.4.1')]")); 
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
		Actions actions = new Actions(driver); 
		actions.moveToElement(element);
		actions.perform();
		}
		wait(10);
		System.out.println("The version is being displayed"+version);
		wait(5);
		elementExist(version1);
		getAttributeValue(version1);
		verifyText("iOS 12.4.1",version1);
		WebElement ToGetColumns = driver.findElement(By.xpath("//div[@id='tableWraper']//table//tbody"));
		List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("tr"));
		System.out.println("Total Number of Columns in the table are: "+TotalColsList.size());
		String result = TotalColsList.size() == 269 ? "Success" : "Failure"; 
		System.out.println(result);
	}
}
