package com.origin.fractal.testauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;
/* File name: ReorderingCatalogItemsPage.java
 * Purpose: FR1-2772 catalog item reordering
 * Developed By: Vigneshwaran R
 * created on: 23-Sep-20
 * Updated Date: 15-Oct-20
 */
public class ReorderingCatalogItemsPage extends FractalBasePage{
	MenuPage menuPage = null;
	private String userName = "wintestersbassvikianu01@gmail.com";//Updated on 7-Nov
	private By allUserSearchArea=By.xpath("//*[@id='searchAllUsersName']");
	private By assignContentIcon=By.xpath("//*[@title='Assign Content']");
	private By expandModules=By.xpath("//*[contains(text(),'Add Content')]");
	private By expandModulesSearch=By.xpath("//input[@id='quoteSearch']");
	private By expandModulesSearchResult=By.xpath("((//*[contains(@class,'course_expand')]//div)[10]/div/div)[1]/div/div/div[1]");
	private By drug=By.xpath("(//*[@ng-drag-data='list'])[1]");
	private By drop=By.xpath("(//*[@ng-drag-data='list'])[2]");
	private By firstItem=By.xpath("(//*[@class='row'])[1]");
	private By secondItem=By.xpath("(//*[@class='row'])[3]");
	private By thirdItem=By.xpath("(//*[@class='row'])[5]");
	private By btnSave=By.xpath("//button[text()='Save']");
	private By popsuccessfullyNotification=By.xpath("//*[contains(text(),'Content updated successfully')]");
	private String existOrder1=null;
	private String existOrder2=null;
	private String existOrder3=null;
	private By adminAccountIcon=By.xpath("//*[@class='loggeduserbg ng-binding']");
	private By roleLeaner=By.xpath("//*[text()='Learner']");
	private By userMyLearningTab=By.xpath("//*[@href='/mylearning']");//a[(text()='MY LEARNING')]
	private By userMyLearningbox1=By.xpath("(((//*[@class='my-masonry-grid_column'])[1]//div)[1]//p)[5]");
	private By userMyLearningbox2=By.xpath("(((//*[@class='my-masonry-grid_column'])[2]//div)[1]//p)[5]");
	private By userMyLearningbox3=By.xpath("(((//*[@class='my-masonry-grid_column'])[3]//div)[1]//p)[5]");
	public ReorderingCatalogItemsPage(WebDriver driver) {
		super(driver);
		menuPage = new MenuPage(driver);
	}

	/* Function Name: verifyDragAndDrop();
	 * Purpose: Verify the Drag And Drop the item and change the order
	 */
	public boolean verifyDragAndDrop() {
		menuPage.gotoManageUsers();
		wait(5);
		enterData(userName,allUserSearchArea);
		wait(5);
		moveElementFocusandClick(assignContentIcon);
		wait(5);
		click(expandModules);
		wait(2);
		click(expandModulesSearchResult);
		click(expandModulesSearchResult);
		wait(2);
		existOrder1= getText(firstItem);
		existOrder2= getText(secondItem);
		existOrder3= getText(thirdItem);
		print("Item1: "+existOrder1);
		print("Item2: "+existOrder2);
		print("Item3: "+existOrder3);
		dragAndDrop(drug,drop);
		wait(2);
		return compareStrings(getText(secondItem), existOrder1) || compareStrings(getText(firstItem), existOrder2);
	}


	/* Function Name: verifyExistedandNewOrder();
	 * Purpose: Verify the Existed items order is NOT affected and New order is updated.
	 */
	public boolean verifyExistedandNewOrder() {
		click(btnSave);
		wait(5);
		clear(allUserSearchArea);
		wait(5);
		enterData(userName,allUserSearchArea);
		wait(3);
		moveElementFocusandClick(assignContentIcon);
		wait(5);
		return compareStrings(getText(secondItem), existOrder1) || compareStrings(getText(firstItem), existOrder2) || compareStrings(getText(thirdItem), existOrder3);
	}

	/* Function Name: verifySuccessfullyUpdated();
	 * Purpose: Verify the Successfully Notification.
	 */
	public boolean verifySuccessfullyUpdated(){
		click(expandModules);
		wait(2);
		click(expandModulesSearchResult);
		click(expandModulesSearchResult);
		click(btnSave);
		return elementExist(popsuccessfullyNotification);
	}


	/* Function Name: verifyReorderUserMyLearning();
	 * Purpose: Verify the items order in user my learning tab.
	 */
	public boolean verifyReorderUserMyLearning(){
		//		click(adminAccountIcon);
		//		wait(2);
		//		click(roleLeaner);
		wait(5);
		click(userMyLearningTab);
		wait(5);
		return compareStrings(getText(userMyLearningbox2), existOrder1) || compareStrings(getText(userMyLearningbox1), existOrder2) || compareStrings(getText(userMyLearningbox3), existOrder3);
	}



}
