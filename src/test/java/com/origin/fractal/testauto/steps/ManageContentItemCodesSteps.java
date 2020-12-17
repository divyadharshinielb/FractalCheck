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
		try{page.verifyLOICeLearn();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyLOICVideo() {
		try{page.verifyLOICVideo();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyLOICDocument() {
		try{page.verifyLOICDocument();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}

	public void verifyLOICImage() {
		try{page.verifyLOICImage();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyLOICAssessment() {
		try{page.verifyLOICAssessment();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyLOICvLab() {
		try{page.verifyLOICvLab();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyLOICAudio() {
		try{page.verifyLOICAudio();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	//Learning Objects Edited Itemcode verification
	public void editVerifyLOICeLearn() {
		try{page.editVerifyLOICeLearn();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyLOICVideo() {
		try{page.editVerifyLOICVideo();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyLOICDocument() {
		try {				
			page.editVerifyLOICDocument();
			if (page.boolResult == true) {
				result ="PASSED";
			}else{
				result ="FAILED";
			}}	catch(Exception e) {
				result="FAILED";
			}
	}
	public void editVerifyLOICImage() {
		try{page.editVerifyLOICImage();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyLOICAssessment() {
		try{page.editVerifyLOICAssessment();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyLOICvLab() {
		try{page.editVerifyLOICvLab();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyLOICAudio() {
		try{page.editVerifyLOICAudio();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	//Catalog Item Itemcode Verifycation
	public void verifyCIICContBundle() {
		try{page.verifyCIICContBundle();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyCIICLearningPath() {
		try{page.verifyCIICLearningPath();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyCIICCourse() {
		try{page.verifyCIICCourse();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyCIICResource() {
		try{page.verifyCIICResource();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyCIICPodcast() {
		try {	page.verifyCIICPodcast();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	//edit Catalog Item Itemcode Verifycation
	public void editVerifyCIICContBundle() {
		try{page.editVerifyCIICContBundle();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyCIICLearningPath() {
		try {	page.editVerifyCIICLearningPath();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyCIICCourse() {
		try{page.editVerifyCIICCourse();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyCIICResource() {
		try{page.editVerifyCIICResource();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyCIICPodcast() {
		try{page.editVerifyCIICPodcast();
		if (page.boolResult == true) {
			result ="PASSED";
		}else{
			result ="FAILED";
		}}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyAdminLearningObjects() {
		result ="PASSED";
		try{page.verifyAdminLearningObjects();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyAdminLearningObjects() {
		result ="PASSED";
		try{page.editVerifyAdminLearningObjects();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyAdminCatalogItems(){
		result ="PASSED";
		try{page.verifyAdminCatalogItems();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyAdminCatalogItems(){
		result ="PASSED";
		try{page.editVerifyAdminCatalogItems();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyUserLearningObjects() {
		result ="PASSED";
		try{page.verifyUserLearningObjects();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyUserLearningObjects() {
		result ="PASSED";
		try{page.editVerifyUserLearningObjects();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void verifyUserCatalogItems(){
		result ="PASSED";
		try{page.verifyUserCatalogItems();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void editVerifyUserCatalogItems(){
		result ="PASSED";
		try{page.editVerifyUserCatalogItems();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void itemcoderenameLearningObject() {
		result ="PASSED";
		try{page.itemcoderenameLearningObject();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void itemcoderenameCatalog() {
		result ="PASSED";
		try{page.itemcoderenamecatalog();
		}	catch(Exception e) {
			result="FAILED";
		}
	}
	public void goToManagecontent() {
		result ="PASSED";
		try{page.goToManagecontent();
		}	catch(Exception e) {
			result="FAILED";
		}
	}

}