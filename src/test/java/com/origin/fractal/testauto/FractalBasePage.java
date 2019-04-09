package com.origin.fractal.testauto;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wv.auto.framework.BasePage;

public abstract class FractalBasePage extends BasePage {
	protected FractalVerifier verifier;

	private By lblMyLearning = By.xpath(".//*[@id='header']/div/*//a/span[contains(text(),'My Learning')]");
	private By lblProfile = By.xpath(".//*[@id='dLabel']/span");
	private By lblMyAccount = By.xpath(".//*[@id='header']/div/*//a[contains(text(),'My Account')]");
	private By btnCategory = By.xpath(".//*[@id='header']/*//button");
	private By btnBellIcon = By.xpath(".//*[@id='header']/*//div[@class='dropdown-container']/*//span[contains(@class,'bell-bubble')]");
	private By viewAll = By.xpath(".//*[@id='notification-dropdown']/div[2]/div[2]/a");
	private By settings = By.xpath(".//a[contains(text(),'Settings')]");
	private By lblHome= By.xpath(".//span[contains(text(),'Home')]");
	private By btnContinue = By.xpath(".//button[contains(text(),'CONTINUE')]");
	private By lblRcntAdded_Courses = By.xpath(
			".//div[@class='col-lg-12 col-sm-12 col-md-12 col-xs-12 padding-b-20 padding-lr-120 bg_grey padding-t-80']//span[@class='ng-binding ng-scope'][contains(text(),'courses')]");
	private By btnTopArr = By.xpath(".//i[contains(@class,'icon topArr')]");

	private By btnList = By.xpath(".//div/ng-include/*//div/ng-include/div/*//div/a[contains(text(),'ALL')]/../div/a[2]");
	private String gridBoxBtn = ".//div/ng-include/*//div/ng-include/div/*//div/*//p[contains(text(),'Category')]/../../../../../div";
	private String gridLblName ="]/*//h3";

	private String  listBoxBtn= ".//div/ng-include[1]/div[1]/div[1]/div[3]/ng-include[1]/div[1]/div[3]/div";
	private String  listLblName="]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h3";
	private By catalogName = By.xpath(".//div/ng-include/*//div/span[contains(text(),'Updated on')]/../div/h3");
	private By catalogType = By.xpath(".//div/ng-include/*//div/span[contains(text(),'Updated on')]/../p");
	private By catalogCourseCount = By.xpath(".//div/ng-include/*//div/span[contains(text(),'Updated on')]/../div[last()]/h3");
	private By catalogValidity = By.xpath(".//div/ng-include/div/*//div/span[contains(text(),'Valid till:')]/span");
	private By btnGrid = By.xpath(".//div/ng-include/*//div/ng-include/div/*//div/a[contains(text(),'ALL')]/../div/a[1]");
	private By lblcontents = By.xpath(".//div/ng-include/div/*//h3[contains(text(),'Content')]/..");
	private String lblNavBtn=".//div/h2[contains(text(),'Recently Added')]/../../following-sibling::div/*//div/slick/ul/li[";

	private By wishListBtn=By.xpath(".//div/ng-include//div/span//../div/i[contains(@data-icon,'Q')]");
    private By cartItemBtn=By.xpath(".//div/ng-include//div/div[1]/div/span//../div/i[contains(@class,'text-right font-size-23 text-icon-bcbcbc')]");
	private By logoImg=By.xpath(".//div/ng-include//div/img");    
	private By logOut=By.xpath(".//a[@class='pointer padding-l-15']");
	private By btnLoadMore = By.xpath(".//div/ng-include/*//div/button[contains(text(),'Load More')]");
	private By goToCart = By.xpath("//button[contains(text(),'GO TO CART')]");
	private By checkout = By.xpath("//button[contains(@class,'ng-binding')]");
	private By lblpaytm=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div/div/span/h3[contains(text(),'paytm')]");
	private By lblpaypal=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div/div/span/h3[contains(text(),'paypal')]");
	protected FractalBasePage(WebDriver driver) {
		this.driver = driver;
		verifier = new FractalVerifier(driver);

	}
	
	
	

