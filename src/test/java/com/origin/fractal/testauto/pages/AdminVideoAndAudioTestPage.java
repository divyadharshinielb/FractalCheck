package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
/*Created by vignesh on 3-Aug-20
 * Purpose: Admin side audio/video pause/Play check
 * Updated by vignesh on 30-Sep-20 (Added Admin audio test)
 */
public class AdminVideoAndAudioTestPage  extends FractalBasePage{ 
	ManageContentItemCodesPage ManageContentItemCodesPage = null;
	public By searchFieldLearnObj = By.xpath("//input[@id='searchObject']");
	private By lblVideoLO=By.xpath("//*[text()='Videos Sample']");
	private By videoPlayer=By.xpath("//*[@class='vjs-big-play-button']");
	private By btnPlay= By.xpath("//*[@class='vjs-play-control vjs-control vjs-button vjs-paused']");
	private By btnPause= By.xpath("//*[@class='vjs-play-control vjs-control vjs-button vjs-playing']");
	//Added on 30-Sep-20
	private By catalogItemTab= By.xpath("(//span[text()='Catalog Items'])[1]");
	private By catalogPodcastFilter= By.xpath("//span[text()='podcasts']");
	private By catalogSearchFilter= By.xpath("//input[@id='searchCatalog']");
	private By catalogPodcast= By.xpath("(//*[contains(@ng-click,'viewObject(learningList)')][@role='button'])[1]");
	private By PodcastLO= By.xpath("(//*[@class='table-vertical table-height-100 text-left'])[1]");
	private By audioPlay= By.xpath("//*[@class='mejs__button mejs__playpause-button mejs__play']");
	private By audioReplay= By.xpath("//*[@class='mejs__button mejs__playpause-button mejs__replay']");
	private By audioPause= By.xpath("//*[@class='mejs__button mejs__playpause-button mejs__pause']");
	private String podcastName="Auto_AdminPodcastAudioTest";
	public By closePopup= By.xpath("//*[@class='md-icon-button margin-r-0 md-button md-ink-ripple']");
	public By videoClosePopup= By.xpath("//*[@class='icon dripicons-cross icon30 font-size-30 ng-scope']");
	//Ends
	public AdminVideoAndAudioTestPage(WebDriver driver) {
		super(driver);
		ManageContentItemCodesPage=new ManageContentItemCodesPage(driver);
	}
	
	/* Function Name: verifyVideoTester();
	 * Purpose: Video LO checking in admin side
	 */
	public void verifyVideoTester() throws InterruptedException {
		Actions	actions = new Actions(driver); 
		ManageContentItemCodesPage.goToManagecontent();
		clear(searchFieldLearnObj);
		enterData("Video", searchFieldLearnObj);
		wait(5);
		try{
			WebElement element = driver.findElement(lblVideoLO);
			actions.moveToElement(element).perform();
			click(lblVideoLO);
			wait(5);
			driver.switchTo().frame(0);
			wait(5);
			click(videoPlayer);
			print("Video is playing.");
			wait(10);
			if(elementExist(btnPause)) {
				element = driver.findElement(btnPause);
				actions = new Actions(driver); 
				actions.moveToElement(element).perform();
				click(btnPause);
				print("Video is paused.");
				wait(3);
				click(videoClosePopup);
				wait(2);
			}
			else {
				print("Unknown Error on video player");
				click(videoClosePopup);
				wait(2);
			}
		}catch(Exception e) {
			print("Exception in video player");
		}
	}

	//Added on 30-Sep-20
	/* Function Name: verifyAudioTester();
	 * Purpose: Audio LO checking in Admin side (Inside catalog)
	 */
	public boolean verifyAudioTester() throws InterruptedException {
		ManageContentItemCodesPage.goToManagecontent();
		click(catalogItemTab);
		wait(5);
		click(catalogPodcastFilter);
		wait(3);
		enterData(podcastName, catalogSearchFilter);
		wait(5);
		click(catalogPodcast);
		wait(5);
		click(PodcastLO);
		wait(5);
		driver.switchTo().frame(0);
		wait(5);
		click(audioPlay);
		wait(3);
		print("Audio is Playing...");
		return elementExist(audioPlay) || elementExist(audioPause) || elementExist(audioReplay);
	}


}
