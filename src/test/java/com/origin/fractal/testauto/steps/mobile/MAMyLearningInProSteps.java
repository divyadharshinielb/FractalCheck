package com.origin.fractal.testauto.steps.mobile;


import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.mobile.*;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MAMyLearningInProSteps extends FractalBaseStep{//extends by Jan_16_19
	private MAMyLearningInProPage page;

	public MAMyLearningInProSteps(AppiumDriver<MobileElement> appDriver) {
		page = new MAMyLearningInProPage(appDriver);
	}
	//Updated by Manju Priya A on Jan_16_19
	public void validateMyLearningTitle() {
		result = "Passed";
		try {
			page.validateMyLearningTitle();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	
	public void clickCompleted() {
		result = "Passed";
		try {
			page.clickCompleted();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	
	public void clickMenu() {
		result = "Passed";
		try {
			page.clickMenu();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyInProgress() {
		result = "Passed";
		try {
			page.verifyInProgress();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	
	public void clickNotification() {
		result = "Passed";
		try {
			page.clickNotification();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyNotification() {
		result = "Passed";
		try{
			page.verifyNotification();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}

	public void verifyMoreButton() {
		result = "Passed";
		try{
			page.verifyMoreButton();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyContentAccess() {
		result = "Passed";
		try{
			page.verifyContentAccess();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyGridView() {
		result = "Passed";
		try{
			page.verifyGridView();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyListView() {
		result = "Passed";
		try{
			//page.verifyInProgress();
			page.verifyListView();//Updated by Manju Priya A on Jan_11_19
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}

	//Updated by Manju Priya A on Jan_16_19
	public void allFilter() {
		result = "Passed";
		try {
			page.allFilter();
		}
		catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void searchIcon() {
		result = "Passed";
		try{
			page.searchIcon();	
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//added by karpagavalli on 20.12.2018
	//Updated by Manju Priya A on Jan_16_19
	public void bundelFilter() {
		result = "Passed";
		try {
			page.bundelFilter();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	
	//Updated by Manju Priya A on Jan_16_19
	public void courseFilter() {
		result = "Passed";
		try{
			page.courseFilter();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void learningpathFilter(){
		result = "Passed";
		try{
			page.learningpathFilter();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void resourceFilter(){
		result = "Passed";
		try{
			page.resourceFilter();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyBundleCount(){
		result = "Passed";
		try{
			page.verifyBundleCount();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifycourseCount() {
		result = "Passed";
		try{
			page.verifycourseCount();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyLearningPathCount() {
		result = "Passed";
		try{
			page.verifyLearningPathCount();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyResourceCount() {
		result = "Passed";
		try{
			page.verifyResourceCount();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//added by karpagavalli till here on 20.12.2018
	//Added by Manju Priya A on jan_11_19
	//Updated by Manju Priya A on Jan_16_19
	public void filterDisplayed() {
		result = "Passed";
		try {
			page.filterDisplayed();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyTwoTabsNavigation() {
		result = "Passed";
		try{
			page.verifyTwoTabsNavigation();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyInProgTabContents() {
		result = "Passed";
		try {
			page.verifyInProgTabContents();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyCatalogNameTitle() {
		result = "Passed";
		try{
			page.verifyCatalogNameTitle();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//For Bundle Verification in Home page
	//Updated by Manju Priya A on Jan_16_19
	public void verifyNameTitleInsideBundle() {
		result = "Passed";
		try{
			page.verifyNameTitleInsideBundle();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyBundleAndContentsIntialProgress() {
		result = "Passed";
		try{
			page.verifyBundleAndContentsIntialProgress();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyBundleProgress() {
		result = "Passed";
		try{
			page.verifyBundleProgress();
		}
		catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyBundleContentsProgress() {
		result = "Passed";
		try{
			page.verifyBundleContentsProgress();
		}catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyBundleFullCompletion() {
		result = "Passed";
		try{
			page.verifyBundleFullCompletion();
		}
		catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//For Learning path Verification in Home page
	//Updated by Manju Priya A on Jan_16_19
	public void verifyNameTitleInsideLpath() {
		result = "Passed";
		try{
			page.verifyNameTitleInsideLpath();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyLpathIntialProgress() {
		result = "Passed";
		try{
			page.verifyLpathIntialProgress();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyCourseProgInLpath() {
		result = "Passed";
		try{
			page.verifyCourseProgInLpath();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyFullCourseProgInLpath() {
		result = "Passed";
		try{
			page.verifyFullCourseProgInLpath();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyPartialLpathProg() {
		result = "Passed";
		try{
			page.verifyPartialLpathProg();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyLpathFullCompletion() {
		result = "Passed";
		try{
			page.verifyLpathFullCompletion();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyLpathMovedToCompTab() {
		result = "Passed";
		try{
			page.verifyLpathMovedToCompTab();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//For Resource Verification in Home page
	//Updated by Manju Priya A on Jan_16_19
	public void verifyNameTitleInsideResource() {
		result = "Passed";
		try{
			page.verifyNameTitleInsideResource();
		}
		catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyResourceIntialProgress() {
		result = "Passed";
		try{
			page.verifyResourceIntialProgress();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyLobjProgInResource() {
		result = "Passed";
		try{
			page.verifyLobjProgInResource();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyFullResourceProg() {
		result = "Passed";
		try{
			page.verifyFullResourceProg();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyRecMovedToCompTab() {
		result = "Passed";
		try{
			page.verifyRecMovedToCompTab();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//For Course Verification in Home page
	//Updated by Manju Priya A on Jan_16_19
	public void verifyNameTitleInsideCourse() {
		result = "Passed";
		try{
			page.verifyNameTitleInsideCourse();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyCourseIntialProgress() {
		result = "Passed";
		try{
			page.verifyCourseIntialProgress();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyLobjProgInCourse() {
		result = "Passed";
		try{
			page.verifyLobjProgInCourse();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyPartialCourseProg() {
		result = "Passed";
		try{
			page.verifyPartialCourseProg();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyFullCourseProg() {
		result = "Passed";
		try{
			page.verifyFullCourseProg();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//Updated by Manju Priya A on Jan_16_19
	public void verifyCourseMovedToCompTab() {
		result = "Passed";
		try{
			page.verifyCourseMovedToCompTab();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	
	//Added by Manju Priya A on Jan-14-19
	public void verifyVoiceAssitant() {
		result = "Passed";
		try{
			page.verifyVoiceAssitant();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyAllowPopup() {
		result = "Passed";
		try{
			page.verifyAllowPopup();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void verifyVoiceAssistLabels() {
		result = "Passed";
		try{
			page.verifyVoiceAssistLabels();
		}catch(Exception e) {
			result = "FAILED";
			e.printStackTrace();
		}
	}
	//End of added by Manju Priya A on Jan-14-19
	public void filterICon() {
		result = "Passed";
		try {
			page.filterICon();
		}
		catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
	public void progressBar() {
		result = "Passed";
		try {
			page.progressBar();
		}
		catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
		
	}
	public void verifyGridListView() {
		result = "Passed";
		try {
			page.verifyGridListView();
		}
		catch(Exception e){
			result = "FAILED";
			e.printStackTrace();
		}
	}
	

}