	// Actions common across all pages
	public void clickOnMyLearning() {
		click(lblMyLearning);
	}

	public void clickOnProfile() {
		click(lblProfile);
	}

	public void clickOnMyAccount() {
		clickOnProfile();
		click(lblMyAccount);
	}

	public void clickOnCategory() {
		click(btnCategory);
	}

	public void clickOnBellIcon() {
		click(btnBellIcon);
	}

	public void clickOnViewAll() {
		wait(5);
		click(viewAll);

	}

	public void clickOnsettings() {
		click(settings);
	}
	
	public void clickOnHome() {
        click(lblHome);
	}

	// Fractal Level Generic Reusable Functions
	public String getLabel(String str) {
		String propKey = pageName + "_" + str;
		String lblValue = FractalUtils.getPageLabel(propKey);
		return lblValue;
	}

	public void verifyLabel(String lblKey, By by) {
		verifyText(getLabel(lblKey), by);
	}


	public boolean verifyAllFilterType(String objBox, String objBoxtype, String objFilterLink) {
		Set<String> actType = popElement(getActualCatalogTypes(objFilterLink), "all");
		Set<String> expectedtype = getCatalogTypesSet(objBox, objBoxtype);
		return compareSet(expectedtype,actType);
	}

	// To verify the bundle, course, learn path and resource filters in My Learning
	// page
	public boolean verifyFilterType(String objPath1, String objpath2, String expType) {
		int count = getItemsCount(By.xpath(objPath1));
		String wholeObjPath = "";
		String actualFilType = "";
		boolean status = false;
		for (int i = 1; i < count; i++) {
			wholeObjPath = objPath1 + "[" + i + objpath2;
			actualFilType = getText(By.xpath(wholeObjPath)).toLowerCase();
			status = compareStrings(actualFilType, expType.toLowerCase());
		}
		return status;
	}

		public void clickOnContinueBtn() {
			click(btnContinue);
		}
		public void clickOnCourseslink() {
			click(lblRcntAdded_Courses);
		}
		public void clickOnTopArrBtn() {
			click(btnTopArr);
		}
		public String[] verifyAllLanguage(String objBox) {
			System.out.println("Taking all links:");
			String[] linkTypes = getFilterLinks(objBox);
			for(String a:linkTypes) {
				System.out.println("---->"+a);
		       }
			return linkTypes;
		}
		
		public boolean verifyAllFilterTypeRcntAdded(String objBox, String objBoxtype, String objFilterLink) {
			System.out.println("Taking all links:");
			String[] linkTypes = getFilterLinks(objFilterLink);
			for(String a:linkTypes) {
				System.out.println("---->"+a);
			}
			System.out.println("After removing s");
			String[] actArray=removeLastInArrayItems(popArray(linkTypes, 0));
			for(String e:actArray) {
				System.out.println("---->"+e);
			}
			System.out.println("Taking all available types from listed catalog items:");
			String[] availableTypes = getCatalogTypes(objBox,objBoxtype);
			for(String c:availableTypes) {
				System.out.println("---->"+c);
			}
			System.out.println("Getting distinct elements from array:");
			String[] uniquecatType = getUniqueArray(availableTypes);
			for(String d:uniquecatType) {
				System.out.println("---->"+d);
			}
			return compareArray(linkTypes,uniquecatType);
		}
		
		//To verify the bundle, course, learn path and resource filters in My Learning page
		public boolean verifyFilterTypeRcntAdded(String objPath1, String objpath2, String expType) {
			int count = getItemsCount(By.xpath(objPath1));
			String wholeObjPath = "";
			String actualFilType= "";
			boolean status=false;
			for(int i=1;i<count;i++) {
				wholeObjPath = objPath1+"["+i+objpath2;
				actualFilType=getText(By.xpath(wholeObjPath));
				if(actualFilType.equalsIgnoreCase(expType)){
					status=true;
				}else {
					status=false;
				}
			}
			return status;
		}

		public void gridView() {
			verifyGridViewItems();
			click(btnList);
		}
		public void listView() {
			verifyListViewItems();
			click(btnGrid);
		}
		
