package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class ViewAllPage extends FractalBasePage{
	private By rLinkViewAll = By.xpath(".//h2[contains(text(),'Recently Added')]/../../../div/*//div/slick/div/../../../../*//a[contains(text(),'View All')]");
	private By vlblAll = By.xpath(".//div/ng-include/*//div/*//a[contains(text(),'ALL')]");
	private By vlblBundle = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'bundles')]");
	private By vlblLpath = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'Learning Paths')]");
	private By vlblcourse = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'courses')]");
	private By vlblResource = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'resources')]");
	private By lblAllLanuages = By.xpath(".//div/ng-include/*//div/span[contains(text(),'ALL LANGUAGES')]");
	private By iconListView = By.xpath(".//div/ng-include/*//div/a[contains(@data-icon,'î��')]");
	private By iconGridView = By.xpath(".//div/ng-include/*//div/a[contains(@data-icon,'R')]");
	private By btnLoadMore = By.xpath(".//div/ng-include/*//div/button[contains(text(),'Load More')]");
	private By homeLink = By.xpath(".//div/ng-include/*//div/a/span[contains(text(),'Home')]");

	public ViewAllPage(WebDriver driver) {
		super(driver);
		pageName ="ViewAllPage"; 
	}

	public void verifyViewAllPage() {
		click(homeLink);
		click(rLinkViewAll);
		verifyText(getLabel("vlblAll"), vlblAll);
		verifyText(getLabel("vlblBundle"), vlblBundle);
		verifyText(getLabel("vlblCourse"), vlblcourse);
		verifyText(getLabel("vlblResource"), vlblResource);
		verifyText(getLabel("vlblLearningPath"), vlblLpath);
		verifyText(getLabel("vlblAllLanuages"), lblAllLanuages);
		elementExist(iconListView);
		elementExist(iconGridView);
		verifyText(getLabel("vbtnLoadMore"), btnLoadMore);
	}
	
}
