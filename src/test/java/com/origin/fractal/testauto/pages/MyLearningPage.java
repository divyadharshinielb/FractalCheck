package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.origin.fractal.testauto.FractalBasePage;

public class MyLearningPage extends FractalBasePage {
	/***********Newui****************/
	private By lblOvCoStatus = By.xpath(".//p[contains(text(),'COMPLETION')]");
	private By lblBCMyLearning = By.xpath(".//a[text()='My Learning']");//*[@id='breadCrumb']/*//span[contains(text(),'My Learning')]
    
	
	private By lblAll = By.xpath(".//button[contains(text(),'ALL')]");//*[@id='ngview']/*//ng-include/*//ng-include/*//a[1][contains(text(),'ALL')]
	private By lblCourses = By.xpath(".//button[contains(text(),'COURSES')]");//*[@id='ngview']/*//ng-include/*//span[contains(text(),'courses')]
	private By lblLearningpath=By.xpath(".//button[contains(text(),'LEARNING PATHS')]");
	private By lblResources = By.xpath(".//button[contains(text(),'RESOURCES')]");//*[@id='ngview']/*//ng-include/*//span[contains(text(),'resources')]
	private By lblBundles = By.xpath(".//button[contains(text(),'BUNDLES')]");//*[@id='ngview']/*//ng-include/*//span[contains(text(),'bundles')]
	private By lblListView = By.xpath(".//div[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-xs-12 mt-2 mb-3')]//div[2]//div[1]//a[1]");
	private By btnGrid = By.xpath(".//a//i[contains(@class,'icon-grid-selected font-16')]");
	
	
	private By lblCompl = By.className("react-sweet-progress-symbol");
	private By enrolledText = By.xpath("//span[@class='enroll_now_btn']");
	private By expiredText = By.xpath("//p[@class='myexpired myfont']");
	private By clickCatalog = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]/div[1]");//Updated on Nov-22-18
    private By clickCatalogBundle2= By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/div[1]/div[1]");
    private By clickCatalogBundle3= By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/a[1]/div[1]/div[1]");
	private By lblCatlogCategory = By.xpath(".//div[contains(@class,'container pl-0 bgcolor')]//div[contains(@class,'category')]//div[1]");//div[contains(text(),'Category :')]
	private By lblLanguage = By.xpath(".//div[contains(@class,'category')]//div[2]");//div[contains(text(),'Language :')]
	private By lblValidity = By.xpath("//div[text()='Validity:']");
	/********************/	
	private By lblDurationInCat = By.xpath(".//*[@id='ngview']/div/ng-include/*//div/*//span[contains(text(),'Duration')]");
	private String lblFilterLink = ".//div/ng-include/*//div/ng-include/div/*//div/a[contains(text(),'ALL')]/../a";
	private String boxBtn = ".//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a";
	private String boxCatType = "]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h6[1]/span[2]";
	private By boxButton = By.xpath("./html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]");//div/ng-include/*//div/ng-include/div/*//div/*//p[contains(text(),'Category')]/../../../../../div
	/************Newui***************/
	private By lblCatnameInside = By.xpath(".//span[@class='three-line-clamp']");//*[@id='ngview']/div/ng-include/*//div/span[contains(text(),'Updated on')]/../*//h3
	private By bundleCnt = By.xpath("./html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]/div[1]");////Updated Nov-22-18
	private By lblcourseName = By.xpath(".//span[@class='three-line-clamp']");//Updated Nov-22-18//h1[@class='masonry-bundlename ellipsis padding-t-5']
	private By lblDuration = By.xpath(".//div/*//span[contains(text(),'Duration')]");
	private By lblTick = By.xpath(".//button[@class='pl-30 launch_btn www']//img");//round-progress-wrapper
	private By lblCompleted = By.xpath("//li[@id='react-tabs-2']");

	private By lblCategory = By.xpath(".//a[contains(text(),'CATEGORIES')]");//a[contains(text(),'CATEGORIES')]
   
	private String categoryList = "../html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]//div//ul//li";//*[@id='header']/*//button[contains(text(),'Category')]/../../div/ul/li
    
	private By lblStar= By.xpath("./html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/label[4]/i[1]");//div/ng-include/div/*//div/ng-include/div/*//div/ul
	private By lblCatalogTick= By.xpath("./html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/img[1]");//div/ng-include/div/*//div/ng-include/div/*//div/ul/../../div/*//div[contains(@class,'round-progress-wrapper')]
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
	private By categorypopupbtn1 =By.xpath("//span[@class='r-border'][1]");
	private By searchbar = By.xpath("//input[contains(@name,'searchterm')]");
