package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
import com.origin.fractal.testauto.steps.MenuSteps;
/* File name: UsageReportPage.java
 * Purpose: Check FR1-3400 usage report for Learning objects & FR1-3401 User report count view
 * Created by: Vignesh R
 * Created on: 23-Nov-2020
 * Updated Date:2-Dec-2020
 */
public class UsageReportPage extends FractalBasePage{
	private MenuSteps menu = null;
	private By usageReportTab = By.xpath("//md-tab-item[@role='tab']//span[@class='text-uppercase padding-lr-10 ng-scope'][normalize-space()='Usage']");
	private By selectOption = By.xpath("//form[@id='usageReportForm']//div[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
	private By selectAllItemOption = By.xpath("//li[text()='All Catalog Items']");
	private By selectMostUsedItemOption = By.xpath("//li[text()='Most Used Learning Objects']");
	private By selectLeastAccessedItemOption = By.xpath("//li[text()='Least Accessed Learning Objects']");
	private By searchTextArea = By.xpath("(//input[@type='search'])[3]");
	private By selectSearchedItem = By.xpath("//md-virtual-repeat-container[@role='presentation']//li[1]");
	private By btnGenerate = By.xpath("(//button[text()='Generate'])[4]");
	private By btnExportReport = By.xpath("(//button[text()='Export report'])");
	private By txtLearningObject = By.xpath("//*[@ng-if='userListView && !contentLoading']//*[contains(text(),'Learning Object')]");
	private By txtViewCount = By.xpath("//*[@ng-if='userListView && !contentLoading']//*[contains(text(),'View count')]");
	private By viewLearningObjectList = By.xpath("(//*[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-lr-0 padding-tb-20 border-bottom ng-scope'][@ng-if=\"data.report_show=='yes'\"])[1]");
	private By viewLearningObjectName = By.xpath("(//*[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-lr-0 padding-tb-20 border-bottom ng-scope'][@ng-if=\"data.report_show=='yes'\"])[1]//div[2]");
	private By viewLearningObjectCount = By.xpath("(//*[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding-lr-0 padding-tb-20 border-bottom ng-scope'][@ng-if=\"data.report_show=='yes'\"])[1]//div[6]");
	private By adminAccountIcon = By.xpath("//*[@class='dropdown text-uppercase line-height-100']");
	private By lanerRole = By.xpath("//*[@class='dropdown-menu menu-myaccount']//div[2]//*[text()='Learner']");
	private By searchfieldUser= By.xpath("//input[@id='theInput']");
	private String mostUsedItemName ="" ;
	private int mostUsedItemCount= 0;
	private By closeXBtn= By.xpath("//*[@id='close']");
	private By userAccountIcon = By.xpath("//button[@class='jss29 jss3 jss5 jss8 circle-hover']");
	private By adminRole = By.xpath("//*[text()='Automationrolecheck']"); // Updated on 2-Dec-20
	//Added on 2-Dec-20
	private By usersReportTab = By.xpath("//md-tab-item[@role='tab']//span[@class='text-uppercase padding-lr-10 ng-scope'][normalize-space()='Users']");
	private By lblUsername = By.xpath("//ng-include[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/md-autocomplete[1]/md-autocomplete-wrap[1]/input[1]");
	private String userName = "automation_directuser@originlearning.com";
	private By lblHighlight = By.xpath("(//span[@class='highlight'])[1]");
	private By selectBox = By.xpath("(//*[@class='nice-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty'])[2]");
	private By selectAll = By.xpath("//li[text()='All']");
	private By btnGenerate2 = By.xpath("(//button[text()='Generate'])[2]");
	private By txtViewCountColumn = By.xpath("//*[contains(text(),'View Count')]");
	private By btnExpendItem = By.xpath("(//*[@class='col-lg-3 col-md-3 col-sm-3 col-xs-3 font-size-12 text-capitalize text-left cursor-pointer color_primary'])[1]");
	private By countView = By.xpath("(//*[@class='col-lg-1 col-md-1 col-sm-1 col-xs-1 font-size-12 text-capitalize text-center ng-binding'])[1]");
	private By btnExportReport1 = By.xpath("(//button[text()='Export report'])[1]");
	//Ends
	public UsageReportPage(WebDriver driver) {
		super(driver);
		menu = new MenuSteps(driver);
	}
	//Added on 2-Dec-20
	/* Function Name: changeAdminRole()
	 * Action: change the admin role
	 */
	public void changeAdminRole() {
		click(userAccountIcon);
		wait(2);
		click(adminRole);
		wait(5);
	}

	/* Function Name: changeLanerRole()
	 * Action: change the Laner role
	 */
	public void changeLanerRole() {
		moveElementFocusandClick(adminAccountIcon);
		wait(2);
		click(lanerRole);
		wait(5);
	}
	//ends

	/* Function Name: gotoUsageReport()
	 * Action: goto report and click usage tab
	 */
	public void gotoUsageReport() {
		menu.gotoReports();
		wait(3);
		click(usageReportTab);
	}

	/* Function Name: verifyAllItemOption()
	 * Action: Verify all catalog item 
	 */
	public void verifyAllItemOption() {
		click(selectOption);
		moveElementFocusandClick(selectAllItemOption);
		moveElementFocusandClick(searchTextArea);
		enterData("a",searchTextArea);
		click(selectSearchedItem);
		wait(2);
		click(btnGenerate);
		elementExist(btnExportReport);
		elementExist(txtLearningObject);
		elementExist(txtViewCount);
		elementExist(viewLearningObjectList);
	}

	/* Function Name: verifyExportBtnUsageReport()
	 * Action: check export report button is clickable
	 */
	public void verifyExportBtnUsageReport() {
		isClickable(btnExportReport);
	}

	/* Function Name: verifyAllItemOption()
	 * Action: Verify Least Accessed Items
	 */
	public boolean verifyLeastAccessedItemOption() {
		click(selectOption);
		moveElementFocusandClick(selectLeastAccessedItemOption);
		click(btnGenerate);
		elementExist(btnExportReport);
		elementExist(txtLearningObject);
		elementExist(txtViewCount);
		elementExist(viewLearningObjectList);
		print("View Count = "+Integer.parseInt(getText(viewLearningObjectCount)));
		return Integer.parseInt(getText(viewLearningObjectCount))>=1;
	}

	/* Function Name: verifyMostUsedItemOption()
	 * Action: Verify Most used Items
	 */
	public boolean verifyMostUsedItemOption() {
		click(selectOption);
		moveElementFocusandClick(selectMostUsedItemOption);
		click(btnGenerate);
		elementExist(btnExportReport);
		elementExist(txtLearningObject);
		elementExist(txtViewCount);
		elementExist(viewLearningObjectList);
		mostUsedItemName = getText(viewLearningObjectName);
		mostUsedItemCount = Integer.parseInt(getText(viewLearningObjectCount));
		print("View Count = "+mostUsedItemCount);
		changeLanerRole(); //Updated on 2-Dec-20
		enterData(mostUsedItemName,searchfieldUser);
		driver.findElement(searchfieldUser).sendKeys(Keys.RETURN);
		wait(5);
		print(mostUsedItemName);
		click(By.xpath("(//*[text()='"+mostUsedItemName+"'])[3]"));
		wait(5);
		click(closeXBtn);
		wait(2);
		changeAdminRole();//Updated on 2-Dec-20
		gotoUsageReport();
		click(selectOption);
		moveElementFocusandClick(selectMostUsedItemOption);
		click(btnGenerate);
		elementExist(btnExportReport);
		elementExist(txtLearningObject);
		elementExist(txtViewCount);
		elementExist(viewLearningObjectList);
		print("New View Count = "+Integer.parseInt(getText(viewLearningObjectCount)));
		return mostUsedItemCount<= Integer.parseInt(getText(viewLearningObjectCount));
	}

	//Added on 2-Dec-12
	/* Function Name: verifyUserReport()
	 * Action: Verify view count column in user report
	 */
	public void verifyUserReport() {
		click(usersReportTab);
		wait(2);
		click(selectBox);
		wait(2);
		click(selectAll);
		click(lblUsername);
		enterData(userName,lblUsername);
		wait(2);
		click(lblHighlight);
		wait(2);
		click(btnGenerate2);
		wait(2);
		elementExist(txtViewCountColumn);
	}

	/* Function Name: verifyItemCount()
	 * Action: Verify view count in user report
	 */
	public boolean verifyItemCount() {
		click(btnExpendItem);
		wait(2);
		mostUsedItemCount=Integer.parseInt(getText(countView));
		print("User viewCount = "+ mostUsedItemCount);
		return mostUsedItemCount>=0 | getText(countView).contentEquals("NA");
	}

	/* Function Name: verifyExportBtnUserReport()
	 * Action: check export report button is clickable
	 */
	public void verifyExportBtnUserReport() {
		isClickable(btnExportReport1);
	}
	//Ends
}
