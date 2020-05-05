package com.origin.fractal.testauto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class videoTesterPage extends FractalBasePage{
	private By searchfieldUser= By.xpath("//input[@id='theInput']");
	private By Iblvideo=By.xpath("//h1[contains(text(),'Video 1')]");//*[text()='AutoTC_Itemcode_Video'])[3]
	private By videoPlayer=By.xpath("//*[@class=\"vjs-big-play-button\"]");
	private By play= By.xpath("//*[@title=\"Play\"]");
	private By pause= By.xpath("//*[@title=\"Pause\"]");
	private By videoPlayingstarted= By.xpath("//*[@class=\"video-js vjs-default-skin videoplayer-dimensions vjs-controls-enabled vjs-workinghover vjs-v7 vjs-user-active vjs-playing vjs-has-started\"]");
	private By videoPlaying= By.xpath("//*[@class=\"video-js vjs-default-skin videoplayer-dimensions vjs-controls-enabled vjs-workinghover vjs-v7 vjs-user-active vjs-has-started vjs-playing\"]");
	private By videoPaused= By.xpath("//*[@class=\"video-js vjs-default-skin videoplayer-dimensions vjs-controls-enabled vjs-workinghover vjs-v7 vjs-user-active vjs-has-started vjs-paused\"]");
	private By videoEnd= By.xpath("//*[@class=\"video-js vjs-default-skin videoplayer-dimensions vjs-controls-enabled vjs-workinghover vjs-v7 vjs-user-active vjs-has-started vjs-paused vjs-ended\"]");

	public videoTesterPage(WebDriver driver) {
		super(driver);
	}
	public boolean verifyVideoTester() throws Exception {
		
		Actions	actions = new Actions(driver); 
		clear(searchfieldUser);
		wait(3);
		enterData("Video", searchfieldUser);//AutoTC_Itemcode_Video
		driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
		wait(5);
		click(By.xpath("//button[contains(text(),'PODCASTS')]"));
		wait(5);
		WebElement element = driver.findElement(Iblvideo);
		actions.moveToElement(element).perform();
		click(Iblvideo);
		wait(10);
		driver.switchTo().frame(0);
		click(videoPlayer);
		wait(5);
		
		if(elementExist(videoPlayingstarted)) {
			print("Video is playing started");
		}
		else if(elementExist(videoPlaying)) {
			print("Video is playing");
		}
		else if(elementExist(videoPaused)) {
			print("Video is Paused");
		}
		else if(elementExist(videoEnd))
		{
			print("Video is Ended");
			click(videoPlayer);
		}
		else
		{
			print("Some issue with the player.");
			return false;
		}
		wait(3);
		element = driver.findElement(pause);
		actions = new Actions(driver); 
		actions.moveToElement(element).perform();
		click(pause);
		wait(3);
		if(elementExist(videoPlayingstarted)) {
			print("Video is playing started");
		}
		else if(elementExist(videoPlaying)) {
			print("Video is playing");
		}
		else if(elementExist(videoPaused)) {
			print("Video is Paused");
		}
		else if(elementExist(videoEnd))
		{
			print("Video is Ended");
			return false;
		}
		else
		{
			print("Some issue with the player.");
			return false;
		}
		wait(10);
		return true;
	}
}
