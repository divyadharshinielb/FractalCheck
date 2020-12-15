package com.origin.originweb.testauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wv.auto.framework.BasePage;
import com.wv.auto.framework.utils.TimeManager;

public abstract class OriginFractalWebBasePage extends BasePage {
	int time10Sec = 10;
	int time20Sec = 20;
	boolean flag;
	double preMilliseconds;
	double milliseconds;
	double postMilliseconds;
	protected OriginFractalWebBasePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLabel(String str) {
		String propKey = pageName + "_" + str;
		String lblValue = OriginFractalWebUtils.getPageLabel(propKey);
		return lblValue;
	}

	public boolean clickAndcheckLoading(By clickelement, String checkUrl) {
		preMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		driver.findElement(clickelement).click();
		//		wait(2);
		postMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		milliseconds = postMilliseconds - preMilliseconds;
		TimeManager.seconds = (milliseconds/1000);
		if(driver.getCurrentUrl().contains(checkUrl) && TimeManager.seconds<=time10Sec){
			print("Excepted URL = "+ checkUrl);
			print("Current URL = "+ driver.getCurrentUrl());
			print("PASSED: Page load times takes less than 10 sec");
			return true;
		}
		else if(driver.getCurrentUrl().contains(checkUrl) && TimeManager.seconds<=time20Sec){
			print("Excepted URL = "+ checkUrl);
			print("Current URL = "+ driver.getCurrentUrl());
			print("PASSED: Page loading time takes less than 20 Sec");
			return true;
		}
		else {
			print("Excepted URL = "+ checkUrl);
			print("Current URL = "+ driver.getCurrentUrl());
			print("FAILED: Page loading time takes more than 20 Sec or other Exception");
			return false;
		}
	}

	public boolean clickAndcheckLoading(By clickelement, By checkElement) {
		preMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		driver.findElement(clickelement).click();
		//		wait(2);
		postMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		milliseconds = postMilliseconds - preMilliseconds;
		TimeManager.seconds = (milliseconds/1000);
		if(elementExist(checkElement) && TimeManager.seconds<=time10Sec){
			print("PASSED: Page load times takes less than 10 sec");
			return true;
		}
		else if(elementExist(checkElement) && TimeManager.seconds<=time20Sec){
			print("PASSED: Page loading time takes less than 20 Sec");
			return true;
		}
		else {
			print("FAILED: Page loading time takes more than 20 Sec or other Exception");
			return false;
		}
	}

	public boolean clickAndcheckLoadingOtherTab(By clickelement, String checkUrl) {
		preMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		driver.findElement(clickelement).click();
		switchToNewTab();
		if(driver.getCurrentUrl().contains(checkUrl)){
			print("Excepted URL = "+ checkUrl);
			print("Current URL = "+ driver.getCurrentUrl());
			flag=true;
		}
		closeNewTabandgoToMainTab();
		postMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		milliseconds = postMilliseconds - preMilliseconds;
		TimeManager.seconds = (milliseconds/1000);
		if(flag=true && TimeManager.seconds<=time10Sec){
			print("PASSED: Page load times takes less than 10 sec");
			flag = true;
		}
		else if(flag=true && TimeManager.seconds<=time20Sec){
			print("PASSED: Page loading time takes less than 20 Sec");
			flag = true;
		}
		else {
			print("FAILED: Page loading time takes more than 20 Sec or other Exception");
			flag = false;
		}
		return flag;
	}
}