package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	private By lblValidTillInCat = By.xpath("//span[text()='Validity:']"); //*[@id='ngview']/div/ng-include/*//div/*//span[contains(text(),'Valid till')]
	private By lblDurationInCat = By.xpath("//div[contains(text(),'Language')]/../div[3]/span"); //*[@id='ngview']/div/ng-include/*//div/*//span[contains(text(),'Duration')]
	private String lblFilterLink = ".//div/ng-include/*//div/ng-include/div/*//div/a[contains(text(),'ALL')]/../a";
	private String boxBtn = ".//div/ng-include/*//div/ng-include/div/*//div/*//p[contains(text(),'Category')]/../../../../../div";
	private String boxCatType = "]/*//p";
	private By boxButton = By.xpath(".//div/ng-include/*//div/ng-include/div/*//div/*//p[contains(text(),'Category')]/../../../../../div");
	private By lblCatnameInside = By.xpath("//span[@class='three-line-clamp']");//*[@id='ngview']/div/ng-include/*//div/span[contains(text(),'Updated on')]/../*//h3

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
	//	wait(5);
	//	click(clickCatalog);
		/***/
		//commenting because updated field is removed verifyPartialLabelText("lblUpdatedOn", lblUpdatedOnInCat);
		//commenting because this field is removed now verifyPartialLabelText("lbloverview", lbloverview);
		verifyPartialLabelText("lblValidtill", lblValidTillInCat);
		verifyPartialLabelText("lblDuration", lblDurationInCat);
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

	public void verifyLaunch() {
		click(clickCatalog);
		launchCheck(lobjpath1,lobjpath2,lobjName);
	}

	public void verifyTopArrowBtn() {
		clickOnTopArrBtn();
		System.out.println("The page should be moving upwards");
	}
	/*Moved from FractalBasePage by Manju Priya A on Nov-29-18*/
	public void verifyMyLearningLabels() {
		wait(7);
		elementExist(lblCatnameInside);
		verifyPartialLabelText("catalogTitle", lblCatnameInside);
		//commenting because updated field is removed verifyPartialLabelText("lastUpdateddate", lblUpdatedOnInCat);
		//commenting because the count is not thereverifyPartialLabelText("lobjCount", lobjCount);
		verifyPartialLabelText("lblDuration", lblDurationInCat);
		verifyPartialLabelText("lblValidity", lblValidTillInCat);
	//commenting because this is not there	verifyPartialLabelText("lbloverview", lbloverview);
	}
	/*End - Moved from FractalBasePage by Manju Priya A on Nov-29-18*/


}