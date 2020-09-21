// Created by Vignesh(WVI) 
// Last Updated on 26-Oct-19
package com.origin.fractal.testauto.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MenuSteps;

public class ManageContentItemCodesPage extends FractalBasePage {
	public MenuSteps menusteps;
	//Learning Object  
	private By searchFieldLearnObj = By.xpath("//input[@id='searchObject']");
	private By searchFieldCatItem = By.xpath("//*[@id='searchCatalog']");
	private By editBtn = By.xpath("(*//i[@role='button'])[2]");
	private By catEditBtn = By.xpath("(//*[@role='button'])[152]");
	//private By closeXBtn = By.xpath("//i[contains(@class, 'font-size-35')]");
	private By itemcodetab = By.xpath("//input[@type='text'][@name='item_code']");
	private By updateBtn = By.xpath("//*[text()='Update']");
	private By cancelBtn = By.xpath("//*[text()='Cancel']");//button[contains(@class,'md-raised btn btn-cancel margin-r-20 ng-binding')]
	private By newVersionReqNoBtn = By.xpath("//*[text()='No']");
	private By updateagainNoBtn = By.xpath("//*[text()='No']");
	private By learnObjTitle1 = By.xpath("//*[text()='AutoTC_Itemcode_eLearning']");
	private By learnObjTitle2 = By.xpath("//*[text()='AutoTC_Itemcode_Video']");
	private By learnObjTitle3 = By.xpath("//*[text()='AutoTC_Itemcode_Document']");
	private By learnObjTitle4 = By.xpath("//*[text()='AutoTC_Itemcode_Image']");
	private By learnObjTitle5 = By.xpath("//*[text()='AutoTC_Itemcode_Assessment']");
	private By learnObjTitle6 = By.xpath("//*[text()='AutoTC_Itemcode_vLab']");
	private By learnObjTitle7 = By.xpath("//*[text()='AutoTC_Itemcode_Audio']");
	private By[]learnObjTitles = { learnObjTitle1,learnObjTitle2,learnObjTitle3,learnObjTitle4,learnObjTitle5,learnObjTitle6,learnObjTitle7};
	private By learnObjItemcode1 = By.xpath("//*[contains(text(),'Auto01LOe_0123456789')]");
	private By learnObjItemcode2 = By.xpath("//*[contains(text(),'Auto02LOv_)!@#$%^&*(')]");
	private By learnObjItemcode3 = By.xpath("//*[contains(text(),\"Auto03LOd_-=[]\\;',./\")]");
	private By learnObjItemcode4 = By.xpath("//*[contains(text(),'Auto04LOi_+{}|:\"<>?~')]");
	private By learnObjItemcode5 = By.xpath("//*[contains(text(),'Auto05LOa_0123456789')]");
	private By learnObjItemcode6 = By.xpath("//*[contains(text(),'Auto06LOl_)!@#$%^&*(')]");
	private By learnObjItemcode7 = By.xpath("//*[contains(text(),\"Auto07LOo_-=[]\\;',./\")]");
	private By[] learnObjItemcodes = { learnObjItemcode1,learnObjItemcode2,learnObjItemcode3,learnObjItemcode4,learnObjItemcode5,learnObjItemcode6,learnObjItemcode7};
	private By editlearnObjItemcode1 = By.xpath("//*[contains(text(),'Auto01LOe_012345678A')]");
	private By editlearnObjItemcode2 = By.xpath("//*[contains(text(),'Auto02LOv_)!@#$%^&*A')]");
	private By editlearnObjItemcode3 = By.xpath("//*[contains(text(),\"Auto03LOd_-=[];',.A\")]");
	private By editlearnObjItemcode4 = By.xpath("//*[contains(text(),'Auto04LOi_+{}|:\"<>?A')]");
	private By editlearnObjItemcode5 = By.xpath("//*[contains(text(),'Auto05LOa_012345678A')]");
	private By editlearnObjItemcode6 = By.xpath("//*[contains(text(),'Auto06LOl_)!@#$%^&*A')]");
	private By editlearnObjItemcode7 = By.xpath("//*[contains(text(),\"Auto07LOo_-=[];',.A\")]");
	private By []editlearnObjItemcodes = {editlearnObjItemcode1,editlearnObjItemcode2,editlearnObjItemcode3,editlearnObjItemcode4,editlearnObjItemcode5,editlearnObjItemcode6,editlearnObjItemcode7}; 
	// LO Update alert Msg/Notification
	private By saveNewVersionBtn = By.xpath("//*[@class='md-title ng-binding']");
	private By updateAlertMsgEditlearnObject1 =  By.xpath("//div[@class = 'col-lg-12 col-sm-12 col-md-12 col-xs-12 height-400']//div[2]");	//*[@id="target"]/div[3]/div/div/div[2]/md-dialog-content/div/div[1]/div/div[2]
	private By updateAlertMsgEditlearnObject2 =  By.xpath("//*[@class='padding-t-20 text-743917 font-size-25 ng-pristine ng-untouched ng-valid ng-binding ng-not-empty']");

