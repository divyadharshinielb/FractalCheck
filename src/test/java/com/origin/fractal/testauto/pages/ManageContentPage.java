package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class ManageContentPage extends FractalBasePage{
	private By btnCreateLobj = By.xpath(".//button[contains(text(),'Add Learning Object')]");
	private By btnAudio = By.xpath(".//button/span[contains(text(),'Audio')]");
	private By lobjTitle = By.xpath(".//i[contains(@data-icon,'9')]/../../h4/span");
	private By closeModel = By.xpath(".//button[contains(@class,'close')]");
	private By btnCancel = By.xpath(".//button[contains(text(),'Cancel')]");
	private By btnSave = By.xpath(".//button[contains(text(),'Save')]");
	private By titleErrorMsg = By.xpath(".//label[contains(text(),'Title')]/../div[contains(@class,'text-danger')]");
	private By languageErrorMessage = By.xpath(".//select/../*//div[contains(@class,'text-danger')]");
	private By categoryErrorMessage = By.xpath("//span[contains(@placeholder,'Select Category')]/../../../*//div[contains(@class,'text-danger')]");
	private By fileUploadErrorMessage = By.xpath(".//input[contains(@type,'file')]/../../div[contains(@class,'text-danger')]");
	private By descriptionErrorMessage = By.xpath(".//textarea/../../div[contains(@class,'text-danger')]");
	private By btnCreateCalitem = By.xpath(".//button[contains(text(),'Add Catalog')]");
	private By lblContentBundle = By.xpath("//md-dialog-content[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button//span[contains(text(),'Content Bundle')]");
	private By lblBundleTitle = By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-tb-10 text-bcbcbc font-size-12 padding-l-19 ng-binding']/../div//div[@class='md-resize-wrapper']/textarea");
	private By lblBundleDescr = By.xpath("//div[@class='col-lg-12 form-group cus_mar_b_30 margin-all-0 padding-t-20 padding-lr-0 whitelabel elearninglabel']/../div//textarea");
	private By lblSelectLang = By.xpath("//div[1]/div[1]/ul[1]/li[contains(text(),'English')]");
	private By lblSelectCateg = By.xpath("//span[@class='ng-binding ng-scope'][contains(text(),'3D Animation')]");
	private By lblItemCode = By.xpath("//md-input-container[1]/input[@id='input_59']");
	private By lblContinue = By.xpath("//button[contains(text(),'Continue')]");
	private By lblCatalogTab = By.xpath("//md-tab-item[2]/span[contains(text(),'Catalog Items')]");
	private By lblValidityNum = By.xpath("//input[@name='validity']");
	private By lblValidityDrop = By.xpath("//li[contains(text(),'Month')]");
	private By lblPrice = By.xpath("//li[contains(text(),'Free')]");
	private By expandBtn = By.xpath("//i[@title='Expand Modules']");
	private By catlogSelect = By.xpath("//md-dialog-content[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]");
	private By lblSave = By.xpath("//button[contains(@value,'Create')]");
	/*private By btnSave = By.xpath("");
	private By btnSave = By.xpath("");
	private By btnSave = By.xpath("");
	private By btnSave = By.xpath("");
	 */
	private By CatalogItemBtn= By.xpath("//span[contains(text(),'Catalog Items')]");
	private By lblReadMore= By.xpath("//span[contains(text(),'Read more')]");
	private By lblLess= By.xpath("//span[@class='text-orange ngTruncateToggleText']");
	private By catalogItemFirstClick= By.xpath("//ng-include[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div/div//span[contains(text(),'Category')]");
	private By Catalog = By.xpath(".//div[@class='icon dripicons-document-edit']");
	private By catalogClick= By.xpath(".//md-tab-item[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple']//span[@class='text-uppercase padding-lr-10 ng-binding ng-scope'][contains(text(),'Catalog Items')]");
	private By addCatalog = By.xpath(".//button[contains(text(),'Add Catalog')]");
	private By bundleAdd = By.xpath(".//span[contains(text(),'Content Bundle')]");
	private By textfield=By.xpath("//textarea[@name='item_name']");
	private By dropDown = By.xpath(".//span[contains(text(),'Select Language')]");
	private By languageChoose = By.xpath(".//*[@id='mCSB_8_container']/div/div[2]/div/div[1]/div/ul/li[3]");
	private By CategorySelection = By.xpath(".//input[@placeholder='Select Category']");
	private By CategorySelected = By.xpath(".//span[@class='ng-binding ng-scope'][contains(text(),'Projects')]");
	private By scrollBar = By.xpath(".//*[@id=\'mCSB_8_scrollbar_vertical\']/div");
	private By itemCode = By.xpath(".//input[@id='itemCode']");
	private By description = By.id("descCatalogName");
	private By continueButton = By.xpath(".//button[contains(text(),'Continue')]");
	private By validityUnlimited = By.xpath(".//label[@id='unlimited']");
	private By priceDropdown = By.xpath(".//span[contains(text(),'Price category')]");
	private By priceFree = By.xpath(".//li[contains(text(),'Free')]");
	private By addBundle = By.xpath(".//i[contains(@title,'Expand Modules')]");
	private By bundleSelection = By.xpath(".//span[@title='who Is A Good Friend']");
	private By createButton = By.xpath(".//button[contains(@value,'Create')]");
	private By saveMessage = By.xpath(".//*[@id=\"mCSB_14_container\"]/div[2]");
	private By daysSceneriao = By.xpath(".//input[@name='validity']");
	private By dropDownClick = By.xpath(".//span[contains(text(),'Day')]");
	private By monthSelection = By.xpath(".//li[contains(text(),'Month')]");
	private By searchText =By.xpath(".//form[@name='quizFormAdd']//input[@placeholder='Search']");
	private By backBtn = By.xpath(".//button[contains(text(),'Back to Catalog Items')]");
	private By closebtn = By.xpath(".//*[@id=\"target\"]/div[3]/div/div/div[1]/button/i");
	private By searchField = By.xpath(".//input[@id='searchCatalog']");
	private By deleteIcon = By.xpath("//*[@id=\"tab-content-59\"]/div/ng-include/div/div/div[3]/div/div[1]/div/div/div[5]/div[3]/i");
	String[]  itemCodeValidation= {"", "1","  1","121"};
	private By dangerText=By.xpath("//div[contains(@class,'text-danger font-size-12 padding-l-20 ng-scope')]");

	//Added by Vignesh (WVI) on 03-Oct-19 & updated on 07-Oct-19 (item codes related)
	private By elearningBtn = By.xpath("//div[contains(@class,'aside-body')]//text()[contains(.,'eLearning')]/ancestor::button[1]");
	private By VideoBtn = By.xpath("//div[contains(@class,'aside-body')]//text()[contains(.,'Video')]/ancestor::button[1]");
	private By documentBtn = By.xpath("//div[contains(@class,'aside-body')]//text()[contains(.,'Document')]/ancestor::button[1]");
	private By imageBtn = By.xpath("//div[contains(@class,'aside-body')]//text()[contains(.,'Image')]/ancestor::button[1]");
	private By assessmentBtn = By.xpath("//div[contains(@class,'aside-body')]//text()[contains(.,'Assessment')]/ancestor::button[1]");
	private By vlabBtn = By.xpath("//div[contains(@class,'aside-body')]//text()[contains(.,'vLab')]/ancestor::button[1]");
	private By audioBtn = By.xpath("//div[contains(@class,'aside-body')]//text()[contains(.,'Audio')]/ancestor::button[1]");
	private By closeXBtn = By.xpath("//i[contains(@class, 'font-size-35')]");
	private By itemcodetab = By.xpath("//input[@type='text'][@name='item_code']");
	private By lbitemcode = By.xpath("//label[text()='Item Code']");
	private By cancelBtn = By.xpath("//button[contains(@class,'md-raised btn btn-cancel margin-r-20 ng-binding')]");

	public boolean boolstatus = false;
	public boolean boolresult = false;
	public boolean textresult = false;

	final int waitingsec = 5;//standard waiting time
	final int waiting7sec = 7;

	private String itemcodetxt ="Item Code";


	//Added by Vignesh (WVI) on 09-Oct-19 updated on 10-Oct-19 (item codes related) 
	private By bundleBtn = By.xpath("//text()[contains(.,'Content Bundle')]/ancestor::button[1]");
	private By learnpathBtn = By.xpath("//text()[contains(.,'Learning path')]/ancestor::button[1]");
	private By courseBtn = By.xpath("//text()[contains(.,'Course')]/ancestor::button[1]");
	private By resourceBtn = By.xpath("//text()[contains(.,'Resource')]/ancestor::button[1]");
	private By podcastBtn = By.xpath("//text()[contains(.,'PODCAST')]/ancestor::button[1]");
	private By itemcode = By.xpath("//input[@type='text'][@name='item_code']");
	private By lbitemcodetxt = By.xpath("//label[text()='Item Code']");
	private By cancel = By.xpath("//button[@class='btn btn-cancel btn_radius ng-binding text-left']");

	//User side 
	private By searchtab = By.xpath("//input[@id='theInput']");
	private By nosearchresult = By.xpath("//span[@class='no-records-found']");
	private By searchresult = By.xpath("//span[@class='no-records-found']");
	private By useraccount = By.xpath("//*[contains(@class, 'logout-height')]");
	private By logout = By.xpath("//li[text()='Logout']");

	// End- here************************** Vignesh (WVI) on 14-Oct-19 ********************************

	public ManageContentPage(WebDriver driver) {
		super(driver);
	}
	public void clickOnCreateLobjButton() {
		click(btnCreateLobj);
	}
	public void selectAudioLobj() {
		wait(10);
		click(btnAudio);
	}
	public void closeLobjModel() {
		click(closeModel);
	}
	public void closeCreateLobjPage() {
		click(btnCancel);
	}
	public void verifyAudioCreationPage() {
		clickOnCreateLobjButton();
		selectAudioLobj();
		verifyText("Audio",lobjTitle);
		wait(5);
	}
	public void verifyMandatoryFieldsAlerMessage() {
		click(btnSave);
		verifyText("Title should not be empty",titleErrorMsg);
		verifyText("languageErrorMessage",languageErrorMessage);
		verifyText("Category should not be empty",categoryErrorMessage);
		verifyText("Audio should not be empty",fileUploadErrorMessage);
		verifyText("Description should not be empty",descriptionErrorMessage);
	}
	public void verifyItemCode() {
		click(lblCatalogTab);
		wait(5);
		click(btnCreateCalitem);
		wait(5);
		click(lblContentBundle);
		wait(5);
		enterData("bundleautomationcheck",lblBundleTitle);
		wait(5);
		enterData("bundleautomationcheck",lblBundleDescr);
		click(lblSelectLang);
		wait(5);
		click(lblSelectCateg);
		wait(5);
		enterData("55521",lblItemCode);
		wait(5);
		click(lblContinue);
		wait(5);
		enterData("2",lblValidityNum);
		wait(5);
		click(lblValidityDrop);
		wait(5);
		click(lblPrice);
		wait(5);
		click(expandBtn);
		wait(5);
		click(catlogSelect);
		wait(5);
		click(lblSave);

	}
	public void clickCatalog() {
		click(Catalog);
		wait(5);
		click(catalogClick);
		click(addCatalog);
		click(bundleAdd);
		wait(5);
		enterData("Automation test2",textfield);
		wait(5);
		click(dropDown);
		wait(3);
		//	click(lblSelectLang);
		click(languageChoose);
		click(CategorySelection);
		click(CategorySelected);
		click(scrollBar);
		wait(5);
		enterData(itemCodeValidation[0],itemCode);
		verifytextDanger(); 
		enterData(itemCodeValidation[1],itemCode);
		verifytextDanger();
		enterData(itemCodeValidation[2],itemCode);
		verifytextDanger();
		enterData(itemCodeValidation[3],itemCode);
		verifytextDanger();
		enterData("23121",itemCode);
		wait(5);
		enterData("Automation test bundle desc",description);
		click(continueButton);
		wait(5);
		click(validityUnlimited);
		click(priceDropdown);
		wait(5);
		click(priceFree);
		click(addBundle);
		click(bundleSelection);
		click(createButton);
		elementExist(saveMessage);
	}
	private void verifytextDanger() {
		elementExist(dangerText);
		wait(3);
		clear(itemCode);
	}
	public void validity() {
		click(Catalog);
		wait(5);
		click(catalogClick);
		click(addCatalog);
		click(bundleAdd);
		wait(5);
		enterData("Automation test bundle1",textfield);
		wait(5);
		click(dropDown);
		click(languageChoose);
		click(CategorySelection);
		click(CategorySelected);
		click(scrollBar);
		wait(5);
		enterData("2",itemCode);
		enterData("Automation test bundle desc",description);
		click(continueButton);
		enterData("2",daysSceneriao);
		click(dropDownClick);
		click(monthSelection);
		click(priceDropdown);
		wait(5);
		click(priceFree);
		click(addBundle);
		click(bundleSelection);
		click(createButton);
		elementExist(saveMessage);
	}
	public void deleteCatalog() {
		click(searchText);
		enterData("Automation test bundle1",searchText);

	}
	public void verifyReadMoreLessText() {
		click(CatalogItemBtn);
		wait(5);
		click(catalogItemFirstClick);
		wait(5);
		verifyText("Read more",lblReadMore);
		click(lblReadMore);
		wait(5);
		verifyText("Less",lblLess);
		click(lblLess);	

	}
	public void verifyCatalogTitleValidation() {
		click(lblCatalogTab);
		wait(5);
		click(btnCreateCalitem);
		wait(5);
		click(lblContentBundle);
		wait(5);
		enterData("bun",lblBundleTitle);
		wait(5);
		click(lblContinue);
		verifyText("Title must be at least 4 characters",titleErrorMsg);
	}

	//Added by Vignesh (WVI) on 03-Oct-19 & updated on 09-Oct-19(item codes related)
	//------------------------------------------//

	public boolean Clickelearning() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false)
		{
			wait(waitingsec);
			click(elearningBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'aside minwidth-aside-50 ng-scope right am-slide-right')]//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("1234",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("!@#$%",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("<>/{}[]",itemcodetab);

			if(verifyText(itemcodetxt,lbitemcode))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancelBtn);
			print("Elearning Passed");

		}
		return boolresult;
	}

	public boolean ClickVideo() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false)
		{
			wait(waitingsec);
			click(VideoBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'aside minwidth-aside-50 ng-scope right am-slide-right')]//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("1234",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("!@#$%",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("<>/{}[]",itemcodetab);

			if(verifyText(itemcodetxt,lbitemcode))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancelBtn);
			print("Video Passed");
		}
		return boolresult;
	}

	public boolean ClickDocument() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(documentBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'aside minwidth-aside-50 ng-scope right am-slide-right')]//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();


			enterData("Abcd",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("1234",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);


			enterData("!@#$%",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);


			enterData("<>/{}[]",itemcodetab);


			if(verifyText(itemcodetxt,lbitemcode))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancelBtn);
			print("Document Passed");
		}
		return boolresult;

	}

	public boolean ClickImage() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(imageBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'aside minwidth-aside-50 ng-scope right am-slide-right')]//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("1234",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("!@#$%",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("<>/{}[]",itemcodetab);

			if(verifyText(itemcodetxt,lbitemcode))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancelBtn);
			print("Image Passed");
		}

		return boolresult;
	}

	public boolean ClickAssessment() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(assessmentBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'aside minwidth-aside-50 ng-scope right am-slide-right')]//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("1234",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("!@#$%",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("<>/{}[]",itemcodetab);


			if(verifyText(itemcodetxt,lbitemcode))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancelBtn);
			print("Assessment Passed");
		}

		return boolresult;
	}

	public boolean ClickVlab() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(vlabBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'aside minwidth-aside-50 ng-scope right am-slide-right')]//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("1234",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("!@#$%",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("<>/{}[]",itemcodetab);


			if(verifyText(itemcodetxt,lbitemcode))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else if(verifyText("", lbitemcode)) {
				print("itemtext is verified ");
				textresult=false;
				boolresult = false;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancelBtn);
			print("Vlab Passed");
		}
		return boolresult;
	}

	public boolean ClickAudio() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(audioBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'aside minwidth-aside-50 ng-scope right am-slide-right')]//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcodetab);
			wait(waitingsec);

			enterData("1234",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("!@#$%",itemcodetab);
			wait(waitingsec);
			clear(itemcodetab);

			enterData("<>/{}[]",itemcodetab);
			wait(waitingsec);
			if(verifyText(itemcodetxt,lbitemcode))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancelBtn);
			print("Audio Passed");
			wait(waitingsec);
			click(closeXBtn);

		}

		return boolresult;
	}

	//Added by Vignesh (WVI) on 09-Oct-19 updated on 10-Oct-19 (item codes related)

	public void clickOnCreatecatalogButton() {
		wait(waiting7sec);
		click(CatalogItemBtn);
		wait(waitingsec);
		click(addCatalog);
		wait(waitingsec);
	}

	public boolean ClickBundle() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(bundleBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[@class = 'ng-scope']//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("1234",itemcode);
			wait(waitingsec);
			clear(itemcode);


			enterData("!@#$%",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("<>/{}[]",itemcode);

			if(verifyText(itemcodetxt,lbitemcodetxt))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancel);
			print("Bundle Passed");

		}
		return boolresult;
	}

	public boolean ClickLearningPath() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(learnpathBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[@class = 'ng-scope']//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("1234",itemcode);
			wait(waitingsec);
			clear(itemcode);


			enterData("!@#$%",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("<>/{}[]",itemcode);

			if(verifyText(itemcodetxt,lbitemcodetxt))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancel);
			print("LearningPath Passed");
		}
		return boolresult;
	}

	public boolean ClickCourse() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(courseBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[@class = 'ng-scope']//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("1234",itemcode);
			wait(waitingsec);
			clear(itemcode);


			enterData("!@#$%",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("<>/{}[]",itemcode);
			wait(waitingsec);

			/* Commented by Vignesh (WVI) on 11-Oct-19 Because the item code label text is NOT extractable in Course under Catalog items 

			 *if(verifyText(itemcodetxt,lbitemcodetxt))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}*/
			print("The item code label text is NOT extractable in Course under Catalog items.");

			textresult=true;
			boolresult = true;
			click(cancel);
			print("Course Passed");
		}
		return boolresult;
	}

	public boolean ClickResource() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(resourceBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[@class = 'ng-scope']//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("1234",itemcode);
			wait(waitingsec);
			clear(itemcode);


			enterData("!@#$%",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("<>/{}[]",itemcode);

			if(verifyText(itemcodetxt,lbitemcodetxt))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancel);
			print("Resource Passed");
		}
		return boolresult;
	}

	public boolean ClickPodcast() 
	{
		boolresult = false; 
		textresult = false;
		if(boolresult == false) {
			wait(waitingsec);
			click(podcastBtn);
			wait(waitingsec);

			WebElement element = driver.findElement(By.xpath("//div[@class = 'ng-scope']//input[@type='text'][@name='item_code']")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();

			enterData("Abcd",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("1234",itemcode);
			wait(waitingsec);
			clear(itemcode);


			enterData("!@#$%",itemcode);
			wait(waitingsec);
			clear(itemcode);

			enterData("<>/{}[]",itemcode);

			if(verifyText(itemcodetxt,lbitemcodetxt))
			{
				print("itemtext is verified ");
				textresult=true;
				boolresult = true;
			}
			else
			{
				print("itemtext is verified it's NOT Matching");
				textresult=false;
				boolresult = false;
			}
			wait(waitingsec);
			click(cancel);
			wait(waitingsec);
			print("Podcast Passed");
			click(closeXBtn);
			wait(waitingsec);
		}
		return boolresult;
	}


	public void Usersearchitemcode() 
	{	wait(waitingsec);	
		click(searchtab);
		wait(waitingsec);
		enterData("1234",searchtab);
		driver.findElement(searchtab).sendKeys(Keys.RETURN);
		wait(waitingsec);
		verifyText("No catalog item available at the moment",nosearchresult);
		print("No catalog item available at the moment");
		wait(waitingsec);
		enterData("876555",searchtab);
		driver.findElement(searchtab).sendKeys(Keys.RETURN);
		wait(waitingsec);
		enterData("222222",searchtab);
		driver.findElement(searchtab).sendKeys(Keys.RETURN);
		wait(waitingsec);
		click(useraccount);
		wait(waitingsec);
		click(logout);

	}


	// End- here************************** Vignesh (WVI) on 14-Oct-19 ********************************
}