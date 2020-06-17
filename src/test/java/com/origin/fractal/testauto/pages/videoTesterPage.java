package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class videoTesterPage extends FractalBasePage{
	private By searchfieldUser= By.xpath("//input[@id='theInput']");
	private By Iblvideo=By.xpath("//h1[contains(text(),'Prod-Video1')]");//h1[contains(text(),'Video 1')]//*[text()='Sample video'])[3]
	private By videoPlayer=By.xpath("//*[@class=\"vjs-big-play-button\"]");//*[@class=\"vjs-big-play-button\"]
	private By play= By.xpath("//*[@title=\"Play\"]");
	private By pause= By.xpath("//*[@title=\"Pause\"]");
	private By replay= By.xpath("//*[@title=\"Replay\"]");
	private By mylearningRadioBtn=By.xpath("//div[contains(@class,'text-right')]//div[1]//label[1]");
	
	public videoTesterPage(WebDriver driver) {
		super(driver);
	}
		public void verifyVideoTester() throws Exception {
			Actions	actions = new Actions(driver); 
			clear(searchfieldUser);
			wait(3);
			enterData("video", searchfieldUser);//AutoTC_Itemcode_VideoVideo
			driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
			wait(6);
			click(By.xpath("//button[contains(text(),'COURSES')]"));//button[contains(text(),'PODCASTS')]
			wait(5);
			click(mylearningRadioBtn);
			wait(5);
			WebElement element = driver.findElement(Iblvideo);
			actions.moveToElement(element).perform();
			click(Iblvideo);
		wait(10);
		driver.switchTo().frame(0);
		wait(10);
		click(videoPlayer);
		print("Video is playing.");
		wait(5);
		try {
		if(elementExist(pause)) {
			element = driver.findElement(pause);
			actions = new Actions(driver); 
			actions.moveToElement(element).perform();
			click(pause);
			print("Video is paused.");
			wait(5);
		}
		else if(elementExist(replay)) {
			element = driver.findElement(replay);
			actions = new Actions(driver); 
			actions.moveToElement(element).perform();
			click(replay);
			print("Video is resumed.");
			wait(5);
		}
		else {
			print("Unknown Error on video player");
		
		}
			}catch(Exception e) {
			print("Exception on video player");
		}
		
	}

}

