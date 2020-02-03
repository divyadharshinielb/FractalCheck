package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class videoTesterPage extends FractalBasePage{
	private By searchfieldUser= By.xpath("//input[@id='theInput']");
	private By Iblvideo=By.xpath("(//*[text()='Sample video'])[3]");
	private By videoPlayer=By.xpath("//*[@class=\"vjs-big-play-button\"]");
	private By play= By.xpath("//*[@title=\"Play\"]");
	private By pause= By.xpath("//*[@title=\"Pause\"]");
	private By replay= By.xpath("//*[@title=\"Replay\"]");
	public videoTesterPage(WebDriver driver) {
		super(driver);
	}
		public void verifyVideoTester() throws InterruptedException {
		Actions	actions = new Actions(driver); 
		clear(searchfieldUser);
		enterData("Sample video", searchfieldUser);
		driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
		wait(5);
		try{
		WebElement element = driver.findElement(Iblvideo);
		actions.moveToElement(element).perform();
		click(Iblvideo);
		wait(3);
		driver.switchTo().frame(0);
		click(videoPlayer);
		print("Video is playing.");
		wait(5);
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