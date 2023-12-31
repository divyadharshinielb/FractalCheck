package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.origin.fractal.testauto.FractalBasePage;

public class MyLearningPage extends FractalBasePage {
	private By lblOvCoStatus = By.xpath(".//*[@id='ngview']/*//span[contains(text(),'Overall Completion Status')]");
	private By lblBCMyLearning = By.xpath(".//*[@id='breadCrumb']/*//span[contains(text(),'My Learning')]");

	private By lblAll = By.xpath(".//*[@id='ngview']/*//ng-include/*//ng-include/*//a[1][contains(text(),'ALL')]");
	private By lblCourses = By.xpath(".//*[@id='ngview']/*//ng-include/*//span[contains(text(),'courses')]");
	private By lblResources = By.xpath(".//*[@id='ngview']/*//ng-include/*//span[contains(text(),'resources')]");
	private By lblBundles = By.xpath(".//*[@id='ngview']/*//ng-include/*//span[contains(text(),'bundles')]");


	private By lblCompl = By.className("percentageValue_ent");
	private By clickCatalog = By.xpath(".//div/ng-include/*//div/ng-include/div/*//div/p[contains(text(),'Valid till:')]");//Updated on Nov-22-18
	/***added on 02/08/19***/
	private By lblUpdatedOnInCat = By.xpath(".//*[@id='ngview']/div/ng-include/*//div/span[contains(text(),'Updated on')]");
	/******/
	private By lblDescInCat = By.xpath(".//*[@id='ngview']/div/ng-include/*//div/*//h3[contains(text(),'Overview')]");
	private By lblValidTillInCat = By.xpath(".//*[@id='ngview']/div/ng-include/*//div/*//span[contains(text(),'Valid till')]");
	private By lblDurationInCat = By.xpath(".//*[@id='ngview']/div/ng-include/*//div/*//span[contains(text(),'Duration')]");
	private String lblFilterLink = ".//div/ng-include/*//div/ng-include/div/*//div/a[contains(text(),'ALL')]";//removed for checking/../a
	private String boxBtn = ".//div/ng-include/*//div/ng-include/div/*//div/*//p[contains(text(),'Category')]/../../../../../div";
	private String boxCatType = "]/*//p";
	private By boxButton = By.xpath(".//div/ng-include/*//div/ng-include/div/*//div/*//p[contains(text(),'Category')]/../../../../../div");
	private By lblCatnameInside = By.xpath(".//*[@id='ngview']/div/ng-include/*//div/span[contains(text(),'Updated on')]/../*//h3");

	private By bundleCnt = By.xpath(".//div/ng-include/*//div/ng-include/div/*//div/p[contains(text(),'Valid till:')]");////Updated Nov-22-18
	private By lblcourseName = By.xpath(".//div/ng-include/div/*//h3[contains(text(),'Content')]/../../div/*//h3");//Updated Nov-22-18
	private By lblDuration = By.xpath(".//div/*//span[contains(text(),'Duration')]");
	private By lblTick = By.className("round-progress-wrapper");

	private By lblCategory = By.xpath(".//*[@id='header']/*//button[contains(text(),'Category')]");
	private String categoryList = ".//*[@id='header']/*//button[contains(text(),'Category')]/../../div/ul/li";
	private By lblStar= By.xpath(".//div/ng-include/div/*//div/ng-include/div/*//div/ul");
	private By lblCatalogTick= By.xpath(".//div/ng-include/div/*//div/ng-include/div/*//div/ul/../../div/*//div[contains(@class,'round-progress-wrapper')]");
	private String lobjpath1 = ".//div/ng-include/div/*//h3[contains(text(),'Content')]/../../div/div[";
	private String lobjpath2 = "]/*//span";
	private String lobjName = "]/*//h3";
	
	String catalogname = "";
	private By searchField=By.xpath(".//input[@placeholder='Search']");
	private By searchCount=By.xpath(".//h3[@title='Automation Checking']");
	private By searchResult1=By.xpath(".//h3[@title='sample Image']");
	private By searchResult2=By.xpath(".//h3[@title='sample image for automation']");
	private By searchResult3=By.xpath(".//h3[@title='global_automation image']");
	
	/*Added By manju Priya A on Nov-29-18*/
	private By lobjCount = By.xpath(".//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/ng-include[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/h3[1]");
	private By lbloverview = By.xpath("//*[@id='ngview']/div/ng-include/*//div/*//h3[contains(text(),'Overview')]");
	/*End -added By manju Priya A on Nov-29-18*/
	public MyLearningPage(WebDriver driver) {
		super(driver);
		pageName = "MyLearningPage";
	}