		//Moved this function from base page to FractalBasePage 
		public boolean verifyPartialLabelText(String expText, By objLoc) {
			WebElement we = getObj(objLoc);
			return verifyPartialText(getLabel(expText), we);
		}

		//To verify the category list in the header
		public boolean verifyAllCategories(String objPath){
			String[] actArray = {
				getLabel("lblCategoryAll"),/*getLabel("lblCategoryPrjMgm"),*/getLabel("lblCategoryQA"),
				getLabel("lblCategoryHC"),getLabel("lblCategoryID"),getLabel("lblCategoryMrkt"),
				getLabel("lblCategoryMcrLrn"),getLabel("lblCategory3DAnim"),getLabel("lblCategorySftSkl"),
				getLabel("lblCategoryStryLine"),getLabel("lblCategoryGD"),getLabel("lblCategoryTech")
			};
			String[] categoryList = getListViewNames(objPath, "]");
			return compareArray(actArray,categoryList);
		}
		
		//To verify the completed catalog item have start and tick mark
		public boolean verifyCompletedCatalog(By objLocRate, By objLocTick){
			boolean status = elementExist(objLocTick);
			if(status) {
				status = elementExist(objLocTick);
			}
			return status;
		}

		public void verifyCatalogDeatils(String name, String type, String totalCourses, String validity) {
			verifyLabel(name,catalogName);
			verifyLabel(type,catalogType);
			verifyPartialLabelText(totalCourses,catalogCourseCount);
			verifyLabel(validity,catalogValidity);
		}
		
		public Set<String> getActualCatalogTypes(String objpath) {
			HashSet<String> items = new HashSet<String>();
			addToSet(items,getLabel("lblCourses").toLowerCase());
			addToSet(items,getLabel("lblResources").toLowerCase());
			addToSet(items,getLabel("lblBundles").toLowerCase());
			addToSet(items,getLabel("lblLearningPaths").toLowerCase());
			return items;
		}
		
		public int getContentsCount(){
			String fullText = getText(lblcontents);
			String data = getLastWord(fullText," ");
			String count = getSubString(data,1,data.length()-1);
			int itemsCount=Integer.parseInt(count);;
			return itemsCount;
		}
		
		public boolean launchCheck(String path1 , String path2,String lobjName){
			boolean status = false;
			int assignedItems=getContentsCount();
			boolean isExist=false;
			String itemType="";
			String objpath="";
			String itemName = "";
			for(int i=0;i<assignedItems;i++) {
				objpath = path1+(i+1)+path2;
				isExist = elementExist(By.xpath(objpath));
				if(isExist) {
					itemType = getText(By.xpath(objpath));
					itemName=getText(By.xpath(path1+(i+1)+lobjName));
					if(isLearninfObject(itemType)){
						status = launchLearningObject(By.xpath(objpath),itemName);
					}
				}else {
					System.out.println("-----------------This is a catalog item not a learning path....so click...-----------------");//r
				}
			}
			return status;
		}
		
		public boolean launchLearningObject(By objLoc, String lobjName) {
			boolean status = false;
			click(objLoc);
			String strFirstWindowHandle = driver.getWindowHandle();
			switchToNewWindow();
			status = verifyLobjLaunch(lobjName);
			closeNewWindow();
			switchToParentWindow(strFirstWindowHandle); 
			return status;
		}

		public boolean verifyLobjLaunch(String lobjName) {
			String title = driver.getTitle();
			return containsString(title, lobjName);
		}

		public boolean verifyGridViewItems() {
			String[] actualItems = getActualCatalogItems().toArray(new String[0]);
			String[] expectedItems = getGridViewNames(gridBoxBtn,gridLblName);
			return compareArray(actualItems,expectedItems);
		}
		
		public boolean verifyListViewItems() {
			String[] actualItems = getActualCatalogItems().toArray(new String[0]);
			String[] expectedItems = getListViewNames(listBoxBtn,listLblName);
			return compareArray(actualItems,expectedItems);
		}
		