//	private By categorypopuptext1 = By.xpath("//div[contains(text(),'Automation Test, Functional Testing, General, Project, Project Lead, Project Management, Technology, Time Management')]");
	private By lblhome = By.xpath("//img[contains(@class,'logo-height')]");
	private By lblProfile = By.xpath(".//div[contains(@class,'logout_pop')]/*//button[contains(@class,'circle-hover')]");//*[@id='dLabel']/span
	private By multiplecategorycatalog = By.xpath("//a[contains(text(),'checkmultiplechoice')]");
	private By categorypopupbtn = By.xpath("//span[@class='r-border mtoptab']");
//	private By categorypopuptext = By.xpath("//div[contains(text(),'Automation Test, Project Lead, Project Management, Functional Testing, Time Management, Project, General, Technology')]");
	private By viewallbtn = By.xpath("//a[contains(text(),'VIEW ALL')]");
	private By listviewhome = By.xpath("//i[@class='icon-list font-16']");
	private By multiplecatalogpopup = By.xpath("//div[contains(@class,'pop-updiv zindx')]");
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
		if(elementExist(lblResources)) {
		verifyLabel("lblResources", lblResources);
		}
		if(elementExist(lblBundles)) {
		verifyLabel("lblBundles", lblBundles);
		}
		if(elementExist(lblLearningpath)) {
		verifyLabel("lblLearningPaths",lblLearningpath);
		}
	}

	
	public void verifyComplStatus() {
		verifyComplPercent(lblCompl);
	}
	

	public void verifyCatalogname() {
		wait(2);
		click(clickCatalog);
		verifyText(getLabel("lblCatalogName"), lblCatnameInside);
		wait(2);
	    click(lblMyLearning);
	}

	public void verifyCatalogDetails() {
		/**added here 1/30/2019**/
		wait(5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element= driver.findElement(lblAll);
		js.executeScript("arguments[0].scrollIntoView();",Element);
		wait(2);
		click(clickCatalog);
		/***/
		verifyPartialLabelText("lblUpdatedOn", lblCatlogCategory);
	//	verifyPartialLabelText("lbloverview", lbloverview);
		if(elementExist(lblValidity)) {
		verifyPartialLabelText("lblValidtill", lblValidity);}
		verifyPartialLabelText("lblDuration", lblLanguage);
	}

	public void verifyCourseInBundle() {
		if(elementExist(lblBundles)) {
		click(lblBundles);
		wait(3);
		click(bundleCnt);
		verifyLabel("lblCourseNameText", lblcourseName);
		}
	}

	public void verifyAllFilter() {
		wait(5);
		if(elementExist(lblAll)){
		wait(2);
		click(lblAll);
		}
		click(lblListView);
		verifyAllFilterType(boxBtn, boxCatType, lblFilterLink);
		
	}

	public void verifyBundleFilter() {
		wait(2);
		WebElement element = driver.findElement(lblAll);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait(2);
		click(lblAll);
		wait(5);
		if(elementExist(lblBundles)) {
		click(lblBundles);
		wait(5);
		click(lblListView);
		verifyFilterType(boxBtn, boxCatType, "bundle");
		}
	}

	public void verifyCourseFilter() {
		click(lblAll);
		wait(5);
		if(elementExist(lblCourses)) {
		click(lblCourses);
		wait(5);
		click(lblListView);
		verifyFilterType(boxBtn, boxCatType, "course");
		}
	}

	public void verifyResourceFilter() {
		click(lblAll);
		wait(5);
		if(elementExist(lblResources)) {
		click(lblResources);
		wait(5);
		click(lblListView);
		verifyFilterType(boxBtn, boxCatType, "resource");
		}
	}

	public void verifyTickmark() {
		click(lblCompleted);
		if(elementExist(boxButton)) {
			wait(2);
			click(boxButton);
			//	click(lblDuration);
		  elementExist(lblTick);
		}
	}

	public void verifyGridView() {
		click(lblAll);
		wait(2);
	//	gridView();
		System.out.println("true");
	}
	public void verifyListView() {
	/*	wait(2);
		click(lblAll);
		wait(5);
	//	listView();
	*/	System.out.println("true");
	}
	public void verifyCategory() {
		wait(5);
		verifyPartialLabelText("lblcategory", lblCategory);
	}
	

	public void verifyCategoryList() {
		click(lblCategory);
		verifyAllCategories(categoryList);
		wait(2);
	}

	public void verifyRatings() throws Exception {
		wait(2);
		click(lblCompleted);
	/*	wait(2);
		click(btnGrid);
		wait(2);
		click(boxButton);
		wait(5);
	*/if(elementExist(boxButton)) {
		click(boxButton);
		wait(2);
		verifyCompletedCatalog(lblStar,lblCatalogTick);
	}
	else {
		throw new Exception( );

	}
	}

	public void verifyBundleContents() {
		if(elementExist(lblBundles)) {
			wait(5);
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("javascript:window.scrollBy(250,350)");
			wait(10);
		click(lblBundles);
		wait(5);
		if(elementExist(expiredText)) {
		click(clickCatalog);
		wait(5);
		click(enrolledText);
		wait(5);
		}
		else if(elementExist(clickCatalog)) {
			click(clickCatalog);
		}
	  else if(elementExist(clickCatalogBundle2)) {
			click(clickCatalogBundle2);
		}
		else {
			click(clickCatalogBundle3);
		}
		verifyCatalogDeatils("lblBundleName","lblBundleType","lblNoOfBundleContents","lblBundleValidity");
		}
	}
	public void verifyCourseContents() throws Exception {
		if(elementExist(lblCourses)) {
			wait(10);
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("javascript:window.scrollBy(250,350)");
	        wait(5);
		click(lblCourses);
		if(elementExist(expiredText)) {
			click(clickCatalog);
			wait(5);
			click(enrolledText);
			wait(5);
			}
			else if(elementExist(clickCatalog)) {
				click(clickCatalog);
			}
		  else if(elementExist(clickCatalogBundle2)) {
				click(clickCatalogBundle2);
			}
			else {
				click(clickCatalogBundle3);
			}
		verifyCatalogDeatils("lblCourseName","lblCourseType","lblNoOfCourseContents","lblCourseValidity");
		}
	else {
		throw new Exception( );

	}
		}
		

	public void verifyLaunch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element= driver.findElement(clickCatalog);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		wait(2);
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
	private By clickClassroomCatalog=By.xpath(".//a[contains(text(),'Automation_Learningpath')]");
	private By globalSearch=By.xpath(".//input[@id='theInput']");
	private By lbldetails=By.xpath("//button[@class='detail_btn']");//div[2]//div[1]//div[1]//div[2]//div[1]//h6[1]//div[1]//button[1]//button[contains(text(),'DETAILS')]//div[5]//div[1]//div[1]//div[2]//div[1]//h6[1]//div[1]//button[contains(text(),'Details')]
	private By classroomlblDate=By.xpath("//p[contains(@class,'timebox-li margin-b-7')]");
	private By classroomlblTime=By.xpath("//div[contains(@class,'margin-t-0')]//p[2]");
    private By classroomlblLocation=By.xpath("//div[contains(@class,'display-box')]");
    private By lblAssignedClassroom=By.xpath("//h3[contains(text(),'Checking_for_classroom1')]");
    private By classroomlblEvent=By.xpath("//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]");
    private By classroomlblEventDate=By.xpath("//div[contains(@class,'col-lg-2 col-md-2 col-sm-2 col-xs-2 height-115 event-bg')]");
    private By classroomlblEventTime=By.xpath("//div[contains(@class,'display-box')]//div[contains(@class,'padding-t-5')]");
    private By classroomlblEventLocation=By.xpath("//div[contains(@class,'font-14 padding-l-10 padding-t-20 color6f')]");
    private By classroomlblEventRegistration=By.xpath("//button[contains(@class,'regBtn')]");
    private By lblTraditionalClass=By.xpath(".//button[contains(text(),'TRADITIONAL CLASS')]");
    private By lblCancel=By.xpath("  //button[contains(text(),'CANCEL')]");
    private By lblRegisterText=By.xpath("//p[contains(@class,'margin-tb-50 destext myfont text_center line-ht')]//p[1]");
    private By btnCancelRegistration=By.xpath(".//button[contains(text(),'CANCEL REGISTRATION')]");
    private By lblAssignedClassroom3=By.xpath(" //h1[contains(text(),'Checking for classroom1')]");
    private By lblPreeventActivities=By.xpath("//span[contains(text(),'Pre-event Activities')]");
    private By lblReference=By.xpath(" //span[contains(text(),'Reference')]");
    private By lblPosteventActivities=By.xpath("//span[contains(text(),'Post-event Activities')]");
    private By lblTermsCondition=By.xpath("//p[contains(text(),'Terms & Conditions')]");
    private By breadcrumLink=By.xpath("//a[text()='Automation Learningpath']");
    private By registrationCancelText=By.xpath("//p[@class='f-s-20 margin-tb-10 heading2text myfont text_center boldText']");
    private By btnNO=By.xpath("//button[contains(text(),'NO')]");
    private By classroomParent=By.xpath("//h1[contains(text(),'classroom')]/../../..");
    private By lblEventCalendarText=By.xpath("//button[contains(text(),'CANCEL REGISTRATION')]");
    private By lblAssignedClassroom2=By.xpath("//h1[contains(text(),'classroom')]");
    private By privacyText=By.xpath("//a[contains(text(),'Privacy')]");
    
    public void  verifyClassroomDetails() {
				wait(5);
				click(globalSearch);
				wait(10);	
				Actions action=new Actions(driver);
				action.sendKeys("Automation_Learningpath").sendKeys(Keys.ENTER).build().perform();
				 wait(15);
			 
			 WebElement element = driver.findElement(clickClassroomCatalog); Actions 
				actions = new Actions(driver); actions.moveToElement(element);
				actions.perform();
				wait(10);
		   /*   WebElement element = driver.findElement(clickClassroomCatalog);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				wait(10);
		    */	click(clickClassroomCatalog);
			  wait(5);
		    }
			  public void	verifyAssignedClassroom(){
			  scrollBar();
				  wait(5);
				 verifyText("checking_for_classroom1",lblAssignedClassroom);
					}
			  
			  public void	verifyDetailsBtn(){
				  verifyText("Details",lbldetails);
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
				scrollToElement(lblAssignedClassroom2);
				wait(5);
				click(lblAssignedClassroom2);
				wait(5);
				scrollToElement(privacyText);
				//  verifyText("Pre-event Activities",lblPreeventActivities);
				if(elementExist(lblReference)) {
				  verifyText("Reference",lblReference);
				}
				//  verifyText("Post-event Activities",lblPosteventActivities);
				if(elementExist(lblTermsCondition)) {
				  verifyText("Terms & Conditions",lblTermsCondition);
				}
				wait(5);
			}
//			  Checking whether the Event is displayed under classroom object
			  public void verifyEventDisplayClassroomObject(){
				  click(lblAssignedClassroom);
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
				  wait(2);
				  click(lblAssignedClassroom3);
				  wait(2);
			   elementExist(classroomlblEventDate);
			   wait(2);
			   WebElement element = driver.findElement( By.xpath("//button[contains(@class,'regBtn')]")); Actions
				actions = new Actions(driver); actions.moveToElement(element);
				actions.perform();
				wait(2);
			  click(classroomlblEventRegistration);
			  verifyText("By registering, you are accepting the",lblRegisterText);
			  wait(5);
			  click(lblCancel);
			  }
			  
			  public void verifyChooseEventBtn() throws Exception{
				//  scrollToElement(classroomParent);
				  wait(2);
				/*  if(elementExist(lblEventCalendarText)) {
			  	  verifyText("CANCEL REGISTRATION",lblEventCalendarText);
				  wait(2);
				  }  
				  else {
						throw new Exception( );

					}
				  */
			}
		    public void scrollBar() {
		   /* WebElement element = driver.findElement( By.xpath("//h1[contains(text(),'checking for classroom 1')]")); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();*/
			WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Checking_for_classroom1')]"));
			Actions a = new Actions(driver);
		      a.moveToElement(element);
		      a.perform();
		    }
		    public void multiplecategorycheck() {
		    	  //code to search for a catalog in search bar and check for multiplecategories
		    	    wait(2);
		    	   click(searchbar);
		    	   enterData("checkmultiplechoice",searchbar);
		    	   driver.findElement(By.xpath("//input[contains(@name,'searchterm')]")).sendKeys(Keys.ENTER);
		    	   elementExist(categorypopupbtn);
		    	   click(categorypopupbtn);
		    	   wait(2);
		    	   elementExist(multiplecatalogpopup);
		    	   driver.navigate().refresh();
		    	   //code to check for multiplecategories in mylearning completed list view
		    	   click(lblMyLearning);
		    	   wait(6);
		    	  click(searchbar);
		    	   enterData("checkmultiplechoice",searchbar);
		    	  driver.findElement(By.xpath("//input[contains(@name,'searchterm')]")).sendKeys(Keys.ENTER);
		    	/*    click(lblListView);
		    	   wait(5);
		    	*/  
		    	  //commented as it invloves the search page only again
		    	/*  JavascriptExecutor js = (JavascriptExecutor) driver;
		    	WebElement Element= driver.findElement(By.xpath("//span[@class='r-border'][1]"));
		    	js.executeScript("arguments[0].scrollIntoView();", Element);
		    	wait(5);
		    	   click(categorypopupbtn1);
		    	   wait(2);
		    	   elementExist(multiplecatalogpopup);
		    	   wait(5);
		    	   driver.navigate().refresh();*/
		    	   }
			 	  //  }
			 public  void multiplecategoryhomepage() {
			    //check for multiple categories in Homepage
			    wait(2);
			    click(lblhome);
			    wait(5);
			    WebElement element = driver.findElement(viewallbtn); //By.xpath("//div[@class='popular_title title']")
			    elementExist(viewallbtn);
			    wait(5);
			    Actions actions = new Actions(driver);
			    wait(5);
			    actions.moveToElement(element).perform();
			    wait(2);
			    click(viewallbtn);
			    wait(3);
			    click(listviewhome);
			    wait(2);
			    elementExist(categorypopupbtn1);
			    WebElement element1 = driver.findElement(By.xpath("(//span[@class='r-border'])[1]")); //a[17]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[3]//a[1]//h6[1]//span[1]
			    Actions actions1 = new Actions(driver); actions1.moveToElement(element1);
			    actions1.perform();
			    wait(5);
			    click(categorypopupbtn1);
			    wait(2);
			    elementExist(multiplecatalogpopup);
			    driver.navigate().refresh();
			 }

				//Added by vignesh on 30-Nov-20
				private By viewCertiBtn=By.xpath("(//*[@class='certify_Check'])");//Updated on 9-Oct-20

				private By certificateModule = By.xpath("//*[@class='cert_rect']");
				private By txtCongratulations = By.xpath("//*[@class='cert_font'][contains(text(),'Congratulations')]");
				private By txtUserFirstName = By.xpath("//*[@class='KARTHIK__S no-printme']//*[@class='resultname1']");
				private By certifDownloadBtn = By.xpath("//*[@id='printPageButton']");
				private By ratingOverLay = By.xpath("(//*[@class='my-masonry-grid_column'])[1]//*[@class='overlay']");
				private By ratingStars = By.xpath("(//*[@class='my-masonry-grid_column'])[1]//*[@class='overlay']//*[@class='star']//*[@class='dv-star-rating']");
				private By ratingDonebtn = By.xpath("(//*[@class='my-masonry-grid_column'])[1]//*[@class='overlay']//button[text()='DONE']");
				//				private By completedItem= By.xpath("(//*[@class='my-masonry-grid_column'])[1]");
				private By completedItem= By.xpath	("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div//p//a");//Updated on 12-Mar-21
				private By tabMyLearning = By.xpath("//*[@href='/mylearning']");//Added on 9_oct-20
				private By certificationIcon= By.xpath("(//*[@class='detail_Certify'])");

				/* Function Name: verifyCertificateModule()
				 * Action: Verifying certificate module
				 * Return type: boolean
				 */
				public boolean verifyCertificateModule() {
					wait(10);
					click(tabMyLearning);
					wait(15);//Updated on 6-Jan-21
					click(lblCompleted);
					wait(15);//Updated on 6-Jan-21
//					if(elementExist(ratingOverLay)) {
//						click(ratingStars);
//						click(ratingDonebtn);
//						wait(3);
//					}
					print("Check");
					elementExist(By.xpath("//button[contains(text(),'RESOURCES')]"));
					click(By.xpath("//button[contains(text(),'RESOURCES')]/.."));
					wait(6);
					WebElement element = driver.findElement(completedItem);
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
					wait(2);
					click(completedItem);
					wait(10);
					if(elementExist(certificationIcon) && elementExist(viewCertiBtn)) {
						moveElementFocusandClick(viewCertiBtn);
						wait(5);
						if(elementExist(certificateModule) && elementExist(txtCongratulations) 
								&& elementExist(txtUserFirstName) && elementExist(certifDownloadBtn)) {
							print("PASSED: Certificate Module is working fine");
							return true;
						}
					}
					else {
						print("FAILED: Catalog item do not have a certificate");
					}
					return false;
				}
				//Ends
}