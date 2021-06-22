package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.MyLearningPage;

public class MyLearningSteps extends FractalBaseStep {
	private MyLearningPage page;
	public MyLearningSteps(WebDriver driver) {
		page = new MyLearningPage(driver);
		fBPage = page;
	}

	public void verifyMyLearningPage() {
		result ="PASSED";
		try {
			page.verifyMyLearningPage();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifySubMenu() {
		result ="PASSED";
		try {
			page.verifySubMenu();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void verifyComplStatus() {
		result ="PASSED";
		try {
			page.verifyComplStatus();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyCatalogname() {
		result ="PASSED";
		try {
			page.verifyCatalogname();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyCourseInBundle() {
		result ="PASSED";
		try {
			page.verifyCourseInBundle();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}public void multiplecategorycheck() {
		result ="PASSED";
		try {
			page.multiplecategorycheck();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}	
	public void multiplecategoryhomepage() {
		result ="PASSED";
		try {
			page.multiplecategoryhomepage();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyCatalogDetails() {
		result ="PASSED";
		try {
			page.verifyCatalogDetails();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyAllFilter(){
		result ="PASSED";
		try {
			page.verifyAllFilter();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyBundleFilter(){
		result ="PASSED";
		try {
			page.verifyBundleFilter();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyCourseFilter(){
		result ="PASSED";
		try {
			page.verifyCourseFilter();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyResourceFilter(){
		result ="PASSED";
		try {
			page.verifyResourceFilter();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyTickmark(){
		result ="PASSED";
		try {
			page.verifyTickmark();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void verifyListView(){
		result ="PASSED";
		try {
			page.verifyListView();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyGridView(){
		result ="PASSED";
		try {
			page.verifyGridView();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyCategory(){
		result ="PASSED";
		try {
			page.verifyCategory();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void verifyCategoryList(){
		result ="PASSED";
		try {
			page.verifyCategoryList();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void verifyRatings(){
		result ="PASSED";
		try {
			page.verifyRatings();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void verifyBundleContents(){
		result ="PASSED";
		try {
			page.verifyBundleContents();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void verifyCourseContents(){
		result ="PASSED";
		try {
			page.verifyCourseContents();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}


	public void verifyLaunch(){
		result ="PASSED";
		try {
			page.verifyLaunch();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	public void verifyTopArrowBtn() {
		result ="PASSED";
		try {
			page.verifyTopArrowBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyClassroomDetails() {
		result ="PASSED";
		try {
			page.verifyClassroomDetails();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyCancelRegistrationBtn() {
		result ="PASSED";
		try {
			page.verifyCancelRegistrationBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyDetailsBtn() {
		result ="PASSED";
		try {
			page.verifyDetailsBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyAssignedClassroom(){
		result ="PASSED";
		try {
			page.verifyAssignedClassroom();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyInsideClassroomDetails() {
		result ="PASSED";
		try {
			page.verifyInsideClassroomDetails();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyEventDisplayClassroomObject() {
		result ="PASSED";
		try {
			page.verifyEventDisplayClassroomObject();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyTraditionalClassBtn() {
		result ="PASSED";
		try {
			page.verifyTraditionalClassBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyChooseEventBtn() {
		result ="PASSED";
		try {
			page.verifyChooseEventBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyEventRegistrationBtn() {
		result ="PASSED";
		try {
			page.verifyEventRegistrationBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void verifyClassrooomLabels() {
		result ="PASSED";
		try {
			page.verifyClassrooomLabels();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}

	//Added by vignesh 30-Nov-20
	/* Function Name: verifyCertification()
	 * Action: Verifying certificate module
	 */
	public void verifyCertification(){
		try {result="FAILED";
		page.verifyCertificateModule(); {
			result="PASSED";
		}}catch(Exception e) {
			result="FAILED";
		}
	}
	//Ends
}