	private By adminAccountLogo =By.xpath("//*[@class='loggeduserbg ng-binding']");// Updated on 21-Sep-20
	private By adminLogout =By.xpath("//*[@class='dropdown-menu menu-myaccount']//*[contains(text(),'Logout')]");// Updated on 21-Sep-20
	private By userAccountLogo =By.xpath("//div[@class='logout_pop']");
	private By userLogout =By.xpath("//*[text()='Logout']");
	//Catalog
	private By catalogItem= By.xpath("//span[contains(text(),'Catalog Items')]");
	private By catItemTitle1 = By.xpath("//*[text()='AutoTC_Itemcode_Bundle']");
	private By catItemTitle2 = By.xpath("//*[text()='AutoTC_Itemcode_LearnPath']");
	private By catItemTitle3 = By.xpath("//*[text()='AutoTC_Itemcode_Course']");
	private By catItemTitle4 = By.xpath("//*[text()='AutoTC_Itemcode_Resource']");
	private By catItemTitle5 = By.xpath("//*[text()='AutoTC_Itemcode_Podcast']");
	private By[] catItemTitles = {catItemTitle1,catItemTitle2,catItemTitle3,catItemTitle4,catItemTitle5};
	private By catItemItemcode1 = By.xpath("//*[text()='Auto01CIb_0123456789']");
	private By catItemItemcode2 = By.xpath("//*[text()='Auto02CIl_)!@#$%^&*(']");
	private By catItemItemcode3 = By.xpath("//*[text()=\"Auto03CIc_-=[]\\;',./\"]");
	private By catItemItemcode4 = By.xpath("//*[text()='Auto04CIr_+{}|:\"<>?~']");
	private By catItemItemcode5 = By.xpath("//*[text()='Auto05CIp_0123456789']");
	private By[] catItemItemcodes = {catItemItemcode1,catItemItemcode2,catItemItemcode3,catItemItemcode4,catItemItemcode5};
	private By editCatItemItemcode1 = By.xpath("//*[text()='Auto01CIb_012345678A']");
	private By editCatItemItemcode2 = By.xpath("//*[text()='Auto02CIl_)!@#$%^&*A']");
	private By editCatItemItemcode3 = By.xpath("//*[text()=\"Auto03CIc_-=[];',.A\"]");
	private By editCatItemItemcode4 = By.xpath("//*[text()='Auto04CIr_+{}|:\"<>?A']");
	private By editCatItemItemcode5 = By.xpath("//*[text()='Auto05CIp_012345678A']");
	private By[] editCatItemItemcodes = {editCatItemItemcode1,editCatItemItemcode2,editCatItemItemcode3,editCatItemItemcode4,editCatItemItemcode5};
	// Update alert Msg/Notification
	private By updateAlertMsgEditCatItem1 = By.xpath("/html/body/div[3]/div/div/div/md-dialog-content/div/div/div/div[1]/div/div[1]/div[2]");//Abs XPath
	private By updateAlertMsgEditCatItem2 = By.xpath("/html/body/div[3]/div/div/div/md-dialog-content/div/div/div/div[1]/div/div[1]/div[2]");//Abs XPath
	private By updateAlertMsgEditCatItem3 = By.xpath("/html/body/div[3]/div/div/div/md-dialog-content/div/div/div/div[1]/div/div[1]/div[2]");//Abs XPath
	private By updateAlertMsgEditCatItem4 = By.xpath("/html/body/div[3]/div/div/div/md-dialog-content/div/div/div/div[1]/div/div[1]/div[2]");//Abs XPath
	private By updateAlertMsgEditCatItem5 = By.xpath("/html/body/div[3]/div/div/div/md-dialog-content/div/div/div/div[1]/div/div[1]/div[2]");//Abs XPath
	private By[] updateAlertMsgEditCatItem = {updateAlertMsgEditCatItem1,updateAlertMsgEditCatItem2,updateAlertMsgEditCatItem3,updateAlertMsgEditCatItem4,updateAlertMsgEditCatItem5};
	private By updateAlertMsgCat = By.xpath("//*[@ng-model='document']");
	private By continueBtn = By.xpath(" //button[contains(text(),'Continue')]");
	private By continueBtn1 = By.xpath("(//*[text()='Continue'])[1]");
	private By saveBtn = By.xpath("(//*[text()='Save'])[1]");
	private By backcatalogBtn = By.xpath(" //button[contains(text(),'Back to Catalog Items')]");
	final int waitingSec =3;
	public boolean [] boolVerifyAdminLOResult = new boolean[7];
	public boolean [] boolVerifyUserLOResult = new boolean[7];
	public boolean [] editboolVerifyAdminLOResult = new boolean[7]; 
	public boolean [] editboolVerifyUserLOResult = new boolean[7];
	public boolean [] boolVerifyAdminCIResult = new boolean[5];
	public boolean [] boolVerifyUserCIResult = new boolean[5];
	public boolean [] editboolVerifyAdminCIResult = new boolean[5]; 
	public boolean [] editboolVerifyUserCIResult = new boolean[5];
	private By searchResultCountofResults = By.xpath(".//div[contains(@class,'heading-left1')]/../div/b[1]");
	private String arrayXpath1 = "(//html/body/div/div/main/div/div[3]/div/div/div/div/div/div/div/div/div/div/h6/span)";
	private String arrayXpath2 ="]";
	public boolean boolResult = false;
	public int adminResultNext=0;
	public int userResultNext=0;
	public int editAdminResultNext=0;
	public int editUserResultNext=0;
	//User side
	private By searchfieldUser= By.xpath("//input[@id='theInput']");

