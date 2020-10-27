package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ReorderingCatalogItemsPage;

/* File name: ReorderingCatalogItemsPage.java
 * Purpose: FR1-2772 catalog item reordering Step level codes
 * Developed By: Vigneshwaran R
 * created on: 23-Sep-20
 * Updated Date: 15-Oct-20
 */
public class ReorderingCatalogItemsSteps extends FractalBaseStep  {
	ReorderingCatalogItemsPage reorder=null;
	public ReorderingCatalogItemsSteps(WebDriver driver) {
		reorder = new ReorderingCatalogItemsPage(driver);
	}

	/* Function Name: verifyDragAndDrop();
	 * Purpose: Verify the Drag And Drop the item and change the order
	 */
	public void verifyDragAndDrop() {
		result="FAILED";
		try {
			if(reorder.verifyDragAndDrop()==true) {
				print("PASSED: Drag and drop is working");
				result="PASSED";
			}else print("FAILED: Drag and drop is NOT working");}
		catch(Exception e) {
			print("FAILED: Drag and drop is NOT working");
			result="FAILED";
		}
	}

	/* Function Name: verifyExistedandNewOrder();
	 * Purpose: Verify the Existing order is NOT affected except for the new order change.
	 */
	public void verifyExistedandNewOrder() {
		result="FAILED";
		try {
			if(reorder.verifyExistedandNewOrder()==true) {
				result="PASSED";
			}}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifySuccessfullyUpdated();
	 * Purpose: Verify the Successfully Notification.
	 */
	public void verifySuccessfullyUpdated(){
		result="FAILED";
		try {
			if(reorder.verifySuccessfullyUpdated()==true) {
				result="PASSED";
			}}
		catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function Name: verifyReorderUserMyLearning();
	 * Purpose: Verify the items order in user My Learning tab.
	 */
	public void verifyReorderUserMyLearning(){
		result="FAILED";
		try {
			if(reorder.verifyReorderUserMyLearning()==true) {
				result="PASSED";
			}}
		catch(Exception e) {
			result="FAILED";
		}
	}
}
