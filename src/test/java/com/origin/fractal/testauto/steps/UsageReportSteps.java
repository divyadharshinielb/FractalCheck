package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.UsageReportPage;
/* File name: UsageReportSteps.java
 * Purpose: Check FR1-3400 usage report for Learning objects & FR1-3401 User report count view -steplevel code
 * Created by: Vignesh R
 * Created on: 23-Nov-2020
 * Updated Date:18-Mar-21
 */
public class UsageReportSteps extends FractalBaseStep {
	private UsageReportPage usagePage= null;
	public UsageReportSteps(WebDriver driver) {
		usagePage=new UsageReportPage(driver);
	}

	/* Function Name: gotoUsageReport()
	 * Action: goto report and click usage tab
	 */
	public void gotoUsageReport() {
		result = "FAILED";
		try{
//			usagePage.changeAdminRole();//Added on 2-Dec-20
			usagePage.gotoUsageReport();
			result = "PASSED";
		}catch(Exception e) {
			result = "FAILED";
		}
	}

	/* Function Name: verifyAllItemOption()
	 * Action: Verify all catalog item option
	 */
	public void verifyAllItemOption() {
		result = "FAILED";
		try{
			usagePage.verifyAllItemOption();
			result = "PASSED";
		}catch(Exception e) {
			result = "FAILED";
		}
	}

	/* Function Name: verifyExportBtnUsageReport()
	 * Action: check export report button is clickable
	 */
	public void verifyExportBtnUsageReport() {
		result = "FAILED";
		try{usagePage.verifyExportBtnUsageReport();
		result = "PASSED";
		}catch(Exception e) {
			result = "FAILED";
		}
	}

	/* Function Name: verifyLeastAccessedItemItemOption()
	 * Action: Verify Least Accessed catalog item option
	 */
	public void verifyLeastAccessedItemOption() {
		result = "FAILED";
		try{usagePage.verifyLeastAccessedItemOption(); {
			result = "PASSED";
		}
		}catch(Exception e) {
			result = "FAILED";
		}
	}

	/* Function Name: verifyMostUsedItemOption()
	 * Action: Verify Most used Items
	 */
	public void verifyMostUsedItemOption() {
		result = "FAILED";
		try{usagePage.verifyMostUsedItemOption(); {
			result = "PASSED";
		}
		}catch(Exception e) {
			result = "FAILED";
		}
	}

	//Added on 2-Dec-12
	/* Function Name: verifyUserReport()
	 * Action: Verify view count column in user report
	 */
	public void verifyUserReport() {
		result = "FAILED";
		try{usagePage.verifyUserReport();
		result = "PASSED";
		}catch(Exception e) {
			result = "FAILED";
		}
	}

	/* Function Name: verifyItemCount()
	 * Action: Verify view count in user report
	 */
	public void verifyItemCount() {
		result = "FAILED";
		try{usagePage.verifyItemCount(); {
			result = "PASSED";
		}
		}catch(Exception e) {
			result = "FAILED";
		}
	}
	
	/* Function Name: verifyExportBtnUserReport()
	 * Action: check export report button is clickable
	 */
	public void verifyExportBtnUserReport() {
		result = "FAILED";
		try{usagePage.verifyExportBtnUserReport();
		result = "PASSED";
		}catch(Exception e) {
			result = "FAILED";
		}
	}
	//ends
}
