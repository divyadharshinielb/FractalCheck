package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.CatalogItemPage;
/* File Name: CatalogItemSteps.java
  * Purpose: Check for due date field in Catalog items -FR1-2770
 * Number of Testcases: 7
 * Created by: DivyaDharshini
 * Created on: 17-July-2020
*/
public class CatalogItemSteps extends FractalBaseStep {
	private CatalogItemPage page;
	public CatalogItemSteps(WebDriver driver) {
		page = new CatalogItemPage(driver);
		fBPage = page;
	}
	/*
	 * function: clickManageContents()
	 * covers: It covers navigation of clickManageContents() function in CatalogItemPage
	 */

	public void clickManageContents() {
		result ="PASSED";
		try {
			page.clickManageContents();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: clickCatalogitem()
	 * covers: It covers navigation of clickCatalogitem() function in CatalogItemPage
	 */

	public void clickCatalogitem() {
		result ="PASSED";
		try {
			page.clickCatalogitem();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: addBundle()
	 * covers: It covers navigation of addBundle() function in CatalogItemPage
	 */

	public void addBundle() {
		result ="PASSED";
		try {
			page.addBundle();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: catalogCreation()
	 * covers: It covers navigation of catalogCreation() function in CatalogItemPage
	 */

	public void catalogCreation() {
		result ="PASSED";
		try {
			page.catalogCreation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: catalogTitle()
	 * covers: It covers navigation of catalogTitle() function in CatalogItemPage
	 */

	public void catalogTitle() {

		result ="PASSED";
		try {
			page.catalogTitle();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: courseCreation()
	 * covers: It covers navigation of courseCreation() function in CatalogItemPage
	 */

	public void courseCreation() {

		result ="PASSED";
		try {
			page.courseCreation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: addLearnPath()
	 * covers: It covers navigation of addLearnPath() function in CatalogItemPage
	 */

	public void addLearnPath() {

		result ="PASSED";
		try {
			page.addLearnPath();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: addPodcast()
	 * covers: It covers navigation of addPodcast() function in CatalogItemPage
	 */

	public void addPodcast() {

		result ="PASSED";
		try {
			page.addPodcast();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: addCourse()
	 * covers: It covers navigation of addCourse() function in CatalogItemPage
	 */

	public void addCourse() {

		result ="PASSED";
		try {
			page.addCourse();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: addResource()
	 * covers: It covers navigation of addResource() function in CatalogItemPage
	 */

	public void addResource() {

		result ="PASSED";
		try {
			page.addResource();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: clickBothlbl()
	 * covers: It covers navigation of clickBothlbl() function in CatalogItemPage
	 */

	public void clickBothlbl() {

		result ="PASSED";
		try {
			page.clickBothlbl();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: clickPartOfCatalogLbl()
	 * covers: It covers navigation of clickPartOfCatalogLbl() function in CatalogItemPage
	 */

	public void clickPartOfCatalogLbl() {

		result ="PASSED";
		try {
			page.clickPartOfCatalogLbl();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: catalogSecondPage()
	 * covers: It covers navigation of catalogSecondPage() function in CatalogItemPage
	 */
	public void catalogSecondPage() {

		result ="PASSED";
		try {
			page.catalogSecondPage();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: bundleDueDateCheck()
	 * covers: It covers navigation of bundleDueDateCheck() function in CatalogItemPage
	 */

	public void bundleDueDateCheck() {

		result ="PASSED";
		try {
			page.bundleDueDateCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: bellNotificationDueCheck()
	 * covers: It covers navigation of bellNotificationDueCheck() function in CatalogItemPage
	 */

	public void bellNotificationDueCheck() {

		result ="PASSED";
		try {
			page.bellNotificationDueCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 *function: userCatalogItem()
	 * cause: Check for completion timeline (whether its clickable or not) in user part
	 */
	/*public void userCatalogItem() {		
		try {
			page.userCatalogItem();
			if (page.booleanresult == true) {
				result ="PASSED";

			}
			else if (page.booleanresult == false){
				result ="FAILED";
			}
			else {
				result = "FAILED";
				
			}
	}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 *function: logoutUser()
	 * cause: Click profile and logout in userpart
	 
	public void logoutUser() {
	
		result ="PASSED";
		try {
			page.logoutUser();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}*/
}