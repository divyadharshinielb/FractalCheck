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
		page.verifyMyLearningPage();
	}
	public void verifySubMenu() {
		page.verifySubMenu();
	}
	
	public void verifyComplStatus() {
		page.verifyComplStatus();
	}
	public void verifyCatalogname() {
		page.verifyCatalogname();
	}
	public void verifyCourseInBundle() {
		page.verifyCourseInBundle();
	}
	public void verifyCatalogDetails() {
		page.verifyCatalogDetails();
	}
	public void verifyAllFilter(){
		page.verifyAllFilter();
	}
	public void verifyBundleFilter(){
		page.verifyBundleFilter();
	}
	public void verifyCourseFilter(){
		page.verifyCourseFilter();
	}
	public void verifyResourceFilter(){
		page.verifyResourceFilter();
	}
	public void verifyTickmark(){
		page.verifyTickmark();
	}

	public void verifyListView(){
		page.verifyListView();
	}
	public void verifyGridView(){
		page.verifyGridView();
	}
	public void verifyCategory(){
		page.verifyCategory();
	}
	
	public void verifyCategoryList(){
		page.verifyCategoryList();
	}

	public void verifyRatings(){
		page.verifyRatings();
	}

	public void verifyBundleContents(){
		page.verifyBundleContents();
	}
	
	public void verifyCourseContents(){
		page.verifyCourseContents();
	}
	

	public void verifyLaunch(){
		page.verifyLaunch();
	}

	public void verifyTopArrowBtn() {
    	page.verifyTopArrowBtn();
    }
	public void verifyClassroomDetails() {
	    page.verifyClassroomDetails();
	}
	public void verifyCancelRegistrationBtn() {
	 page.verifyCancelRegistrationBtn();
	 }
	public void verifyDetailsBtn() {
		page.verifyDetailsBtn();
	}
	public void verifyAssignedClassroom(){
		page.verifyAssignedClassroom();
	}
	public void verifyInsideClassroomDetails() {
		page.verifyInsideClassroomDetails();
	}
	public void verifyEventDisplayClassroomObject() {
		page.verifyEventDisplayClassroomObject();
	}
	public void verifyTraditionalClassBtn() {
		page.verifyTraditionalClassBtn();
	}
	public void verifyChooseEventBtn() {
		page.verifyChooseEventBtn();
	}
	public void verifyEventRegistrationBtn() {
	verifyEventRegistrationBtn();
	}
	public void verifyClassrooomLabels() {
	verifyClassrooomLabels();
	}
}
