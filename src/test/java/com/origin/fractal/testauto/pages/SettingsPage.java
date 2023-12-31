package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

public class SettingsPage extends FractalBasePage {
	private By label = By.xpath(".//md-switch");
	private By save = By.xpath(".//button[2]");

	
	public SettingsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnSwitch() {
		WebElement lbl = driver.findElement(label);
		lbl.click();
	}

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
	
	/****added here by mahesh*06/02/0/19**/
/* public void verifyMailReceivedToEmail() {
		String text = read();
		String textReceived =text;
		verifyText(textReceived,textReceived);
	}
	*/
/****end**/


}
