package com.origin.fractal.testauto.test.testsuites;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.DocumentValidationSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestDocumentValidation.java
 * Purpose: Check document creation with different file formats  - FR1-2775,FR1-2776
 * Number of Test cases: 9
 * Created by: DivyaDharshini
 * Updated  on: 27-10-2020
 */

public class WebTestDocumentValidation extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void documentValidation(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		DocumentValidationSteps docstep = new DocumentValidationSteps(driver);
		docstep.emptyFieldValidation();
		Reporter.writeSummary("FR1-2775_Doc_TC_001,Verify Empty Field validation messages for Document, " +  docstep.getResult() );
		docstep.documentWithLinkValidation();
		Reporter.writeSummary("FR1-2775_Doc_TC_001,Verify link field validation for Document, " +  docstep.getResult() );
	    docstep.documentCreationWithPDF();
		Reporter.writeSummary("FR1-2775_Doc_TC_002,Verify document with PDF and downloadable field validation, " +  docstep.getResult() );
		docstep.documentCreation();
		Reporter.writeSummary("FR1-2775_Doc_TC_003,Verify creation of document , " +  docstep.getResult() );
		docstep.documentCreationWithXLFile();
		Reporter.writeSummary("FR1-2776_Doc_TC_004,Verify creation of document with xl format , " +  docstep.getResult() );
		docstep.editDocument();
		Reporter.writeSummary("FR1-2775_Doc_TC_005,Verify edit of document, " +  docstep.getResult() );
		docstep.previewDocument();
		Reporter.writeSummary("FR1-2775_Doc_TC_006,Verify navigation of classroom icon in admin part , " +  docstep.getResult() );
		docstep.mapCatalogItem();
		Reporter.writeSummary("FR1-2775_Doc_TC_007,Verify mapping of created document while creating catalog item , " +  docstep.getResult() );
		docstep.podcastValidation();
		Reporter.writeSummary("FR1-2775_Doc_TC_008,Verify whether podcast does not allow to add document, " +  docstep.getResult() );
	/*	docstep.userDocumentCheck();
		Reporter.writeSummary("FR1-2775_Doc_TC_0012,Verify navigation of classroom icon in admin part , " +  docstep.getResult() );
			*/
	}
}