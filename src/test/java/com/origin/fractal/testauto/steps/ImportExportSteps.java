package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.ImportExportPage;

public class ImportExportSteps extends FractalBaseStep {
	private ImportExportPage page=null;


	public ImportExportSteps(WebDriver driver) {
		page = new ImportExportPage(driver);
		fBPage = page;
	}
	/* Function name:GotoImportExport() Covers:It navigates to the import and export page*/
	public void GotoImportExport() {
		result ="PASSED";
		try {
			page.GotoImportExport();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:verifyImportExportText() Covers:It navigates to verifyImportExportText function in import and export page*/
	public void verifyImportExportText() {
		result ="PASSED";
		try {
			page.verifyImportExportText();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:verifyUserTab() Covers:It navigates to verifyUserTab function in import and export page  */
	public void verifyUserTab() {
		result ="PASSED";
		try {
			page.verifyUserTab();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:selectIndividualUser() Covers:It navigates to selectIndividualUser function in import and export page  */
	public void selectIndividualUser() {
		result ="PASSED";
		try {
			page.selectIndividualUser();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:uploadBrowseFile() Covers:It navigates to uploadBrowseFile function in import and export page  */
	public void uploadBrowseFile() {
		result ="PASSED";
		try {
			page.uploadBrowseFileSample();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:selectGroups() Covers:It navigates to selectGroups function in import and export page  */
	public void selectGroups() {
		result ="PASSED";
		try {
			page.selectGroups();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:selectBusinessUser() Covers:It navigates to selectBusinessUser function in import and export page  */
	public void selectBusinessUser() {
		result ="PASSED";
		try {
			page.selectBusinessUser();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:SelectBusinessAdmin() Covers:It navigates to SelectBusinessAdmin function in import and export page  */
	public void SelectBusinessAdmin() {
		result ="PASSED";
		try {
			page.SelectBusinessAdmin();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:moreBusinessUsers() Covers:It navigates to moreBusinessUsers function in import and export page  */
	public void moreBusinessUsers() {
		result ="PASSED";
		try {
			page.moreBusinessUsers();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:NotStartedStatus() Covers:It navigates to NotStartedStatus function in import and export page  */
	public void NotStartedStatus(){
		result ="PASSED";
		try {
			page.NotStartedStatus();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:InprogressStatus() Covers:It navigates to InprogressStatus function in import and export page  */
	public void InprogressStatus(){
		result ="PASSED";
		try {
			page.InprogressStatus();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:CompletedStatus() Covers:It navigates to CompletedStatus function in import and export page  */
	public void CompletedStatus(){
		result ="PASSED";
		try {
			page.CompletedStatus();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:ParticularGroupName() Covers:It navigates to ParticularGroupName function in import and export page  */
	public void ParticularGroupName() {
		result ="PASSED";
		try {
			page.ParticularGroupName();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:allDirectUsers() Covers:It navigates to allDirectUsers function in import and export page  */
	public void allDirectUsers() {
		result ="PASSED";
		try {
			page.allDirectUsers();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:allBusinessUsers() Covers:It navigates to allBusinessUsers function in import and export page  */
	public void allBusinessUsers() {
		result ="PASSED";
		try {
			page.allBusinessUsers();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:uploadFilesValidation() Covers:It navigates to uploadFilesValidation function in import and export page  */
	public void uploadFilesValidation() {
		result ="PASSED";
		try {
			page.uploadFilesValidation();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:specialCharacters() Covers:It navigates to specialCharacters function in import and export page  */
	public void specialCharacters() {
		result ="PASSED";
		try {
			page.specialCharacters();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:LHwithInFirstSecondSheet() Covers:It navigates to LHwithInFirstSecondSheet function in import and export page  */
	public void LHwithInFirstSecondSheet(){
		result ="PASSED";
		try {
			page.LHwithInFirstSecondSheet();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:LHwithInFirstSheet() Covers:It navigates to LHwithInFirstSheet function in import and export page  */
	public void LHwithInFirstSheet(){
		result ="PASSED";
		try {
			page.LHwithInFirstSheet();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}

	}
	/* Function name:clickHereLink() Covers:It navigates to clickHereLink function in import and export page  */
	public void clickHereLink(){
		result ="PASSED";
		try {
			page.clickHereLink();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:InvalidCatalogTypNotStarted() Covers:It navigates to InvalidCatalogTypNotStarted function in import and export page  */
	public void InvalidCatalogTypNotStarted(){
		result ="PASSED";
		try {
			page.InvalidCatalogTypNotStarted();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:InvalidCatalogTypInprogress() Covers:It navigates to InvalidCatalogTypInprogress function in import and export page  */
	public void InvalidCatalogTypInprogress(){
		result ="PASSED";
		try {
			page.InvalidCatalogTypInprogress();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:InvalidCatalogTypCompleted() Covers:It navigates to InvalidCatalogTypCompleted function in import and export page  */
	public void InvalidCatalogTypCompleted(){
		result ="PASSED";
		try {
			page.InvalidCatalogTypCompleted();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:InvalidCatalogNameNotStarted() Covers:It navigates to InvalidCatalogNameNotStarted function in import and export page  */
	public void InvalidCatalogNameNotStarted(){
		result ="PASSED";
		try {
			page.InvalidCatalogNameNotStarted();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:InvalidCatalogNameInprogress() Covers:It navigates to InvalidCatalogNameInprogress function in import and export page  */
	public void InvalidCatalogNameInprogress(){
		result ="PASSED";
		try {
			page.InvalidCatalogNameInprogress();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
	/* Function name:InvalidCatalogNameCompleted() Covers:It navigates to InvalidCatalogNameCompleted function in import and export page  */
	public void InvalidCatalogNameCompleted(){
		result ="PASSED";
		try {
			page.InvalidCatalogNameCompleted();
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			result="FAILED";
		}
	}
}
