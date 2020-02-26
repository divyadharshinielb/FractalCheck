package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;
import com.wv.auto.framework.BrowserFactory;

public class MyLearningPage extends FractalBasePage {
	/***********Newui****************/
	private By lblOvCoStatus = By.xpath(".//p[contains(text(),'COMPLETION')]");
	private By lblBCMyLearning = By.xpath(".//a[text()='My Learning']");//*[@id='breadCrumb']/*//span[contains(text(),'My Learning')]
    
	
	private By lblAll = By.xpath(".//button[contains(text(),'ALL')]");//*[@id='ngview']/*//ng-include/*//ng-include/*//a[1][contains(text(),'ALL')]
	private By lblCourses = By.xpath(".//button[contains(text(),'COURSES')]");//*[@id='ngview']/*//ng-include/*//span[contains(text(),'courses')]
	private By lblLearningpath=By.xpath(".//button[contains(text(),'LEARNING PATHS')]");
	private By lblResources = By.xpath(".//button[contains(text(),'RESOURCES')]");//*[@id='ngview']/*//ng-include/*//span[contains(text(),'resources')]
	private By lblBundles = By.xpath(".//button[contains(text(),'BUNDLES')]");//*[@id='ngview']/*//ng-include/*//span[contains(text(),'bundles')]
	private By lblListView = By.xpath(".//div[contains(@class,'bgcolor padding-tb-0')]//div[contains(@class,'bgcolor')]//div//div[2]//div[1]//a[1]"); //div[contains(@class, 'row')]//*/div[2]/div/a
	private By btnGrid = By.xpath(".//a//i[contains(@class,'icon-grid-selected font-16')]");
	
	
	private By lblCompl = By.className("react-sweet-progress-symbol");
	private By clickCatalog = By.xpath("//*[@class='masonry-bundlename two-line-clamp'])[1]");//Updated on Nov-22-18 //div[contains(@class, 'mylearn')]/*//p[contains(@class, 'icon-heading')] //div[contains(@class,'mylearn')]/../div[3]/a[1]/*//a

	private By lblCatlogCategory = By.xpath(".//div[contains(text(),'Category')]");
	private By lblLanguage = By.xpath(".//div[contains(text(),'Language')]");
	private By lblValidity = By.xpath(".//span[text()='Validity:']");
	/********************/	
	private By lblDurationInCat = By.xpath(".//*[@id='ngview']/div/ng-include/*//div/*//span[contains(text(),'Duration')]");
	private String lblFilterLink = ".//div/ng-include/*//div/ng-include/div/*//div/a[contains(text(),'ALL')]/../a";
	private String boxBtn = ".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a";
	private String boxCatType = "]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]/span[2]";
	private By boxButton = By.xpath(".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/div[1]/div[1]/div[1]");//div/ng-include/*//div/ng-include/div/*//div/*//p[contains(text(),'Category')]/../../../../../div
	/************Newui***************/
	private By lblCatnameInside = By.xpath(".//div[contains(@class, 'cdescrip tecap')]/../div/span");//*[@id='ngview']/div/ng-include/*//div/span[contains(text(),'Updated on')]/../*//h3
	private By bundleCnt = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");////Updated Nov-22-18
	private By lblcourseName = By.xpath(".//span[@class='three-line-clamp']");//Updated Nov-22-18//h1[@class='masonry-bundlename ellipsis padding-t-5']
	private By lblDuration = By.xpath(".//div/*//span[contains(text(),'Duration')]");
	private By lblTick = By.xpath(".//button[@class='pl-0 launch_btn www']/../button/img");//round-progress-wrapper
	private By lblCompleted = By.xpath(".//li[contains(text(),'COMPLETED')]");

	private By lblCategory = By.xpath(".//a[contains(text(),'CATEGORIES')]");//a[contains(text(),'CATEGORIES')]
   
	private String categoryList = "./html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]//div//ul//li";//*[@id='header']/*//button[contains(text(),'Category')]/../../div/ul/li
    
