package com.origin.fractal.testauto.steps;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.CustomizationRolesPage;
/* File Name: CustomizationRolesSteps.java
 * Purpose: Check for creation and mapping of custom roles to user - FR1-2361
 * Number of Testcases: 9
 * Created by: DivyaDharshini
 * Created on: 02-June-2020
 */
public class CustomizationRolesSteps extends FractalBaseStep{
	public CustomizationRolesPage page;
	public CustomizationRolesSteps(WebDriver driver) {
		page = new CustomizationRolesPage(driver);
		fBPage = page;
	}
	/*
	 * function: clickManageroles()
	 * covers: It covers navigation of clickManageroles function in DeleteEventandClassroomPage
	 */
	public void clickManageroles() {
		result ="PASSED";
		try {
			page.clickManageroles();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: addCustomRoleField()
	 * covers: It covers navigation of addCustomRoleField function in DeleteEventandClassroomPage
	 */
	public void addCustomRoleField() {
		result ="PASSED";
		try {
			page.addCustomRoleField();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: roleNameValidation()
	 * covers: It covers navigation of roleNameValidation function in DeleteEventandClassroomPage
	 */
	public void roleNameValidation() {
		result ="PASSED";
		try {
			page.roleNameValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: roleCreationwithLearningadmin()
	 * covers: It covers navigation of roleCreationwithLearningadmin function in DeleteEventandClassroomPage
	 */
	public void roleCreationwithLearningadmin() {
		result ="PASSED";
		try {
			page.roleCreationwithLearningadmin();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: RoleCreationwithGuestuser()
	 * covers: It covers navigation of RoleCreationwithGuestuser function in DeleteEventandClassroomPage
	 */
	public void RoleCreationwithGuestuser() {
		result ="PASSED";
		try {
			page.RoleCreationwithGuestuser();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: roleMappingToDirectUser()
	 * covers: It covers navigation of roleMappingToDirectUser function in DeleteEventandClassroomPage
	 */
	public void roleMappingToDirectUser() {
		result ="PASSED";
		try {
			page.roleMappingToDirectUser();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/*
	 * function: deleteAssignedRole()
	 * covers: It covers navigation of deleteAssignedRole function in DeleteEventandClassroomPage
	 */
	public void deleteAssignedRole() {
		result ="PASSED";
		try {
			page.deleteAssignedRole();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
		
	}
	/*
	 * function: adminLogout()
	 * covers: It covers navigation of adminLogout function in DeleteEventandClassroomPage
	 */
	public void adminLogout() {
		result ="PASSED";
		try {
			page.adminLogout();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
		
	}
	/*
	 * function: customRolemapForDirectUser()
	 * covers: It covers navigation of customRolemapForDirectUser function in DeleteEventandClassroomPage
	 */
	public void customRolemapForDirectUser() {
		result ="PASSED";
		try {
			page.customRolemapForDirectUser();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
		
	}
	/*
	 * function: unassignRole()
	 * covers: It covers navigation of unassignRole function in DeleteEventandClassroomPage
	 */
	public void unassignRole() {
		result ="PASSED";
		try {
			page.unassignRole();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	
	}
	/*
	 * function: deleteUnassignedRole()
	 * covers: It covers navigation of deleteUnassignedRole function in DeleteEventandClassroomPage
	 */
	public void deleteUnassignedRole() {
		result ="PASSED";
		try {
			page.deleteUnassignedRole();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	
	}
	/*
	 * function: clickSettingsicon()
	 * covers: It covers navigation of clickSettingsicon function in DeleteEventandClassroomPage
	 */
	public void clickSettingsicon() {
		result ="PASSED";
		try {
			page.clickSettingsicon();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	
	}
	
}
