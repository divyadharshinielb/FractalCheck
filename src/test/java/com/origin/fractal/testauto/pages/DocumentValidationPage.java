package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
/* File Name: DocumentValidationPage.java
 * Purpose: Check document creation with different file formats  -FR1-2775,FR1-2776
 * Number of Test cases: 9
 * Created by: DivyaDharshini
 * Updated  on: 27-10-2020
 */
public class DocumentValidationPage extends FractalBasePage {
	CatalogItemPage page;
	private By addLearningObjectBtn = By.xpath("//button[contains(text(),'Add Learning Object')]");
	private By selectCategory= By.xpath("//input[@placeholder='Select Category']");
	private By lblGeneral= By.xpath("//span//span[contains(text(),'General')]");
	private By selectLanguage= By.xpath("//span[contains(text(),'Select Language')]");
	private By lblEnglish= By.xpath("//span[contains(text(),'Select Language')]/../ul/li[contains(text(),'English')]");
	private By uploadScromBtn= By.xpath("//label//input[@type='file']");//label[contains(text(),'Upload Scorm Package')]//input[@type='file']
	private By lblDescription= By.xpath("//label[contains(text(),'Description')]/../div/textarea");//textarea[@id='input_18']
	private By lblItemCode= By.xpath("//input[@name='item_code']");
	private By lblHH= By.xpath("//input[@placeholder='HH']");
	private By lblMM= By.xpath("//input[@placeholder='MM']");
	private By lblSave= By.xpath("//button[contains(text(),'Save')]");//button[@class='btn btn-default md-raised ng-binding']//button[@type='submit'][contains(text(),'Save')]
	private By documentBtn= By.xpath("//span[@class='padding-l-0 ng-binding'][contains(text(),'Document')]/..");
	private By documentInputField= By.xpath("//label[contains(text(),'Title')]/../input");
	private By lblpages= By.xpath("//input[@name='pages']");
	private By btnReports = By.xpath("//a[@href='#reports']//div[@class='icon']");
	private By lblUsers = By.xpath("//span[@class='text-uppercase padding-lr-10 ng-scope'][contains(text(),'Users')]");
	private By lblUsername = By.xpath("//ng-include[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/md-autocomplete[1]/md-autocomplete-wrap[1]/input[1]");
	private By lblHighlight = By.xpath("//span[@class='highlight']");
	private By lblGroupNameContent = By.xpath("//ng-include[1]/div[1]/div[5]/div[3]/div[2]/div[1]/div[9]");
	private By lblCatalogName = By.xpath("//ng-include[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/md-autocomplete[1]/md-autocomplete-wrap[1]/input[1]");
	private By btnGenerate1 = By.xpath("//ng-include[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div/button");
	private By itemNameText = By.xpath("//div[contains(text(),'item name')]");
	private By subscribeText = By.xpath("//div[contains(text(),'No. of Users Subscribed')]");
	private By completedText = By.xpath("//div[contains(text(),'completed')]");
	private By inprogressText = By.xpath("//div[contains(text(),'in progress')]");
	private By yetToStartText = By.xpath("//div[contains(text(),'yet to start')]");
	private By catalognameField = By.xpath("//div[contains(text(),'checklearningpaths')]");
	private By documentLbl = By.xpath("//div[@title='Document_Check1']");
	private By searchLO = By.xpath("//input[@id='searchObject']");
	private By downloadBtn = By.xpath("//div[contains(text(),'Download')]");
	private By closeIcon = By.xpath("//i[@class='icon dripicons-cross icon30 font-size-30 ng-scope']/..");
	private By catalogTitle = By.xpath("//textarea[@id='catalogItemName']");
	private By continuebtn1 = By.xpath("//span[contains(text(),'Save')]/..");
	private By saveBtn = By.xpath("//button[contains(text(),'Save')]");
	private By priceclick = By.xpath("//span[contains(text(),'Price category')]");
	private By pricefreeclick = By.xpath("//ul[contains(@class,'list')]/li[contains(text(),'Free')]");
	private By plusbutton = By.xpath("//i[contains(@class,'icon pointer dripicons-plus icon-circle-fill font-size-30 expand_menu_list map_content padding-t-0 tp-50')]");
	private By asscontent = By.xpath("//span[contains(text(),'Document_Check1')]"); //div[contains(@class,'ng-scrollbars padding-b-20 ng-isolate-scope mCustomScrollbar _mCS_14')]/div/div[1]/div/div[1]/div[contains(@class,'whole')]/div[contains(@class,'col-lg-12 col-md-12 col-xs-12 col-sm-12 border-tb margin-r-10 padding-tb-15 padding-lr-0')]
	private By deletecoursebtn = By.xpath("//span[contains(text(),'CatalogItemWithDocument')]/../../../*/div[3]/i");
	private By deletecourseokbtn = By.xpath("//button/span[contains(text(),'OK')]");
	private By closebtn = By.xpath("//button[contains(@class,'close padding-t-20')]/i ");
	private By catalogSearch = By.xpath("//input[@id='quoteSearch']");
	private By validityDays = By.xpath("//input[@name='validity']");
	private By duedateInput = By.xpath("//div[contains(text(),'DAY(S)')]/../div[1]/*/input");
	private By noItemMsg = By.xpath("//*[contains(text(),' No items found')]");
	private By loTab = By.xpath("//span[contains(text(),'Learning Objects')]");
	private By deleteLO = By.xpath("//i[@data-template-url1='editObj.html']/../i[2]");
	private By downloadableField = By.xpath("//label[@id=\"downloading_content\"]");
	private By downloadtext = By.xpath("//h6[contains(text(),' If checked, a DOWNLOAD button will appear for this content in the player.')]");
	private By linkField = By.xpath("//label[contains(text(),'Link')]");
	private By documentURL = By.xpath("//label[contains(text(),'Document URL')]/../input");
	private By titleError = By.xpath("//div[contains(text(),'Title should not be empty')]");
	private By categoryError =  By.xpath("//*[contains(text(),'Category should not be empty')]");
	private By languageError =  By.xpath("//*[contains(text(),'Language should not be empty')]");
	private By descError = By.xpath("//*[contains(text(),'Description should not be empty')]");
	private By itemcodeError = By.xpath("//*[contains(text(),'Item Code should not be empty')]");
	private By pagesError = By.xpath("//*[contains(text(),'No. of pages should not be empty')]");
	private By durationError = By.xpath("//div[contains(text(),'Duration should not be empty')]");
	private By invalidURLError = By.xpath("//*[contains(text(),'Document Url incorrect')]");
	private By closeLOBtn = By.xpath("//body/div[@id='addObject']/div[1]/div[1]/div[1]/button[1]/i[1]");//i[@class='icon  text-right font-size-35']
	private By deleteIcon = By.xpath("//i[@class='icon text-left font-size-16 bold cursor-pointer gray-85 padding-l-0 ng-scope']");
	private By editIcon = By.xpath("//i[@data-template-url1='editObj.html']");
	private By testcountFile = By.xpath("//span[contains(text(),'TestReport.xls')]");
	private By changeFileBtn = By.xpath("//label[contains(text(),'Change')]");
	private By updateBtn = By.xpath("//button[contains(text(),'Update')]");
	private By noBtn = By.xpath("//button/span[contains(text(),'No')]"); 
	private By noUpdateBtn = By.xpath("//button[contains(text(),'No')]");
	private By scormzipFile = By.xpath("//span[contains(text(),'Scorm2004videofile.zip')]");
	private By continuebtn2 = By.xpath("//span[contains(text(),'Continue')]");
	private By editCloseBtn = By.xpath("//button[@class='close']/i");
	private By previewTitle = By.xpath("//h2[contains(text(),'Document_Check1')]");
	private By previewDownloadBtn = By.xpath("//div[contains(text(),'Download')]");
	private By searchCatalog = By.xpath("//input[@id='searchCatalog']");
	private String filename1="C:\\sample file\\Scorm2004videofile.zip";  //C:\\sample file\\Scorm2004videofile.zip /Users/origin/Downloads/Scorm2004videofile.zip
	//private String filename2 ="C:\\sample-large-zip-file";
	private String filename3 = "C:\\sample file\\Auto_Document.pdf"; //C:\\Auto_Document.pdf  /Users/origin/Downloads/sample.pdf
	private String filename4 = "C:\\sample file\\TestReport.xls"; //C:\\testcase count.xlsx /Users/origin/Downloads/TestReport.xls
	private By backtoCatalogBtn = By.xpath("//button[contains(text(),'Back to Catalog Items')]");
	public DocumentValidationPage(WebDriver driver) {
		super(driver);
		page=new CatalogItemPage(driver);
	}

