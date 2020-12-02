


package com.origin.fractal.testauto.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
/* File Name: CatalogItemPage.java
 * Purpose: Check for due date field in Catalog items -FR1-2770
 * Number of Testcases: 7
 * Created by: DivyaDharshini
 * Created on: 17-July-2020
 */

public class CatalogItemPage extends FractalBasePage {
	//private By itemcodeerr = By.xpath("//div[contains(text(),'Enter Atleast 2 Alphanumeric Characters')]");
	private By btnMenu = By.xpath("//ng-include[@id='header1']/*//div[contains(@title,'Menu')]");
	private By manageContents = By.xpath("//span[contains(text(),'Manage Content')]");
	private By clkcatalogitem = By.xpath("//span[contains(text(),'Catalog Items')]");
	private By addcatalogbtn = By.xpath("//button[contains(text(),'Add Catalog')]");
	private By bundlebtn = By.xpath("//button/*/span[contains(text(),'Content Bundle')]");
	private By learpathbtn = By.xpath("//button/*/span[contains(text(),'Learning path')]");
	private By coursebtn = By.xpath("//button/*/span[contains(text(),'Course')]");
	private By resourcebtn = By.xpath("//button/*/span[contains(text(),'Resource')]");
	private By podcastbtn  = By.xpath("//button/*/span[contains(text(),'PODCAST')]");
	private By continuebtn = By.xpath("//button[contains(text(),'Continue')]");
	private By continuebtn2 = By.xpath("//span[contains(text(),'Continue')]");
	private By continuebtn1 = By.xpath("//span[contains(text(),'Save')]/..");
	private By catalogTitle = By.xpath("//textarea[@id='catalogItemName']");//label[contains(text(),'Bundle Title')]/../div/textarea
	private By selectlanguage = By.xpath("//span[contains(text(),'Select Language')]");
	private By languageEnglish = By.xpath("//span[contains(text(),'Select Language')]/../ul/li[contains(text(),'English')]");
	private By selectcategory = By.xpath("//span[contains(@placeholder,'Select Category')]/../input");
	private By selcatgegoryitem = By.xpath("//li[contains(@class, 'ui-select-choices-group')]/div[contains(@class,'ui-select-choices-row ng-scope active')]/span");
	private By addtaglabel = By.xpath("//input[contains(@placeholder,'Add a tag')]");
	private By itemcodelabel = By.xpath("//label[contains(text(),'Item Code')]/../input");
	private By descriptiontxt = By.xpath("//body[@contenteditable='true']");
	//private By validityunlimited = By.xpath("//label[contains(text(),'Unlimited')]");
	private By priceclick = By.xpath("//span[contains(text(),'Price category')]");
	private By pricefreeclick = By.xpath("//ul[contains(@class,'list')]/li[contains(text(),'Free')]");
	private By plusbutton = By.xpath("//i[contains(@class,'icon pointer dripicons-plus icon-circle-fill font-size-30 expand_menu_list map_content padding-t-0 tp-50')]");
	private By asscontent = By.xpath("//span[contains(text(),'Sample Audio')]"); //div[contains(@class,'ng-scrollbars padding-b-20 ng-isolate-scope mCustomScrollbar _mCS_14')]/div/div[1]/div/div[1]/div[contains(@class,'whole')]/div[contains(@class,'col-lg-12 col-md-12 col-xs-12 col-sm-12 border-tb margin-r-10 padding-tb-15 padding-lr-0')]
	private By btnsave = By.xpath("//button[contains(text(),'Save')]");
	private By deletecoursebtn = By.xpath("//span[contains(text(),'CatalogItemwithDueDate')]/../../../*/div[3]/i");
	private By deletecourseokbtn = By.xpath("//span[contains(text(),'OK')]/..");
	private By closebtn = By.xpath("//button[contains(@class,'close padding-t-20')]/i ");
	private By catalogSearch = By.xpath("//input[@id='quoteSearch']");
	private By duedateError = By.xpath("//div[contains(@class,'text-danger duedate')]");
	private By duedateLbl = By.xpath("//h4[contains(text(),'Due Date')]");
	private By validityDays = By.xpath("//input[@name='validity']");
	private By duedateInput = By.xpath("//div[contains(text(),'DAY(S)')]/../div[1]/*/input");
	private By selectcontentError = By.xpath("//div[contains(text(),'Please select any content')]");
	private By bothLbl = By.xpath("//label[contains(text(),'Both')]");
	private By partLbl = By.xpath("//div[contains(text(),'Please select any content')]");
	private By searchbar = By.xpath("//input[@name='searchterm']");
	private By dueerror = By.xpath("//p[contains(text(),'Due date is over. Please contact your admin ')]");
	private By okBtn = By.xpath("//button[contains(text(),'OK')]");
	private By htmlobj = By.xpath("//div[contains(@class,'masonry-bundlename ellipsis cp')]");
	private By bellicon = By.xpath("//div[contains(@class,'pad-hover-67 notify-box')]//button[contains(@class,'jss29 jss3 jss5 jss8 circle-hover click-hover-09')]");
	private By dueNoti  = By.xpath("//li[1]//div[1]//p[1]");
	private By moreBtn = By.xpath("//button[contains(text(),'MORE')]");
	private By saveBtn = By.xpath("//button[contains(text(),'Save')]");
	public CatalogItemPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/*
	 *function: clickManageContents()
	 * cause: Click Manage contents icon 
	 */
	public void clickManageContents() {
		wait(5);
		click(btnMenu);
		wait(3);
		click(manageContents);
		wait(3);
	}
	/*
	 *function: clickCatalogitem()
	 * cause: Click addcatalog item  icon 
	 */
	public void clickCatalogitem() {
		click(clkcatalogitem);
		wait(5);
	}
	//creation of Bundle
	/*
	 *function: addBundle()
	 * cause: Click bundle icon 
	 */
	public void addBundle() {
		click(addcatalogbtn);
		wait(3);
		click(bundlebtn);
	}
	/*
	 *function: addLearnPath()
	 * cause: Click Learning path icon
	 */
	public void addLearnPath() {
		click(addcatalogbtn);
		wait(3);
		click(learpathbtn);
	}
	/*
	 *function: addCourse()
	 * cause: Click Course icon 
	 */
	public void  addCourse() {
		click(addcatalogbtn);
		wait(3);
		click(coursebtn);
	}
	/*
	 *function: addResource()
	 * cause: Click resource icon 
	 */
	public void addResource() {
		click(addcatalogbtn);
		wait(3);
		click(resourcebtn);
	}
	/*
	 *function: addPodcast()
	 * cause: Click Podcast icon 
	 */
	public void addPodcast() {
		click(addcatalogbtn);
		wait(3);
		click(podcastbtn);
	}
	/*
	 *function: catalogTitle()
	 * cause: Enter title for catalog item
	 */
	public void catalogTitle() {
		click(catalogTitle);
		enterData("CatalogItemwithDueDate", catalogTitle);
		wait(2); 
	}
	/*
	 *function: catalogCreation()
	 * cause: Creation of Catalog item first page
	 */
	public void catalogCreation() {
		if(elementExist(selectlanguage)) {
		click(selectlanguage);
		wait(2);
		click(languageEnglish);
		}
		click(selectcategory);
		wait(2);
		click(selcatgegoryitem);
		click(addtaglabel);
		enterData("Catalog_itemdue", addtaglabel);
		wait(2);
		click(itemcodelabel);
		enterData("Catalog_due1", itemcodelabel);
		driver.switchTo().frame(0);
		click(descriptiontxt);
		enterData("Description for catalog", descriptiontxt);
		driver.switchTo().defaultContent();
		wait(3);
		elementExist(continuebtn);
		click(continuebtn);
		wait(5);
	}
	/*
	 *function: clickBothlbl()
	 * cause: Catalog item creation with both label enabled
	 */
	public void clickBothlbl() {
		click(bothLbl);
	}
	/*
	 *function: clickPartOfCatalogLbl()
	 * cause:Catalog item creation with part of catalog item label enabled
	 */
	public void clickPartOfCatalogLbl() {
		click(partLbl);
	}
	/*
	 *function: catalogSecondPage()
	 * cause: Catalog item creation second page
	 */
	public void catalogSecondPage() {
		//due date field check
		//	click(validityunlimited);
		wait(5);
		elementExist(duedateLbl);
		enterData("7",duedateInput);
		click(validityDays);
		enterData("5",validityDays);
		wait(3);
		click(continuebtn1);
		elementExist(duedateError);
		verifyText("Please select any content",selectcontentError);
		verifyText("Due date should not be greater than validity",duedateError);
		wait(3);
		clear(duedateInput);
		enterData("5",duedateInput);
		scrollToElement(priceclick);
		wait(2);
		click(priceclick);
		wait(5);
		click(pricefreeclick);
		wait(5);
		contentAssign();
		if(elementExist(continuebtn2)) {
			click(continuebtn2);
			wait(2);
			click(saveBtn);
			
		}
		else {
		click(continuebtn1);
		}
		//commented as ibm competency is not enabled
	//	click(btnsave);
		wait(5);
		click(closebtn);
		wait(5);
		click(deletecoursebtn);
		wait(5);
		click(deletecourseokbtn);
	//	click(deletecourseokbtn);
		wait(2);
	}
	public void contentAssign() {
		click(plusbutton);
		wait(2);
		enterData("Sample Audio",catalogSearch);
		click(asscontent);
		wait(3);
	}
	/*
	 *function: courseCreation()
	 * cause: Creation of course first page 
	 */
	public void courseCreation() {
		driver.switchTo().frame(0);
		click(descriptiontxt);
		enterData("Check", descriptiontxt);
		driver.switchTo().defaultContent();
		
		scrollToElement(selectcategory);
		if(elementExist(selectlanguage)) {
		click(selectlanguage);
		wait(2);
		click(languageEnglish);
		wait(2);
		}
		click(selectcategory);
		wait(2);
		click(selcatgegoryitem);
		wait(2);
		click(addtaglabel);
		enterData("Catalog_item", addtaglabel);
		wait(2);
		scrollToElement(itemcodelabel);
		wait(2);
		click(itemcodelabel);
		enterData("Catalog_item", itemcodelabel);
		wait(5);
		driver.switchTo().frame(1);
		wait(3);
		click(descriptiontxt);
		enterData("Catalog item Description", descriptiontxt);
		driver.switchTo().defaultContent();
		wait(5);
		elementExist(continuebtn);
		click(continuebtn);
		wait(5);
		catalogSecondPage();
	}
	/*
	 *function: catalogFirstPage()
	 * cause: Creation of catalog item first page
	 */
	public void catalogFirstPage() {
		click(selectlanguage);
		click(languageEnglish);
		wait(5);
		click(selectcategory);
		wait(2);
		click(selcatgegoryitem);
		click(addtaglabel);
		enterData("Catalog_item", addtaglabel);
		wait(5);
		click(itemcodelabel);
		enterData("Catalog_item", itemcodelabel);
		wait(5);
		driver.switchTo().frame(0);
		click(descriptiontxt);
		enterData("Description for catalog item", descriptiontxt);
		driver.switchTo().defaultContent();
		wait(5);
		elementExist(continuebtn);
		wait(2);
		click(continuebtn);

	}
	/*
	 *function: bundleDueDateCheck()
	 * cause: Check for bundle for which due date is completed
	 */
	public void bundleDueDateCheck() {
		click(searchbar);
		enterData("bundle validity",searchbar);
		driver.findElement(searchbar).sendKeys(Keys.ENTER);
		click(By.xpath("//a[contains(text(),'bundle validity')]/.."));
		wait(2);
		scrollToElement(By.xpath("//img[@class='scrollup-image']"));
		wait(2);
		elementExist(htmlobj);
		click(htmlobj);
		verifyText("Due date is over. Please contact your admin ",dueerror);
		click(okBtn);
	}
	/*
	 *function: bellNotificationDueCheck()
	 * cause: Click bell notification icon and check for due date notification
	 */
	public void bellNotificationDueCheck() {
		click(bellicon);
		if(elementExist(dueNoti)) {
			verifyText("bundle validity Due date is over",dueNoti);
		}
		else {
			click(moreBtn);
			scrollToElement(dueNoti);
			verifyText("bundle validity Due date is over",dueNoti);
		}

	}
}
