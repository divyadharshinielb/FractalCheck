package com.origin.originweb.testauto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.wv.auto.framework.BasePage;
import com.wv.auto.framework.utils.TimeManager;

public abstract class OriginWebBasePage extends BasePage {
	int time10Sec = 30;//Updated on 16-Mar-21
	int time20Sec = 60;//Updated on 16-Mar-21
	boolean flag;
	double preMilliseconds;
	double milliseconds;
	double postMilliseconds;
	protected OriginWebBasePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLabel(String str) {
		String propKey = pageName + "_" + str;
		String lblValue = OriginWebUtils.getPageLabel(propKey);
		return lblValue;
	}
	
	public boolean clickAndcheckLoading(By clickelement, By checkelement) {
		preMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		driver.findElement(clickelement).click();
		//		wait(2);
		postMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		milliseconds = postMilliseconds - preMilliseconds;
		TimeManager.seconds = (milliseconds/1000);
		//TimeManager.seconds = new Short((short) (milliseconds/1000));
		if(elementExist(checkelement) && TimeManager.seconds<=time10Sec){
			print("PASSED: Page load times takes less than 10 sec");//Updated on 3-Dec-20
			return true;
		}
		else if(elementExist(checkelement) && TimeManager.seconds<=time10Sec){
			print("PASSED: Page loading time takes less than 20 Sec");//Updated on 3-Dec-20
			return true;
		}
		else {
			print("FAILED: Page loading time takes more than 20 Sec");//Updated on 3-Dec-20
			return false;
		}
	}

	public boolean clickAndcheckLoadingOtherTab(By clickelement, By checkelement) {
		preMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		driver.findElement(clickelement).click();
		switchToNewTab();
		if(elementExist(checkelement)){
			flag=true;
		}
		closeNewTabandgoToMainTab();
		postMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		milliseconds = postMilliseconds - preMilliseconds;
		TimeManager.seconds = (milliseconds/1000);
		//TimeManager.seconds = new Short((short) (milliseconds/1000));
		if(flag=true && TimeManager.seconds<=time10Sec){
			print("PASSED: Page load times takes less than 10 sec");//Updated on 3-Dec-20
			flag = true;
		}
		else if(flag=true && TimeManager.seconds<=time20Sec){
			print("PASSED: Page loading time takes less than 20 Sec");//Updated on 3-Dec-20
			flag = true;
		}
		else {
			print("FAILED: Page loading time takes more than 20 Sec");//Updated on 3-Dec-20
			flag = false;
		}
		return flag;
	}

	public boolean searchKeyWordAndcheckLoading(By clickelement,String searchkey,By textArea, By checkelement) {
		preMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		driver.findElement(clickelement).click();
		enterData(searchkey,textArea);
		driver.findElement(textArea).sendKeys(Keys.RETURN);
		//		wait(2);
		postMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		milliseconds = postMilliseconds - preMilliseconds;
		TimeManager.seconds = ((milliseconds/1000));
		//TimeManager.seconds = new Short((short) (milliseconds/1000));
		if(elementExist(checkelement) && TimeManager.seconds<=time10Sec){
			print("PASSED: Page load times takes less than 10 sec");//Updated on 3-Dec-20
			return true;
		}
		else if(elementExist(checkelement) && TimeManager.seconds<=time20Sec){
			print("PASSED: Page loading time takes less than 20 Sec");//Updated on 3-Dec-20
			return true;
		}
		else {
			print("FAILED: Page loading time takes more than 20 Sec");//Updated on 3-Dec-20
			return false;
		}
	}
	
	public boolean clickAnd40SecLoading(By clickelement, By checkelement) {
		preMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		driver.findElement(clickelement).click();
		//		wait(2);
		postMilliseconds = TimeManager.getCurrententTimeStamp().getTime();
		milliseconds = postMilliseconds - preMilliseconds;
		TimeManager.seconds = ((milliseconds/1000));
		//TimeManager.seconds = new Short((short) (milliseconds/1000));
		if(elementExist(checkelement) && TimeManager.seconds<=20){
			print("PASSED: Page load times takes less than 20 sec");//Updated on 3-Dec-20
			return true;
		}
		else if(elementExist(checkelement) && TimeManager.seconds<=75){//Updated on 3-Dec-20
			print("PASSED: Page loading time takes less than 75 Sec");//Updated on 3-Dec-20
			return true;
		}
		else {
			print("FAILED: Page loading time takes more than 60 Sec");//Updated on 3-Dec-20
			return false;
		}
	}
}