	/*
	 *function: addLearningObjectBtn()
	 * cause: Navigate to add learning object button 
	 */
	public void addLearningObjectBtn() {
		page.clickManageContents();
		wait(5);
		click(addLearningObjectBtn);
	}
	/*
	 *function: emptyFieldValidation()
	 * cause: Validation for empty fields in document
	 */
	public void emptyFieldValidation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
		click(documentBtn);
		wait(5);
		click(lblSave);
		verifyText("Title should not be empty",titleError);
		wait(2);
		if(elementExist(languageError)) {
		verifyText("Language should not be empty",languageError);
		}
		verifyText("Category should not be empty",categoryError);
		scrollToElement(durationError);
		verifyText("No. of pages should not be empty",pagesError);
		verifyText("Description should not be empty",descError);
		verifyText("Item Code should not be empty",itemcodeError);
		verifyText("Duration should not be empty",durationError);
		wait(2);
		click(closeLOBtn);
	}
	/*
	 *function: documentTillLanguageSelect()
	 * cause: Document creation - Till Language selection 
	 */
	public void documentTillLanguageSelect() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
		click(documentBtn);
		wait(5);
		enterData("Document_Check1",documentInputField);
		wait(2);
		click(selectCategory);
		wait(2);
		click(lblGeneral);
		wait(2);
		if(elementExist(selectLanguage)) {
		click(selectLanguage);
		wait(2);
		click(lblEnglish);
		wait(2);
		}
	}
	/*
	 *function: documentTillDuration()
	 * cause: Document Creation - Till Duration
	 */
	public void documentTillDuration() {
		/*WebElement element = driver.findElement(lblpages); Actions
		actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		wait(2);*/
		wait(2);
		elementExist(lblpages);
		scrollToElement(lblpages);
		wait(2);
		enterData("abc",lblDescription);
		wait(2);
		enterData("Document123",lblItemCode);
		wait(2);
		enterData("00",lblHH);
		wait(2);
		enterData("50",lblMM);
		wait(2);
		enterData("2",lblpages);
		wait(5);


	}
	/*
	 *function: documentCreation()
	 * cause: Creation of document and deleting it
	 */
	public void documentCreation() {
		documentTillLanguageSelect();
		uploadBrowseFile(filename1);
		documentTillDuration();
		click(lblSave);
		wait(2);
		click(closeLOBtn);
		wait(2);
		documentDelete();
	}
	/*
	 *function: documentDelete()
	 * cause: Delete the created document
	 */
	public void documentDelete() {
		enterData("Document_Check1",searchLO);
		wait(10);
		click(deleteIcon);
		wait(2);
		click(deletecourseokbtn);
		wait(2);

	}
	/*
	 *function: linkFieldsCheck()
	 * cause: Check and validate  video creation with link 
	 */
	public void documentCreationWithPDF() {
		documentTillLanguageSelect();
		uploadBrowseFile(filename3);
		documentTillDuration();
		elementExist(downloadableField);
		verifyText("If checked, a DOWNLOAD button will appear for this content in the player.",downloadtext);
		click(lblSave);
		wait(2);
		click(closeLOBtn);
		wait(2);
		documentDelete();
	}
	/*
	 *function: linkFieldsCheck()
	 * cause: Check and validate  video creation with link 
	 */
	public void documentWithLinkValidation() {
		wait(5);
		addLearningObjectBtn();
		wait(5);
		click(documentBtn);
		wait(5);
		enterData("Document_Check",documentInputField);
		wait(2);
		elementExist(linkField);
		click(linkField);
		elementExist(documentURL);
		wait(2);
		enterData("adafdsfs",documentURL);
		click(lblSave);
		verifyText("Document Url incorrect",invalidURLError);
		click(closeLOBtn);
	}
	/*
	 *function: linkFieldsCheck()
	 * cause: Check and validate  video creation with link 
	 */
	public void uploadBrowseFile(String filename) {
		wait(2);
		driver.manage().window().maximize();
		driver.findElement(uploadScromBtn).sendKeys(filename);
		wait(10);
	}
	/*
	 *function: editDocument()
	 * cause: Check for editing the document with different package 
	 */

	public void editDocument() {
		enterData("Document_Check1",searchLO);
		wait(10);
		click(editIcon);
		wait(5);
		verifyText("TestReport.xls",testcountFile);
		wait(2);
		uploadBrowseFile(filename1);
		wait(2);
		click(updateBtn);
		wait(5);
		click(noBtn);
		wait(10);
		click(noUpdateBtn);
		wait(7);
		enterData("Document_Check1",searchLO);
		wait(2);
		click(editIcon);
		verifyText("ScormTestvideofile.zip",scormzipFile);
		if(verifyText("ScormTestvideofile.zip",scormzipFile)==true) {
			print("The document is updated properly");
		}
		click(editCloseBtn);
		wait(2);
	}
	/*
	 *function: previewDocument()
	 * cause: Check and validate  video creation with link 
	 */
	public void previewDocument() {
		wait(2);
		enterData("Document_Check1",searchLO);
		wait(2);
		click(documentLbl);
		wait(2);
		verifyText("Document_Check1",previewTitle);
		verifyText("Download",previewDownloadBtn);
		isClickable(previewDownloadBtn);
		wait(2);
		click(closeIcon);
		wait(2);
	}
	/*
	 *function: linkFieldsCheck()
	 * cause: Check and validate  video creation with link 
	 */
	public void contentReportCheck() {
		click(btnReports);
		wait(5);
		click(lblHighlight);
		enterData("Bundle for Category check",lblCatalogName);
		wait(10);
		click(lblHighlight);
		wait(10);
		click(btnGenerate1);
		wait(5);
		if(elementExist(lblGroupNameContent)) {
			String lblGroupNameContent1=getText(lblGroupNameContent);
			verifyText(lblGroupNameContent1,lblGroupNameContent);
			verifyText("item name",itemNameText);
			verifyText("No. Of Users Subscribed",subscribeText);
			verifyText("Completed",completedText);
			verifyText("In progress",inprogressText);
			verifyText("Yet to Start",yetToStartText);
			verifyText("Learning Course Check",catalognameField);
		}
	}
	/*
	 *function: linkFieldsCheck()
	 * cause: Check and validate  video creation with link 
	 */
	public void userReportCheck() {
		click(btnReports);
		wait(5);
		click(lblUsers);
		wait(5);
		click(lblUsername);
		wait(5);
		enterData("automation_directuser",lblUsername);
		wait(5);
		click(lblHighlight);

		verifyText("item name",itemNameText);
		verifyText("No. Of Users Subscribed",subscribeText);
		verifyText("Completed",completedText);
		verifyText("In progress",inprogressText);
		verifyText("Yet to Start",yetToStartText);
		verifyText("Learning Course Check",catalognameField);
	}
	/*
	 *function: linkFieldsCheck()
	 * cause: Check and validate  video creation with link 
	 */

	public void mapCatalogItem() {
		page.clickCatalogitem();
		page.addBundle();
		click(catalogTitle);
		enterData("CatalogItemWithDocument", catalogTitle);
		wait(5); 
		page.catalogCreation();
		enterData("10",duedateInput);
		click(validityDays);
		enterData("15",validityDays);
		wait(5);
		scrollToElement(priceclick);
		wait(2);
		click(priceclick);
		wait(5);
		click(pricefreeclick);
		wait(5);
		click(plusbutton);
		wait(5);
		enterData("Document_Check1",catalogSearch);
		click(asscontent);
		wait(5);
		//commenting as creation of catalog item is not required
		if(elementExist(continuebtn2)) {
			click(continuebtn2);
			wait(2);
			click(saveBtn);
			
		}
		else {
		click(continuebtn1);
		}
		wait(10);
		elementExist(backtoCatalogBtn);
		wait(10);
		click(closebtn);
		wait(5);
		enterData("CatalogItemWithDocument",searchCatalog);
		wait(5);
		click(deletecoursebtn);
		wait(5);
		click(deletecourseokbtn);
	}
	/*
	 *function: linkFieldsCheck()
	 * cause: Check and validate  video creation with link 
	 */
	public void deleteDocumentAfterMap() {
		click(loTab);
		wait(5);
		enterData("Document_Check1",searchLO);
		wait(5);
		click(deleteIcon);
		wait(2);
		click(deletecourseokbtn);
		wait(2);

	}
	/*
	 *function: podcastValidation()
	 * cause: Check and validate  podcast catalog item
	 */
	public void podcastValidation() {
		page.clickCatalogitem();
		page.addPodcast();
		click(catalogTitle);
		enterData("CatalogItemWithDocument", catalogTitle);
		wait(5); 
		page.catalogCreation();
		wait(5);
		click(plusbutton);
		wait(5);
		enterData("Document_Check1",catalogSearch);
		elementExist(noItemMsg);
		verifyText(" No items found",noItemMsg);
		click(closebtn);
		wait(2);
		
	}

	/*
	 *function: documentCreationWithXLFile()
	 * cause: Check and validate  document (xl file upload) 
	 */
	public void documentCreationWithXLFile() {
		documentTillLanguageSelect();
		uploadBrowseFile(filename4);
		documentTillDuration();
		//elementExist(downloadableField);
		//verifyText("If checked, a DOWNLOAD button will appear for this content in the player.",downloadtext);
		wait(3);
		click(lblSave);
		wait(2);
		click(closeLOBtn);	
		wait(2);
		//documentDelete();

	}

}
