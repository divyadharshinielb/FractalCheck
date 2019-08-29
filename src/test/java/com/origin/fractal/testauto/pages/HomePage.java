package com.origin.fractal.testauto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


import com.origin.fractal.testauto.FractalBasePage;

public class HomePage extends FractalBasePage {

	private By lblLrnInProg = By.xpath(".//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Learning in Progress')]");
	private By lblRcntAdded = By.xpath(".//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Recently Added')]");
	private By lblRecommed = By.xpath(".//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Recommended')]");
	private By lblMostPoplr = By.xpath(".//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Most Popular')]");

	private By lblCLAll = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'All')]");
	private By lblCLQA = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Quality Assurance')]");
	private By lblCLPM = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Project Management')]");
	private By lblCLMiLrn = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Micro Learning')]");

	private By lblNotification = By.xpath(".//*[@id='notification-dropdown']/*//span[@class='heading']");
	private By Check = By.xpath(".//div[contains(@class,'notificationdrop')]/*//span[contains(text(),'Check')]");

	private By lblLearningInProgress= By.xpath(".//h2[contains(text(),'Learning in Progress')]");
	private By lblCompl = By.xpath(".//div[@class='percentageValue ng-binding']");
	private By lblCoverage= By.xpath(".//div[contains(text(),'Completion Status')]");
	private By lblContinue= By.xpath(".//button[contains(text(),'CONTINUE')]");
	

	private By lblRcntAdded_CoursesText= By.xpath(".//div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-b-20 padding-lr-120 bg_grey padding-t-80']//span[@class='ng-binding ng-scope'][contains(text(),'courses')]");
	private By lblViewAllRcntAdded= By.xpath(".//div/ng-include[1]/div/div/div[2]/div/a[contains(text(),'View All')]");
    private By lblViewAll=By.xpath("//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]");

	private By rlblAll = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a[contains(text(),'ALL')]");
	private By rlblCourses = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'courses')]");
	private By rlblResources = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'resources')]");
	private By rlblBundles = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'bundles')]");
	private By rlblLpaths = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'Learning Paths')]");
	private String rlblFilterLink = ".//h2[contains(text(),'Recently Added')]/../div/*//a";
	private String rboxBtn= ".//h2[contains(text(),'Recently Added')]/../../../div/*//div/slick/div/div/div";
	private String rboxCatType= "]/*//div/p";
	private By lblFree= By.xpath("//ng-include[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[1]/span[1]");
	private By lblEnrolled=By.xpath(".//h2[contains(text(),'Recently Added')]/../../../div/*//div/slick/div/div/div[1]/*//div/div/span[1]/div/span");
	private By lblViewAllLang1=By.xpath(".//ng-include[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li");
	private String lblViewAllLang=".//ng-include[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li";
	//for recommended filters//
	private By relblAll = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a[contains(text(),'ALL')]");
	private By relblCourses = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a/span[contains(text(),'courses')]");
	private By relblResources = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a/span[contains(text(),'resources')]");
	private By relblBundles = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a/span[contains(text(),'bundles')]");
	private By relblLpaths = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a/span[contains(text(),'Learning Paths')]");
	private String relblFilterLink =".//h2[contains(text(),'Recommended')]/../div/*//a";
	private String reboxBtn=".//h2[contains(text(),'Recommended')]/../../../div/*//div/slick/div/div/div";
    private String reboxCatType="]/div[1]/div[2]/p[1]";
    private String reboxBtn1 ="//ng-include[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div";
    private String reboxCatType1="]/div[2]/div[1]/div[1]/div[1]/h3[1]";
  //for most popular filters//
    private By mostlblAll = By.xpath(".//h2[contains(text(),'Most Popular')]/../div/*//a[contains(text(),'ALL')]");
    private By mostlblCourses = By.xpath(".//h2[contains(text(),'Most Popular')]/../div/*//a/span[contains(text(),'courses')]");
    private By mostlblResources = By.xpath(".//h2[contains(text(),'Most Popular')]/../div/*//a/span[contains(text(),'resources')]");
    private By mostlblBundles = By.xpath(".//h2[contains(text(),'Most Popular')]/../div/*//a/span[contains(text(),'bundles')]");
    private By mostlblLpaths = By.xpath(".//h2[contains(text(),'Most Popular')]/../div/*//a/span[contains(text(),'Learning Paths')]");
    private String mostlblFilterLink =".//h2[contains(text(),'Most Popular')]/../div/*//a";
    private String mostboxBtn =".//h2[contains(text(),'Most Popular')]/../../../div/*//div/slick/div/div/div";
    private String mostboxCatType ="]/*//p";

    private By lblCategory = By.xpath("//button[@placeholder='Category']");
    private By txtBoxSearch = By.xpath("//input[@placeholder='Search']");
    private By iconWishlist = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'My Learning')]/../../../*//div/i[contains(@data-icon,'î€„')]");
    private By iconCart = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'My Learning')]/../../../*//div/i[contains(@data-icon,'Q')]");
    private By lblMyLearning = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'My Learning')]");
    private By compPercent = By.xpath(".//div/ng-include/*//div[contains(@class,'percentageValue')]");
    /***added on 08/02/19***/
    private By learningItemTitle = By.xpath(".//div/ng-include/*//div/*//span[contains(text(),'joined on')]/../*//h3");
    /*****end***/
    private By btnContinue = By.xpath(".//div/ng-include/*//div/button[contains(text(),'CONTINUE')]");

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

	private By privacyLink = By.xpath(".//div/ng-include/*//div/span/a[contains(text(),'Privacy')]");
	private By termsLink = By.xpath(".//div/ng-include/*//div/*//span/a[contains(text(),'Terms')]");
	private By contactsLink = By.xpath(".//div/ng-include/*//div/*//span/a[contains(text(),'Contact')]");
	private By privacyPage = By.xpath(".//div/h2[contains(text(),'Privacy Policy')]");
	private By termsPage = By.xpath(".//div/h2[contains(text(),'Terms & Condition')]");
	private By contactsPage = By.xpath(".//div/h2[contains(text(),'Contact')]");
	MyLearningPage myLearning = new MyLearningPage(driver);
    
	private By CatalogItemBtn= By.xpath("//span[contains(text(),'Catalog Items')]");
	private By lblReadMore= By.xpath("//span[contains(text(),'Read more')]");
	private By lblLess= By.xpath("//span[@class='text-orange ngTruncateToggleText']");
	private By catalogItemFirstClick= By.xpath("//ng-include[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div/div//span[contains(text(),'Category')]");
    private By lastCatalogName = By.xpath(".//ng-include[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[4]/div[1]/div[2]/h3[1]");
    private By CatalogType = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]");
    private By CatalogTitle = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    private By CatalogPrice = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]");
	private By nextButton=By.xpath(".//div/ng-include/div//div//div/slick/button[contains(text(),'Next')]");
    private By PreviousButton=By.xpath(".//div/ng-include/div//div//div/slick/button[contains(text(),'Previous')]");
    private By reFirstCatalog=By.xpath("//ng-include[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    private By reSecondCatalog=By.xpath("//ng-include[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/h3[1]");
    private By rFirstCatalog=By.xpath(".//ng-include[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    private By rSecondCatalog=By.xpath(".//ng-include[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[2]/div[1]/div[2]/h3[1]");
    private By mFirstCatalog=By.xpath("//ng-include[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    private By mSecondCatalog=By.xpath("//ng-include[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[2]/div[1]/div[2]/h3[1]");
    private By mThirdCatalog=By.xpath("//ng-include[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[3]/div[1]/div[2]/h3[1]");
    private By mFourthCatalog=By.xpath("//ng-include[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[4]/div[1]/div[2]/h3[1]");
    private String reBox1="//ng-include[1]/div[1]/div[1]/div[2]/div";
    private String reBox2="]/div[1]/div[1]/div[2]/h3[1]";
    private By globalSearch=By.xpath("//input[@placeholder='Search']");
    private By lblErrorMsg=By.xpath("//div[contains(@class,'text-danger ng-scope')]");
    private By searchCatalogItem=By.xpath("//ng-include[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[2]/span[1]");
    private By reFirstCatalogEnrollText=By.xpath("//ng-include[1]//div[1]/div[2]//div//div/h3[contains(text(),'Automation checking LP')]/../..//span[contains(text(),'ENROLLED')]");
    private By reSecondCatalogEnrolledText=By.xpath(".//ng-include[1]//div[1]/div[2]//div//div/h3[contains(text(),'Automation Checking course')]/../..//span[contains(text(),'ENROLLED')]");
    private By reThirdCatalogEnrolledText=By.xpath("//ng-include[1]//div[1]/div[2]//div//div/h3[contains(text(),'Automation Checking')]/../..//span[contains(text(),'ENROLLED')]");
    private By reFourthCatalogEnrollText=By.xpath("//ng-include[1]//div[1]/div[2]//div//div/h3[contains(text(),'Automation test bundle1')]/../..//span[contains(text(),'ENROLL')]");
    private By reFirstCatalog1=By.xpath(".//ng-include[1]//div[1]/div[2]//div//div/h3[contains(text(),'Automation checking LP')]");
    private By reSecondCatalog1=By.xpath(".//ng-include[1]//div[1]/div[2]//div//div/h3[contains(text(),'Automation Checking course')]");
    private By reThirdCatalog=By.xpath(".//ng-include[1]//div[1]/div[2]//div//div/h3[contains(text(),'Automation Checking')]");
    private By reFourthCatalog=By.xpath(".//ng-include[1]//div[1]/div[2]//div//div/h3[contains(text(),'Automation test bundle1')]");
    private By lblDetailedPage1=By.xpath(".//div/ng-include/div/*//h3/span[contains(text(),'Contents')]/../../../../div/div[2]/*//h3");
    private By lblDetailedPage=By.xpath(".//span[contains(text(),'1 Document, 1 eLearning Object')]");
    private By lblDetailedPage2=By.xpath(".//div/ng-include/div/*//h3[contains(text(),'Content')]/../../div/div[1]/*//h3");
    private By lblDetailedPage3=By.xpath(".//div/ng-include/div/*//h3[contains(text(),'Content')]/../../div/div[3]/*//h3");
    private By myLearningClick = By.xpath("//*[@id=\'header\']/div/div[2]/div[2]/a/span");
    private By searchField=By.xpath(".//input[@placeholder='Search']");
    private By bundleClick=By.xpath(".//span[contains(text(),'bundles')]");
    private By courseClick1=By.xpath("//span[contains(text(),'courses')]");
    private By courseClick = By.xpath(".//h3[contains(text(),'Automation Checking course')]");
    private By learningpathCourseclick = By.xpath(".//h3[contains(text(),'Spelling Change: -ce/-se')]");
    private By courseFilter = By.xpath(".//span[contains(text(),'courses')]");
    private By learningClick=By.xpath(".//h3[@title='Automation Learningpath']");
    private By learningPathLink=By.xpath("//span[@class='ng-scope']");
    private By videolp = By.xpath(".//h3[@class='content_list_view width-90percent lne-height-3 ng-binding']");
    private By video = By.xpath(".//h3[contains(@class,'font-size-18 padding-r-20 ng-binding ng-scope')]");
    private By play = By.xpath(".//div[@class='vjs-poster']");
    private By lp = By.xpath(".//span[contains(text(),'Learning Paths')]");
  
    
    public HomePage(WebDriver driver) {
		super(driver);
		pageName ="HomePage"; 
	}
	
	public void verifySubHeaders() {
		verifyLabel("lblLrnInProg",lblLrnInProg );
		verifyLabel("lblRcntAdded",lblRcntAdded );
		verifyLabel("lblRecommed", lblRecommed);
		verifyLabel("lblMostPoplr", lblMostPoplr);
	}
	
	public void verifyCategories() {
		clickOnCategory();
		verifyLabel("lblCLAll",lblCLAll );
		verifyLabel("lblCLQA",lblCLQA );
		verifyLabel("lblCLPM", lblCLPM);
		verifyLabel("lblCLMiLrn", lblCLMiLrn);
	}
	
	public void verifyBellNotification() {
		wait(5);
		clickOnBellIcon();
		wait(2);
		verifyLabel("lblNotification",lblNotification );
		if((elementExist(Check))) {
		String ntnIntroGST=getText(Check);
		verifyText(ntnIntroGST,Check );
		clickOnViewAll();
		}
		
	}
	public void verifyLearningInProgressText() {
		verifyLabel("lblLrnInProg",lblLearningInProgress);
	}
	public void verifyComplStatus() {
			verifyComplPercent(lblCompl);
		}
	
	public void verifyCoverageText() {
		verifyLabel("lblCoverage",lblCoverage);

	}
	
	public void verifyContinueText() {
		verifyLabel("lblContinue",lblContinue);
	}
	public void clickContinueBtn() {
         clickOnContinueBtn();

	}
	public void rcntAddedCourses() {
		clickOnCourseslink();
		/***added on 2/08/19****/
		click(vlblAll);
		/**here***/

	}
	public void verifyRcntAdded_CoursesText() {
		verifyLabel("lblRcntAdded_CoursesText",lblRcntAdded_CoursesText);
	
	}
	public void verifyTopArrBtn() {
		clickOnTopArrBtn();
		System.out.println("The page should be moving upwards");
	}
	public void ViewAllRcntAddedBtn() {
	    click(lblViewAllRcntAdded);
	}

	public void verifyAllFilterRcntAdded() {
		wait(5);
		click(rlblAll);
		verifyAllFilterTypeRcntAdded(rboxBtn,rboxCatType,rlblFilterLink);
	}
	public void verifyBundleFilterRcntAdded() {
		click(rlblAll);
		click(rlblBundles);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Bundle");
	}
	public void verifyCourseFilterRcntAdded() {
		click(rlblAll);
		click(rlblCourses);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Course");
	}
	public void verifyResourceFilterRcntAdded() {
		click(rlblAll);
		click(rlblResources);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Resource");
	}
	public void verifyLearnPathFilterRcntAdded() {
		click(rlblAll);
		if(elementExist(rlblLpaths)) {
		click(rlblLpaths);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Learning Path");
	}
	}
	public void verifyAllFilterRecommAdded(){
		click(relblAll);
		wait(3);
		verifyAllFilterTypeRecommAdded(reboxBtn,reboxCatType,relblFilterLink);
	}
	public void verifyBundleFilterRecommAdded() {
		click(relblAll);
		wait(3);
		//edited By Karpagavalli from here
		if(elementExist(relblBundles)) {
			click(relblBundles);
			wait(3);
			verifyFilterTypeRecommAdded(reboxBtn,reboxCatType,"bundle");
		}
	}
	public void verifyCourseFilterRecommAdded() {
		click(relblAll);
		wait(3);
		if(elementExist(relblCourses)) {
			click(relblCourses);
			wait(3);
			verifyFilterTypeRecommAdded(reboxBtn,reboxCatType,"course");
		}
	}
	public void verifyResourceFilterRecommAdded() {
		click(relblAll);
		wait(3);
		if(elementExist(relblResources)) {
			click(relblResources);
			wait(3);
			verifyFilterTypeRecommAdded(reboxBtn,reboxCatType,"Resource");
		}	
	}
	public void verifyLearnPathFilterRecommAdded() {
		click(relblAll);
		wait(3);
		if(elementExist(relblLpaths)) {
			click(relblLpaths);
			wait(3);
			verifyFilterTypeRecommAdded(reboxBtn,reboxCatType,"Learning Paths");
		}	
		//edited By Karpagavalli till here
	}
   //************most popular************//
	public void verifyAllFilterMostAdded(){
		click(mostlblAll);
		wait(3);
		verifyAllFilterTypeMostAdded(mostboxBtn,mostboxCatType,mostlblFilterLink);
	}
	public void verifyBundleFilterMostAdded() {
		click(mostlblAll);
		wait(3);
		//edited By Karpagavalli from here
		if(elementExist(mostlblBundles)) {
			click(mostlblBundles);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Bundle");
		}	
	}
	public void verifyCourseFilterMostAdded() {
		click(mostlblAll);
		wait(3);
		if(elementExist(mostlblCourses)) {
			click(mostlblCourses);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Course");
		}	
	}
	public void verifyResourceFilterMostAdded() {
		click(mostlblAll);
		wait(3);
		if(elementExist(mostlblResources)) {
			click(mostlblResources);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Resource");
		}	
	}
	public void verifyLearnPathFilterMostAdded() {
		click(mostlblAll);
		wait(3);
		if(elementExist(mostlblLpaths)) {
			click(mostlblLpaths);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Learning Path");
		}	
		//edited By Karpagavalli till here
	}
	/*Added by Manju Priya A on Nov-27-18*/
	public void verifyHomePageData() {
		elementExist(txtBoxSearch);
		elementExist(iconWishlist);
		elementExist(iconCart);
		verifyText(getLabel("lblcategory"), lblCategory);
		verifyText(getLabel("lblMyLearning"), lblMyLearning);
		
	}
	/*added on 25-1-2019 by mahesh */ 
	public void verifyLearningInprogress() {
		String learningItemTitle1=getText(learningItemTitle);
		verifyText(learningItemTitle1, learningItemTitle);
		verifyComplPercent(compPercent);
		elementExist(btnContinue);
	}
	/*--------------here------*/
	public void verifyMyLearningLabeltext() {
		click(btnContinue);
		myLearning.verifyMyLearningLabels();
	}
	public void verifyEnrolledText() {
	if(elementExist(lblFree)) {
	String lblEnrolledText=getText(lblEnrolled);
	verifyText(lblEnrolledText,lblEnrolled);
	    }
	}
	
	public void verifyAllLanguage() {
		 click(lblViewAll);
		verifyAllLanguage(lblViewAllLang);
		click(homeLink);
	}
	public void verifyViewAllPage() {
		click(homeLink);
		wait(10);
		click(rLinkViewAll);
		wait(5);
		verifyText(getLabel("vlblAll"), vlblAll);
		verifyText(getLabel("vlblBundle"), vlblBundle);
		wait(5);
		verifyText(getLabel("vlblCourse"), vlblcourse);
		verifyText(getLabel("vlblResource"), vlblResource);
		if(elementExist(vlblLpath)){
		verifyText(getLabel("vlblLearningPath"), vlblLpath);
		}
		verifyText(getLabel("vlblAllLanuages"), lblAllLanuages);
		elementExist(iconListView);
		elementExist(iconGridView);
		if(elementExist(btnLoadMore)){
		verifyText(getLabel("vbtnLoadMore"), btnLoadMore);
		}
	}
	/*Ends- added by Manju Priya A on Nov-29-18*/
	public void verifyFooterLinks() {
		verifyLabel("lblPrivacy",privacyLink);
		verifyLabel("lblTerms",termsLink);
		verifyLabel("lblContacts",contactsLink);
		click(privacyLink);
		verifyLabel("privacyPage",privacyPage);
		click(termsLink);
		verifyLabel("termsPage",termsPage);
		click(contactsLink);
		verifyLabel("contactsPage",contactsPage);
	}
	/*Ends- added by Manju Priya A on Nov-29-18*/
	public void	recentlyAddedsectionAttributes() {
		click(rlblAll);
		wait(5);
	    String[] linkTypes = getFilterLinks(rlblFilterLink);
	    for(String a:linkTypes) {
			System.out.println("---->"+a);
	    }
	    verifyAllFilterTypeRcntAdded(rboxBtn, rboxCatType, rlblFilterLink);
	    verifyTileFunctionality();
	    verifyTileStructure();
	}
	public void verifyTileStructure() {
		String TileType=getText(CatalogType);
		verifyText(TileType,CatalogType);
		String TileTitle=getText(CatalogTitle);
		verifyText(TileTitle,CatalogTitle);
		String TilePrice=getText(CatalogPrice);
		verifyText(TilePrice,CatalogPrice);
	}
	public void verifyTileFunctionality() {
		String previousItem=getText(lastCatalogName);
		click(nextButton);
		//String nextItem=getText();
		verifyText(previousItem,lastCatalogName);
	}
	
	public void verifyNextBtn() {
		wait(15);
		click(nextButton);
    }
	
	public void verifyPreviousBtn() {
		wait(5);
		click(PreviousButton);
	}

	public void firstTwoCatalogItemsTitleCompare() {
		wait(5);
		String FirstCatalog1=getText(rFirstCatalog);
    	verifyText(FirstCatalog1,rFirstCatalog);
    	String SecondCatalog1=getText(rSecondCatalog);
        verifyText(SecondCatalog1,rSecondCatalog);
		click(rLinkViewAll);
		wait(5);
		String FirstCatalog2=getText(reFirstCatalog);
		verifyText(FirstCatalog2,reFirstCatalog);
		String SecondCatalog2=getText(reSecondCatalog);
		verifyText(SecondCatalog2,reSecondCatalog);
		wait(5);
		click(homeLink);
	}
	public void lastFourCatalogItemsTitleCompare() {
		wait(5);
		String MFirstCatalog1=getText(mFirstCatalog);
		verifyText(MFirstCatalog1,mFirstCatalog);
		String MSecondCatalog1=getText(mSecondCatalog);
		verifyText(MSecondCatalog1,mSecondCatalog);
		String MThirdCatalog1=getText(mThirdCatalog);
		verifyText(MThirdCatalog1,mThirdCatalog);
		String MFourthCatalog1=getText(mFourthCatalog);
		verifyText(MFourthCatalog1,mFourthCatalog);
		wait(5);
		click(rLinkViewAll);
		for(int i=0;i<=1;i++) {
		click(btnLoadMore);
		}
		wait(5);
		String[] expectedItems=verifyLastCataloItems(reBox1,reBox2);
		for(int i=0;i<=3;i++) {
		 if(i==0)  {
				verifyText(expectedItems[i],MFirstCatalog1);
			}
		 else if(i==1) {
			 verifyText(expectedItems[i],MSecondCatalog1);	 
		}
		 else if(i==2) {
			 verifyText(expectedItems[i],MThirdCatalog1);
		 }
		 else if(i==3){
			 verifyText(expectedItems[i],MFourthCatalog1);
		 }
	  }		
	}
	public void mostPopularCount() {
		int itemCount = getItemsCount(mostboxBtn,mostboxCatType);
   	    System.out.println("---------"+itemCount);
		
	}

	public void recentlyCount() {
		int itemCount = getItemsCount(reboxBtn,reboxCatType);
   	 System.out.println("---------"+itemCount);
		
	}
	public void searchFieldItemCodeUser() {
		 click(globalSearch);
		wait(15);	
		Actions action=new Actions(driver);
	    action.sendKeys("auto123").sendKeys(Keys.ENTER).build().perform();
	    wait(15);
	   verifyText("No Records Found",lblErrorMsg);
	   clear(globalSearch);
	   click(globalSearch);
	   action.sendKeys("~@$~").sendKeys(Keys.ENTER).build().perform();
	    wait(15);
	    if( elementExist(btnLoadMore)){
	    	click(btnLoadMore);
	    }
	    
	    String[] expectedItems=verifySearchCataloItems(reboxBtn1,reboxCatType1);
	    for(String a:expectedItems) {
			System.out.println("---->"+a);
	    }
	}
	public void AccessCatalogItemEnrolledOutside() {
		click(myLearningClick);
		wait(5);
		click(courseFilter);
		wait(5);
		click(courseClick);
		/*click(rLinkViewAll);
		wait(5);
		verifyLabel("lblEnrolledText",reSecondCatalogEnrolledText);
		wait(5);
		verifyLabel("lblEnrolledText",reThirdCatalogEnrolledText);
		click(reSecondCatalog1);
		wait(5);*/
	}
	public void	AccessCatalogItemEnrolledInside() {
		click(myLearningClick);
		wait(5);
		click(learningPathLink);
	/*	WebElement textbox = driver.findElement(searchField);
		enterData("automation checking lp",searchField);
		textbox.sendKeys(Keys.RETURN);
	   click(homeLink);
		click(rLinkViewAll);
		click(rlblBundles);
		click(reThirdCatalog);	*/
		wait(5);
		click(learningClick);
		wait(10);
		click(learningpathCourseclick);
		wait(5);
		click(homeLink);
	}
	public void	AccessCatalogItemEnrollInside() {
		click(rLinkViewAll);
		wait(5);
		click(bundleClick);
		wait(5);
		if( elementExist(btnLoadMore)){
	    	click(btnLoadMore);
	    }
		wait(5);
		click(reFourthCatalog);
		wait(5);
		click(courseClick);
	/*	verifyLabel("lblEnrollText",reFourthCatalogEnrollText);
		click(reFourthCatalog);
		wait(5);
		click(lblDetailedPage1);
	*/	wait(5);
		click(homeLink);
	}
	public void	TimelineCompletionCriteriaOption() {
	click(rLinkViewAll);
	wait(5);
	//verifyLabel("lblEnrolledText",reFirstCatalogEnrollText);
	click(reFirstCatalog1);
	wait(5);
	boolean fname1 = driver.findElement(By.xpath(".//div/ng-include/div/*//h3[contains(text(),'Content')]/../../div/div[1]/*//h3")).isEnabled();
	System.out.print(fname1);
	wait(5);
	/*click(lblDetailedPage2);
	wait(5);*/
//	click(lblDetailedPage3);
	boolean fname = driver.findElement(By.xpath("/*//.//div/ng-include/div/*//h3[contains(text(),'Content')]/../../div/div[3]")).isEnabled();
	System.out.print(fname);
	verifyText("Just Culture and High Reliability - Retrospect",lblDetailedPage3);
	wait(5);
	click(homeLink);
	
	}
	public void verifyReadMoreLessText() {
		click(rLinkViewAll);
		wait(5);
		click(courseClick1);
		wait(5);
		if( elementExist(btnLoadMore)){
	    	click(btnLoadMore);
	    }
		wait(5);
		if( elementExist(btnLoadMore)){
	    	click(btnLoadMore);
	    }
		click(reSecondCatalog1);
		wait(5);
		verifyText("Read more",lblReadMore);
		click(lblReadMore);
		wait(5);
		verifyText("Less",lblLess);
		click(lblLess);	
		
	}

	public void videoLaunch() {
		wait(5);
		WebElement textbox = driver.findElement(searchField);
		enterData("Launch",searchField);
		textbox.sendKeys(Keys.RETURN);
		click(lp);
		wait(5);
		click(videolp);
		wait(5);
		click(video);
		wait(5);
		elementExist(play);		
	}

	public void videoLaunchCheck() throws FindFailed {
		videoLaunch();
	    //  System.setProperty("webdriver.chrome.driver", driversLocation + "chromedriver.exe");
	  //    WebDriver driver= new ChromeDriver();
//		WebDriver browser = new ChromeDriver();
	      WebDriverWait wait=new WebDriverWait(driver,20);
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  // driver.get("https://www.youtube.com/watch?v=0XowYwfvbo8");
	      System.out.println("Youtube Opened");
	      Screen s=new Screen();
	      Pattern muteImg= new Pattern("video.png");
	      s.wait(muteImg,50);
	      s.click(muteImg);
	      s.wait(muteImg,50);
	      Pattern pauseImg= new Pattern("videopause.png");
	      s.wait(pauseImg,50);
	      System.out.println("pause img Opened");
	     s.click(pauseImg);

	}
}