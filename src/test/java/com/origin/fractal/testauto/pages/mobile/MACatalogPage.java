package com.origin.fractal.testauto.pages.mobile;

import java.util.Set;

import org.openqa.selenium.By;

import com.origin.fractal.testauto.FractalAppPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class MACatalogPage extends FractalAppPage {
	private By txtCatalog = By.id("com.originkonnect.app:id/action");
	private By btnBuy = By.id("com.originkonnect.app:id/button8");

	private By categoryHR = By.xpath("//android.widget.Button[contains(@resource-id,'com.originkonnect.app:id/category_btn') and @instance='0']");
	private By categoryPrj = By.xpath("//android.widget.Button[contains(@resource-id,'com.originkonnect.app:id/category_btn') and @instance='1']");
	private By categoryAdmin = By.xpath("//android.widget.Button[contains(@resource-id,'com.originkonnect.app:id/category_btn') and @instance='2']");
	private By whatsNewItem1 = By.xpath("//android.widget.RelativeLayout/android.widget.TextView[starts-with(@text,'Validity:') and @instance='10']");
	private By whatsNewItem2 = By.xpath("//android.widget.RelativeLayout/android.widget.TextView[starts-with(@text,'Validity:') and @instance='17']");
	String[] catArray = {"Project Management","Quality Assurance","Health Care","Delivery","Finance","Marketing"};
	
	private By btnFilter = By.id("com.originkonnect.app:id/filter_icon");
	private By btnBack = By.id("com.originkonnect.app:id/imageView15");

	private By categoryFirst = By.xpath("//android.widget.Button[contains(@resource-id,'com.originkonnect.app:id/category_btn') and @instance='0']");
	private By categoryText = By.id("com.originkonnect.app:id/cat");
	private By btnGridView = By.id("com.originkonnect.app:id/grid_icon");
	private By btnListView = By.id("com.originkonnect.app:id/list_icon");
	private By listView = By.id("com.originkonnect.app:id/list_icon");
	private By gridView = By.id("com.originkonnect.app:id/list_icon");

	private By bundleFilter = By.id("com.originkonnect.app:id/bundle_text");
	private By lPathFilter = By.id("com.originkonnect.app:id/lp_text");
	private By courseFilter = By.id("com.originkonnect.app:id/course_text");
	private By resourceFilter = By.id("com.originkonnect.app:id/resource_text");
	private By allFilter = By.id("com.originkonnect.app:id/all_selected");
	private By btnApply = By.id("com.originkonnect.app:id/apply");
	private By catTypeText = By.id("com.originkonnect.app:id/textView44");
	String objPath1 = "//android.widget.RelativeLayout[contains(@resource-id,'com.originkonnect.app:id/rr1') and @index='";
	String objPath2 = "']/android.widget.RelativeLayout/android.widget.TextView[contains(@resource-id,'com.originkonnect.app:id/textView44')]";
	private By resultsText = By.id("com.originkonnect.app:id/textView16");
	private By langEnglish = By.id("android:id/text1");
	private By lblLanguage = By.id("com.originkonnect.app:id/lang");
	private By btnClear = By.id("com.originkonnect.app:id/clr");
	public MACatalogPage(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
		this.setLocators();
	}
	
	public void setLocators() {
		if(platform.equalsIgnoreCase("ios")) {
			txtCatalog = By.id("");
			btnBuy = By.xpath("");
			categoryHR = By.xpath(".//XCUIElementTypeStaticText[contains(@value,'Categories')]/../XCUIElementTypeOther[2]//XCUIElementTypeCell[1]/*//XCUIElementTypeStaticText");//first category
			categoryPrj = By.xpath(".//XCUIElementTypeStaticText[contains(@value,'Categories')]/../XCUIElementTypeOther[2]//XCUIElementTypeCell[2]/*//XCUIElementTypeStaticText");//Second category
			categoryAdmin = By.xpath(".//XCUIElementTypeStaticText[contains(@value,'Categories')]/../XCUIElementTypeOther[2]//XCUIElementTypeCell[3]/*//XCUIElementTypeStaticText");//Third category
			whatsNewItem1 = By.xpath(".//XCUIElementTypeStaticText[contains(@value,'Categories')]/../XCUIElementTypeOther[3]/*//XCUIElementTypeCell[1]/*//XCUIElementTypeStaticText[starts-with(@value,'Validity')]");//first category
			whatsNewItem2 = By.xpath(".//XCUIElementTypeStaticText[contains(@value,'Categories')]/../XCUIElementTypeOther[3]/*//XCUIElementTypeCell[2]/*//XCUIElementTypeStaticText[starts-with(@value,'Validity')]");//Second category
			btnFilter = By.xpath("//XCUIElementTypeButton[contains(@name,'filter')]/../XCUIElementTypeButton[4]");
			btnBack = By.xpath("//XCUIElementTypeButton[contains(@name,'back icon Green')]");
			btnBuy = By.xpath("//XCUIElementTypeButton[contains(@name,'JOIN')]");//we have no contents for buy
			categoryText = By.xpath("//XCUIElementTypeButton[contains(@name,'back icon Green')]/../XCUIElementTypeStaticText[1]");
			categoryFirst = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Categories')]/../XCUIElementTypeOther[2]/*//XCUIElementTypeCell[1]");
			btnListView = By.xpath(".//XCUIElementTypeButton[contains(@name,'gray List')]/../XCUIElementTypeButton[2]");
			listView = By.xpath(".//XCUIElementTypeButton[contains(@name,'dark list')]/../XCUIElementTypeButton[2]");
			btnGridView = By.xpath(".//XCUIElementTypeButton[contains(@name,'gray grid')]/../XCUIElementTypeButton[1]");
			gridView = By.xpath(".//XCUIElementTypeButton[contains(@name,'dark grid')]/../XCUIElementTypeButton[1]");
			bundleFilter = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Bundle')]/../XCUIElementTypeButton");
			lPathFilter = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Learning Path')]/../XCUIElementTypeButton");
			courseFilter = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Course')]/../XCUIElementTypeButton");
			resourceFilter = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Resource')]/../XCUIElementTypeButton");
			allFilter = By.xpath("//XCUIElementTypeStaticText[contains(@name,'All')]/../XCUIElementTypeButton");			
			btnApply = By.xpath("//XCUIElementTypeButton[contains(@name,'APPLY')]");
			catTypeText = By.xpath("//XCUIElementTypeStaticText[starts-with(@value,'Validity')]/../XCUIElementTypeStaticText[1]");
			langEnglish = By.xpath("//XCUIElementTypeStaticText[contains(@name,'English')]");
			lblLanguage = By.xpath("//XCUIElementTypeStaticText[starts-with(@value,'Validity')]/../XCUIElementTypeStaticText[5]");
			btnClear = By.xpath("//XCUIElementTypeButton[contains(@name,'Clear')]");
			resultsText = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Result')]");
			objPath1 = "//XCUIElementTypeStaticText[contains(@name,'Result')]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[";
			objPath2 = "]/*//XCUIElementTypeStaticText";
		}
	}

	public void validateCatalogPageTile() {
		wait(3);
		verifyText("CATALOG", getObj(txtCatalog));

	}


	public void verifyBuyPresence() {
		verifyText("BUY", getObj(btnBuy));
		wait (5);
	}
	
	public void verifyPopularCategory() {
		//wait(5);
		verifyText(catArray[0], categoryHR);//wait(5);
		verifyText(catArray[1], categoryPrj);//wait(5);
		verifyText(catArray[2], categoryAdmin);
	}
	public void verifyWhatsNewContents() {
		//wait(5);
		elementExist(whatsNewItem1);
		elementExist(whatsNewItem2);
	}

	public void verifyFilterExist() {
		click(categoryHR);
		elementExist(btnFilter);
		click(btnBack);
	}

	public void verifyBuyButton(){
		wait(3);
		verifyText("BUY", btnBuy);
	}
	public void verifyCategory(){
		click(categoryFirst);
		verifyText("Project Management",categoryText);
		click(btnBack);
	}
	public void verifyListView(){wait(5);
		click(categoryFirst);
		click(btnListView);
		elementExist(listView);
	}
	public void verifyGridView(){
		click(btnGridView);
		elementExist(gridView);
		//click(btnBack);
		
	}

	public void verifyBundleFilter(){
		click(btnFilter);
		click(bundleFilter);
		click(btnApply);
		verifyText("Bundle",catTypeText);
		click(btnClear);
	}
	public void verifyLpathFilter(){
		click(btnFilter);
		click(lPathFilter);
		click(btnApply);
		verifyText("Learning Path",catTypeText);
		click(btnClear);
	}
	public void verifyCourseFilter(){
		click(btnFilter);
		click(courseFilter);
		click(btnApply);
		verifyText("Course",catTypeText);
		click(btnClear);
	}
	public void verifyResourceFilter(){
		click(btnFilter);
		click(resourceFilter);
		click(btnApply);
		verifyText("Resource",catTypeText);
		click(btnClear);
		//click(btnBack);
	}
	public void verifyAllFilter(){
		click(btnFilter);
		click(allFilter);
		click(btnApply);
		verifyAllFilterType(objPath1,objPath2);
		click(btnClear);
		//click(btnBack);wait(5);
	}
	
	public void verifyLangFilter(){
		click(btnFilter);
		click(langEnglish);
		click(btnApply);
		verifyText("English",lblLanguage);
		click(btnBack);
	}
	//Updated by Manju Priya A on Jan_22_19
	public void verifyAllFilterType(String objBox, String objBoxtype) {
		String[] actType = {"Bundle","Learning Path","Course","Resource"};
		int count = getNumber(getFirstWord(getText(resultsText)));
		if(platform.equalsIgnoreCase("ios")) {
			verifyAllFilterTypes(actType,getCatalogTypesSetAppIos(objBox,objBoxtype,count));
		}else {
			verifyAllFilterTypes(actType,getCatalogTypesSetApp(objBox,objBoxtype,count));
		}
	}
	//Added by Manju Priya A on Jan_22_19
	public void verifyAllFilterTypes(String[] actType, Set<String> set) {
		if(comapreArrayWithSetLength(actType,set)) {
			print("PASSED:  ALl filter is working fine");
		}else {
			print("FAILED:  ALl filter is not working");
		}
	}

}
