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
		try {				
			page.verifyLOICeLearn();
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
	public void verifyLOICVideo() {
		try {				
			page.verifyLOICVideo();
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
	public void verifyLOICDocument() {
		try {				
			page.verifyLOICDocument();
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
	public void verifyLOICImage() {
		try {				
			page.verifyLOICImage();
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
	public void verifyLOICAssessment() {
		try {				
			page.verifyLOICAssessment();
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
	public void verifyLOICvLab() {
		try {				
			page.verifyLOICvLab();
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
	public void verifyLOICAudio() {
		try {				
			page.verifyLOICAudio();
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
	//Learning Objects Edited Itemcode verification
	public void editVerifyLOICeLearn() {
		try {				
			page.editVerifyLOICeLearn();
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
	public void editVerifyLOICVideo() {
		try {				
			page.editVerifyLOICVideo();
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
		try {				
			page.editVerifyLOICImage();
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
	public void editVerifyLOICAssessment() {
		try {				
			page.editVerifyLOICAssessment();
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
	public void editVerifyLOICvLab() {
		try {				
			page.editVerifyLOICvLab();
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
	public void editVerifyLOICAudio() {
		try {				
			page.editVerifyLOICAudio();
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
	//Catalog Item Itemcode Verifycation
	public void verifyCIICContBundle() {
		try {				
			page.verifyCIICContBundle();
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
	public void verifyCIICLearningPath() {
		try {				
			page.verifyCIICLearningPath();
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
	public void verifyCIICCourse() {
		try {				
			page.verifyCIICCourse();
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
	public void verifyCIICResource() {
		try {				
			page.verifyCIICResource();
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
	public void verifyCIICPodcast() {
		try {				
			page.verifyCIICPodcast();
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
	//edit Catalog Item Itemcode Verifycation
	public void editVerifyCIICContBundle() {
		try {				
			page.editVerifyCIICContBundle();
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
	public void editVerifyCIICLearningPath() {
		try {				
			page.editVerifyCIICLearningPath();
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
	public void editVerifyCIICCourse() {
		try {				
			page.editVerifyCIICCourse();
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
	public void editVerifyCIICResource() {
		try {				
			page.editVerifyCIICResource();
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
	public void editVerifyCIICPodcast() {
		try {				
			page.editVerifyCIICPodcast();
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
	public void verifyLearningObjects() {
		page.verifyLearningObjects();
	}
	public void editVerifyLearningObjects() {
		page.editVerifyLearningObjects();
	}
	public void verifyCatalogItems(){
		page.verifyCatalogItems();
	}
	public void editCVerifyCatalogItems()
	{
		page.editCVerifyCatalogItems();
	}
	public void reEdit() {
		page.reEdit();
	}

}