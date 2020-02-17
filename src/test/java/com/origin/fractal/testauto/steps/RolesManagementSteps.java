package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.RolesManagementPage;
public class RolesManagementSteps extends FractalBaseStep {
	private RolesManagementPage page;
	public RolesManagementSteps(WebDriver driver) {
		page = new RolesManagementPage(driver);
		//fBPage = page;
	}
	public void DirectuserwithLearningadminandinsrole() {
		result ="PASSED";
		   try {
			page.DirectuserwithLearningadminandinsrole();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void Checkdirectuserinsandlearningadminmapping() {
		result ="PASSED";
		   try {
			page.Checkdirectuserinsandlearningadminmapping();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void LearningadminwithDirectuserrole() {
		result ="PASSED";
		   try {
			page.LearningadminwithDirectuserrole();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void InstructorwithDirectuserrole() {
		result ="PASSED";
		   try {
			page.InstructorwithDirectuserrole();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void SiteadminwithDirectuserRole() {
		result ="PASSED";
		   try {
			page.SiteadminwithDirectuserRole();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void BusinessadminwithbusinessuserRole() {
		result ="PASSED";
		   try {
			page.BusinessadminwithbusinessuserRole();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void Businessuserwithinsrole() {
		result ="PASSED";
		   try {
			page.Businessuserwithinsrole();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	}
	public void BusinessUserRole() {
		result ="PASSED";
		   try {
			page.BusinessUserRole();
		   }
		   catch(Exception e)
		   {
			e.printStackTrace();   
			result="FAILED";
		   }
	   }
		public void instructorUserRole() {
			result ="PASSED";
			   try {
				page.instructorUserRole();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		   }
		public void businessAdminRole() {
			result ="PASSED";
			   try {
				page.businessAdminRole();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		   }
		public void siteAdminRole() {
			result ="PASSED";
			   try {
				page.siteAdminRole();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		   }
		public void directUserRole() {
			result ="PASSED";
			   try {
				page.directUserRole();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		   }
		public void learningAdminRole() {
			result ="PASSED";
			   try {
				page.learningAdminRole();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		   }
		public void gotoManageUser() {
			result ="PASSED";
			   try {
				page.gotoManageUser();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void clickMenu() {
			result ="PASSED";
			   try {
				page.clickMenu();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void clickClassroom() {
			result ="PASSED";
			   try {
				page.clickClassroom();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void addclassroomcheck() {
			result ="PASSED";
			   try {
				page.addclassroomcheck();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void editclassroomcheck() {
			result ="PASSED";
			   try {
				page.editclassroomcheck();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
		public void editmanagerolefunctionality() {
			result ="PASSED";
			   try {
				page.editmanagerolefunctionality();
			   }
			   catch(Exception e)
			   {
				e.printStackTrace();   
				result="FAILED";
			   }
		}
}

