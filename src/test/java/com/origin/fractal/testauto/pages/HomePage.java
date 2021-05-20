package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class HomePage extends FractalBasePage {

	private By lblLrnInProg = By.xpath(".//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Learning in Progress')]");
	 /*******new ui***************/
	private By lblRcntAdded = By.xpath(".//div[@class='whats_title']");//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Recently Added')]
	private By lblPoplr = By.xpath(".//div[contains(text(),'Popular content')]");//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Recommended')]
	private By lblRecommended = By.xpath(".//div[contains(text(),'Recommended for You')]");//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Most Popular')]
	/***************/
	
	private By lblCLAll = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'All')]");
	private By lblCLQA = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Quality Assurance')]");
	private By lblCLPM = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Project Management')]");
	private By lblCLMiLrn = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Micro Learning')]");

	private By lblNotification = By.xpath(".//*[@id='notification-dropdown']/*//span[@class='heading']");
	private By Check = By.xpath(".//p[contains(text(),'You can now access Launch.')]");
 /*******new ui***************/
	private By lblResumeLearning= By.xpath(".//div[contains(text(),'RESUME LEARNING')]");//new ui
/***************/	
	private By lblCompl = By.xpath(".//div[@class='percentageValue ng-binding']");
	private By lblCoverage= By.xpath(".//div[contains(text(),'Completion Status')]");
	/*******new ui***************/
	private By lblContinue= By.xpath(".//span[contains(text(),'CONTINUE')]");
	/***************/

	private By lblRcntAdded_CoursesText= By.xpath(".//div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-b-20 padding-lr-120 bg_grey padding-t-80']//span[@class='ng-binding ng-scope'][contains(text(),'courses')]");
	private By lblViewAllRcntAdded= By.xpath("//a[contains(text(),'VIEW ALL')]");//div/ng-include[1]/div/div/div[2]/div/a[contains(text(),'View All')]
	
	/************Newui***************/
	private By whlblAll = By.xpath("//button[contains(text(),'ALL')]");
	private By whlblCourses = By.xpath(".//button[contains(text(),'COURSES')]");//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'courses')]
	private By whlblResources = By.xpath(".//button[contains(text(),'RESOURCES')]");//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'resources')]
	private By whlblBundles = By.xpath(".//button[contains(text(),'BUNDLES')]");//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'bundles')]
	private By whlblLpaths = By.xpath(".//button[contains(text(),'LEARNING PATHS')]");//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'Learning Paths')]
	private By whlblPodcasts = By.xpath("//button[contains(text(),'PODCASTS')]");
	private String whlblFilterLink = ".//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]";//div[@class='whats_menu margin-t-0 float-right']//./button
	/*******************/
	private String rlblFilterLink = ".//h2[contains(text(),'Recently Added')]/../div/*//a";
	/************Newui***************/
	private String rboxBtn= "/html[1]/body[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li";//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a
	private String rboxCatType= "]/a[1]/div[1]/div[1]/div[2]/div[1]/p[1]";//]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6
	/*******************/
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
    
    /*******new ui***************/
    private By lblCategory = By.xpath("//li//a[contains(text(),'CATEGORIES')]");
    private By txtBoxSearch = By.xpath("//input[@id='theInput']");
    private By iconWishlist = By.xpath(".//div[@class='log_wishlist']");
    private By iconCart = By.xpath(".//div[@class='log_cart']");
    private By lblMyLearning = By.xpath("//a[contains(text(),'MY LEARNING')]");
    /************************/
    private By compPercent = By.xpath(".//div/ng-include/*//div[contains(@class,'percentageValue')]");
    private By learningItemTitle = By.xpath(".//div/ng-include/*//div/*//span[contains(text(),'updated on')]/../*//h3");
    private By btnContinue = By.xpath(".//div/ng-include/*//div/button[contains(text(),'CONTINUE')]");
   
    /*******new ui***************/
	private By whatsNewLinkViewAll = By.xpath(".//a[contains(text(),'VIEW ALL')]");
	private By wlblAll = By.xpath(".//button[contains(text(),'ALL')]");
	private By wlblBundle = By.xpath(".//button[contains(text(),'BUNDLES')]");
	private By wlblLpath = By.xpath(".//button[contains(text(),'LEARNING PATHS')]");
	private By wlblcourse = By.xpath(".//button[contains(text(),'COURSES')]");
	private By wlblResource = By.xpath(".//button[contains(text(),'RESOURCES')]");
	private By lblAllLanuages = By.xpath("//div[contains(text(),'English')]");//select[@name='langfilter']//option[contains(text(),'ALL LANGUAGES')]
	private By iconListView = By.xpath(".//i[@class='icon-list font-16']");//div/ng-include/*//div/a[contains(@data-icon,'î��')]
	private By btnLoadMore = By.xpath(".//a[contains(text(),'LOAD MORE')]");
	private By homeLink = By.xpath(".//img[@class='logo-height']");
	/************************/
	
	private By iconGridView = By.xpath(".//div[contains(@class,'col-lg-6 col-md-6 col-sm-6 float-right mobo_width pr-0 text-right')]/../div/div/a/i");//edit by dhanushiya.k
   
	/*******new ui***************/
	private By privacyLink = By.xpath(".//a[contains(text(),'Privacy')]");
	private By termsLink = By.xpath(".//footer[@id='footer']//a[2]");//a[contains(text(),'| Terms')]
	private By contactsLink = By.xpath(".//footer[@id='footer']//a[3]");//a[contains(text(),'| Contact')]
	private By privacyPage = By.xpath(".//span[contains(text(),'PRIVACY POLICY')]");//span[contains(text(),'PRIVACY POLICY')]
	private By termsPage = By.xpath(".//span[contains(text(),'Terms & Conditions')]");//span[contains(text(),'TERMS & CONDITIONS')]
	private By contactsPage = By.xpath(".//span[contains(text(),'contact us')]");//span[contains(text(),'CONTACT US')]
	/************************/
	MyLearningPage myLearning = new MyLearningPage(driver);

    private By lastCatalogName = By.xpath(".//ng-include[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[4]/div[1]/div[2]/h3[1]");
    private By CatalogType = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]");
    private By CatalogTitle = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    private By CatalogPrice = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]");
   
    /*******new ui***************/
	private By nextButton=By.xpath(".//body/div[@id='root']/div[@id='page-container']/main[@id='content-wrap']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[4]/div[1]/img[1]");//div[@class='slider-control-centerright']//div//img//div/ng-include/div//div//div/slick/button[contains(text(),'Next')]
    private By PreviousButton=By.xpath(".//div[@class='slider-control-centerleft']//div//img");//div/ng-include/div//div//div/slick/button[contains(text(),'Previous')]
    private By whFirstCatalog=By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[2]/div[2]/p[1]/a[1]");
    private By whSecondCatalog=By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[2]/div[2]/p[1]/a[1]");
    private By poFirstCatalog=By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[2]/div[2]/p[1]/a[1]");
    private By poSecondCatalog=By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/div[1]/div[1]/div[2]/div[2]/p[1]/a[1]");
    /*************/
    private By viewAll=By.xpath("//a[contains(text(),'VIEW ALL')]");
    public By percentLabel = By.xpath("//*[contains(@class,'CircularProgressbar ')]");
    private By btnTopArr = By.xpath(".//div[@class='scrollup']");
    public HomePage(WebDriver driver) {
		super(driver);
		pageName ="HomePage"; 
	}
	
	public void verifySubHeaders() {
		verifyLabel("lblLrnInProg",lblResumeLearning );
		verifyLabel("lblRcntAdded",lblRcntAdded );
		verifyLabel("lblRecommed", lblPoplr);
		verifyLabel("lblMostPoplr", lblRecommended);
	}
	
	public void verifyCategories() {
		clickOnCategory();
		verifyLabel("lblCLAll",lblCLAll );
		verifyLabel("lblCLQA",lblCLQA );
		verifyLabel("lblCLPM", lblCLPM);
		verifyLabel("lblCLMiLrn", lblCLMiLrn);
	}
	
	public void verifyBellNotification() {
		wait(10);
		clickOnBellIcon();
	//	verifyLabel("lblNotification",lblNotification );
	/*	commenting this code as else condition is not provided and adding code without if condition so that it fails if the element is not there.
	 * 
	 * if(elementExist(Check)) {
			String ntnIntroGST=getText(Check);
			verifyText(ntnIntroGST,Check );
			clickOnViewAll();
			}*/
//		elementExist(Check);
//		String ntnIntroGST=getText(Check);
//		verifyText(ntnIntroGST,Check );
		wait(5);
		clickOnViewAll();
	}
	public void verifyResumeLearningText() {
		if(elementExist(lblResumeLearning)) {
		verifyLabel("lblLrnInProg",lblResumeLearning);
		}
		else
		{
			elementExist(percentLabel);
			click(percentLabel);
		}
	}
	public void verifyComplStatus() {
			verifyComplPercent(lblCompl);
		}
	
	public void verifyCoverageText() {
		verifyLabel("lblCoverage",lblCoverage);

	}
	
	public void verifyContinueText() {
		//verifyLabel("lblContinue",lblContinue);
		//divya uncommenting verifyLabel functionality on 12-5-2021
		verifyLabel("lblContinue",lblContinue);
	}
	public void clickContinueBtn() {
         clickOnContinueBtn();

	}
	public void rcntAddedCourses() {
		clickOnCourseslink();
        click(whlblAll);//added by mahesh 2/1/19
	}
	public void verifyRcntAdded_CoursesText() {
		verifyLabel("lblRcntAdded_CoursesText",lblRcntAdded_CoursesText);
	    click(whlblAll);
	}
	public void verifyTopArrBtn() {
		wait(5);
		WebElement element = driver.findElement(btnTopArr); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		wait(5);
		clickOnTopArrBtn();
		System.out.println("The page should be moving upwards");
	}
	public void ViewAllRcntAddedBtn() {
	    click(lblViewAllRcntAdded);
	}

	public void verifyAllFilterWhatsNew() {
	/*	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element= driver.findElement(viewAll);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		wait(5);
	click(viewAll);
	*/wait(5);
/*		click(whlblAll);
		wait(2);
		verifyAllFilterTypeRcntAdded(rboxBtn,rboxCatType,whlblFilterLink);
	*/     
	}
	public void verifyBundleFilterWhatsNew() {
		click(whlblAll);
		click(whlblBundles);
		wait(2);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Bundle");
	}
	public void verifyCourseFilterWhatsNew() {
		wait(2);
		click(whlblAll);
		click(whlblCourses);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Course");
		
	}
	public void verifyResourceFilterWhatsNew() {
		click(whlblAll);
		click(whlblResources);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Resource");
	}
	public void verifyLearnPathFilterWhatsNew() {
		click(whlblAll);
		if(elementExist(whlblLpaths)) {
		click(whlblLpaths);
		wait(2);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Learning Path");
	}
	}
	public void verifyPodcastFilterWhatsNew() {
		click(whlblAll);
		if(elementExist(whlblPodcasts)) {
		click(whlblPodcasts);
		wait(2);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Podcast");
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
		wait(10);
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
		//edit by divya - All label is not present so commented click(mostlblAll);
	//	click(mostlblAll);
		wait(3);
		verifyAllFilterTypeMostAdded(mostboxBtn,mostboxCatType,mostlblFilterLink);
	}
	public void verifyBundleFilterMostAdded() {
	//	click(mostlblAll);
		wait(3);
		//edited By Karpagavalli from here
		if(elementExist(mostlblBundles)) {
			click(mostlblBundles);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Bundle");
		}	
	}
	public void verifyCourseFilterMostAdded() {
	//	click(mostlblAll);
		wait(3);
		if(elementExist(mostlblCourses)) {
			click(mostlblCourses);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Course");
		}	
	}
	public void verifyResourceFilterMostAdded() {
	//	click(mostlblAll);
		wait(3);
		if(elementExist(mostlblResources)) {
			click(mostlblResources);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Resource");
		}	
	}
	public void verifyLearnPathFilterMostAdded() {
	//	click(mostlblAll);
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
	public void verifyViewAllPage() {
		wait(5);
		click(homeLink);
/*		wait(10);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement Element= driver.findElement(By.xpath(".//div[@class='popular_title title']"));//a[contains(text(),'VIEW ALL')]
	js.executeScript("arguments[0].scrollIntoView();", Element);
*/	wait(5);
		click(whatsNewLinkViewAll);
		wait(5);
		verifyText(getLabel("vlblAll"), wlblAll);
		verifyText(getLabel("vlblBundle"), wlblBundle);
		wait(5);
		verifyText(getLabel("vlblCourse"), wlblcourse);
		verifyText(getLabel("vlblResource"), wlblResource);
		if(elementExist(wlblLpath)){
		verifyText(getLabel("vlblLearningPath"), wlblLpath);
		}
		wait(5);
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element= driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		wait(5);
		wait(10);
/*		
		WebElement element1 = driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]"));
		Actions actions1= new Actions(driver);
		actions.moveToElement(element1);
		actions1.perform();
		wait(10);
*/		click(termsLink);
		verifyLabel("termsPage",termsPage);
		wait(5);
		click(contactsLink);
		verifyLabel("contactsPage",contactsPage);
		wait(5);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement Element1= driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]"));
		js1.executeScript("arguments[0].scrollIntoView();", Element1);
		wait(5);
		wait(5);
		click(privacyLink);
		verifyLabel("privacyPage",privacyPage);
	}
	/*Ends- added by Manju Priya A on Nov-29-18*/
	public void	whatsNewSectionAttributes() {
		wait(10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element= driver.findElement(By.xpath("//div[@class='popular_title title']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		wait(5);
		click(lblViewAllRcntAdded);
		wait(2);
		click(whlblAll);
		wait(10);
	    String[] linkTypes = getFilterLinks(whlblFilterLink);
	    for(String a:linkTypes) {
			System.out.println("---->"+a);
	    }
	    click(iconListView);
	    verifyAllFilterTypeRcntAdded(rboxBtn, rboxCatType, whlblFilterLink);
	/*    verifyTileFunctionality();
	    verifyTileStructure();
	*/
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
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element= driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page-container']/main[@id='content-wrap']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[4]/div[1]/img[1]"));//div[@class='slider-control-centerright']//div//img
		js.executeScript("arguments[0].scrollIntoView();", Element);
		wait(10);
		click(nextButton);
    }
	
	public void verifyPreviousBtn() {
		wait(5);
		click(PreviousButton);
	}

	public void firstTwoCatalogItemsTitleCompare() {
		wait(5);
		String FirstCatalog1=getText(whFirstCatalog);
    	verifyText(FirstCatalog1,whFirstCatalog);
    	String SecondCatalog1=getText(whSecondCatalog);
        verifyText(SecondCatalog1,whSecondCatalog);
		wait(5);
		String FirstCatalog2=getText(poFirstCatalog);
		verifyText(FirstCatalog2,poFirstCatalog);
		String SecondCatalog2=getText(poSecondCatalog);
		verifyText(SecondCatalog2,poSecondCatalog);
		wait(5);
		click(homeLink);
	}
	public void mostPopularCount() {
		int itemCount = getItemsCount(mostboxBtn,mostboxCatType);
   	    System.out.println("---------"+itemCount);
		
	}

	public void recentlyCount() {
		int itemCount = getItemsCount(reboxBtn,reboxCatType);
   	 System.out.println("---------"+itemCount);
		
	}
	

	public void verifyAllFilterRcntAdded() {
		// TODO Auto-generated method stub
		
	}
}