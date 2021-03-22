package com.origin.fractal.testauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;
/* File Name: UserPaginationPage.java
 * Purpose: Check for pagination in user side - FR1-2498
 * Number of Test cases: 5
 * Created by: DivyaDharshini
 * Created on: 28-July-2020
 */

public class UserPaginationPage extends FractalBasePage{
	CatalogItemPage page;
	public String repeatdiv1 = "//body[@id='target']/div[@class='ng-scope']/div[@class='ng-scope']/div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-lr-0']/div[@id='ngview']/div[@class='page-view ng-scrollbars1111 ng-scope']/div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-tb-0 padding-lr-120 ng-scope']/div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-lr-0']/div[@class='padding-lr-0']/div[@class='font-size-18']/md-tabs[@class='learningObjectTab ng-isolate-scope md-dynamic-height']/md-tabs-content-wrapper[@class='_md']/md-tab-content[@id='tab-content-0']/div[@class='ng-scope ng-isolate-scope']/ng-include[@class='ng-scope']/div[@class='ng-scope']/div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 padding-b-80 padding-t-20 min-height-500']/div[@class='ng-scope']/div[";
	public String repeatdiv2 = "]/div[1]/div[1]";
	public By searchbar = By.xpath("//input[@id='searchObject']");
	public By searchCatalog = By.xpath("//input[@id='searchCatalog']");
	public By paginationarrow = By.xpath("//md-tab-content[@id='tab-content-0']//i[@class='icon font-size-15 text-555555']");
	public By allCategoriesfilter = By.xpath("//span[contains(text(),'All Categories')]");
	public By categoryDropdown = By.xpath("//li[text()='General']");
	public By btncatalogitem = By.xpath("//span[text()='Catalog Items']");
	public By btnbundle = By.xpath("//span[contains(text(),'bundles')]");
	public By btnlearnpath = By.xpath("//span[contains(text(),'Learning paths')]");
	public By btncourse = By.xpath("//span[contains(text(),'courses')]");
	public By btnpodcasts = By.xpath("//span[contains(text(),'podcasts')]");
	public By btnresources = By.xpath("//span[contains(text(),'resources')]");
	//user part
	public String categoryRepeatdiv1 = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[";
	public String categoryRepeatdiv2 = "]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]";
	public String whatsnewRepeatdiv1 = "//a[";
	public String whatsnewRepeatdiv2= "]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]";	
	public By categoriesLbl = By.xpath("//a[text()='CATEGORIES']");
	public By generalLbl = By.xpath("//a[contains(text(),'General')]");
	public By gridicon = By.xpath("//i[@class='icon-list font-16']");
	public By loadmoreBtn = By.xpath("//a[contains(text(),'LOAD MORE')]");
	public By onlymylearnBtn = By.xpath("//div[@class='checkbox-circle-my']//label");
	public By viewallBtn = By.xpath("//button[@class='btn btn view-button mb-4 padding-tb-10']/a");
	public By homeIcon = By.xpath("//img[@class='logo-height']");
	public By scrollIcon = By.xpath("//div[@class='scrollup']");
	public By searchLbl = By.xpath("//input[@name='searchterm']");
	public By userBundles = By.xpath("//button[contains(text(),'BUNDLES')]");
	public By userLearnpath = By.xpath("//button[contains(text(),'LEARNING PATHS')]");
	public UserPaginationPage(WebDriver driver) {
		super(driver);
	}

	/*
	 *function:paginationLearningObject() 
	 *cause: Check for pagination in learning object page
	 */
	public void paginationLearningObject() {
		page.clickManageContents();
		enterData("a",searchbar);
		wait(2);
		countCheck();
	}
	/*
	 *function:countCheck() 
	 *cause: Gives the count of the number of elements
	 */
	public void countCheck() {
		int count = 25;
		int index = 1;
		int checkcount = getCount(repeatdiv1,repeatdiv2,count,index);
		if(checkcount<25) {
			print("The count is less than or equal to 25");
			if(!isClickable(paginationarrow)) {
				print("The pagination task works proper");
			}
		}
		else if(checkcount>=25){
			isClickable(paginationarrow);
			//click(paginationarrow);

		}
	}
	/*
	 *function:learningobjectWithCategoryFilter() 
	 *cause: Check pagination for learning object with category filter
	 */
	public void learningobjectWithCategoryFilter() {
		click(allCategoriesfilter);
		click(categoryDropdown);
		countCheck();
	}
	/*
	 *function:paginationCatalogPage() 
	 *cause:Check pagination for catalog item 
	 */
	public void paginationCatalogPage() {
		click(btncatalogitem);
		enterData("a",searchCatalog);
		countCheck();
	}
	/*
	 *function:catalogpageWithCategoryFilter() 
	 *cause: Check pagination for catalog item  with category filter
	 */
	public void catalogpageWithCategoryFilter() {
		elementExist(btnbundle);
		elementExist(btnlearnpath);
		elementExist(btncourse);
		elementExist(btnpodcasts);
		elementExist(btnresources);
		click(allCategoriesfilter);
		click(categoryDropdown);
		countCheck();
	}
	//userpart start

	/*
	 *function:categoryLoadMore() 
	 *cause:Check pagination for category 
	 */
	public void categoryLoadMore() {
		wait(2);
		click(categoriesLbl);
		wait(2);
		click(generalLbl);
		wait(10);
		elementExist(gridicon);
		click(gridicon);
		usercountCheck(categoryRepeatdiv1,categoryRepeatdiv2);
	}
	public void usercountCheck(String countcheck1,String countcheck2) {
		int count =25;
		int index = 2;
		int countcheck = getCount(countcheck1,countcheck2,count,index);
		print("The no of items is:" + countcheck);
		if(countcheck>=24) {
			if(elementExist(loadmoreBtn)) {
				verifyText("LOAD MORE",loadmoreBtn);
				print("THe load more button is present and functionality works fine");
			}
			else {
				print("The load more button is not there");
			}
		}
		else {
			print("The count is less than 25 , hence load more button is not there");
		}
	}
	//category with filter and only my learning filter also
	/*
	 *function:categoryLoadMoreWithFilter() 
	 *cause:Check pagination for category with filter
	 */
	public void categoryLoadMoreWithFilter() {
		if(elementExist(btnbundle)) {
		elementExist(btnbundle);
		click(userBundles);
		usercountCheck(categoryRepeatdiv1,categoryRepeatdiv2);
		click(onlymylearnBtn);
		wait(3);
		click(userLearnpath);
		wait(5);
		usercountCheck(categoryRepeatdiv1,categoryRepeatdiv2);
		}
		else {print("There are no catalog items present in the general category at the moment");}
	}
	/*
	 *function:whatsnewLoadMore() 
	 *cause:Check pagination for whats new section
	 */
	public void whatsnewLoadMore() {
		click(homeIcon);
		wait(10);
		WebElement Element = driver.findElement(viewallBtn);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Element);
		//elementExist(viewallBtn);
		click(gridicon);
		wait(2);
		usercountCheck(whatsnewRepeatdiv1,whatsnewRepeatdiv2);
	}
	/*
	 *function:whatsnewWithFilter() 
	 *cause:Check pagination for whats new section with filter 
	 */
	public void whatsnewWithFilter() {
		click(userBundles);
		usercountCheck(whatsnewRepeatdiv1,whatsnewRepeatdiv2);
		click(userLearnpath);
		usercountCheck(whatsnewRepeatdiv1,whatsnewRepeatdiv2);
	}
	/*
	 *function:globalsearchLoadMore() 
	 *cause:Check pagination for global search page
	 */
	public void globalsearchLoadMore() {
		click(homeIcon);
		wait(10);
		enterData("a",searchLbl);
		driver.findElement(searchLbl).sendKeys(Keys.ENTER);
		scrollToElement(scrollIcon);
		verifyText("LOAD MORE",loadmoreBtn);
	}
}


