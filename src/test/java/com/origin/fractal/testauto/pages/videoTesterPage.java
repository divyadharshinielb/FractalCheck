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
	
	private By manageContenticon= By.xpath("//div[@class='icon dripicons']");
	private By tabCatalogItem= By.xpath("//md-tab-item//span[contains(text(),'Catalog Items')]");
	private By bundleClick= By.xpath("//span[@title='Auto_Bundle']");
	private By learningPathClick= By.xpath("//span[@title='Auto_LearningPath']");
	private By videoClick= By.xpath("//h3[@title='Auto_MP4']");
	private By homeLink=By.xpath("//a[contains(text(),'Catalog Items')]");
	private By closeBtn=By.xpath("//i[@class='icon dripicons-cross icon30 font-size-30 ng-scope']");
	private By searchCatalog=By.xpath("//input[@id='searchCatalog']");
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
		public void verifyAdminVideoTester() throws InterruptedException {
			Actions	actions1 = new Actions(driver);
			click(manageContenticon);
			wait(2);
			click(tabCatalogItem);
			wait(2);
			enterData("Auto_Bundle", searchCatalog);
			wait(5);
			WebElement element = driver.findElement(bundleClick);
			actions1.moveToElement(element).perform();
			click(bundleClick);
				WebElement element1 = driver.findElement(videoClick);
				actions1.moveToElement(element1).perform();
				click(videoClick);
				wait(5);
				driver.switchTo().frame(0);
				wait(10);
				click(videoPlayer);
				print("Video is playing.");
				wait(20);
				if(elementExist(adminPause)) {
					element = driver.findElement(adminPause);
					actions1 = new Actions(driver); 
					actions1.moveToElement(element1).perform();
					click(adminPause);
					print("Video is paused.");
					wait(10);
			click(closeBtn);
			wait(5);
			WebElement element2 = driver.findElement(homeLink);
			actions1.moveToElement(element2).perform();
			click(homeLink);
			wait(5);
			click(tabCatalogItem);
			wait(5);
			WebElement element3 = driver.findElement(learningPathClick);
			actions1.moveToElement(element3).perform();
			click(learningPathClick);
			wait(5);
			
			actions1.moveToElement(element1).perform();
			click(videoClick);
			wait(5);
			click(closeBtn);
			wait(2);
				}
			
			
		}
	/*		public By searchFieldLearnObj = By.xpath("//input[@id='searchObject']");
			private By Iblvideo=By.xpath("//*[text()='Videos Sample']");
			private By videoPlayer=By.xpath("//*[@class='vjs-big-play-button']");
	*/		private By adminPlay= By.xpath("//*[@class='vjs-play-control vjs-control vjs-button vjs-paused']");
			private By adminPause= By.xpath("//*[@class='vjs-play-control vjs-control vjs-button vjs-playing']");
	//		ManageContentItemCodesPage ManageContentItemCodesPage = null;
			
	/*		public void verifyVideoTester() throws InterruptedException {
				Actions	actions = new Actions(driver); 
				ManageContentItemCodesPage.goToManagecontent();
				clear(searchFieldLearnObj);
				enterData("Videos", searchFieldLearnObj);
				wait(5);
				try{
					WebElement element = driver.findElement(Iblvideo);
					actions.moveToElement(element).perform();
					click(Iblvideo);
					wait(5);
					driver.switchTo().frame(0);
					wait(10);
					click(videoPlayer);
					print("Video is playing.");
					wait(20);
					if(elementExist(pause)) {
						element = driver.findElement(pause);
						actions = new Actions(driver); 
						actions.moveToElement(element).perform();
						click(pause);
						print("Video is paused.");
						wait(10);
					}
					else {
						print("Unknown Error on video player");
					}
				}catch(Exception e) {
					print("Exception on video player");
				}
			}

*/

}
		