	private By lblStar= By.xpath(".//div//div[@class='dv-star-rating']");//div/ng-include/div/*//div/ng-include/div/*//div/ul
	private By lblCatalogTick= By.xpath(".//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//img");//div/ng-include/div/*//div/ng-include/div/*//div/ul/../../div/*//div[contains(@class,'round-progress-wrapper')]
	/*********************/	
	private String lobjpath1 = ".//div/ng-include/div/*//h3[contains(text(),'Content')]/../../div/div[";
	private String lobjpath2 = "]/*//span";
	private String lobjName = "]/*//h3";
	private By lblMyLearning = By.xpath(".//a[contains(text(),'MY LEARNING')]");//div/ng-include/*//div/*//a/span[contains(text(),'My Learning')]
	
	String catalogname = "";
	
	/*Added By manju Priya A on Nov-29-18*/
	private By lobjCount = By.xpath(".//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/ng-include[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/h3[1]");
	private By lbloverview = By.xpath("//*[@id='ngview']/div/ng-include/*//div/*//h3[contains(text(),'Overview')]");
	/*End -added By manju Priya A on Nov-29-18*/
    //edit by divya
	private By boxButton1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]");
	private By lblAssignedClassroom3 = By.xpath("//h1[contains(text(),'checking for classroom 1')]");
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
		verifyLabel("lblLearningPaths",lblLearningpath);
	}

	
	public void verifyComplStatus() {
		verifyComplPercent(lblCompl);
	}
	

	public void verifyCatalogname() {
		wait(5);
		click(lblMyLearning);
		wait(5);
		click(By.xpath("//body/div[@id='root']/div[@id='page-container']/main[@id='content-wrap']/div/div[@class='overflow mb-5']/div[2]"));
		wait(5);
	//	click(clickCatalog);
		verifyText(getLabel("lblCatalogName"), lblCatnameInside);
		wait(2);
	    click(lblMyLearning);
	}

	public void verifyCatalogDetails() {
		/**added here 1/30/2019**/
		wait(5);
		WebElement element = driver.findElement( By.xpath("//*[@id='react-tabs-1']/div/div/div/div[3]/div/div[1]/a[1]/div")); 
	    Actions actions = new Actions(driver); actions.moveToElement(element);
		actions.perform();
		click(clickCatalog);
		/***/
		verifyPartialLabelText("lblUpdatedOn", lblCatlogCategory);
	//	verifyPartialLabelText("lbloverview", lbloverview);
		verifyPartialLabelText("lblValidtill", lblValidity);
		verifyPartialLabelText("lblDuration", lblLanguage);
	}

	public void verifyCourseInBundle() {
		click(lblBundles);
		wait(3);
		click(lblListView);
		wait(5);
		click(bundleCnt);
		verifyLabel("lblCourseNameText", lblcourseName);
	}

	public void verifyAllFilter() {
		click(lblAll);
		wait(5);
		click(lblListView);
		wait(5);
		verifyAllFilterType(boxBtn, boxCatType, lblFilterLink);
	}

	public void verifyBundleFilter() {
		click(lblAll);
		wait(5);
		click(lblBundles);
		wait(5);
		click(lblListView);
		verifyFilterType(boxBtn, boxCatType, "bundle");
	}

	public void verifyCourseFilter() {
		click(lblAll);
		wait(5);
		click(lblCourses);
		wait(5);
		click(lblListView);
		verifyFilterType(boxBtn, boxCatType, "course");
	}

	public void verifyResourceFilter() {
		click(lblAll);
		wait(5);
		click(lblResources);
		wait(5);
		click(lblListView);
		verifyFilterType(boxBtn, boxCatType, "resource");
	}

	public void verifyTickmark() {
		click(lblCompleted);
		click(lblListView);
		wait(5);
		if(elementExist(boxButton1)) {
			click(boxButton1);
			wait(5);
			//	click(lblDuration);
		  elementExist(lblTick);
		}
	}

	public void verifyGridView() {
		click(lblAll);
		wait(5);
	//	gridView();
		wait(5);
		System.out.println("true");
	}
	public void verifyListView() {
		click(lblAll);
		wait(5);
	//	listView();
		System.out.println("true");
	}
	public void verifyCategory() {
		wait(5);
		verifyPartialLabelText("lblcategory", lblCategory);
	}
	

	public void verifyCategoryList() {
		click(lblCategory);
		verifyAllCategories(categoryList);
		wait(2);
		print("CHECCCKKCKCKCKCKKCKKCKCK NOWWW in BROWSERRRRRR");
		click(lblAll);
		wait(5);
	}

	public void verifyRatings() {
		print("HHHHEIEIEIEIIEEIEIIE CHECK NOWWWW IN BROWSER" + lblCompleted);
		wait(5);
	click(lblCompleted);
		wait(5);
		//click(btnGrid);
		//wait(2);
		//click(boxButton);
		//wait(5);
	if(elementExist(boxButton1)) {
		verifyCompletedCatalog(lblStar,lblCatalogTick);
	}
	}

	public void verifyBundleContents() {
		click(lblBundles);
		wait(5);
		click(lblListView);
		wait(2);
		click(clickCatalog);
		wait(5);
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
		wait(2);
		clickOnTopArrBtn();
		System.out.println("The page should be moving upwards");
	}
	/*Moved from FractalBasePage by Manju Priya A on Nov-29-18*/
	public void verifyMyLearningLabels() {
		wait(5);
		verifyPartialLabelText("catalogTitle", lblCatnameInside);
		verifyPartialLabelText("lastUpdateddate", lblCatlogCategory);
		verifyPartialLabelText("lobjCount", lobjCount);
		verifyPartialLabelText("lblDuration", lblDurationInCat);
		verifyPartialLabelText("lblValidity", lblValidity);
		verifyPartialLabelText("lbloverview", lbloverview);
	}
	/*End - Moved from FractalBasePage by Manju Priya A on Nov-29-18*/
	private By clickClassroomCatalog=By.xpath(".//a[contains(text(),'Automation Learningpath')]");
	private By globalSearch=By.xpath(".//input[@id='theInput']");
	//edit by divya
	private By lbldetails=By.xpath("//button[contains(text(),'DETAILS')]");//div[5]//div[1]//div[1]//div[2]//div[1]//h6[1]//div[1]//button[contains(text(),'Details')]
	private By classroomlblDate=By.xpath("//p[contains(@class,'timebox-li margin-b-7')]");
	private By classroomlblTime=By.xpath("//div[contains(@class,'margin-t-0')]//p[2]");
    private By classroomlblLocation=By.xpath("//div[contains(@class,'display-box')]");
    private By lblAssignedClassroom=By.xpath("//h1[contains(text(),'Automation classroom')]");
    private By classroomlblEvent=By.xpath("//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]");
    private By classroomlblEventDate=By.xpath("//div[contains(@class,'col-lg-2 col-md-2 col-sm-2 col-xs-2 height-115 event-bg')]");
    private By classroomlblEventTime=By.xpath("//div[contains(@class,'display-box')]//div[contains(@class,'padding-t-5')]");
    private By classroomlblEventLocation=By.xpath("//div[contains(@class,'font-14 padding-l-10 padding-t-20 color6f')]");
    private By classroomlblEventRegistration=By.xpath("//button[contains(@class,'regBtn')]");
    private By lblTraditionalClass=By.xpath(".//button[contains(text(),'TRADITIONAL CLASS')]");
    private By lblCancel=By.xpath("  //button[contains(text(),'CANCEL')]");
    private By lblRegisterText=By.xpath("//p[contains(text(),'By registering, you are accepting the')]");
    private By lblEventCalendarText=By.xpath("//button[contains(text(), 'Choose Event')]");
    private By btnCancelRegistration=By.xpath(".//button[contains(text(),'CANCEL REGISTRATION')]");
    private By lblAssignedClassroom2=By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[3]/div[3]/div[1]/div[1]/div[1]");//h1[contains(text(),'App_notification_check')]
    private By lblPreeventActivities=By.xpath("//span[contains(text(),'Pre-event Activities')]");
    private By lblReference=By.xpath(" //span[contains(text(),'Reference')]");
    private By lblPosteventActivities=By.xpath("//span[contains(text(),'Post-event Activities')]");
    private By lblTermsCondition=By.xpath("//p[contains(text(),'Terms & Conditions')]");
    private By breadcrumLink=By.xpath("//a[text()='Automation Learningpath']");
    private By registrationCancelText=By.xpath("//p[contains(text(),'Are you sure you want to cancel your registration?')]");
    private By btnNO=By.xpath("//button[contains(text(),'NO')]");
	 public void  verifyClassroomDetails() {
			/*	wait(5);
				click(globalSearch);
				wait(10);	
				Actions action=new Actions(driver);
				action.sendKeys("learning path check").sendKeys(Keys.ENTER).build().perform();
				 wait(15);
			 
			*/ WebElement element = driver.findElement( By.xpath(".//a[contains(text(),'Automation Learningpath')]")); Actions 
				actions = new Actions(driver); actions.moveToElement(element);
				actions.perform();
				wait(5);
		    	click(clickClassroomCatalog);
			  wait(5);
		    }
			  public void	verifyAssignedClassroom(){
				  scrollBar();
				  wait(2);
				 verifyText("Automation classroom",lblAssignedClassroom);
					}
			  
			  public void	verifyDetailsBtn(){
				  verifyText("DETAILS m",lbldetails);
					}
		    
			//TC:4  the  Details button should be getting displayed on classroom asset.
			  public void	verifyInsideClassroomDetails() {
			  elementExist(classroomlblDate);
			  elementExist(classroomlblTime);
			  elementExist(classroomlblLocation); 
			  wait(5);
			  scrollBar();
				wait(5);
			  }
			//TC:6   the below details should be inside classroom dashboard Date&Time Location Instructor name.
			 
			public void	verifyCancelRegistrationBtn(){
			  verifyText("CANCEL REGISTRATION",btnCancelRegistration);
			  
				}
		  
			public void	verifyClassrooomLabels(){
			wait(2);
		    WebElement element = driver.findElement( By.xpath(".//a[text()='Automation Learningpath']")); Actions 
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			wait(2);
		    click(By.xpath(".//a[text()='Automation Learningpath']"));
		    wait(5);
		    WebElement element1 = driver.findElement( By.xpath("//h1[contains(text(),'Automation classroom')]")); Actions 
			actions1 = new Actions(driver); actions.moveToElement(element1);
			actions1.perform();
			wait(5);
			click(lblAssignedClassroom2);
			if(elementExist(lblReference)) {	  
			//edit by divya based on newcode  verifyText("Pre-event Activities",lblPreeventActivities);
			  verifyText("Reference",lblReference);
			  verifyText("Terms & Conditions",lblTermsCondition);
			//edit by divya based on newcode  verifyText("Post-event Activities",lblPosteventActivities);
			  if(elementExist(btnCancelRegistration)) {
			  click(btnCancelRegistration);
			  verifyText("Are you sure you want to cancel your registration?",registrationCancelText);
			  click(btnNO);
			  }
			  wait(2);
			  click(breadcrumLink);
			  scrollBar();
			  wait(5);
			  click(By.xpath("//div[@class='margin-t-0']//div[3]//div[1]//div[1]//div[2]//div[1]//h6[1]//div[1]//button[1]"));
			  wait(5);
			}
		}