		public Set<String> getActualCatalogItems(){
			HashSet<String> items = new HashSet<String>();
			addToSet(items,getLabel("catalogItemName1").toLowerCase());
			addToSet(items,getLabel("catalogItemName2").toLowerCase());
			addToSet(items,getLabel("catalogItemName3").toLowerCase());
			addToSet(items,getLabel("catalogItemName4").toLowerCase());
			addToSet(items,getLabel("catalogItemName5").toLowerCase());
			addToSet(items,getLabel("catalogItemName6").toLowerCase());
			return items;
		}
		
		
		//***********************//
		public String[] homeGetCatalogTypes(String objpath, String objpathType) {
			int length = getItemsCount(By.xpath(objpath));
			String wholeObjPath = "";
			String actualCatalogType="";
			String[] catlogType = new String[length-1];
			String clickLoc="";
			int j=1;
			int module =0;
			for(int i=0;i<length-1;i++) {
				module = module+1;
				wholeObjPath = objpath+"["+(i+1)+objpathType;
				actualCatalogType=getText(By.xpath(wholeObjPath));
				wait(2);
				catlogType[i]=(actualCatalogType).toLowerCase();
				
				if(module%4==0){
					j=j+1;
					clickLoc=lblNavBtn+j+"]";
					click(By.xpath(clickLoc));
					System.out.println("Clicked successfully");
			}
			}
			return catlogType;
		}
		
		public String[] verifyLastCataloItems(String objpath, String objpathType) {
			int length = getItemsCount(By.xpath(objpath));
			String wholeObjPath = "";
			String actualCatalogName="";
			String[] catlogName = new String[length];
		//	click(btnLoadMore);
			for(int i=1;i<=4;i++) {
				wholeObjPath = objpath+"["+(length)+objpathType;
				actualCatalogName=getText(By.xpath(wholeObjPath));
				wait(2);
				catlogName[i-1]=actualCatalogName;
				length--;
			}
			return catlogName;
		}
		//****for admin part assert search****//
		public String[] verifySearchCataloItems(String objpath, String objpathType) {
			int length = getItemsCount(By.xpath(objpath));
			String wholeObjPath = "";
			String actualCatalogName="";
			String[] catlogName = new String[length];
		//	click(btnLoadMore);
			for(int i=1;i<=length;i++) {
				wholeObjPath = objpath+"["+(i)+objpathType;
				actualCatalogName=getText(By.xpath(wholeObjPath));
				wait(2);
				catlogName[i-1]=actualCatalogName;
				
			}
			return catlogName;
		}
		//**********end**********//
		
	   //*****Recommended***//
		public boolean verifyAllFilterTypeRecommAdded(String objBox, String objBoxtype, String objFilterLink) {
			Set<String> actType = popElement(getActualCatalogTypesRecomm(objFilterLink), "all");
			Set<String> expectedtype = getCatalogTypesSet(objBox, objBoxtype);
			return compareSet(expectedtype,actType);
			
		
		}
		
		//To verify the bundle, course, learn path and resource filters in home page
		public boolean verifyFilterTypeRecommAdded(String objPath1, String objpath2, String expType) {
			int count = getItemsCount(By.xpath(objPath1));
			String wholeObjPath = "";
			String actualFilType= "";
			boolean status=false;
			int j=1;
			int module =0;
			String clickLoc="";
			for(int i=0;i<count;i++) {
				module = module+1;
				wholeObjPath = objPath1+"["+(i+1)+objpath2;
				actualFilType=getText(By.xpath(wholeObjPath));
				status = compareStrings(actualFilType, expType);
			
				if(module%4==0){
					j=j+1;
					clickLoc=lblNavBtn+j+"]";
					click(By.xpath(clickLoc));
					System.out.println("Clicked successfully");
				  wait(2);
				}
			}
			return status;
		}
		
		
	//*********Most popular**********//
		public boolean verifyAllFilterTypeMostAdded(String objBox, String objBoxtype, String objFilterLink) {
			Set<String> actType = popElement(getActualCatalogTypesMost(objFilterLink), "all");
			Set<String> expectedtype = getCatalogTypesSet(objBox, objBoxtype);
			return compareSet(expectedtype,actType);
			
		}
		
