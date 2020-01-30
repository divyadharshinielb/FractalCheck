package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
import com.wv.auto.framework.BrowserFactory;

public class HomePage extends FractalBasePage {

	private By lblLrnInProg = By.xpath(".//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Learning in Progress')]");
	 /*******new ui***************/
	private By lblRcntAdded = By.xpath(".//div[@class='whats_title']");//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Recently Added')]
	private By lblPoplr = By.xpath(".//div[contains(text(),'Popular content')]");//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Recommended')]
	private By lblRecommended = By.xpath(".//div[contains(text(), 'Recommended for You')]");//*[@id='ngview']/*//ng-include/*//h2[contains(text(),'Most Popular')]
	/***************/
	
	private By lblCLAll = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'All')]");
	private By lblCLQA = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Quality Assurance')]");
	private By lblCLPM = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Project Management')]");
	private By lblCLMiLrn = By.xpath(".//*[@id='header']/*//ul/*//a/span[contains(text(),'Micro Learning')]");

	private By lblNotification = By.xpath(".//*[@id='notification-dropdown']/*//span[@class='heading']");
//edit by divya 	private By Check = By.xpath(".//p[contains(text(),'Check it out! New item added to Automation Learnin')]");
	private By Check = By.xpath(".//p[contains(@class, 'noti-title mb-0')]");	 //p[contains(text(), 'Check it out! New item added to Elearning: Rule 5 - Set 3')]
 /*******new ui***************/
	private By lblResumeLearning= By.xpath(".//div[contains(text(),'RESUME LEARNING')]");//new ui
