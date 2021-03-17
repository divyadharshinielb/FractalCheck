package com.origin.fractal.testauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.origin.fractal.testauto.FractalBasePage;
/* File Name: AdminPaginationPage.java
 * Purpose: Check for pagination in admin side -FR1-2497
 * Number of Testcases: 4
 * Created by: DivyaDharshini
 * Created on: 28-July-2020
 */

public class AdminPaginationPage extends FractalBasePage{
	CatalogItemPage page;
	public String repeatdiv1 = "//body[@id='target']/div[@class='ng-scope']/div[@class='ng-scope']/div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-lr-0']/div[@id='ngview']/div[@class='page-view ng-scrollbars1111 ng-scope']/div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-tb-0 padding-lr-120 ng-scope']/div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-lr-0']/div[@class='padding-lr-0']/div[@class='font-size-18']/md-tabs[@class='learningObjectTab ng-isolate-scope md-dynamic-height']/md-tabs-content-wrapper[@class='_md']/md-tab-content[@id='tab-content-0']/div[@class='ng-scope ng-isolate-scope']/ng-include[@class='ng-scope']/div[@class='ng-scope']/div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-all-0 padding-b-80 padding-t-20 min-height-500']/div[@class='ng-scope']/div[";
	public String repeatdiv2 = "]/div[1]/div[1]";
	public By searchbar = By.xpath("//input[@id='searchObject']");
	public By searchCatalog = By.xpath("//input[@id='searchCatalog']");
	public By paginationarrow = By.xpath("//md-tab-content[@id='tab-content-0']//i[@class='icon font-size-15 text-555555']");
	public By allCategoriesfilter = By.xpath("//span[contains(text(),'All Categories')]");
	public By categoryDropdown = By.xpath("//li[text()='General']"); //span[contains(text(),'All Categories')]
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
	public By generalLbl = By.xpath("//a[@title='General']");
	public By gridicon = By.xpath("//i[@class='icon-list font-16']");
	public By loadmoreBtn = By.xpath("//a[contains(text(),'LOAD MORE')]");
	public By onlymylearnBtn = By.xpath("//div[@class='checkbox-circle-my']//label");
	public By viewallBtn = By.xpath("//button[@class='btn btn view-button mb-4 padding-tb-10']/a");
	public By homeIcon = By.xpath("//img[@class='logo-height']");
	public By scrollIcon = By.xpath("//div[@class='scrollup']");
	public By searchLbl = By.xpath("//input[@name='searchterm']");
	public By userBundles = By.xpath("//button[contains(text(),'BUNDLES')]");
	public By userLearnpath = By.xpath("//button[contains(text(),'LEARNING PATHS')]");
	public By catalogGeneral = By.xpath("//div[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty open']//li[@class='option'][contains(text(),'General')]");
	public AdminPaginationPage(WebDriver driver) {
		super(driver);
		page=new CatalogItemPage(driver);
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
		wait(5);
		elementExist(allCategoriesfilter);
		click(allCategoriesfilter);
		wait(5);
		elementExist(categoryDropdown);
		wait(5);
		click(catalogGeneral);
		wait(5);
		countCheck();


	}

}


