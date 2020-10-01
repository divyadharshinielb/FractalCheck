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
		result ="Passed";
		try {
			page.clickManageContents();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: clickCatalogitem()
	 * covers: It covers navigation of clickCatalogitem() function in CatalogItemPage
	 */

	public void clickCatalogitem() {
		result ="Passed";
		try {
			page.clickCatalogitem();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: addBundle()
	 * covers: It covers navigation of addBundle() function in CatalogItemPage
	 */

	public void addBundle() {
		result ="Passed";
		try {
			page.addBundle();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: catalogCreation()
	 * covers: It covers navigation of catalogCreation() function in CatalogItemPage
	 */

	public void catalogCreation() {
		result ="Passed";
		try {
			page.catalogCreation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: catalogTitle()
	 * covers: It covers navigation of catalogTitle() function in CatalogItemPage
	 */

	public void catalogTitle() {

		result ="Passed";
		try {
			page.catalogTitle();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: courseCreation()
	 * covers: It covers navigation of courseCreation() function in CatalogItemPage
	 */

	public void courseCreation() {

		result ="Passed";
		try {
			page.courseCreation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: addLearnPath()
	 * covers: It covers navigation of addLearnPath() function in CatalogItemPage
	 */

	public void addLearnPath() {

		result ="Passed";
		try {
			page.addLearnPath();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: addPodcast()
	 * covers: It covers navigation of addPodcast() function in CatalogItemPage
	 */

	public void addPodcast() {

		result ="Passed";
		try {
			page.addPodcast();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: addCourse()
	 * covers: It covers navigation of addCourse() function in CatalogItemPage
	 */

	public void addCourse() {

		result ="Passed";
		try {
			page.addCourse();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: addResource()
	 * covers: It covers navigation of addResource() function in CatalogItemPage
	 */

	public void addResource() {

		result ="Passed";
		try {
			page.addResource();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: clickBothlbl()
	 * covers: It covers navigation of clickBothlbl() function in CatalogItemPage
	 */

	public void clickBothlbl() {

		result ="Passed";
		try {
			page.clickBothlbl();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: clickPartOfCatalogLbl()
	 * covers: It covers navigation of clickPartOfCatalogLbl() function in CatalogItemPage
	 */

	public void clickPartOfCatalogLbl() {

		result ="Passed";
		try {
			page.clickPartOfCatalogLbl();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: catalogSecondPage()
	 * covers: It covers navigation of catalogSecondPage() function in CatalogItemPage
	 */
	public void catalogSecondPage() {

		result ="Passed";
		try {
			page.catalogSecondPage();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: bundleDueDateCheck()
	 * covers: It covers navigation of bundleDueDateCheck() function in CatalogItemPage
	 */

	public void bundleDueDateCheck() {

		result ="Passed";
		try {
			page.bundleDueDateCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
	/*
	 * function: bellNotificationDueCheck()
	 * covers: It covers navigation of bellNotificationDueCheck() function in CatalogItemPage
	 */

	public void bellNotificationDueCheck() {

		result ="Passed";
		try {
			page.bellNotificationDueCheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="Failed";
		}
	}
}