/***************/	
	private By lblCompl = By.xpath(".//div[@class='percentageValue ng-binding']");
	private By lblCoverage= By.xpath(".//div[contains(text(),'Completion Status')]");
	/*******new ui***************/
	private By lblContinue= By.xpath(".//span[contains(text(),'CONTINUE')]");
	/***************/

	private By lblRcntAdded_CoursesText= By.xpath(".//div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-b-20 padding-lr-120 bg_grey padding-t-80']//span[@class='ng-binding ng-scope'][contains(text(),'courses')]");
	private By lblViewAllRcntAdded= By.xpath(".//a[contains(text(),'VIEW ALL')]");//div/ng-include[1]/div/div/div[2]/div/a[contains(text(),'View All')]
	
	/************Newui***************/
	private By whlblAll = By.xpath(".//button[contains(text(),'ALL')]");
	private By whlblCourses = By.xpath(".//button[contains(text(),'COURSES')]");//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'courses')]
	private By whlblResources = By.xpath(".//button[contains(text(),'RESOURCES')]");//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'resources')]
	private By whlblBundles = By.xpath(".//button[contains(text(),'BUNDLES')]");//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'bundles')]
	private By whlblLpaths = By.xpath(".//button[contains(text(),'LEARNING PATHS')]");//h2[contains(text(),'Recently Added')]/../div/*//a/span[contains(text(),'Learning Paths')]
	private By whlblPodcasts = By.xpath("//button[contains(text(),'PODCASTS')]");
	private String whlblFilterLink = "//div[@class='whats_menu margin-t-0 float-right']//button";//div[@class='col-lg-9 col-md-9 col-sm-6 mt-2 mb-1 filter']//div//button//div[@class='whats_menu margin-t-0 float-right']//./button
	private String whALLlblFilterLink = "//div[@class='whats_menu margin-t-0 float-right']//button[contains(text(),'ALL')]";
	/*******************/
	private String rlblFilterLink = ".//h2[contains(text(),'Recently Added')]/../div/*//a";
	/************Newui***************/
	private String rboxBtn= "./html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a";
	private String rboxCatType= "]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6";//]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]
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
    //edit by divya
  //  private By lblCategory = By.xpath("//li//a[contains(text(),'Categories')]"); 
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
	private By lblAllLanuages = By.xpath("//div[contains(text(),'ALL LANGUAGES')]");//select[@name='langfilter']//option[contains(text(),'ALL LANGUAGES')]
	private By iconListView = By.xpath(".//i[@class='icon-list font-16']");//div/ng-include/*//div/a[contains(@data-icon,'î��')]
	private By btnLoadMore = By.xpath(".//a[contains(text(),'LOAD MORE')]");
	private By homeLink = By.xpath(".//img[@class='logo-height']");
	/************************/
	
	private By iconGridView = By.xpath(".//div/ng-include/*//div/a[contains(@data-icon,'R')]");
   
	/*******new ui***************/
	private By privacyLink = By.xpath(".//a[contains(text(),'Privacy')]");
	private By termsLink = By.xpath(".//footer[@id='footer']//a[2]");//a[contains(text(),'| Terms')]
	private By contactsLink = By.xpath(".//footer[@id='footer']//a[3]");//a[contains(text(),'| Contact')]
	// edit by divya private By privacyPage = By.xpath(".//span[contains(text(),'Copyright �')]");//span[contains(text(),'PRIVACY POLICY')]
	private By privacyPage = By.xpath(".//span[contains(text(),'PRIVACY POLICY')]");
	private By termsPage = By.xpath(".//span[contains(text(), 'Terms & Conditions')]");//span[contains(text(),'TERMS & CONDITIONS')]
	//edit by divya private By contactsPage = By.xpath(".//span[contains(text(),'success')]");//span[contains(text(),'CONTACT US')]
	private By contactsPage = By.xpath(".//span[contains(text(), 'contact us')]");
	/************************/
	MyLearningPage myLearning = new MyLearningPage(driver);

    private By lastCatalogName = By.xpath(".//ng-include[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[4]/div[1]/div[2]/h3[1]");
    private By CatalogType = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]");
    private By CatalogTitle = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    private By CatalogPrice = By.xpath(".//ng-include[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/slick[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]");
   
    /*******new ui***************/
	private By nextButton=By.xpath(".//div[@class='slider-control-centerright']//div//img");//div/ng-include/div//div//div/slick/button[contains(text(),'Next')]
    private By PreviousButton=By.xpath(".//div[@class='slider-control-centerleft']//div//img");//div/ng-include/div//div//div/slick/button[contains(text(),'Previous')]
    private By whFirstCatalog=By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[2]/div[2]/p[1]/a[1]");
    private By whSecondCatalog=By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[2]/div[2]/p[1]/a[1]");
    private By poFirstCatalog=By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[2]/div[2]/p[1]/a[1]");
    private By poSecondCatalog=By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/div[1]/div[1]/div[2]/div[2]/p[1]/a[1]");
    /*************/
    //Added by dhanushiya from here
    private By Search = By.xpath(".//input[contains(@class,'cat_search')]");
    private By verificationText = By.xpath(".//div[contains(@class,'course_cnt  ml-3')]/../div/h6/span");
    private By homepage = By.xpath(".//button[contains(@class,'btn btn active2')]/../button/a/span");
    private By verificationText2 = By.xpath(".//div[contains(@class,'course_cnt ml-3 padding-t-6')]/../div/h6");
    private By noItem = By.xpath(".//span[contains(text(),'No catalog item available at the moment')]");
    private By eLearning = By.xpath(".//span[contains(text(),'eLearning')]");
    private By video = By.xpath(".//div[contains(@class,'course_cnt ml-3 padding-t-6')]/../div/h6");
    private By automationLearningpath = By.xpath(".//a[contains(text(),'Automation Learningpath')]");
    
    private By count = By.xpath(".//div[contains(@class,'heading-left1')]/../div/b");
    private String arrayXpath1 = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div";
    private String arrayXpath2 ="]/a[1]/div[1]/div[1]/div[1]";
    private String countResulcheck1 ="/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div";
    private String countResultcheck2  ="]/a[1]/div[1]/div[1]/div[1]";
    private By mylearning=By.xpath(".//a[contains(text(),'MY LEARNING')]");
    private By automaionLearningpath=By.xpath(".//a[contains(text(),'Automation Learningpath')]");
    private By automationclassroom=By.xpath(".//h1[contains(text(),'Automation classroom')]");
    private By AutomationLearningpath=By.xpath(".//span[contains(text(),'Automation Learningpath')]");
    //Added by dhanushiya.k till here
    //added by mahesh
    private String FirstboxBtn="/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/a";
    private String FirstCatType="]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]";
    private String MyLearnFirstboxBtn="/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a";
    private String MyLearnFirstCatType="]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]/span[2]";
    private String categorybox1 = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li";
    private String categorybox2 = "]/a[1]";
    private String CategoryFirstboxBtn="/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div";
    private String CategoryFirstCatType="]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]";
    String name="course";
    //till here
    
    
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
		wait(2);
	//	verifyLabel("lblNotification",lblNotification );
	//	String ntnIntroGST=getText(Check);
	//	verifyText(ntnIntroGST,Check );
	//	clickOnViewAll();
		
	}
	public void verifyResumeLearningText() {
		verifyLabel("lblLrnInProg",lblResumeLearning);
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
        click(whlblAll);//added by mahesh 2/1/19
	}
	public void verifyRcntAdded_CoursesText() {
		verifyLabel("lblRcntAdded_CoursesText",lblRcntAdded_CoursesText);
	    click(whlblAll);
	}
	public void verifyTopArrBtn() {
		wait(5);
		WebElement element1 = driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]"));
		Actions actions1= new Actions(driver);
		actions1.moveToElement(element1);
		actions1.perform();
		wait(10);
		clickOnTopArrBtn();
		System.out.println("The page should be moving upwards");
	}
	public void ViewAllRcntAddedBtn() {
	    click(lblViewAllRcntAdded);
	}

	public void verifyAllFilterWhatsNew() {
		click(whlblAll);
		verifyAllFilterTypeRcntAdded(rboxBtn,rboxCatType,whlblFilterLink);
	     
	}
	/*public void verifyBundleFilterWhatsNew() {
		click(whlblAll);
		click(whlblBundles);
		wait(2);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Bundle");
	}
	public void verifyCourseFilterWhatsNew() {
		click(whlblAll);
		click(whlblCourses);
		verifyFilterTypeRcntAdded(rboxBtn,rboxCatType,"Course");
		
	}*/
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
		//click(mostlblAll);
		wait(3);
		verifyAllFilterTypeMostAdded(mostboxBtn,mostboxCatType,mostlblFilterLink);
	}
	public void verifyBundleFilterMostAdded() {
		//click(mostlblAll);
		wait(3);
		//edited By Karpagavalli from here
		if(elementExist(mostlblBundles)) {
			click(mostlblBundles);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Bundle");
		}	
	}
	public void verifyCourseFilterMostAdded() {
		//click(mostlblAll);
		wait(3);
		if(elementExist(mostlblCourses)) {
			click(mostlblCourses);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Course");
		}	
	}
	public void verifyResourceFilterMostAdded() {
		//click(mostlblAll);
		wait(3);
		if(elementExist(mostlblResources)) {
			click(mostlblResources);
			wait(3);
			verifyFilterTypeMostAdded(mostboxBtn,mostboxCatType,"Resource");
		}	
	}
	public void verifyLearnPathFilterMostAdded() {
		//click(mostlblAll);
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
		//elementExist(iconWishlist);
		//elementExist(iconCart);
		//verifyText(getLabel("lblcategory"), lblCategory);
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
	/*	wait(5);
		click(homeLink);
	*/	
	WebElement element = driver.findElement(By.xpath(".//a[contains(text(),'VIEW ALL')]"));
	if(BrowserFactory.getOS() == "win") {
	Actions actions = new Actions(driver);
	actions.moveToElement(element);
	actions.perform();
	}
	wait(5);
		click(whatsNewLinkViewAll);
		wait(5);
		verifyText(getLabel("vlblAll"), wlblAll);
		//verifyText(getLabel("vlblBundle"), wlblBundle);
		wait(5);
		//verifyText(getLabel("vlblCourse"), wlblcourse);
		verifyText(getLabel("vlblResource"), wlblResource);
		if(elementExist(wlblLpath)){
		verifyText(getLabel("vlblLearningPath"), wlblLpath);
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
		WebElement element = driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]"));
		//edited by divya on 24th sept 2019
		/*	if(BrowserFactory.getOS() == "win") {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		}//edited till here by divya
		wait(10);*/
		
		WebElement element1 = driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]"));
		Actions actions1= new Actions(driver);
		actions1.moveToElement(element1);
		actions1.perform();
		wait(10);
		click(termsLink);
		verifyLabel("termsPage",termsPage);
		wait(5);
		click(contactsLink);
		verifyLabel("contactsPage",contactsPage);
		wait(5);
		WebElement element2 = driver.findElement(By.xpath(".//a[contains(text(),'Privacy')]"));
		//edited by divya on 24th sept 2019
				if(BrowserFactory.getOS() == "win") {
		Actions actions= new Actions(driver);
		actions1.moveToElement(element2);
		actions1.perform();
				}//edited till here by divya
		wait(5);
		click(privacyLink);
		verifyLabel("privacyPage",privacyPage);
	}
	/*Ends- added by Manju Priya A on Nov-29-18*/
	public void	whatsNewSectionAttributes() {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'VIEW ALL')]"));
		//edited by divya on 24th sept 2019
		if(BrowserFactory.getOS() == "win") {
		Actions actions= new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		}//edited till here by divya
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
		
		WebElement element = driver.findElement(By.xpath("//div[@class='slider-control-centerright']//div//img"));
		if(BrowserFactory.getOS() == "win") {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		}
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
	//Added by Dhanushiya
		public void backButtonCheckClassroomEvent() {
			click(mylearning);
			wait(5);
			JavascriptExecutor je =(JavascriptExecutor)driver;
			je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(".//a[contains(text(),'Automation Learningpath')]")));
			wait(5);
			click(automaionLearningpath);
			wait(5);
			je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(".//h1[contains(text(),'Automation classroom')]")));
			wait(5);
			click( automationclassroom);
			wait(5);
			driver.navigate().back();
			wait(5);
			//verifyText("Automation Learningpath",AutomationLearningpath);
			wait(5);
			
		}
		
		
		//added by dhanushiya

		public void GlobalSearchforClassroomandClassroomsKeyword() {
			
			enterData("classroom",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Classroom",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("classrooms",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Classroom",verificationText);
			wait(5);
			if(elementExist(verificationText)){
				int itemCount = getItemsCount(arrayXpath1,arrayXpath2);
				
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforimageandimages() {
			wait(5);
			enterData("image",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Image",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("images",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Image",verificationText);
			if(elementExist(verificationText)){
				int itemCount = getItemsCount(arrayXpath1,arrayXpath2);
				
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforAudioandAudios() {
			wait(5);
			enterData("audio",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("No catalog item available at the moment!",noItem);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("audios",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog item available at the moment!",noItem);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforVideoandVideos() {
			wait(5);
			enterData("video",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Video",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("videos",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Video",verificationText);
			if(elementExist(verificationText)){
				int itemCount = getItemsCount(arrayXpath1,arrayXpath2);
				
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforDocumentandDocuments() {
			wait(5);
			enterData("document",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Document",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("documents",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Document",verificationText);
			if(elementExist(verificationText)){
				int itemCount = getItemsCount(arrayXpath1,arrayXpath2);
				
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
		}
		//Added by Dhanushiya
		public void GlobalSearchforVlabsandVlabs() {
			wait(5);
			enterData("vlab",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("No catalog item available at the moment!",noItem);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("vlabs",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog item available at the moment!",noItem);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforAssessmentandAssessments() {
			wait(5);
			enterData("assessment",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("No catalog item available at the moment!",noItem);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("assessment",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog item available at the moment!",noItem);
				
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforElearningandElearnings() {
			wait(5);
			enterData("elearning",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("eLearning",eLearning);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("elearnings",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("eLearning",eLearning);
			if(elementExist(verificationText)){
				int itemCount = getItemsCount(arrayXpath1,arrayXpath2);
				
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforBundleandBundles() {
			wait(5);
			enterData("bundle",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Bundle",verificationText2);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("bundles",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Bundle",verificationText2);
			if(elementExist(verificationText2)){
				int itemCount = getItemsCount(countResulcheck1,countResultcheck2);
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			}
		//Added by Dhanushiya
		public void GlobalSearchforPodcastandPodcasts() {
			wait(5);
			enterData("podcast",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Podcast",verificationText2);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("podcasts",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Podcast",verificationText2);
			if(elementExist(verificationText2)){
				int itemCount = getItemsCount(countResulcheck1,countResultcheck2);
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
		}	
		//Added by Dhanushiya
		public void GlobalSearchforLearningpathandLearningpaths() {
			wait(5);
			enterData("learningpath",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Learning Path",verificationText2);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("learningpaths",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Learning Path",verificationText2);
			if(elementExist(verificationText2)){
				int itemCount = getItemsCount(countResulcheck1,countResultcheck2);
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforCourseandCourses() {
			wait(5);
			enterData("Course",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Course",verificationText2);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("courses",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Course",verificationText2);
			if(elementExist(verificationText2)){
				int itemCount = getItemsCount(countResulcheck1,countResultcheck2);
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			}
		//Added by Dhanushiya
		public void GlobalSearchforResourceandResources() {
			wait(5);
			enterData("resource",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Video",video);//resource only have videos
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("resources",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Video",video);
			if(elementExist(verificationText2)){
				int itemCount = getItemsCount(countResulcheck1,countResultcheck2);
				System.out.println("---------"+itemCount);
				String s = Integer.toString(itemCount); 
				verifyText(s,count);
				}
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchwithRandomcharacterandIntegers() {
			wait(5);
			enterData("gggg",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("No catalog item available at the moment!",noItem);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("123456",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog item available at the moment!",noItem);	
			
		}
		//Added by Dhanushiya
		public void GlobalSearchwithSpecialcharacters() {
			wait(5);
			enterData("classroom*&",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Classroom",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("***images",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog item available at the moment!",noItem);	
			
		}
		//Added by Dhanushiya
		public void GlobalSearchwithUnavailableKeyword() {
			wait(5);
			enterData("machinelearning",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("No catalog item available at the moment!",noItem);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("cloud",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog item available at the moment!",noItem);	
			
		}
		//Added by Dhanushiya
		public void GlobalSearchwithDoubleandTabspace() {
			wait(5);
			enterData("automation  learningpath",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Automation Learningpath",automationLearningpath);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData(" automation    learningpath",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Automation Learningpath",automationLearningpath);	
		}
		//added by mahesh
		public void verifyCatalogFilterDashboard() {
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'VIEW ALL')]"));
			Actions actions= new Actions(driver);
			actions.moveToElement(element);
			actions.perform();
			wait(5);
			click(lblViewAllRcntAdded);
			wait(2);
			 click(iconListView);
			    wait(2);
			    String[] CatalogType=getCatalogTypes(FirstboxBtn,FirstCatType);
				 for(String a:CatalogType) {
					 System.out.println("---->"+a);
				 }
				 wait(2);
				    commonCatalogType3();
		         }
	     public void verifyCatalogFilterMylearning() {
	    	 wait(2);
			 clickOnMyLearning();
			 click(By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 mt-2 mb-3']//div[2]//div[1]//a[1]"));
				wait(2);
				    String[] CatalogType1=getCatalogTypes(MyLearnFirstboxBtn,MyLearnFirstCatType);
					 for(String a:CatalogType1) {
						 System.out.println("---->"+a);
					 }
					 wait(2);
					 commonCatalogType2();
		            }
	     public void verifyCatalogFilterCategories() {
	    	 /****General is the only common category for all url so i enabled general alone***/
	   /* 	 click(By.xpath("//li[@class='bg-1']"));
	    	 click(By.xpath("//li[@class='space lato']//a[contains(text(),'3D Animation')]"));
	    	 wait(2);
			 click(By.xpath("//i[@class='icon-list font-16']"));
	    	 commonCatalogType4();
	    	 click(By.xpath("//li[@class='bg-1']"));
	    	 click(By.xpath("//a[contains(text(),'Micro Learning')]"));
	    	 commonCatalogType4();
	    	 click(By.xpath("//li[@class='bg-1']"));
	    	 click(By.xpath("//a[contains(text(),'Healthcare')]"));
	    	 commonCatalogType4();
	    */	 click(By.xpath("//li[@class='bg-1']"));
	    	 click(By.xpath("//a[contains(text(),'General')]"));
	    	 wait(2);
			 click(By.xpath("//i[@class='icon-list font-16']"));
	    	 commonCatalogType4();
	       }
	     public void verifyCatalogFilterSearch() {
	    	 
	    	 WebElement queryElement= driver.findElement(By.xpath("//input[@id='theInput']"));
	    	 queryElement.sendKeys("test bundle");//Automation Learningpath
	    	 queryElement.sendKeys(Keys.ENTER);
	    //	 enterData("Automation Learningpath",txtBoxSearch);
	    	 wait(5);
	    	 click(whlblBundles);
			 if(elementExist(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]"))){
				 wait(5);  
				 verifyText("Bundle",By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]"));
				    wait(5);
			    }
	    	 
	          }
	     
			public void commonCatalogType() {
				 String[] CatalogType=getCatalogTypes(FirstboxBtn,FirstCatType);
				 for(String a:CatalogType) { System.out.println("---->"+a);
					/* if(name.equals(a)) {
						 
					}
				*/ }
			 }
			public void commonCatalogType1() {
				 String[] CatalogType1=getCatalogTypes(MyLearnFirstboxBtn,MyLearnFirstCatType);
				 for(String a:CatalogType1) { System.out.println("---->"+a);
					/* if(name.equals(a)) {
						 
					}
			*/	 }
				 }
			public void commonCatalogType5() {
				 String[] CatalogType1=getCatalogTypes1(CategoryFirstboxBtn,CategoryFirstCatType);
				 for(String a:CatalogType1) { System.out.println("---->"+a);
					/* if(name.equals(a)) {
						 
					}
			*/	 }
				 }
			
			public void commonCatalogType2() {
				if(elementExist(whlblCourses)){
						click(whlblCourses);
				 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
				   commonCatalogType1();
				    wait(2);
				 }
				 }
				if(elementExist(whlblBundles)){
				  click(whlblBundles);
				 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
				    commonCatalogType1();
				    wait(5);
			    }
				}
				 if(elementExist(whlblResources)){
				 click(whlblResources);
				 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
					    commonCatalogType1();
					    wait(5);
				    }
				 }
				 if(elementExist(whlblLpaths)){
				 click(whlblLpaths);
				 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
					    commonCatalogType1();
					    wait(5);
				    }
				 }
				 if(elementExist(whlblPodcasts)){
				 click(whlblPodcasts);
				 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
					    commonCatalogType1();
					    wait(5);
				    }
				 }
			}
			public void commonCatalogType3() {
				   click(whlblCourses);
					 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
					   commonCatalogType();
					    wait(2);
					 }
					  click(whlblBundles);
					 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
					    commonCatalogType();
					    wait(5);
				    }
					 click(whlblResources);
					 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
						    commonCatalogType();
						    wait(5);
					    }
					 click(whlblLpaths);
					 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
						    commonCatalogType();
						    wait(5);
					    }
					 click(whlblPodcasts);
					 if(elementExist(By.xpath("//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//h6[1]"))){
						    commonCatalogType();
						    wait(5);
					    }
				}
			public void commonCatalogType4() {
				click(whlblCourses);
				 if(elementExist(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]"))){
				   commonCatalogType5();
				    wait(2);
				 }
				  click(whlblBundles);
				 if(elementExist(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]"))){
				    commonCatalogType5();
				    wait(5);
			    }
				 click(whlblResources);
				 if(elementExist(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]"))){
					    commonCatalogType5();
					    wait(5);
				    }
				 click(whlblLpaths);
				 if(elementExist(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]"))){
					    commonCatalogType5();
					    wait(5);
				    }
				 if(elementExist(whlblPodcasts))
				 click(whlblPodcasts);
				 if(elementExist(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]"))){
					    commonCatalogType5();
					    wait(5);
				    }
				
			}
			//till here
		
}