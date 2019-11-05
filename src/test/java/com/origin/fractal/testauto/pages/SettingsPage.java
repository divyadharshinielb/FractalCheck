package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

public class SettingsPage extends FractalBasePage {
	private By label = By.xpath("//div[@class='col-lg-2 col-md-2 col-sm-2 col-xs-2 text-left blue-span-2']");//button[@class='btn green-button-save mb-4 width-25']
	private By save = By.xpath(".//button[contains(text(),'SAVE')]");

	
	public SettingsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnSwitch() {
		WebElement lbl = driver.findElement(label);
		lbl.click();
	/*System.out.println("labelStatus");
		click(label);
		System.out.println("labelStatus");	
	  */ }

	public void printStatus() {
		WebElement lbl = driver.findElement(label);
		String notificationStatus = lbl.getAttribute("aria-checked");
		System.out.println("notificationStatus");
		if (notificationStatus.equals("true")) {
			System.out.println("Enabled");
		} else {
			System.out.println("Disabled");
		}
	}

	public void clickOnSave() {
		WebElement btn = driver.findElement(save);
		btn.click();

	}


}
