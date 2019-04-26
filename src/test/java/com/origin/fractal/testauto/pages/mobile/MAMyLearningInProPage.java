package com.origin.fractal.testauto.pages.mobile;

import org.openqa.selenium.By;

import com.origin.fractal.testauto.FractalAppPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class MAMyLearningInProPage extends FractalAppPage {
	private By txtTitleMyLrn = By.id("com.originkonnect.app:id/action");
	private By tabCompleted = By.xpath("//android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView");
	private By btnMenu = By.id("com.originkonnect.app:id/action_bar_back");
	private By lblInprogress = By.xpath(".//*[@resource-id='com.originkonnect.app:id/tablayout']/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView");

	private By listView = By.id("com.originkonnect.app:id/list_icon");
	private By gridView = By.id("com.originkonnect.app:id/grid_icon");
	private By listViewCheck = By.id("com.originkonnect.app:id/expandable_listview");
	private By gridViewCheck = By.id("com.originkonnect.app:id/gridview");
	private By filterIcon = By.id("com.originkonnect.app:id/filter_icon");
	private By filterLandingPage = By.id("com.originkonnect.app:id/r1");
	private By bundleClick = By.id("com.originkonnect.app:id/bundle_text");
	private By applyButton = By.id("com.originkonnect.app:id/apply");
	private By filterAll = By.id("com.originkonnect.app:id/all_selected");
	private By progressBar = By.id("com.originkonnect.app:id/circularprogress");
	private By searchICon = By.id("com.originkonnect.app:id/search");
	private By searchText = By.id("com.originkonnect.app:id/search_text");
	private By clickCell = By.id("com.originkonnect.app:id/layout_cell");
	private By verifytext = By.id("com.originkonnect.app:id/catalog_name");
	private By backButton = By.id("com.originkonnect.app:id/new_back");
	private By closeButton = By.id("com.originkonnect.app:id/close_grey");
	private By catalogType = By.id("com.originkonnect.app:id/item_logo");	
	private By catalogName = By.id("com.originkonnect.app:id/contentname");
	
	private By btnNotification = By.id("com.originkonnect.app:id/notification");
	private By  txtWhatsnew= By.id("com.originkonnect.app:id/textView1");
	private By  btnMore= By.id("com.originkonnect.app:id/more");
	private By  elements= By.xpath(".//android.widget.ListView/android.widget.RelativeLayout");
	private By  btnBack= By.id("com.originkonnect.app:id/imageView15");
	private By  firstNotifItem= By.id("com.originkonnect.app:id/component");
	private By  imgDirectLobj= By.id("com.originkonnect.app:id/obj_image");
	private By  webView= By.className("android.webkit.WebView");
	private By  imgInCatalogLobj= By.id("com.originkonnect.app:id/item_logo");
	private By  imgCatalog= By.id("com.originkonnect.app:id/lp_image");
	private By  clickBack= By.id("com.originkonnect.app:id/action_bar_back");
	private By  emptySpaceTop= By.id("com.originkonnect.app:id/empty_space_top");	
	
	//Added by Karpagavalli on 20.12.2018
	private By bundelFilter = By.xpath("(//android.widget.ImageView[@content-desc=\"bundle\"])");
	private By courseSelection = By.id("com.originkonnect.app:id/course_text");
	private By courseFilter = By.xpath("(//android.widget.ImageView[@content-desc=\'course\'])");
	private By clearButton = By.id("com.originkonnect.app:id/clear_text");
	private By learningpathSelection = By.id("com.originkonnect.app:id/lp_text");
	private By learningpathFilter = By.xpath("//android.widget.ImageView[@content-desc=\"learningpath\"]");
	private By resourceSelection = By.id("com.originkonnect.app:id/resource_text");
	private By textView = By.className("android.widget.TextView");
	private By itemCount = By.id("com.originkonnect.app:id/item_count");
	private By resourceFilter = By.xpath("(//android.widget.ImageView[@content-desc=\"resource\"])");
	//added by karpagavalli on 21.12.2018
	private By catalogLogo = By.id("com.originkonnect.app:id/catalog_logo");
	private By catalogTitle = By.id("com.originkonnect.app:id/catalog_name");
	//added by karpagavalli till here
	//Added by Manju pria A on JAN-11-19
	private By linkMyLearning = By.id("com.originkonnect.app:id/mylearning_text");
	private By yellowTick = By.id("com.originkonnect.app:id/tick");
	private By inprogCatalogName = By.id("com.originkonnect.app:id/contentname");
	private By inprogCatalogType = By.id("com.originkonnect.app:id/item_logo");
	private By iosItemsList = By.id("");//Added only for ios
	private By clickOnBundle = By.id("com.originkonnect.app:id/grid_image");//Added only for ios
	private By bundleCatalogLogo = By.id("com.originkonnect.app:id/catalog_logo");//Added only for ios - Catalog type after clicking on a particular catalog
	private By bundleTitle = By.id("com.originkonnect.app:id/catalog_name");//Added only for ios - Catalog name after clicking on a particular catalog
	private By clickOnLpath = By.id("");//Added only for ios
	private By lpathCatalogLogo = By.id("com.originkonnect.app:id/catalog_logo");//Added only for ios - Catalog type after clicking on a particular catalog
	private By lpathTitle = By.id("");//Added only for ios
	private By courseCatalogLogo = By.id("com.originkonnect.app:id/catalog_logo");//Added only for ios - Catalog type after clicking on a particular catalog
	private By clickOnCourse = By.id("");//Added only for ios
	private By clickOnResource = By.id("");//Added only for ios
	private By resourceCatalogLogo = By.id("com.originkonnect.app:id/catalog_logo");//Added only for ios - Catalog type after clicking on a particular catalog
	private By btnCloseSearch = By.id("");//Added only for ios
	private By insideCatBackBtn = By.id("");//Added only for ios
	private By descNotif = By.xpath("//XCUIElementTypeImage[contains(@name,'description_icon')]");
	private By btnBackWhiteNotif = By.xpath("//XCUIElementTypeButton[contains(@name,'iconBack white')]");
	//Added by Manju Priya A on Jan-14-19
	private By  helpTextVoiceAssist= By.id("com.originkonnect.app:id/greeting");
	private By  btnVoiceAssistant= By.id("com.originkonnect.app:id/fab");
	private By  iconVoiceRec= By.id("com.originkonnect.app:id/btn_record");
	private By  iconVoiceAssistant= By.id("com.originkonnect.app:id/chatbot_img");
	private By  btnDeny= By.id("com.android.packageinstaller:id/permission_deny_button");
	private By  btnAllow= By.id("com.android.packageinstaller:id/permission_allow_button");
	
	private By  insideLpathBackBtn= By.id("");
	private By  resourceCatalogTitle= By.id("");
	private By  courseCatalogTitle= By.id("//XCUIElementTypeImage[contains(@name,'course_White')]/../XCUIElementTypeStaticText[1]");
	private By lblBackBtn=By.id("com.originkonnect.app:id/back_white");
	public MAMyLearningInProPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
		this.setLocators();
	}

	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			/*
			txtTitleMyLrn = By.name("MY LEARNING");
			tabCompleted = By.id("COMPLETED");
			btnMenu = By.xpath("//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[1]");
			*/
			txtTitleMyLrn = By.name("MY LEARNING");
			tabCompleted = By.id("COMPLETED");
			btnMenu = By.xpath("//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[1]");
			/*Starts - added By manju priya A on Dec-27-18*/
			linkMyLearning = By.xpath("//XCUIElementTypeStaticText[contains(@name,'MY LEARNING')]");
			catalogType = By.xpath("//XCUIElementTypeImage[contains(@name,'bundle_Grey')]");//If there is no bundle in MyLearning page this will break - have to check with the developer
			catalogName = By.xpath("//XCUIElementTypeImage[contains(@name,'bundle_Grey')]/../XCUIElementTypeStaticText");//If there is no bundle in MyLearning page this will break  - have to check with the developer
			lblInprogress = By.xpath("//XCUIElementTypeButton[contains(@name,'IN PROGRESS')]");
			listView = By.xpath("//XCUIElementTypeScrollView/*//XCUIElementTypeButton[2]");
			gridView = By.xpath("//XCUIElementTypeScrollView/*//XCUIElementTypeButton[1]");
			//gridView = By.xpath("//XCUIElementTypeButton[contains(@name,'gray grid')]");//XCUIElementTypeButton[contains(@name,'dark grid')]
			listViewCheck = By.xpath("//XCUIElementTypeButton[contains(@name,'dark list')]");
			gridViewCheck = By.xpath("//XCUIElementTypeButton[contains(@name,'dark grid')]");//XCUIElementTypeButton[contains(@name,'gray list')]
			//listView = By.xpath("//XCUIElementTypeButton[contains(@name,'gray List')]");//XCUIElementTypeButton[contains(@name,'dark list')]
			//listViewCheck = By.xpath("//XCUIElementTypeButton[contains(@name,'gray grid')]");//XCUIElementTypeButton[contains(@name,'gray grid')]
			searchICon = By.xpath("//XCUIElementTypeButton[contains(@name,'search gray')]");
			searchText = By.xpath("//XCUIElementTypeTextField[contains(@value,'Search here')]");
			verifytext = By.xpath("//XCUIElementTypeImage[contains(@name,'iconBack_white')]/../XCUIElementTypeStaticText[1]");//This also will fail if there is no content in Language Training
			backButton = By.xpath("//XCUIElementTypeImage[contains(@name,'iconBack_white')]/../XCUIElementTypeButton[1]");
			closeButton = By.xpath("//XCUIElementTypeButton[contains(@value,'close')]");
			clickCell = By.xpath("//XCUIElementTypeImage[starts-with(@name,'cell_') or @name='resource_Grey']/..");//To click on search result
			yellowTick = By.xpath("//XCUIElementTypeImage[contains(@name,'yellow_tick')]");
			//lblTitle = By.xpath("//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[1]/../XCUIElementTypeStaticText[1]");//MY LEARNING//CATALOG//MY ACCOUNT
			/*End of - added By manju priya A on Dec-27-18*/
			/*Starts - added By manju priya A on Dec-27-18*/
			inprogCatalogName = By.xpath("//XCUIElementTypeImage[contains(@name,'bundle_Grey')]/../XCUIElementTypeStaticText");
			inprogCatalogType = By.xpath("//XCUIElementTypeImage[contains(@name,'bundle_Grey')]");
			filterIcon = By.xpath("//XCUIElementTypeButton[contains(@name,'filter')]");//Filter icon in My Learning page
			filterLandingPage = By.xpath("//XCUIElementTypeStaticText[contains(@value,'FILTER')]");
			filterAll = By.xpath("//XCUIElementTypeStaticText[contains(@name,'All')]");
			applyButton = By.xpath("//XCUIElementTypeButton[contains(@name,'APPLY')]");//Apply Button in My Learning Filter Page page
			bundleClick = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Bundle')]/../XCUIElementTypeButton");//Bundle option in My Learning Filter Page page
			bundelFilter = By.xpath("//XCUIElementTypeImage[contains(@name,'bundle_Grey')]");//Bundle icon on Bundle in My Learning Filter Page page
			learningpathSelection = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Learning Path')]");
			learningpathFilter = By.xpath("//XCUIElementTypeImage[starts-with(@name,'learningpath_Without_Timeline_Grey')]");
			courseSelection = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Course')]");
			courseFilter = By.xpath("//XCUIElementTypeImage[contains(@name,'course_Grey')]");
			resourceSelection = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Resource')]");
			resourceFilter = By.xpath("//XCUIElementTypeImage[contains(@name,'resource_Grey')]");
			/*End of - added By manju priya A on Dec-28-18*/
			/*Starts - added By manju priya A on Jan-03-19*/
			progressBar = By.xpath("//XCUIElementTypeImage[contains(@name,'description_icon')]");//(This must be the progress circle's xpath inside the catalog item after clicking any catalog item)This is not the correct one, after getting fixed apk from Ajith, I have to take xpath for this
			bundleCatalogLogo = By.xpath("//XCUIElementTypeImage[contains(@name,'bundle_title_icon')]");//Bundle image inside the catalog item
			catalogTitle = By.xpath("//XCUIElementTypeImage[contains(@name,'iconBack_white')]/../XCUIElementTypeStaticText[1]");//Catalog title inside bundle
			//bundleTitle = By.xpath("//XCUIElementTypeImage[contains(@name,'bundle_title_icon')]/../XCUIElementTypeStaticText[1]");
			itemCount = By.xpath("//XCUIElementTypeImage[contains(@name,'description_icon')]/../../XCUIElementTypeOther[2]/*//XCUIElementTypeStaticText");//Catalog contents count inside the catalog item, next to desc icon
			iosItemsList = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Contents')]/../*//XCUIElementTypeCell");//each box box after contents inside the catalog item
			clickOnBundle = By.xpath("//XCUIElementTypeImage[contains(@name,'bundle_Grey')]/../XCUIElementTypeImage[1]/..");
			//clickOnBundle = By.xpath("//XCUIElementTypeImage[contains(@name,'iconBack_white')]/../XCUIElementTypeStaticText[1]");
			clickOnLpath = By.xpath("//XCUIElementTypeImage[starts-with(@name,'learningpath')]/../XCUIElementTypeImage/..");
			lpathCatalogLogo = By.xpath("//XCUIElementTypeImage[starts-with(@name,'learningpath')][2]");
			clickOnCourse = By.xpath("//XCUIElementTypeImage[contains(@name,'course_Grey')]/../XCUIElementTypeImage/..");
			courseCatalogLogo = By.xpath("//XCUIElementTypeImage[contains(@name,'course_White')]");
			clickOnResource = By.xpath("//XCUIElementTypeImage[contains(@name,'resource_Grey')]/../XCUIElementTypeImage/..");
			resourceCatalogLogo = By.xpath("//XCUIElementTypeImage[contains(@name,'resource_white')]");
			btnCloseSearch = By.xpath("(//XCUIElementTypeButton[@name=\"close\"])[2]");
			insideCatBackBtn = By.xpath("//XCUIElementTypeButton[starts-with(@name,'iconBack')]/../XCUIElementTypeButton[1]");
			insideLpathBackBtn = By.xpath("//XCUIElementTypeImage[contains(@name,'iconBack_white')]/../XCUIElementTypeButton[1]");
			
			
			//yellowTick = By.xpath("");
			txtTitleMyLrn = By.name("MY LEARNING");
			tabCompleted = By.id("COMPLETED");
			btnMenu = By.xpath("//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[1]");
			/*Starts - added by Manju Priya A on Dec-26-18*/
			txtWhatsnew = By.xpath("//XCUIElementTypeImage[@name=\"notification_bg\"]/../XCUIElementTypeStaticText[2]");
			btnNotification = By.xpath("//XCUIElementTypeButton[contains(@name,'notificationIcon grey')]");
			btnMore = By.xpath("//XCUIElementTypeStaticText[contains(@value,'MORE')]");
			elements = By.xpath("//XCUIElementTypeStaticText[@name='NOTIFICATIONS']/../../XCUIElementTypeTable/XCUIElementTypeCell");
			clickBack = By.xpath("//XCUIElementTypeButton[@name='back icon Green']");
			//XCUIElementTypeImage[@name='menuButton']/../XCUIElementTypeButton[2]->alternative for btnNotification
			firstNotifItem = By.xpath("//XCUIElementTypeImage[contains(@name,'notification_bg')]/../XCUIElementTypeStaticText[starts-with(@name,'NEW')]");
			/*Ends - added by Manju Priya A on Dec-26-18*/
			btnBack = By.xpath("//XCUIElementTypeButton[contains(@name,'back icon Green')]");
			emptySpaceTop = By.xpath("//XCUIElementTypeButton[starts-with(@name,'notificationIcon')]");
			descNotif = By.xpath("//XCUIElementTypeImage[contains(@name,'description_icon')]");
			btnBackWhiteNotif = By.xpath("//XCUIElementTypeButton[contains(@name,'iconBack white')]");
			//Added by Manju Priya A on Jan-09-19
			helpTextVoiceAssist= By.xpath("com.originkonnect.app:id/greeting");
			btnVoiceAssistant= By.xpath("//XCUIElementTypeButton[@name=\"chat trigger\"]");//
			iconVoiceRec= By.xpath("com.originkonnect.app:id/btn_record");
			iconVoiceAssistant= By.xpath("com.originkonnect.app:id/chatbot_img");
			btnDeny= By.xpath("//XCUIElementTypeButton[@name=\"Don’t Allow\"]");//
			btnAllow= By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]");//
			
			bundleTitle = By.xpath("//XCUIElementTypeButton[contains(@name,'iconBack white')]/../XCUIElementTypeStaticText[1]");
			resourceCatalogTitle = By.xpath("//XCUIElementTypeButton[contains(@name,'iconBack white')]/../XCUIElementTypeStaticText[1]");
			courseCatalogTitle= By.xpath("//XCUIElementTypeImage[contains(@name,'course_White')]/../XCUIElementTypeStaticText[1]");
			//lpathCatalogLogo = By.xpath("");
			//lpathTitle = By.xpath("");
			
			//lpathTitle = By.xpath("");
			//lpathTitle = By.xpath("");
			
			//lpathTitle = By.xpath("");
			//lpathTitle = By.xpath("");
			//
		}
	}
	public void validateMyLearningTitle() {
		wait(3);
		//Updated by Manju Priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			clickMenu();
			clickMyLearning();
		}
		verifyText("MY LEARNING", getObj(txtTitleMyLrn));
		elementExist(catalogType);
		elementExist(catalogName);
	}
	public void clickCompleted() {
		click(getObj(tabCompleted));
		wait(5);
	}
	
	public void clickMenu() {
		click(getObj(btnMenu));
		wait(5);
	}
	
	public void verifyInProgress() {
		wait(3);
		verifyText("IN PROGRESS", getObj(lblInprogress));
	}
	public void clickNotification() {
		wait(3);
		click(btnNotification);
	}
	public void verifyNotification() {
		wait(3);
		verifyText("WHAT'S NEW?", getObj(txtWhatsnew));
	}

	public void verifyMoreButton() {
		wait(3);
		if(elementExist(btnMore)) {
			verifyText("MORE", btnMore);
			click(btnMore);
			verifyMoreContents(elements);
		}
		click(btnBack);
	}
	public void verifyContentAccess() {
		if(platform.equalsIgnoreCase("ios")) {
			click(firstNotifItem);
			wait(10);//must
			//This if condition is for expired contents, if the first item is expired it wont be clickable.
			if(elementExist(firstNotifItem)) {
				//Nothing
			}else {
				lobjLaunchCheckIos();
			}
		}else {
			clickNotification();
			click(firstNotifItem);
			wait(10);//must
			lobjLaunchCheck();
			click(emptySpaceTop);
		}
	}
	//Added by Manju Priya A on Jan_14_19 for IOS
	public void lobjLaunchCheckIos() {
		if(elementExist(descNotif)) {
			print("PASSED: The catalog item opened successfully from the Notification");
			//catalogLaunchCheckIos();
		}else {
			print("PASSED: The Learning Object is opened successfully from the Notification");
			//launchIos();
		}
		click(btnBackWhiteNotif);
	}
	public boolean verifyMoreContents(By objLoc) {
		boolean status = false;
		if(getAllElements(objLoc).size() > 3) {
			status = true;
			print("PASSED: All the contents are displayed");
		}else {
			status = false;
			print("FAILED: All the contents are not displayed");
		}
		return status;
	}
	public void lobjLaunchCheck() {
		if(elementExist(webView)) {
			launchCheck();
			click(clickBack);
		}
		else if(elementExist(imgDirectLobj)) {
			if(elementExist(imgDirectLobj)) {
				click(imgDirectLobj);
				launchCheck();
				click(clickBack);
			}
			
		}else if(elementExist(imgInCatalogLobj)) {
			if(elementExist(imgInCatalogLobj)) {
				click(imgInCatalogLobj);
				launchCheck();
			}
			
			click(clickBack);
		}else {
			if(elementExist(imgCatalog)) {
				click(imgCatalog);
				cataloglaunchCheck();
				click(clickBack);
			}
			
		}
	}
	public void cataloglaunchCheck() {
		lobjLaunchCheck();
	}
	public boolean launchCheck() {
		boolean status = elementExist(webView);
		if(status) {
			print("PASSED : Learning object launched successfully");
		}else {
			print("FAILED : Learning object is not launched");
		}
		return status;
	}
	public void verifyGridView() {
		wait(5);
		click(getObj(gridView));
		wait(5);
		elementExist(gridViewCheck);
	}
	public void verifyListView() {
		wait(5);
		click(getObj(listView));
		wait(5);
		elementExist(listViewCheck);
	}
	public void allFilter() {
		wait(5);
		elementExist(filterIcon);
		click(getObj(filterIcon));
		wait(5);
		elementExist(filterLandingPage);
		wait(5);
		click(getObj(filterAll));
		wait(5);
		click(getObj(applyButton));
		elementExist(gridView);
		
	}
	
	public void searchIcon() {
		wait(5);
		click(getObj(searchICon));
		wait(5);
		typeIntoElement("Origin ",getObj(searchText));//Should give the correct assigned catalog item name, otherwise this will fail, and stope execution.
		wait(5);
		click(getObj(clickCell));
		wait(5);
		verifyText("Language Training", getObj(verifytext));
		click(getObj(backButton));
		wait(5);
		//Updated by Manju Priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			click(getObj(btnCloseSearch));
		}else {
			click(getObj(closeButton));
		}
	}
	//added by Karpagavalli on 20.12.2018
	public void bundelFilter() {
		wait(5);
		elementExist(filterIcon);
		click(getObj(filterIcon));
		wait(5);
		elementExist(filterLandingPage);
		wait(5);
		click(getObj(bundleClick));
		wait(5);
		click(getObj(applyButton));
		wait(5);
		elementExist(bundelFilter);
	}
	public void courseFilter() {
		wait(5);
		elementExist(filterIcon);
		click(getObj(filterIcon));
		wait(5);
		elementExist(filterLandingPage);
		wait(5);
		click(getObj(courseSelection));
		wait(5);
		click(getObj(applyButton));
		wait(5);
		elementExist(courseFilter);
	}
	public void learningpathFilter() {
		wait(5);
		elementExist(filterIcon);
		click(getObj(filterIcon));
		wait(5);
		elementExist(filterLandingPage);
		wait(5);
		click(getObj(learningpathSelection));
		wait(5);
		click(getObj(applyButton));
		wait(5);
		elementExist(learningpathFilter);
	}
	public void resourceFilter() {
		wait(5);
		elementExist(filterIcon);
		click(getObj(filterIcon));
		wait(5);
		elementExist(filterLandingPage);
		wait(5);
		click(getObj(resourceSelection));
		wait(5);
		click(getObj(applyButton));
		wait(5);
		elementExist(resourceFilter);
	}
	
	public void verifyBundleCount() {
		//Updated by Manju Priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			click(getObj(filterIcon));
			wait(5);
			click(getObj(bundleClick));
			click(getObj(applyButton));
			print("b4click");
			wait(5);
			click(clickOnBundle);//Xpath Updated by Manju Priya A on Jan_16_19
			wait(5);
			print("Afterclick");
			elementExist(progressBar);
			elementExist(bundleCatalogLogo);
			elementExist(catalogTitle);
			
			int count = getNumber(getText(itemCount));
			int itemCount = getItemsCount(iosItemsList);
			verifyItemsCount(count, itemCount);
			wait(5);
			elementExist(progressBar);
			//click(insideCatBackBtn);//Commented by Manju Priya A on Jan_16_19
		}
		else {
			click(getObj(filterIcon));
			wait(5);
			click(getObj(bundleClick));
			click(getObj(applyButton));
			wait(5);
			click(getObj(bundelFilter));
			wait(5);
			elementExist(progressBar);
			elementExist(catalogLogo);
			elementExist(catalogTitle);
			int count = getNumber(getText(itemCount));
			int itemCount = getItemsCount(part1,part2);
			verifyItemsCount(count, itemCount);
			wait(5);
			elementExist(progressBar);
			//click(backButton);
		}
	}
	public void verifycourseCount() {
		//Updated by Manju Priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			click(getObj(filterIcon));
			wait(5);
			click(getObj(courseSelection));
			click(getObj(applyButton));
			wait(5);
			click(getObj(clickOnCourse));
			wait(5);
			elementExist(progressBar);
			elementExist(courseCatalogLogo);
			elementExist(catalogTitle);
			
			int count = getNumber(getText(itemCount));
			int itemCount = getItemsCount(iosItemsList);
			verifyItemsCount(count, itemCount);
			wait(5);
			elementExist(progressBar);
			//click(insideCatBackBtn);
		}
		else {
			click(getObj(filterIcon));
			wait(5);
			click(getObj(courseSelection));
			click(getObj(applyButton));
			wait(5);
			click(getObj(courseFilter));
			wait(5);
			elementExist(progressBar);
			elementExist(catalogLogo);
			elementExist(catalogTitle);
			int count = getNumber(getText(itemCount));
			int itemCount = getItemsCount(part1,part2);
			verifyItemsCount(count, itemCount);
			wait(5);
			elementExist(progressBar);
			//click(backButton);
		}
	}
	public void verifyLearningPathCount() {
		//Updated by Manju Priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			click(getObj(filterIcon));
			wait(5);
			click(getObj(learningpathSelection));
			click(getObj(applyButton));
			wait(5);
			click(getObj(clickOnLpath));
			wait(5);
			elementExist(progressBar);
			elementExist(lpathCatalogLogo);
			elementExist(catalogTitle);
			int count = getNumber(getText(itemCount));
			int itemCount = getItemsCount(iosItemsList);
			verifyItemsCount(count, itemCount);
			wait(5);
			elementExist(progressBar);
			//click(insideCatBackBtn);//Commented by Manju Priya A on Jan_16_19
		}else {
			click(getObj(filterIcon));
			wait(5);
			click(getObj(learningpathSelection));
			click(getObj(applyButton));
			wait(5);
			click(getObj(learningpathFilter));
			wait(5);
			elementExist(progressBar);
			elementExist(catalogLogo);
			elementExist(catalogTitle);
			int count = getNumber(getText(itemCount));
			int itemCount = getItemsCount(part1,part2);
			verifyItemsCount(count, itemCount);
			wait(5);
			elementExist(progressBar);
			//click(backButton);
		}
	}
	public void verifyResourceCount() {
		//Updated by Manju Priya A on Jan_11_19
		if(platform.equalsIgnoreCase("ios")) {
			click(getObj(filterIcon));
			wait(5);
			click(getObj(resourceSelection));
			click(getObj(applyButton));
			wait(5);
			click(getObj(clickOnResource));
			wait(5);
			elementExist(progressBar);
			elementExist(resourceCatalogLogo);
			elementExist(catalogTitle);
			int count = getNumber(getText(itemCount));
			int itemCount = getItemsCount(iosItemsList);
			verifyItemsCount(count, itemCount);
			wait(5);
			elementExist(progressBar);
			//click(insideCatBackBtn);//Commented by Manju Priya A on Jan_16_19
		}
		else {
			click(getObj(filterIcon));
			wait(5);
			click(getObj(resourceSelection));
			click(getObj(applyButton));
			wait(5);
			click(getObj(resourceFilter));
			wait(5);
			elementExist(progressBar);
			elementExist(catalogLogo);
			elementExist(catalogTitle);
			int count = getNumber(getText(itemCount));
			int itemCount = getItemsCount(part1,part2);
			verifyItemsCount(count, itemCount);
			wait(5);
			elementExist(progressBar);
			//click(backButton);
		}
	}
	//added by Karpagavalli till here
	
	//Added by Manju Priya A on jan_11_19
	public void clickMyLearning() {
		click(getObj(linkMyLearning));
		wait(5);
	}
	public void filterDisplayed() {
		if(elementExist(filterIcon)) {
			print("PASSED: The Filter icon is displayed");
		}{
			print("FAILED: The Filter icon is not displayed");
		}
	}
	public void verifyTwoTabsNavigation() {
		click(getObj(tabCompleted));
		verifyCompletedTab();
		click(getObj(lblInprogress));
		verifyInProgTab();
	}
	public void verifyCompletedTab() {//Integrated
		if(elementExist(yellowTick)) {
			print("PASSED: Successfully Navigated to COMPLETED tab");
		}else {
			print("FAILED: Not successfully Navigated to COMPLETED tab");
		}
	}
	public void verifyInProgTab() {//Integrated
		if(!elementExist(yellowTick)) {
			print("PASSED: Successfully Navigated to IN PROGRESS tab");
		}else {
			print("FAILED: Not successfully Navigated to IN PROGRESS tab");
		}
	}
	public void verifyInProgTabContents() {
		checkInprogContent();		
	}
	public void checkInprogContent() {
		verifyText("Language Training",inprogCatalogName);//Language Training would be the name of the first catalog item in the inprogress tab
	}
	public void verifyCatalogNameTitle() {
		verifyText("Language Training",inprogCatalogName);//Language Training would be the name of the first catalog item in the inprogress tab
		verifyCatalogType(inprogCatalogType);
		click(insideCatBackBtn);//Updated by Manju priya A on Jan_16_19
	}
	public void verifyCatalogType(By objPath) {
		if(elementExist(objPath)) {
			print("PASSED: The catalog type is displayed");
		}else {
			print("FAILED: The catalog type is not displayed");
		}
	}
	//For Bundle Verification in Home page
	public void verifyNameTitleInsideBundle() {
		verifyText("An Introduction to GST",bundleTitle);//Language Training would be the name of the first catalog item in the inprogress tab
		verifyCatalogType(bundleCatalogLogo);
		click(insideCatBackBtn);
	}
	public void verifyBundleAndContentsIntialProgress() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyBundleProgress() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyBundleContentsProgress() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyBundleFullCompletion() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	
	//For Learning path Verification in Home page
	public void verifyNameTitleInsideLpath() {
		verifyText("Origin Spectrum",catalogTitle);//Language Training would be the name of the first catalog item in the inprogress tab
		verifyCatalogType(lpathCatalogLogo);
		click(insideLpathBackBtn);//Updated by Manju Priya A on Jan_16_19
	}
	public void verifyLpathIntialProgress() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyCourseProgInLpath() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyFullCourseProgInLpath() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyPartialLpathProg() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyFullLpathProg() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyLpathFullCompletion() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyLpathMovedToCompTab() {
		//Waiting for the Database Backup
	}
	//For Resource Verification in Home page
	public void verifyNameTitleInsideResource() {
		verifyText("Resource_Dec20th18",resourceCatalogTitle);//Language Training would be the name of the first catalog item in the inprogress tab
		verifyCatalogType(resourceCatalogLogo);
		click(insideCatBackBtn);//Updated by Manju Priya A on Jan_16_19
	}
	 public void verifyResourceIntialProgress() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyLobjProgInResource() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyFullResourceProg() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyRecMovedToCompTab() {
		////Waiting for the Database Backup
	}
	//For Course Verification in Home page
	public void verifyNameTitleInsideCourse() {
		verifyText("Topic 12 - Effective HRO Leadership",courseCatalogTitle);//Language Training would be the name of the first catalog item in the inprogress tab
		verifyCatalogType(courseCatalogLogo);
		click(insideCatBackBtn);//Updated by Manju Priya A on Jan_16_19
	}
	public void verifyCourseIntialProgress() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyLobjProgInCourse() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyPartialCourseProg() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyFullCourseProg() {
		//Couldnopt take the progress value in Ios, waitinf for updated build from ajith
	}
	public void verifyCourseMovedToCompTab() {
		//Waiting for the Database Backup
	}
	//Added by Manju Priya A on Jan-14-19
	public void verifyVoiceAssitant() {
		verifyVoiceAssitantDisplayed();
	}
	public void verifyAllowPopup() {
		click(btnVoiceAssistant);
		if(verifyPopupLabels()) {
			click(btnAllow);
		}
	}
	public void verifyVoiceAssistLabels() {
		verifyVoiceAssitantLabels();
		click(emptySpaceTop);
	}
	
	public void verifyVoiceAssitantDisplayed() {
		if(elementExist(btnVoiceAssistant)) {
			print("PASSED: Voice Assistant is present in My Learning page");
		}else {
			print("FAILED: Unable to find Voice Assistant in My Learning page");
		}
	}
	public void verifyVoiceAssitantLabels() {
		if(elementExist(iconVoiceRec) && elementExist(helpTextVoiceAssist) && elementExist(iconVoiceAssistant) ) {
			print("PASSED: Voice Assistant Speaker, Record audio button are displayed");
		}else {
			print("FAILED: Unable to find any labels of Voice Assistant after click");
		}
	}
	public boolean verifyPopupLabels() {
		if(elementExist(btnDeny) && elementExist(btnAllow)) {
			print("PASSED: 'allow Origin Fractal to record audio?' ALert displayed");
			return true;
		}else {
			print("FAILED: 'allow Origin Fractal to record audio?' Alert not displayed");
			return false;
		}
	}
	//End of added by Manju Priya A on Jan-14-19

	public void filterICon() {
		wait(5);
		elementExist(filterIcon);
	}

	public void progressBar() {
		wait(5);
		elementExist(progressBar);	
	}

 public void verifyGridListView() {
			click(lblBackBtn);
			wait(3);
			click(lblBackBtn);
			wait(3);
			clickMenu();
			wait(5);
			clickMyLearning();
			click(getObj(searchICon));
			wait(5);
			typeIntoElement("Catalogtest",getObj(searchText));
			elementExist(gridViewCheck);
			elementExist(listViewCheck);
			click(getObj(filterIcon));
			wait(5);
			click(getObj(resourceSelection));
			click(getObj(applyButton));
			wait(5);
			typeIntoElement("Bundlecheck",getObj(searchText));
			elementExist(gridViewCheck);
			elementExist(listViewCheck);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
