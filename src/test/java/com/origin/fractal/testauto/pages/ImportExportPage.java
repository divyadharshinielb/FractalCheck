package com.origin.fractal.testauto.pages;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

/*
 * File/class Name:Import/ExportPage.java
 * covers:This page covers all basic functions and Xpath of the import/Export page 
 * Name of developer:Mahesh G
 * Completed date:25/5/2020
 */

public class ImportExportPage extends FractalBasePage {
	private By ImportExporticon = By.xpath("//li[15]//a//div//img[@class='mCS_img_loaded']");
	private By ImportExportBreadcrumbLabel = By.xpath("//span[@class='crumb orange-link font-size-12 padding-t-2 breadcrumbActive ng-scope']");
	private By ImportExportTextLabel = By.xpath("//h1[@class='margin-all-0 font-weight-400']");
	private By lblUserTab = By.xpath("//md-tab-item[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple md-active']//span[@id='step-7']");
	private By selectUserDropDown = By.xpath("//div[@class='nice-select selectUser ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required']");//h4[contains(text(),'Select User')]/../select
	private By IndividualUser = By.xpath("//li[contains(text(),'Individual User')]");
	private By browseFileBtn = By.xpath("//label[contains(text(),'Browse file')]//input[@type='file']");
	private By settingsIcon =By.xpath("//div[@class='icon dripicons-gear']");
	private By groupCheckBox =By.xpath("//label[@id='completion_criteria_checkbox'][@for='groupId']");
	private By learningHistoryCheckBox =By.xpath("//label[@id='completion_criteria_checkbox'][@for='learningId']");
	private By selectGroup =By.xpath("//span[contains(text(),'Select Group')]");
	private By lblGeneral =By.xpath("//li[contains(text(),'General')]");
	private By lblcurrentGroup=By.xpath("	//span[contains(text(),'General')][@class='current']");
	private By lblWVI =By.xpath("//li[contains(text(),'WVI team')]");
	private By BusinessUser = By.xpath("//li[contains(text(),'Business User')]");
	private By selectAdminDropDown = By.xpath("//span[contains(text(),'Select Business Admin')]");
	private By BusinessAdmin1 = By.xpath("//li[contains(text(),'Origin Learning')]");
	//	private By BusinessAdmin2 = By.xpath("//li[contains(text(),'Select Business Admin')]");
	private By Importbtn = By.xpath("//div//button[contains(text(),'IMPORT')][@type='submit']");//button[contains(text(),'IMPORT')]
	private String directuserxpath1 ="//ng-include[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li";
	private String directuserxpath2 ="]";
	private String adminxpath1="//ng-include[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li";
	private String adminxpath2="]";
	private By errorformatText= By.xpath("//div[contains(text(),'Invalid file format!')]");
	private By uploadErrorText=By.xpath("//div[contains(text(),'The uploaded Excel file is not matching with the template Excel file. Please check.')]");
	private By clickHereLink=By.xpath("//a[contains(text(),'here')]");

