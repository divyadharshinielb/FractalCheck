//added by karpagavalli on 16.11.2018
package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.SettingsPage;

public class SettingsSteps extends FractalBaseStep {
	private SettingsPage page = null;

	public SettingsSteps(WebDriver driver) {
		page = new SettingsPage(driver);
		fBPage = page;
	}

	public void clickOnSwitch() {
		result ="Passed";
		   try {
			page.clickOnSwitch();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}

	public void printStatus() {
		page.printStatus();
	}

	public void clickOnSave() {
		page.clickOnSave();
	}
	/****added by mahesh on 06/02/2019**/
/*	public void verifyMailReceivedToEmail() {
		page.verifyMailReceivedToEmail();
	}
	*/
/*****end**/

}

//added by karpagavalli on 16.11.2018