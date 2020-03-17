// Created by Vignesh(WVI) 
// Last Updated on 26-Oct-19
package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassroomCCPage;
import com.origin.fractal.testauto.pages.ManageContentItemCodesPage;

public class ManageContentItemCodesSteps extends FractalBaseStep {
	ManageContentItemCodesPage page;
	public ManageContentItemCodesSteps(WebDriver driver) {
		page = new ManageContentItemCodesPage(driver);		
		fBPage = page;	
	}
	//Learning Objects Itemcode verification
	public void verifyLOICeLearn() {
		page.verifyLOICeLearn();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyLOICVideo() {
		page.verifyLOICVideo();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyLOICDocument() {
		page.verifyLOICDocument();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}

	public void verifyLOICImage() {
		page.verifyLOICImage();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyLOICAssessment() {
		page.verifyLOICAssessment();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyLOICvLab() {
		page.verifyLOICvLab();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyLOICAudio() {
		page.verifyLOICAudio();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	//Learning Objects Edited Itemcode verification
	public void editVerifyLOICeLearn() {
		page.editVerifyLOICeLearn();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyLOICVideo() {
		page.editVerifyLOICVideo();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyLOICDocument() {
		try {				
			page.editVerifyLOICDocument();
			if (page.boolResult == true) {
				result ="PASSED";
			}
			else
			{ 
				result ="FAILED";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	public void editVerifyLOICImage() {
		page.editVerifyLOICImage();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyLOICAssessment() {
		page.editVerifyLOICAssessment();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyLOICvLab() {
		page.editVerifyLOICvLab();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyLOICAudio() {
		page.editVerifyLOICAudio();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	//Catalog Item Itemcode Verifycation
	public void verifyCIICContBundle() {
		page.verifyCIICContBundle();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyCIICLearningPath() {
		page.verifyCIICLearningPath();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyCIICCourse() {
		page.verifyCIICCourse();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyCIICResource() {
		page.verifyCIICResource();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyCIICPodcast() {
		page.verifyCIICPodcast();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	//edit Catalog Item Itemcode Verifycation
	public void editVerifyCIICContBundle() {
		page.editVerifyCIICContBundle();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyCIICLearningPath() {
		page.editVerifyCIICLearningPath();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyCIICCourse() {
		page.editVerifyCIICCourse();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyCIICResource() {
		page.editVerifyCIICResource();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void editVerifyCIICPodcast() {
		page.editVerifyCIICPodcast();
		if (page.boolResult == true) {
			result ="PASSED";
		}
		else
		{
			result ="FAILED";
		}
	}
	public void verifyAdminLearningObjects() {
		page.verifyAdminLearningObjects();
	}
	public void editVerifyAdminLearningObjects() {
		try {
			page.editVerifyAdminLearningObjects();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void verifyAdminCatalogItems(){
		page.verifyAdminCatalogItems();
	}
	public void editVerifyAdminCatalogItems(){
		page.editVerifyAdminCatalogItems();
	}
	public void verifyUserLearningObjects() {
		page.verifyUserLearningObjects();
	}
	public void editVerifyUserLearningObjects() {
		page.editVerifyUserLearningObjects();
	}
	public void verifyUserCatalogItems(){
		page.verifyUserCatalogItems();
	}
	public void editVerifyUserCatalogItems(){
		page.editVerifyUserCatalogItems();
	}
	public void itemcoderenameLearningObject() {
		page.itemcoderenameLearningObject();
	}
	public void itemcoderenameCatalog() {
		page.itemcoderenamecatalog();
	}	

}