	private String filename="C:\\\\sample file\\\\Sample.xlsx";
	private String filename2="C:\\sample file\\Sample2.xlsx";
	private String filename3="C:\\\\sample file\\\\LHwithNOTSTARTED.xlsx";
	private String filename4="C:\\sample file\\LHwithINPROGRESS.xlsx";
	private String filename5="C:\\sample file\\LHwithCOMPLETED.xlsx";
	private String filename6="C:\\sample file\\samplecsv.csv";
	private String filename7="C:\\sample file\\samplexls.xls";
	private String filename8="C:\\sample file\\customization_of_roles-Updated.png";
	private String filename9="C:\\sample file\\practicals-budgetory-control1.docx";
	private String filename10="C:\\sample file\\practicals-budgetory-control.pdf";
	private String filename11="C:\\\\sample file\\\\LHwithSpecialCharacters.xlsx";
	private String filename12="C:\\sample file\\LHwithInFirst&SecondSheet.xlsx";
	private String filename13="C:\\sample file\\LHwithInFirstSheet.xlsx";
	private String filename14="C:\\sample file\\LHwithInvalidCatTypNOTSTARTED.xlsx";
	private String filename15="C:\\sample file\\LHwithInvalidCatTypINPROGRESS.xlsx";
	private String filename16="C:\\sample file\\LHwithInvaidCatTypCOMPLETED.xlsx";
	private String filename17="C:\\sample file\\LHwithInvalidCatNameNOTSTARTED.xlsx";
	private String filename18="C:\\sample file\\LHwithInvalidCatNameINPROGRESS.xlsx";
	private String filename19="C:\\sample file\\LHwithInvalidCatNameCompleted.xlsx";
	public ImportExportPage(WebDriver driver) 
	{
		super(driver);
		pageName ="ImportExportPage"; 
	}
	/*
	 * Function name:GotoImportExport()
	 * Covers:It redirects to the import and export page
	 */
	public void GotoImportExport() 
	{
		wait(10);
		click(settingsIcon);
		wait(5);
		WebElement element = driver.findElement(ImportExporticon);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait(10);
		click(ImportExporticon);
		wait(10);
		print("In Admin side, Import and export is opened");
	}
	/*
	 * Function name:verifyImportExportText()
	 * Covers:It compares the Label texts
	 */
	public void verifyImportExportText() {
		verifyLabel("ImportExportLable",ImportExportBreadcrumbLabel);
		wait(5);
		print("Bread crumb text verified");
		verifyLabel("ImportExportLable",ImportExportTextLabel);
	}
	/*
	 * Function name:verifyUserTab
	 * Covers:It clicks and compares the usertab
	 */
	public void verifyUserTab() {
		verifyLabel("UserTabLabel",lblUserTab);
		wait(5);
		print("User label verified");
		click(lblUserTab);
		print("User tab clicked");
	}
	/*
	 * Function name:selectIndividualUser
	 * Covers:It clicks  the IndividualUser drop down
	 */
	public void selectIndividualUser() {
		wait(2);
		click(selectUserDropDown);
		wait(5);
		click(IndividualUser);
		wait(2);
	}
	/*
	 * Function name: uploadBrowseFile()
	 * Covers :It's a common function for upload browse file
	 */
	public void uploadBrowseFile(String filename) {
		wait(2);
		driver.manage().window().maximize();
		driver.findElement(browseFileBtn).sendKeys(filename);
		wait(10);
	}
	/*
	 * Function name:uploadBrowseFileSample()
	 * Covers:It uploads the browser file sample
	 */
	public void uploadBrowseFileSample() {
		uploadBrowseFile(filename);
	}
	/*
	 * Function name:selectIndividualUser()
	 * Covers:It uploads the browser file sample1
	 */
	public void uploadBrowseFileSample1() {
		uploadBrowseFile(filename2);
	}
	/*
	 * Function name:selectGroups()
	 * Covers:It covers both uncheck and check radio button and group selection
	 */
	public void selectGroups() {
		click(groupCheckBox);
		wait(2);
		click(groupCheckBox);
		wait(2);
		click(groupCheckBox);
		wait(10);
		click(selectGroup);
		wait(2);
		click(lblGeneral);
		wait(2);
		uploadBrowseFileSample();
		wait(2);

	}
	/*
	 * Function name:selectBusinessUser()
	 * Covers:It selects the business user drop down
	 */
	public void selectBusinessUser() {
		wait(2);
		click(selectUserDropDown);
		wait(5);
		click(BusinessUser);
		wait(2);
	}
	/*
	 * Function name:selectBusinessAdmin()
	 * Covers:It selects the business admin drop down and import the sample file
	 */
	public void SelectBusinessAdmin() {
		wait(5);
		click(selectAdminDropDown);
		wait(5);
		click(BusinessAdmin1);
		wait(2);
		uploadBrowseFileSample();
		wait(10);
		elementExist(Importbtn);
		//   click(Importbtn);
		print("clicked succesfully");
		wait(2);

	}
	/*
	 * Function name:moreBusinessUsers()
	 * Covers:It uploads more business users
	 */
	public void moreBusinessUsers() {
		wait(2);
		uploadBrowseFileSample1();
		wait(10);
		//	click(Importbtn);
		wait(2);
	}
	/*
	 * Function name:NotStartedStatus()
	 * Covers:It covers both learning history selection check box and upload not started status file
	 */
	public void NotStartedStatus() {
		selectIndividualUser();
		selectGroups();
		wait(2);
		click(learningHistoryCheckBox);
		wait(2);
		click(learningHistoryCheckBox);
		wait(2);
		click(learningHistoryCheckBox);
		uploadBrowseFile(filename3);
		//	click(Importbtn);
		wait(2);
	}
	/*
	 * Function name:InprogressStatus()
	 * Covers:It uploads inprogress status file
	 */
	public void InprogressStatus() {
		selectIndividualUser();
		uploadBrowseFile(filename4);
		//	click(Importbtn);
		wait(2);
	}
	/*
	 * Function name:CompletedStatus()
	 * Covers:It uploads completed status file
	 */
	public void CompletedStatus() {
		selectIndividualUser();
		uploadBrowseFile(filename5);
		//	click(Importbtn);
		wait(2);
	}
	/*
	 * Function name:ParticularGroupName()
	 * Covers:It covers particular group name selection
	 */
	public void ParticularGroupName() {
		wait(2);
		click(lblWVI);
	}
	/*
	 * Function name:allDirectUsers()
	 * Covers:It lists out all direct users
	 */
	public void allDirectUsers() {
		selectIndividualUser();
		wait(2);
		click(lblcurrentGroup);
		wait(2);
		Set<String> groupname=getCatalogTypesSet(directuserxpath1,directuserxpath2);
		System.out.println(groupname);
	}
	/*
	 * Function name:allBusinessUsers()
	 * Covers:It lists out all business users
	 */
	public void allBusinessUsers() {
		selectBusinessUser();
		wait(5);
		click(selectAdminDropDown);
		wait(5);
		click(BusinessAdmin1);
		wait(2);
		Set<String> groupname=getCatalogTypesSet(adminxpath1,adminxpath2);
		System.out.println(groupname);
	}
	/*
	 * Function name:uploadFilesValidation()
	 * Covers:It checks .csv,.xsl,.pdf,.docx files upload validations
	 */
	public void  uploadFilesValidation() {

		uploadBrowseFile(filename6);
		verifyLabel("InvalidError",errorformatText);
		print(".csv validated");
		uploadBrowseFile(filename7);
		verifyLabel("InvalidError",errorformatText);
		print(".xls validated");
		uploadBrowseFile(filename8);
		verifyLabel("InvalidError",errorformatText);
		print(".png validated");
		uploadBrowseFile(filename9);
		verifyLabel("InvalidError",errorformatText);
		print(".doc validated");
		uploadBrowseFile(filename10);
		verifyLabel("InvalidError",errorformatText);
		print(".pdf validated");
	}
	/*
	 * Function name:specialCharacters()
	 * Covers:It uploads special characters file
	 */
	public void specialCharacters(){
		uploadBrowseFile(filename11);
		verifyLabel("UploadError",uploadErrorText);
		print(".special character validated");
	}
	/*
	 * Function name:LHwithInFirstSecondSheet()
	 * Covers:It uploads LHwithInFirstSecondSheet file
	 */
	public void LHwithInFirstSecondSheet(){
		uploadBrowseFile(filename12);
		verifyLabel("UploadError",uploadErrorText);
		print("LHwithInFirst&SecondSheet validated");
	}
	/*
	 * Function name:LHwithInFirstSheet()
	 * Covers:It uploads LHwithInFirstSheet file
	 */
	public void LHwithInFirstSheet(){
		uploadBrowseFile(filename13);
		verifyLabel("UploadError",uploadErrorText);
		print("LHwithInFirstSheet validated");
	}
	/*
	 * Function name:clickHereLink()
	 * Covers:It checks clickHereLink is exists or not
	 */
	public void clickHereLink() {
		wait(2);
		elementExist(clickHereLink);
	}
	/*
	 * Function name:InvalidCatalogTypNotStarted()
	 * Covers:It uploads InvalidCatalogTypNotStarted file
	 */
	public void InvalidCatalogTypNotStarted(){
		uploadBrowseFile(filename14);
	}
	/*
	 * Function name:InvalidCatalogTypInprogress()
	 * Covers:It uploads InvalidCatalogTypInprogress file
	 */
	public void InvalidCatalogTypInprogress(){
		uploadBrowseFile(filename15);
	}
	/*
	 * Function name:InvalidCatalogTypCompleted()
	 * Covers:It uploads InvalidCatalogTypCompleted file
	 */
	public void InvalidCatalogTypCompleted(){
		uploadBrowseFile(filename16);
	}
	/*
	 * Function name:InvalidCatalogTypCompleted()
	 * Covers:It uploads InvalidCatalogNameNotStarted file
	 */
	public void InvalidCatalogNameNotStarted(){
		uploadBrowseFile(filename17);
	}
	/*
	 * Function name:InvalidCatalogTypCompleted()
	 * Covers:It uploads InvalidCatalogNameInprogress file
	 */
	public void InvalidCatalogNameInprogress(){
		uploadBrowseFile(filename18);
	}
	/*
	 * Function name:InvalidCatalogTypCompleted()
	 * Covers:It uploads InvalidCatalogNameCompleted file
	 */
	public void InvalidCatalogNameCompleted(){
		uploadBrowseFile(filename19);

	}
}