		//To verify the bundle, course, learn path and resource filters in home page
		public boolean verifyFilterTypeMostAdded(String objPath1, String objpath2, String expType) {
			int count = getItemsCount(By.xpath(objPath1));
			String wholeObjPath = "";
			String actualFilType= "";
			boolean status=false;
			int j=1;
			int module =0;
			String clickLoc="";
			for(int i=0;i<count;i++) {
				module = module+1;
				wholeObjPath = objPath1+"["+(i+1)+objpath2;
				actualFilType=getText(By.xpath(wholeObjPath));
				status = compareStrings(actualFilType, expType);
				if(module%4==0){
					j=j+1;
					clickLoc=lblNavBtn+j+"]";
					click(By.xpath(clickLoc));
					System.out.println("Clicked successfully");
			        wait(2);	
				}
			}
			System.out.println("------->"+count);
			System.out.println("------->"+actualFilType);
			return status;
		}
	

		public Set<String> getActualCatalogTypesRecent(String objpath) {
			HashSet<String> items = new HashSet<String>();
			if(!getLabel("rlblCourses").isEmpty()) {
			items.add(getLabel("rlblCourses").toLowerCase());
			}
			if(!getLabel("rlblResources").isEmpty()) {
			items.add(getLabel("rlblResources").toLowerCase());
			}
			if(!getLabel("rlblBundles").isEmpty()) {
			items.add(getLabel("rlblBundles").toLowerCase());
			}
			if(!getLabel("rlblLearningPaths").isEmpty()) {
			items.add(getLabel("rlblLearningPaths").toLowerCase());
			}
			return items;
		}
		public Set<String> getActualCatalogTypesRecomm(String objpath) {
			HashSet<String> items = new HashSet<String>();
			if(!getLabel("recomlblCourses").isEmpty()) {
			items.add(getLabel("recomlblCourses").toLowerCase());
			}
			if(!getLabel("recomlblResources").isEmpty()) {
			items.add(getLabel("recomlblResources").toLowerCase());
			}
			if(!getLabel("recomlblBundles").isEmpty()) {
			items.add(getLabel("recomlblBundles").toLowerCase());
			}
			if(!getLabel("recomlblLearningPaths").isEmpty()) {
			items.add(getLabel("recomlblLearningPaths").toLowerCase());
			}
			return items;
		}
			public Set<String> getActualCatalogTypesMost(String objpath) {
			HashSet<String> items = new HashSet<String>();
			if(!getLabel("mostlblCourses").isEmpty()) {
			items.add(getLabel("mostlblCourses").toLowerCase());
			}
			if(!getLabel("mostlblResources").isEmpty()) {
			items.add(getLabel("mostlblResources").toLowerCase());
			}
			if(!getLabel("mostlblBundles").isEmpty()) {
			items.add(getLabel("mostlblBundles").toLowerCase());
			}
			if(!getLabel("mostlblLearningPaths").isEmpty()) {
			items.add(getLabel("mostlblLearningPaths").toLowerCase());
			}
			return items;
		}
		//Updated by Manju Priya A on Nov-26-18=>Moded the function from base page to fractal base page
		public Set<String> getCatalogTypesSet(String objpath, String objpathType) {
			int length = getItemsCount(By.xpath(objpath));
			String wholeObjPath = "";
			String catalogType="";
			HashSet<String> catlogTypes = new HashSet<String>();
			for(int i=0;i<length-1;i++) {
				wholeObjPath = objpath+"["+(i+1)+objpathType;
				catalogType=getText(By.xpath(wholeObjPath));
				catlogTypes.add(catalogType.toLowerCase());
			}
			return catlogTypes;
		}
		public boolean isLearninfObject(String itemType) {
			boolean status = false;
			if(itemType.equalsIgnoreCase("document")||itemType.equalsIgnoreCase("video")||itemType.equalsIgnoreCase("elearning")||itemType.equalsIgnoreCase("image")) {
				status = true;
			}else {
				status = false;
			}
			return status;
		}
		/*End-Nov-26-18*/
		/*Added By Manju Priya A on Nov-28-18*/
	
		
		public void verifyWishListBtn() {
			click(wishListBtn);
		}
		