	public ManageContentItemCodesPage(WebDriver driver) {
		super(driver);
		menusteps = new MenuSteps(driver);
		pageName = "ManageContentItemCodePage";
	}
	public void goToManagecontent() {
		menusteps.clickMenu();
		menusteps.gotoManageContents();
		wait(5);//Updated by 21-09-2020
	}
	//Learning Objects Itemcode verification - Admin side
	public void verifyAdminLearnObjItemcodes() {
		print("----------Verify LO Admin Itemcode start-----------");
		for(int i=0;i<learnObjTitles.length;i++)
		{
			String exptLearnObjTitle = "learnObjTitle"+(Integer.toString(i+1));
			String exptitemcode = "learnObjItemcode"+(Integer.toString(i+1));
			String searchLearnObjitemcode = "learnObjItemcodes"+(Integer.toString(i+1));
			click(searchFieldLearnObj);
			enterData(getLabel(searchLearnObjitemcode), searchFieldLearnObj);
			wait(waitingSec);
			if(verifyTextIgnorecase(getLabel(exptLearnObjTitle), learnObjTitles[i]) && verifyTextIgnorecase(getLabel(exptitemcode), learnObjItemcodes[i]))
			{
				boolVerifyAdminLOResult [i] = true;
			}
		}
		print("----------Verify LO Admin Itemcode End-----------");
	}
	//Learning Objects Itemcode verification - user side
	public void verifyUserLearnObjItemcodes() {
		print("----------Verify LO User Itemcode start-----------");
		for(int i=0;i<learnObjTitles.length;i++)
		{
			String exptLearnObjTitle = "learnObjTitle"+(Integer.toString(i+1));
			String searchLearnObjitemcode = "learnObjItemcodes"+(Integer.toString(i+1));
			clear(searchfieldUser);
			enterData(getLabel(searchLearnObjitemcode), searchfieldUser);
			driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
			wait(waitingSec);
			verifyTextIgnorecase(getLabel(exptLearnObjTitle), learnObjTitles[i]);
			int searchResultCount = Integer.parseInt(driver.findElement(searchResultCountofResults).getText());
			print("Searchresult = "+searchResultCount);
			if(elementExist(learnObjTitles[i]) && searchResultCount>0){
				int itemCount = getItemsCount(arrayXpath1,arrayXpath2,searchResultCount);
				print("---------"+itemCount);
				if(itemCount == searchResultCount)
				{
					boolVerifyUserLOResult [i] = true;
				}
				else {
					boolVerifyUserLOResult [i] = false;
				}
			}
			else {
				boolVerifyUserLOResult [i] = false;
			}
		}
		print("----------Verify LO User Itemcode End-----------");
	}