//			  Checking whether the Event is displayed under classroom object
			  public void verifyEventDisplayClassroomObject(){
				  click(lblAssignedClassroom3);
			  elementExist(classroomlblEvent);
			  elementExist(classroomlblEventDate);
			  elementExist(classroomlblEventTime);
			  elementExist(classroomlblEventLocation);
			  elementExist(classroomlblEventRegistration);
			  }
			//TC:9  the below details should be present inside Event Date&Time Location Instructor name Register button. 
			  public void verifyTraditionalClassBtn(){
				  wait(5);
			  click(lblTraditionalClass);
			  }
			  public void verifyEventRegistrationBtn(){
			   elementExist(classroomlblEventDate);
			  click(classroomlblEventRegistration);
			  verifyText("By registering, you are accepting the",lblRegisterText);
			  wait(5);
			  click(lblCancel);
			  }
			  
			  public void verifyChooseEventBtn(){
				  if(elementExist(lblEventCalendarText)) {
			  verifyText("CHOOSE EVENT",lblEventCalendarText);
				  }
			}
		    public void scrollBar() {
		    WebElement element = driver.findElement( By.xpath("//h1[contains(text(),'checking for classroom 1')]")); 
		    if(BrowserFactory.getOS() == "win") {
		    Actions actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
		    }
		    }


}