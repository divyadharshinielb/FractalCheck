package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	private By lblCoverage= By.xpath(".//div[contains(text(),'Coverage')]");
	private By lblContinue= By.xpath(".//button[contains(text(),'CONTINUE')]");
	

	private By lblRcntAdded_CoursesText= By.xpath(".//div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-b-20 padding-lr-120 bg_grey padding-t-80']//span[@class='ng-binding ng-scope'][contains(text(),'courses')]");
	private By lblViewAllRcntAdded= By.xpath(".//div/ng-include[1]/div/div/div[2]/div/a[contains(text(),'View All')]");


	private By rlblAll = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a[contains(text(),'ALL')]");
	private By rlblCourses = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'courses')]");
	private By rlblResources = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'resources')]");
	private By rlblBundles = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'bundles')]");
	private By rlblLpaths = By.xpath(".//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'Learning Paths')]");
	private String rlblFilterLink = ".//h2[contains(text(),'Recently Added')]/../div/*//a";
	private String rboxBtn= ".//h2[contains(text(),'Recently Added')]/../../../div/*//div/slick/div/div/div";
	private String rboxCatType= "]/*//div/p";

	//for recommended filters//
	private By relblAll = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a[contains(text(),'ALL')]");
	private By relblCourses = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a/span[contains(text(),'courses')]");
	private By relblResources = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a/span[contains(text(),'resources')]");
	private By relblBundles = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a/span[contains(text(),'bundles')]");
	private By relblLpaths = By.xpath(".//h2[contains(text(),'Recommended')]/../div/*//a/span[contains(text(),'Learning Paths')]");
	private String relblFilterLink =".//h2[contains(text(),'Recommended')]/../div/*//a";
	private String reboxBtn=".//h2[contains(text(),'Recommended')]/../../../div/*//div/slick/div/div/div";
    private String reboxCatType="]/div[1]/div[2]/p[1]";
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
    private By iconWishlist = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'My Learning')]/../../../*//div/i[contains(@data-icon,'')]");
    private By iconCart = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'My Learning')]/../../../*//div/i[contains(@data-icon,'Q')]");
    private By lblMyLearning = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'My Learning')]");
    private By compPercent = By.xpath(".//div/ng-include/*//div[contains(@class,'percentageValue')]");
    private By learningItemTitle = By.xpath(".//div/ng-include/*//div/*//span[contains(text(),'joined on')]/../*//h3");
    private By btnContinue = By.xpath(".//div/ng-include/*//div/button[contains(text(),'CONTINUE')]");

	private By rLinkViewAll = By.xpath(".//h2[contains(text(),'Recently Added')]/../../../div/*//div/slick/div/../../../../*//a[contains(text(),'View All')]");
	private By vlblAll = By.xpath(".//div/ng-include/*//div/*//a[contains(text(),'ALL')]");
	private By vlblBundle = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'bundles')]");
	private By vlblLpath = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'Learning Paths')]");
	private By vlblcourse = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'courses')]");
	private By vlblResource = By.xpath(".//div/ng-include/*//div/*//a/span[contains(text(),'resources')]");
	private By lblAllLanuages = By.xpath(".//div/ng-include/*//div/span[contains(text(),'ALL LANGUAGES')]");
	private By iconListView = By.xpath(".//div/ng-include/*//div/a[contains(@data-icon,'')]");
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

    private By lastCatalogName = By.xpath(".//div/ng-include/div/div[3]//div/slick//div/div[4]/div/div[2]/h3[1]");
    private By CatalogType = By.xpath(".//div/ng-include/div/div[3]//div/slick//div/div[1]/div/div/p[1]");
    private By CatalogTitle = By.xpath(".//div/ng-include[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    private By CatalogPrice = By.xpath(".//div/ng-include[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]");
	private By nextButton=By.xpath(".//div/ng-include/div//div//div/slick/button[contains(text(),'Next')]");
    private By PreviousButton=By.xpath(".//div/ng-include/div//div//div/slick/button[contains(text(),'Previous')]");
    private By reFirstCatalog=By.xpath(".//ng-include[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h3");
    private By reSecondCatalog=By.xpath(".//ng-include[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/h3");
    private By rFirstCatalog=By.xpath(".//ng-include[1]/div[1]/div[5]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]//div/h3[1]");
    private By rSecondCatalog=By.xpath(".//ng-include[1]/div[1]/div[5]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[2]//div/h3[1]");
 
    
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
		clickOnBellIcon();
		wait(2);
		verifyLabel("lblNotification",lblNotification );
		verifyLabel("ntnIntroGST",Check );
		clickOnViewAll();
		
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
		click(rlblLpaths);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Learning Path");
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
			verifyFilterTypeRecommAdded(reboxBtn,reboxCatType,"resource");
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
	public void verifyLearningInprogress() {
		verifyText(getLabel("learningItemTitle"), learningItemTitle);
		verifyComplPercent(compPercent);
		elementExist(btnContinue);
	}
	public void verifyMyLearningLabeltext() {
		click(btnContinue);
		myLearning.verifyMyLearningLabels();
	}
	public void verifyViewAllPage() {
		click(homeLink);
		wait(10);
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
		wait(5);
		click(nextButton);
    }
	
	public void verifyPreviousBtn() {
		wait(5);
		click(PreviousButton);
	}

	public void firstTwoCatalogItemsTitleCompare() {
		wait(5);
    	verifyText(getLabel("firstCatalog"),rFirstCatalog);
        verifyText(getLabel("secondCatalog"),rSecondCatalog);
		click(rLinkViewAll);
		wait(5);
		verifyText(getLabel("firstCatalog"),reFirstCatalog);
		verifyText(getLabel("secondCatalog"),reSecondCatalog);
		
	}

	public void mostPopularCount() {
		int itemCount = getItemsCount(mostboxBtn,mostboxCatType);
   	    System.out.println("---------"+itemCount);
		
	}

	public void recentlyCount() {
		int itemCount = getItemsCount(reboxBtn,reboxCatType);
   	 System.out.println("---------"+itemCount);
		
	}
}