	public void verifyMyLearningPage() {
		verifyLabel("lblOvCoStatus", lblOvCoStatus);
		verifyLabel("lblBCMyLearning", lblBCMyLearning);
	}

	public void verifySubMenu() {

		verifyLabel("lblAll", lblAll);
		verifyLabel("lblCourses", lblCourses);
		verifyLabel("lblResources", lblResources);
		verifyLabel("lblBundles", lblBundles);
	}

	
	public void verifyComplStatus() {
		verifyComplPercent(lblCompl);
	}
	

	public void verifyCatalogname() {
		click(clickCatalog);
		verifyText(getLabel("lblCatalogName"), lblCatnameInside);
	}

	public void verifyCatalogDetails() {
		/**added here 1/30/2019**/
		wait(5);
		click(clickCatalog);
		/***/
		//Updated by Nithin K on Aug_14_19
		verifyPartialText(getLabel("lblUpdatedOn"), lblUpdatedOnInCat);
		verifyPartialText(getLabel("lbloverview"), lbloverview);
		verifyPartialText(getLabel("lblValidtill"), lblValidTillInCat);
		verifyPartialText(getLabel("lblDuration"), lblDurationInCat);
	}

	public void verifyCourseInBundle() {
		click(lblBundles);
		click(bundleCnt);
		verifyLabel("lblCourseNameText", lblcourseName);
	}

	public void verifyAllFilter() {
		click(lblAll);
		verifyAllFilterType(boxBtn, boxCatType, lblFilterLink);
	}

	public void verifyBundleFilter() {
		click(lblAll);
		wait(5);
		click(lblBundles);
		wait(5);
		verifyFilterType(boxBtn, boxCatType, "bundle");
	}

	public void verifyCourseFilter() {
		click(lblAll);
		wait(5);
		click(lblCourses);
		wait(5);
		verifyFilterType(boxBtn, boxCatType, "course");
	}

	public void verifyResourceFilter() {
		click(lblAll);
		wait(5);
		click(lblResources);
		wait(5);
		verifyFilterType(boxBtn, boxCatType, "resource");
	}

	public void verifyTickmark() {
		click(boxButton);
		click(lblDuration);
		elementExist(lblTick);
	}

	public void verifyGridView() {
		click(lblAll);
		gridView();
	}
	public void verifyListView() {
		click(lblAll);
		wait(5);
		listView();
	}
	public void verifyCategory() {
		verifyPartialLabelText("lblcategory", lblCategory);
	}
	

	public void verifyCategoryList() {
		click(lblCategory);
		verifyAllCategories(categoryList);
	}

	public void verifyRatings() {
		verifyCompletedCatalog(lblStar,lblCatalogTick);
	}

	public void verifyBundleContents() {
		click(lblBundles);
		wait(5);
		click(clickCatalog);
		verifyCatalogDeatils("lblBundleName","lblBundleType","lblNoOfBundleContents","lblBundleValidity");
	}
	public void verifyCourseContents() {
		click(lblCourses);
		wait(5);
		click(clickCatalog);
		verifyCatalogDeatils("lblCourseName","lblCourseType","lblNoOfCourseContents","lblCourseValidity");
	}

	public void verifyLaunch(String browserName) {
		click(clickCatalog);
		launchCheck(lobjpath1,lobjpath2,lobjName,browserName);
	}

	public void verifyTopArrowBtn() {
		clickOnTopArrBtn();
		System.out.println("The page should be moving upwards");
	}
	/*Moved from FractalBasePage by Manju Priya A on Nov-29-18*/
	public void verifyMyLearningLabels() {
		wait(5);
		verifyPartialLabelText("catalogTitle", lblCatnameInside);
		verifyPartialLabelText("lastUpdateddate", lblUpdatedOnInCat);
		//verifyPartialLabelText("lobjCount", lobjCount);
		verifyPartialLabelText("lblDuration", lblDurationInCat);
		verifyPartialLabelText("lblValidity", lblValidTillInCat);
		verifyPartialLabelText("lbloverview", lbloverview);
	}
	/*End - Moved from FractalBasePage by Manju Priya A on Nov-29-18*/
	public void globalSearchCount() {
		wait(5);
		WebElement textbox = driver.findElement(searchField);
		enterData("Automation_Checking",searchField);
		textbox.sendKeys(Keys.RETURN);
		verifyText("3 Result(s) for Automation_Checking",searchCount);
		/*elementExist(searchResult1);
		elementExist(searchResult2);
		elementExist(searchResult3);*/
		
	}

}