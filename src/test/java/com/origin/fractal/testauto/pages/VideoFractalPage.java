package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
/*
 * Description: FR1-2774 -Video Admin Part
 * Number of Test cases covered: 4
 * Developed By:Divya Dharshini R
 * created Date: 10-sep-2020
 */

public class VideoFractalPage extends FractalBasePage{
	private By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	private By manageContent = By.xpath("//span[contains(text(),'Manage Content')]");
	private By btnaddLO = By.xpath("//button[contains(text(),'Add Learning Object')]");
	private By btnvideoLO = By.xpath("//button/span[contains(text(),'Video')]");
	private By videosupportMsg = By.xpath("//h6[@class='text-gray font-size-11 padding-t-5 padding-lr-0']");
	private By videoTitle = By.xpath("//label[contains(text(),'Title')]/../input");	
	private By selectLanguageDropdown = By.xpath("//span[contains(text(),'Select Language')]");
	private By englishLanguage = By.xpath("//span[contains(text(),'Select Language')]/../ul/li[contains(text(),'English')]");
	private By selectCategory = By.xpath("//input[@placeholder='Select Category']");
	private By generalCategory = By.xpath("//span/span[contains(text(),'General')]");
	private By uploadField = By.xpath("//input[@value='upload']/../label");
	private By linkField = By.xpath("//input[@value='link']/../label");
	private By linkSupportText = By.xpath("//h6[contains(text(),'Links Supported:')]");
	private By videoImg = By.xpath("//img[@src='img/vimeo.png']");
	private By youtubeImg = By.xpath("//img[@src='img/youtube1.jpg']");
	private By urlField = By.xpath("//label[contains(text(),'Video URL')]/../input");
	private By videoDescription = By.xpath("//textarea[@name='videodescription']");
	private By itemcodeField = By.xpath("//label[contains(text(),'Item Code')]/../input");
	private By downloadableBtn = By.xpath("//label[@id='downloading_content']");
	private By saveBtn = By.xpath("//button[contains(text(),'Save')]");
	private By videoErrorMsg = By.xpath("//div[contains(text(),'Video Url incorrect')]");
	private By tickmark = By.xpath("//i[contains(@class,'text-right font-size-40 text-CC5600')]");
	private By backToLOBtn = By.xpath("//button[contains(text(),'Back to Learning Objects')]");
	private By videoCreateMsg = By.xpath("//div[contains(text(),\"'Auto_VideoFormatCheck' has been added successfully\")]");
	private By closeBtn = By.xpath("//i[contains(@class,'text-right font-size-35')]");
	private By searchLO = By.xpath("//input[@id='searchObject']");
//	private By editIcon = By.xpath("//i[@data-template-url1='editObj.html']");
	private By deleteIcon = By.xpath("//i[@class='icon text-left font-size-16 bold cursor-pointer gray-85 padding-l-0 ng-scope']");
	private By okBtn = By.xpath("//button/span[contains(text(),'OK')]");
//	private By uploadBtn = By.xpath("//label[contains(text(),'Upload Video')]");
	private By uploadFile = By.xpath("//label[contains(text(),'Upload Video')]/input");
	String filename = "C:\\sample file\\sampleVideo3MB.mp4";
	public VideoFractalPage(WebDriver driver) {
		super(driver);
	}
		/*
	 *function: goToVideoLO()
	 * cause: Click manage contents and check for video Learning Object
	 */

	public void goToVideoLO() {
		wait(2);
		click(btnMenu);
		wait(2);
		click(manageContent);
		wait(2);
		click(btnaddLO);
		wait(2);
		click(btnvideoLO);
		
		}
	/*
	 *function: videoFormatCheck()
	 * cause: Check for validation of Fields present in video creation
	 */
public void videoFormatCheck() {
	wait(2);
	enterData("Auto_VideoFormatCheck",videoTitle);
	if(elementExist(selectLanguageDropdown)) {
	click(selectLanguageDropdown);
	click(englishLanguage);
	}
	click(selectCategory);
	click(generalCategory);
	elementExist(uploadField);
	elementExist(linkField);
	verifyText("File Formats Supported: .mp4, .mov, .m4v",videosupportMsg);
}
/*
 *function: linkFieldsCheck()
 * cause: Check and validate  video creation with link 
 */
public void linkFieldsCheck() {
	click(linkField);
	verifyText("Links Supported:",linkSupportText);
	elementExist(videoImg);
	elementExist(youtubeImg);
	enterData("invalid url",urlField);
	scrollToElement(itemcodeField);
	wait(2);
	enterData("VIDEO CHECK",videoDescription);
	wait(2);
	enterData("VIDEOCheck",itemcodeField);
	wait(2);
	verifyNonExistense(downloadableBtn);
	wait(5);
	isClickable(saveBtn);
	click(saveBtn);
	wait(2);
	elementExist(videoErrorMsg);
	verifyText("Video Url incorrect",videoErrorMsg);
	wait(2);
	enterData("https://www.youtube.com/watch?v=DLX62G4lc44",urlField);
	wait(5);
	click(saveBtn);
	wait(10);
	elementExist(tickmark);
	elementExist(backToLOBtn);
	verifyText("'Auto_VideoFormatCheck' has been added successfully",videoCreateMsg);
	verifyText("Back To Learning Objects",backToLOBtn);
	click(backToLOBtn);
	wait(5);
	enterData("Auto_VideoFormatCheck",searchLO);
	wait(10);
	click(deleteIcon);
	wait(5);
	click(okBtn);
}
/*
 *function: createVideoWithMP4()
 * cause: Create Video with MP4 format supported and deletethe video
 */
//note: unable to edit the videoLO by changing it to upload from link
public void createVideoWithMP4() {
	goToVideoLO();
	videoFormatCheck();
	//click(uploadBtn);
	wait(2);
	driver.findElement(uploadFile).sendKeys(filename);
	wait(2);
	scrollToElement(itemcodeField);
	enterData("VIDEO CHECK",videoDescription);
	enterData("VIDEOCheck1",itemcodeField);
	elementExist(downloadableBtn);
	wait(10);
	click(saveBtn);
	wait(15);
	elementExist(tickmark);
	elementExist(backToLOBtn);
	verifyText("'Auto_VideoFormatCheck' has been added successfully",videoCreateMsg);
	verifyText("Back To Learning Objects",backToLOBtn);
	click(backToLOBtn);
	wait(6);
	//click(closeBtn);
	wait(2);
	enterData("Auto_VideoFormatCheck",searchLO);
	wait(15);
	click(deleteIcon);
	wait(2);
	click(okBtn);
}
}

