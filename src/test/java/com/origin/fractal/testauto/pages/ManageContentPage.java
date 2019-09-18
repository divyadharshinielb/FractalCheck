package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
}