		public void verifyMyLearningPage() {
			click(lblMyLearning);
			System.out.println("MyLearning page is displayed");
		}
			
		public void verifyLogoImg() {
			click(logoImg);
			System.out.println("logoImg is clicked");
		
		}
		public void verifyCartItemBtn() {
			click(cartItemBtn);
		}
		public void verifyCartItemBtn1() {
			click(cartItemBtn);
			click(goToCart);
			click(checkout);
			verifyText("Paytm", lblpaytm);
			verifyText("Paypal", lblpaypal);
			click(lblpaypal);
			
		}



		public void clickLogout() {
			wait(5);
			click(lblProfile);
			wait(5);
			click(logOut);
			
		}
		public int getItemsCount( String objBox,String objBoxtype) {
			boolean status = true;
			int count =0;
			int i=0;
			String wholeObjPath = "";
			do {
				wholeObjPath =objBox+"["+(i+1)+objBoxtype;
				if(elementExist(By.xpath(wholeObjPath))) {
					count = count + 1;
					i = i+1;
					status = true;
				}else {
					status = false;
				}
			}while(status);
			return count;
		}
		/***added by mahesh 06/02/19***/
	/*	public String read() {
	    	String emailSubject;
	    	Message emailMessage;
	    	String textExtract ="";
	        Properties props = new Properties();
	        try {
	            props.load(new FileInputStream(new File("smtp.properties")));
	            Session session = Session.getDefaultInstance(props, null);
	            Store store = session.getStore("imaps");
	            store.connect("smtp.gmail.com", "automation_directuser@originlearning.com", "0R1autoDi6");
	            Folder inbox = store.getFolder("inbox");
	            inbox.open(Folder.READ_WRITE);
	            int messageCount = inbox.getMessageCount();
	            System.out.println("Total Messages:- " + messageCount);
	            Message[] messages = inbox.getMessages();
	            System.out.println("------------------------------");
	            emailMessage = inbox.getMessage(messageCount);
		        emailSubject = emailMessage.getSubject();
		        String textPart = null; 
		        for (int i = messageCount-1; i >= 0; i--) {
	                System.out.println("Mail Subject:- " + messages[i].getSubject());
	         //       System.out.println("Text: " + messages[i].getContent());
	                String actualSub = messages[i].getSubject();
	                //String expectedSub = "Reset Password";
	                String expectedSubFor = "Fwd: Access Enabled";
	                if(actualSub.equalsIgnoreCase(expectedSubFor)) {
	                	//System.out.println("Got it--------------------------------------------------------------");
	                	Object mp = (Object) messages[i].getContent();
	                	
		                System.out.println("mp: " + mp);
	*/	               /* if (mp instanceof String)  
		                {
		                    String body = (String)mp;
		                    
		                    System.out.println("--------------------------------------------------------------");
		                    System.out.println("MSG Body : " + body);
		                    System.out.println("--------------------------------------------------------------");
		                } */
	/*	                if(mp instanceof Multipart)  
		                {  
		                    Multipart mpp = (Multipart)mp;
		                    final BodyPart bp = mpp.getBodyPart(0);
		                    System.out.println("Text: " +bp.getContent().toString());
		                    textPart = bp.getContent().toString();
		                }
     */                   
                        /*else {
		                    System.out.println("Inside else");
		                    Multipart mpp = (Multipart)mp;
		                    final BodyPart bp = mpp.getBodyPart(0);
		                    System.out.println("Text: " +bp.getContent().toString());
		                }*/
	/*	                break;
	                }  
	            }
		        //
	       //  System.out.println("--------------------------------------------------------------");
	            System.out.println(textPart);
	            String[] arrayData = textPart.split("!");
	            for (String e : arrayData) {
					System.out.println(e);
				}
	            textExtract = arrayData[1].substring(0,50);
	*/        /*     System.out.println("-----------------------------Text---------------------------------"+textExtract);
	            System.out.println("--------------------------------------------------------------");
	        */   //
	/*	        inbox.close(true);
	            store.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return textExtract;
	    }
	*/   
/****************end*************************/
}
