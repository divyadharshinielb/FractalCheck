package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ElearningOrientationPage;
/*
 * File/Class name: ElearningOrientationSteps.java
 * Created by: Vignesh 
 * Created on: 10-July-2020
 * Updated on: 14-July-2020
 * Purpose: To check FR1-2539 
 */
public class ElearningOrientationSteps extends FractalBaseStep  {
	ElearningOrientationPage elearningOrientation;
	public ElearningOrientationSteps(WebDriver driver) {
		elearningOrientation = new ElearningOrientationPage(driver);
	}

	/* Method name: verifyELearningOrientation()
	 * Return type: bool
	 * Desc: Verify the Orientation present in e-learning object
	 */
	public void verifyELearningOrientation() {
		try{result="FAILED";
		if (elearningOrientation.verifyELearningOrientation()==true) {
			result="PASSED";
		}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Method name: verifyOrientationSelection()
	 * Return type: bool
	 * Desc: Verify the Orientation radio button action in e-learning object
	 */
	public void verifyOrientationSelection() {
		try{result="FAILED";
		if (elearningOrientation.verifyOrientationSelection()==true) {
			result="PASSED";
		}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	
	/* Method name: verifyScromeOrientation()
	 * Return type: bool
	 * Desc: Click auto/landscape/Portrait orientation with scorm package and Update the Learning Object
	 */
	public void verifyScormOrientation() {
		try {result="FAILED";
		if(elearningOrientation.verifyAutoOrientation("eLearningWithScorm")==true || elearningOrientation.verifyLandScapeOrientation("eLearningWithScorm")==true ||
				elearningOrientation.verifyPortraitOrientation("eLearningWithScorm")==true) {
			result="PASSED";
			elearningOrientation.clickCloseXbutton();
		}
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Method name: verifyXapiOrientation()
	 * Return type: bool
	 * Desc: Click auto/landscape/Portrait orientation with Xapi package and Update the Learning Object
	 */
	public void verifyXapiOrientation() {
		try {result="FAILED";
		if(elearningOrientation.verifyAutoOrientation("eLearningWithXapi")==true || elearningOrientation.verifyLandScapeOrientation("eLearningWithXapi")==true ||
				elearningOrientation.verifyPortraitOrientation("eLearningWithXapi")==true) {
			result="PASSED";
		}
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	//Added on 22Sep20
		/* Method name: preRequisite()
		 * Desc: preRequisite- Click Portrait orientation and Update the Learning Object
		 */
		public void preRequisite() {
			try {result="FAILED";
			elearningOrientation.preRequisite("eLearningWithScorm");
			wait(3);
//			elearningOrientation.preRequisite("eLearningWithXapi");//Updated on 3-Dec-20
			}catch(Exception e) {
				result="FAILED";
			}
		}
		//Ends

}
