package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ClassRoomRosterPage;
/*
* File Name: ClassRoomRosterSteps.java
* Created By: Vignesh
* Created on: 28-Sep-20
* Purpose: To check the classroom Roster tab on Admin side (FR_145 - Learning Admin/Site Admin can manage the roster.)
*/
public class ClassRoomRosterSteps extends FractalBaseStep {
	ClassRoomRosterPage roster=null;
	public ClassRoomRosterSteps(WebDriver driver) {
		roster=new ClassRoomRosterPage(driver);
	}
	
	/* Function Name: verifyClassroomRoster()
	 * purpose: Verifying the Roster details
	 */
	public void verifyClassroomRoster() {
		result="FAILED";
		try{
			if(roster.verifyClassroomRoster()==true)
				result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function Name: verifyAssignmentDetails()
	 * purpose: Verifying the Assignment details
	 */
	public void verifyAssignmentDetails() {
		result="FAILED";
		try{
			if(roster.verifyAssignmentDetails()==true)
				result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function Name: verifyAssignmentScore()
	 * purpose: Verifying the Assignment Score
	 */
	public void verifyAssignmentScore()	 {
		result="FAILED";
		try{
			if(roster.verifyAssignmentScore()==true)
				result="PASSED";
		}catch(Exception e) {
			result="PASSED";
		}
	}
}