	public void adminLogout() {
		click(adminAccountLogo);
		wait(waitingSec); 
		click(adminLogout);
	}
	public void userLogout() {
		click(userAccountLogo);
		wait(waitingSec);
		click(userLogout);
	}
	public boolean verifyLOICeLearn() {
		userResultNext=0;
		adminResultNext=0;
		boolResult =false;
		if(boolVerifyUserLOResult[userResultNext]==true && boolVerifyAdminLOResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyLOICVideo() {
		boolResult =false;
		if(boolVerifyUserLOResult[userResultNext]==true && boolVerifyAdminLOResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyLOICDocument() {
		boolResult =false;
		if(boolVerifyUserLOResult[userResultNext]==true && boolVerifyAdminLOResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyLOICImage() {
		boolResult =false;
		if(boolVerifyUserLOResult[userResultNext]==true && boolVerifyAdminLOResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyLOICAssessment() {
		boolResult =false;
		if(boolVerifyUserLOResult[userResultNext]==true && boolVerifyAdminLOResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyLOICvLab() {
		boolResult =false;
		if(boolVerifyUserLOResult[userResultNext]==true && boolVerifyAdminLOResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyLOICAudio() {
		boolResult =false;
		if(boolVerifyUserLOResult[userResultNext]==true && boolVerifyAdminLOResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	//-----------------------LO Edit Start------------------------
	public void editLearnObjItemcodes() {
		print("----------Edit LO Itemcode Start-----------");
		for(int i=0;i<learnObjItemcodes.length;i++)
		{
			String itemcode = "learnObjItemcodes"+(Integer.toString(i+1));
			enterData(getLabel(itemcode), searchFieldLearnObj);
			wait(waitingSec);
			click(editBtn);
			wait(waitingSec);
			WebElement element = driver.findElement(itemcodetab); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			wait(waitingSec);
			String editItemcode = "editlearnObjItemcode"+(Integer.toString(i+1));
			enterData(getLabel(editItemcode),itemcodetab);
			wait(waitingSec);
			click(updateBtn);
			wait(waitingSec);
			verifyTextIgnorecase(getLabel("SavealertmsglearnObj"), saveNewVersionBtn);
			click(newVersionReqNoBtn);
			wait(waitingSec);
			try{
				String updateAlertMsg = "UpdatealertmsglearnObjTitle"+(Integer.toString(i+1));
				if(verifyTextIgnorecase(getLabel(updateAlertMsg), updateAlertMsgEditlearnObject1)) {
					print("Update Passed......");
				}
				else
				{
					print("Update Failed......");
				}
			}
			catch (Exception e){
				String updateAlertMsg = "UpdatealertmsglearnObjTitle"+(Integer.toString(i+1));
				if(verifyTextIgnorecase(getLabel(updateAlertMsg), updateAlertMsgEditlearnObject2)){
					print("Update Passed......");
				}
				else
				{
					print("Update Failed......");
				}
			}
			click(updateagainNoBtn);
			wait(waitingSec);
		}
		print("----------Edit Itemcode End-----------");
	}
	//Learning Objects Edited Itemcode verification - Admin side
	public void editVerifyAdminLearnObjItemcodes() {
		print("----------Verify LO Admin Edited Itemcode start-----------");
		for(int i=0;i<learnObjTitles.length;i++)
		{
			String exptLearnObjTitle = "learnObjTitle"+(Integer.toString(i+1));
			String expEditedtitemcode = "editlearnObjItemcode"+(Integer.toString(i+1));
			String searchLearnObjitemcode = "learnObjItemcodes"+(Integer.toString(i+1));
			click(searchFieldLearnObj);
			enterData(getLabel(searchLearnObjitemcode), searchFieldLearnObj);
			wait(waitingSec);
			if(verifyTextIgnorecase(getLabel(exptLearnObjTitle), learnObjTitles[i]) && verifyTextIgnorecase(getLabel(expEditedtitemcode), editlearnObjItemcodes[i]))
			{
				editboolVerifyAdminLOResult [i] = true;
			}
		}
		print("----------Verify LO Admin Edited Itemcode End-----------");
	}
	//Learning Objects Edited Itemcode verification - user side
	public void editVerifyUserLearnObjItemcodes() {
		print("----------Verify LO User Edited Itemcode start-----------");
		for(int i=0;i<learnObjTitles.length;i++)
		{
			WebElement element = driver.findElement(searchfieldUser); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			String exptLearnObjTitle = "learnObjTitle"+(Integer.toString(i+1));
			String searchLearnObjitemcode = "learnObjItemcodes"+(Integer.toString(i+1));
			enterData(getLabel(searchLearnObjitemcode), searchfieldUser);
			driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
			wait(waitingSec);
			verifyTextIgnorecase(getLabel(exptLearnObjTitle), learnObjTitles[i]);
			int searchResultCount = Integer.parseInt(driver.findElement(searchResultCountofResults).getText());
			if(elementExist(learnObjTitles[i]) && searchResultCount>0){
				int itemCount = getItemsCount(arrayXpath1,arrayXpath2,searchResultCount);
				print("---------"+itemCount);
				if(itemCount == searchResultCount)
				{
					editboolVerifyUserLOResult [i] = true;
				}
				else {
					editboolVerifyUserLOResult [i] = false;
				}
			}
			else {
				editboolVerifyUserLOResult [i] = false;
			}
		}
		print("----------Verify LO User Itemcode End-----------");
	}

	public boolean editVerifyLOICeLearn() {
		editUserResultNext=0;
		editAdminResultNext=0;
		boolResult =false;
		if(editboolVerifyUserLOResult[editUserResultNext]==true && editboolVerifyAdminLOResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyLOICVideo() {
		boolResult =false;
		if(editboolVerifyUserLOResult[editUserResultNext]==true && editboolVerifyAdminLOResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyLOICDocument() {
		boolResult =false;
		if(editboolVerifyUserLOResult[editUserResultNext]==true && editboolVerifyAdminLOResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyLOICImage() {
		boolResult =false;
		if(editboolVerifyUserLOResult[editUserResultNext]==true && editboolVerifyAdminLOResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyLOICAssessment() {
		boolResult =false;
		if(editboolVerifyUserLOResult[editUserResultNext]==true && editboolVerifyAdminLOResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyLOICvLab() {
		boolResult =false;
		if(editboolVerifyUserLOResult[editUserResultNext]==true && editboolVerifyAdminLOResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyLOICAudio() {
		boolResult =false;
		if(editboolVerifyUserLOResult[editUserResultNext]==true && editboolVerifyAdminLOResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	//-----------------------ReEdit Start------------------------
	public void reEditLearnObjItemcodes() {
		print("----------reEdit LO Itemcode Start-----------");
		for(int i=0;i<learnObjItemcodes.length;i++)
		{
			String itemcode = "learnObjItemcodes"+(Integer.toString(i+1));
			enterData(getLabel(itemcode), searchFieldLearnObj);
			wait(waitingSec);
			click(editBtn);
			wait(waitingSec);
			WebElement element = driver.findElement(itemcodetab); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			wait(waitingSec);
			String editItemcode = "learnObjItemcode"+(Integer.toString(i+1));
			enterData(getLabel(editItemcode),itemcodetab);
			wait(waitingSec);
			click(updateBtn);
			wait(waitingSec);
			click(newVersionReqNoBtn);
			wait(waitingSec);
			click(updateagainNoBtn);
			wait(waitingSec);
		}
		print("----------ReEdit LO Itemcode End-----------");
	}

	//Catalog starts
	public void clickOnCreatecatalog() {
		click(catalogItem);
		wait(waitingSec);
	}
	//catalog Itemcode verification - Admin side
	public void verifyAdminCatItemItemcodes() {
		print("----------Verify CI Admin Itemcode start-----------");
		for(int i=0;i<catItemTitles.length;i++)
		{
			String exptcatItemTitle = "catItemTitle"+(Integer.toString(i+1));
			String exptcatItemitemcode = "catItemItemcode"+(Integer.toString(i+1));
			String searchcatItemitemcode = "catItemItemcodes"+(Integer.toString(i+1));
			click(searchFieldCatItem);
			enterData(getLabel(searchcatItemitemcode), searchFieldCatItem);
			wait(waitingSec);
			if(verifyTextIgnorecase(getLabel(exptcatItemTitle), catItemTitles[i]) && verifyTextIgnorecase(getLabel(exptcatItemitemcode), catItemItemcodes[i]))
			{
				boolVerifyAdminCIResult [i] = true;
			}
		}
		print("----------Verify CI Admin Itemcode End-----------");
	}
	//catalog Itemcode verification - user side
	public void verifyUserCatItemItemcodes() {
		print("----------Verify CI User Itemcode start-----------");
		for(int i=0;i<catItemTitles.length;i++)
		{
			String exptcatItemTitle = "catItemTitle"+(Integer.toString(i+1));
			String searchcatItemitemcode = "catItemTitle"+(Integer.toString(i+1));
			clear(searchfieldUser);
			enterData(getLabel(searchcatItemitemcode), searchfieldUser);
			driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
			wait(waitingSec);
			if(verifyTextIgnorecase(getLabel(exptcatItemTitle), catItemTitles[i]))
			{
				boolVerifyUserCIResult [i] = true;
			}
		}
		print("----------Verify CI User Itemcode End-----------");
	}
	public boolean verifyCIICContBundle() {
		userResultNext=0;
		adminResultNext=0;
		boolResult =false;
		if(boolVerifyUserCIResult[userResultNext]==true && boolVerifyAdminCIResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyCIICLearningPath() {
		boolResult =false;
		if(boolVerifyUserCIResult[userResultNext]==true && boolVerifyAdminCIResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyCIICCourse() {
		boolResult =false;
		if(boolVerifyUserCIResult[userResultNext]==true && boolVerifyAdminCIResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyCIICResource() {
		boolResult =false;
		if(boolVerifyUserCIResult[userResultNext]==true && boolVerifyAdminCIResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public boolean verifyCIICPodcast() {
		boolResult =false;
		if(boolVerifyUserCIResult[userResultNext]==true && boolVerifyAdminCIResult[adminResultNext]==true)
		{
			boolResult =true;
		}
		userResultNext++;
		adminResultNext++;
		return boolResult;
	}
	public void editCataItemItemcodes() {
		print("----------Edit CI Itemcode Start-----------");
		for(int i=0;i<catItemTitles.length;i++)
		{
			String itemcode = "catItemItemcodes"+(Integer.toString(i+1));
			enterData(getLabel(itemcode), searchFieldCatItem);
			wait(waitingSec);
			click(catEditBtn);
			wait(waitingSec);
			WebElement element = driver.findElement(itemcodetab); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			wait(waitingSec);
			String editItemcode = "editcatItemItemcode"+(Integer.toString(i+1));
			enterData(getLabel(editItemcode),itemcodetab);
			wait(waitingSec);
			click(continueBtn);
			wait(waitingSec);
			click(continueBtn1);
			wait(waitingSec);
			click(saveBtn);
			wait(waitingSec);
			String updateAlertMsg = "updatealertmsgItemcodeTitle"+(Integer.toString(i+1));
			if(verifyTextIgnorecase(getLabel(updateAlertMsg), updateAlertMsgEditCatItem[i])) {
				print("Update Passed......");
			}
			else
			{
				print("Update Failed......");
			}


			click(backcatalogBtn);
			wait(waitingSec);
		}
		print("----------Edit CI Itemcode End-----------");
	}
	public void editVerifyAdminCatItemItemcodes() {
		print("----------Verify CI Admin Edited Itemcode start-----------");
		for(int i=0;i<catItemTitles.length;i++)
		{
			String exptcatItemTitle = "catItemTitle"+(Integer.toString(i+1));
			String expEditedtitemcode = "editcatItemItemcode"+(Integer.toString(i+1));
			String searchcatItemitemcode = "catItemItemcodes"+(Integer.toString(i+1));
			click(searchFieldCatItem);
			enterData(getLabel(searchcatItemitemcode), searchFieldCatItem);
			wait(waitingSec);
			if(verifyTextIgnorecase(getLabel(exptcatItemTitle), catItemTitles[i]) && verifyTextIgnorecase(getLabel(expEditedtitemcode), editCatItemItemcodes[i]))
			{
				editboolVerifyAdminCIResult [i] = true;
			}
		}
		print("----------Verify CI Admin Edited Itemcode End-----------");
	}
	// Edited Itemcode verification - user side
	public void editVerifyUserCatItemItemcodes() {
		print("----------Verify CI User Itemcode start-----------");
		for(int i=0;i<catItemTitles.length;i++)
		{
			WebElement element = driver.findElement(searchfieldUser); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			String exptcatItemTitle = "catItemTitle"+(Integer.toString(i+1));
			String searchcatItemitemcode = "catItemTitle"+(Integer.toString(i+1));
			clear(searchfieldUser);
			enterData(getLabel(searchcatItemitemcode), searchfieldUser);
			driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
			wait(waitingSec);
			if(verifyTextIgnorecase(getLabel(exptcatItemTitle), catItemTitles[i]))
			{
				editboolVerifyUserCIResult [i] = true;
			}
		}
		print("----------Verify CI User Itemcode End-----------");
	}
	public boolean editVerifyCIICContBundle() {
		editUserResultNext=0;
		editAdminResultNext=0;
		boolResult =false;
		if(editboolVerifyUserCIResult[editUserResultNext]==true && editboolVerifyAdminCIResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyCIICLearningPath() {
		boolResult =false;
		if(editboolVerifyUserCIResult[editUserResultNext]==true && editboolVerifyAdminCIResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyCIICCourse() {
		boolResult =false;
		if(editboolVerifyUserCIResult[editUserResultNext]==true && editboolVerifyAdminCIResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyCIICResource() {
		boolResult =false;
		if(editboolVerifyUserCIResult[editUserResultNext]==true && editboolVerifyAdminCIResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public boolean editVerifyCIICPodcast() {
		boolResult =false;
		if(editboolVerifyUserCIResult[editUserResultNext]==true && editboolVerifyAdminCIResult[editAdminResultNext]==true)
		{
			boolResult =true;
		}
		editUserResultNext++;
		editAdminResultNext++;
		return boolResult;
	}
	public void reEditCatItemItemcodes() {
		print("----------reEdit CI Itemcode Start-----------");
		for(int i=0;i<catItemTitles.length;i++)
		{
			String itemcode = "catItemItemcodes"+(Integer.toString(i+1));
			enterData(getLabel(itemcode), searchFieldCatItem);
			wait(waitingSec);
			click(catEditBtn);
			wait(waitingSec);
			WebElement element = driver.findElement(itemcodetab); Actions
			actions = new Actions(driver); actions.moveToElement(element);
			actions.perform();
			wait(waitingSec);
			String editItemcode = "catItemItemcode"+(Integer.toString(i+1));
			enterData(getLabel(editItemcode),itemcodetab);
			wait(waitingSec);
			click(continueBtn);
			wait(waitingSec);
			click(continueBtn1);
			wait(waitingSec);
			click(saveBtn);
			wait(waitingSec);
			click(backcatalogBtn);
			wait(waitingSec);
		}
		print("----------ReEdit CI Itemcode End-----------");
	}

	public void verifyAdminLearningObjects() {
		goToManagecontent();
		verifyAdminLearnObjItemcodes();
		adminLogout();
	}
	public void verifyUserLearningObjects() {
		verifyUserLearnObjItemcodes();
		userLogout();
	}
	public void editVerifyAdminLearningObjects() {
		goToManagecontent();
		editLearnObjItemcodes();
		editVerifyAdminLearnObjItemcodes();
		adminLogout();
	}
	public void editVerifyUserLearningObjects() {
		editVerifyUserLearnObjItemcodes();
		userLogout();
	}
	public void verifyAdminCatalogItems(){
		goToManagecontent();
		clickOnCreatecatalog();
		verifyAdminCatItemItemcodes();
		adminLogout();
	}
	public void verifyUserCatalogItems(){
		verifyUserCatItemItemcodes();
		userLogout();
	}
	public void editVerifyAdminCatalogItems(){
		goToManagecontent();
		clickOnCreatecatalog();
		editCataItemItemcodes();
		editVerifyAdminCatItemItemcodes();
		adminLogout();
	}
	public void editVerifyUserCatalogItems(){
		editVerifyUserCatItemItemcodes();
		userLogout();
	}
	public void reEditItem(){
		LoginSteps login = new LoginSteps(driver);
	//	login.reAdminsidelogin();
		goToManagecontent();
		reEditLearnObjItemcodes();
		clickOnCreatecatalog();
		reEditCatItemItemcodes();
		adminLogout();
	}
	public void itemcoderenameLearningObject(){
		goToManagecontent();
		reEditLearnObjItemcodes();
	}
	public void itemcoderenamecatalog() {
		clickOnCreatecatalog();
		reEditCatItemItemcodes();
		adminLogout();
	}
}
