package com.wv.auto.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.wv.auto.framework.utils.Timer;

public abstract class  BasePage {
	protected WebDriver driver;
	protected LinkedHashMap<String, By> objRep = new LinkedHashMap<String, By>();
	protected WebDriverWait wdWait=null;
	protected String pageName=null;


	public WebElement getObj(By objLoc) {
		WebElement we = driver.findElement(objLoc);
		return we;
	}


	public boolean compareStrings(String expValue, String actualValue) {
		if (expValue.equals(actualValue)) {
			print("PASSED : The expected string is " + expValue
					+ " , the actual string is " + actualValue);
			return true;
		} else {
			print("FAILED : The expected string is " + expValue
					+ " , the actual string is " + actualValue);
			//			Assert.assertTrue(false);
			return false;

		}
	}

	public void goTo(String Url) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Url);
	}

	public void print(String strToPrint) {
		System.out.println(strToPrint);
	}

	public void wait(int timeInSec){

		Timer.wait(timeInSec);

	}

	public void enterData(String dataToEnter, By objLoc) {
		enterData(dataToEnter, getObj(objLoc));

	}

	public void enterData(String dataToEnter, WebElement inpElement) {
		WebElement we = inpElement;
		we.clear();
		we.sendKeys(dataToEnter);
		print("ENTERED DATA : The data " + dataToEnter
				+ " is entered in input Element" + inpElement.toString());
	}

	public boolean verifyTitle(String expTitle) {
		return compareStrings(expTitle, driver.getTitle());
	}

	public boolean verifyText(String expText, By objLoc) {
		WebElement we = getObj(objLoc);
		return verifyText(expText, we);

	}
	public String getText(By objLoc) {
		WebElement we = getObj(objLoc);
		return we.getText();

	}
	public boolean verifyText(String expText, WebElement obj) {
		String actText = obj.getText();
		return compareStrings(expText, actText);

	}

	public boolean verifyValue(String expValue, By objLoc) {
		return verifyValue(expValue, getObj(objLoc));
	}

	public boolean verifyValue(String expValue, WebElement obj) {
		return compareStrings(expValue, obj.getAttribute("value"));
	}

	public void printSelectionState(By objLoc) {
		printSelectionState(getObj(objLoc));
		print("The selected status for" + objLoc.toString() + " : "
				+ getObj(objLoc).isSelected());
	}
	public boolean verifyAttrValue(String expValue, By objLoc, String attributeName) {

		return verifyAttrValue(expValue, getObj(objLoc), attributeName );
	}	

	public boolean verifyAttrValue(String expValue, WebElement obj, String attributeName) {
		return compareStrings(expValue, obj.getAttribute(attributeName));
	}

	public void printSelectionState(WebElement obj) {
		print("The selected status is : " + obj.isSelected());
	}


	public void click(By objLoc) {
		click(getObj(objLoc));
	}

	public void click(WebElement obj) {


		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", obj);
		//obj.click();
		print("CLICKED : " + obj.toString());
		//obj.click();
		//print("CLICKED : " + obj.toString());
	}

	public void selectByVisibleText(String textToBeSelected, By objLoc) {
		selectByVisibleText(textToBeSelected, getObj(objLoc));
	}

	public void selectByVisibleText(String textToBeSelected, WebElement dropDown) {
		Select select = new Select(dropDown);
		select.selectByVisibleText(textToBeSelected);
		print("SELECTED : " + textToBeSelected);
	}

	public void selectByValue(String valueToBeSelected, By objLoc) {
		selectByValue(valueToBeSelected, getObj(objLoc));
	}

	public void selectByValue(String valueToBeSelected, WebElement dropDown) {
		Select select = new Select(dropDown);
		select.selectByValue(valueToBeSelected);
		print("SELECTED BY VALUE: " + valueToBeSelected);
	}


	public WebElement getObj(String objName) {
		By objLoc = objRep.get(objName);
		if (objLoc == null) {
			print(" The object "
					+ objName
					+ " is not found, returning null, please investigate page class");
		}

		WebElement we = getObj(objLoc);

		return we;

	}

	public void addObj(String objName, By objLoc) {
		objRep.put(objName, objLoc);
	}

	public void selectByVisibleText(String textToBeSelected, String objName) {
		selectByVisibleText(textToBeSelected, getObj(objName));
	}



	public boolean verifyComplPercent(By objLoc) {
		WebElement we = getObj(objLoc);
		return verifyComplPercent(we);
	}

	//This will verify whether the completed percentage has "%" symbol and number before % 
	public boolean verifyComplPercent(WebElement obj) {
		//Updated by Manju priya A on Jan_11_19
		String trimed=obj.getText();//variable name changed from percentage > trimed by Manju Priya A on Jan_11_19 for Safari automation
		String percentage=trimed.trim();//Added by Manju Priya A on Jan_11_19 for Safari automation
		String[] percentValue = percentage.split("%");
		int value = Integer.parseInt(percentValue[0]);
		if(percentage.endsWith("%") && value<=100){
			print("PASSED : The Completion percent exist");
			return true;
		}else {
			print("FAILED : The Completion percent not found");
			return false;
		}
		/* old - String percentage=obj.getText();
		String[] percentValue = percentage.split("%");
		int value = Integer.parseInt(percentValue[0]);
		if(percentage.endsWith("%") && value<=100){
			print("PASSED : The Completion percent exist");
			return true;
		}else {
			print("FAILED : The Completion percent not found");
//			Assert.assertTrue(false);
			return false;
		}*/
	}

	public boolean verifyPartialText(String expText, By objLoc) {
		WebElement we = getObj(objLoc);
		return verifyPartialText(expText, we);

	}

	public boolean verifyPartialText(String expText, WebElement obj) {
		String actText = obj.getText();
		return containsString(expText, actText);
	}

	public boolean elementExist(By objLoc) {
		WebElement obj = null;
		try {
			obj = getObj(objLoc);
			print("PASSED : ELEMENT" + obj.toString() +" The element exist");
			return true;
		}catch(NoSuchElementException ex) {
			print("FAILED : ELEMENT" + objLoc.toString() +" The element doesn't exist");
			//			Assert.assertTrue(false);
			return false;
		}
	}

	public boolean verifyNonExistense(By objLoc) {
		WebElement obj = null;
		try {
			obj = getObj(objLoc);
			print("FAILED : ELEMENT" + obj.toString() +" The element exist");
			//			Assert.assertTrue(false);
			return false;
		}catch(NoSuchElementException ex) {
			print("PASSED :  ELEMENT" + objLoc.toString() +" The element doesn't exist");
			return true;
		}
	}


	//This method will get the count of repeating tags/elements
	public int getItemsCount(By objLoc) {
		List<WebElement> tags = driver.findElements(objLoc); 
		int noOftags = tags.size(); 
		return noOftags;
	}

	//This function will remove the array item of given index
	public String[] popArray(String[] arrayObj, int index) {
		List<String> initialList = new ArrayList<String>(Arrays.asList(arrayObj));
		initialList.remove(index);
		String[] popedArray = initialList.toArray(new String[initialList.size()]); 

		return popedArray;
	}

	//This function returns all the text in a repeating tag(tag should contain only the text)
	public String[] getFilterLinks(String objpath) {
		int length = getItemsCount(By.xpath(objpath));
		String[] filterArray= new String[length];
		for(int i=1;i<=length;i++) {
			filterArray[i-1] = getText(By.xpath(objpath+"["+i+"]"));
		}
		print("------>"+length);
		return filterArray;
	}

	//This function will get the particular text from the repeating tag(i.e.,The particular text in repeating div) and returns an array
	public String[] getCatalogTypes(String objpath, String objpathType) {
		int length = getItemsCount(By.xpath(objpath));
		String wholeObjPath = "";
		String actualCatalogType="";
		String[] catlogType = new String[length-1];
		for(int i=0;i<length-1;i++) {
			wholeObjPath = objpath+"["+(i+1)+objpathType;
			actualCatalogType=getText(By.xpath(wholeObjPath));
			catlogType[i]=(actualCatalogType).toLowerCase();
		}
		return catlogType;
	}
	public String[] getCatalogTypes1(String objpath, String objpathType) {
		int length = getItemsCount(By.xpath(objpath));
		String wholeObjPath = "";
		String actualCatalogType="";
		String[] catlogType = new String[length-1];
		for(int i=0;i<length-1;i++) {
			wholeObjPath = objpath+"["+(i+2)+objpathType;
			actualCatalogType=getText(By.xpath(wholeObjPath));
			catlogType[i]=(actualCatalogType).toLowerCase();
		}
		return catlogType;
	}

	//This function will remove the last letter from each array item 
	public static String[] removeLastInArrayItems(String[] array) {
		String[] outArray = new String[array.length];
		for(int i=0;i<array.length;i++) {
			outArray[i]=array[i].substring(0, (array[i].length()-1));
		}
		return outArray;
	}

	//This function will return distinct array
	public String[] getUniqueArray(String[] arrayObj) {
		List<String> initialList = Arrays.asList(arrayObj);
		Set<String> hashsetList = new HashSet<String>(initialList);
		String[] uniqueArray = hashsetList.toArray(new String[0]);
		return uniqueArray;
	}


	public boolean containsString(String expValue, String actualValue) {
		if (actualValue.contains(expValue)) {
			print("PASSED : The expected string is " + expValue
					+ " , the actual string is " + actualValue);
			return true;
		} else {
			print("FAILED : The expected string is " + expValue
					+ " , the actual string is " + actualValue);
			//			Assert.assertTrue(false);
			return false;
		}
	}

	//To get all the catalog item names in Grid
	public String[] getGridViewNames(String objBox, String objName) {
		//int count = getItemsCount(By.xpath(objBox));
		String[] listitems = getCatalogTypes(objBox, objName);
		return listitems;
	}

	//To get all the catalog item names in List view 
	public String[] getListViewNames(String objBox, String objName) {
		int length = getItemsCount(By.xpath(objBox));
		String wholeObjPath = "";
		String actualCatalogType="";
		String[] catlogNames = new String[length];
		for(int i=0;i<length;i++) {
			wholeObjPath = objBox+"["+(i+1)+objName;
			actualCatalogType=getText(By.xpath(wholeObjPath));
			catlogNames[i]=(actualCatalogType).toLowerCase();
		}
		return catlogNames;
	}

	public boolean compareArray(String[] actArray, String[] expArray) {
		boolean status=false;
		if(actArray.length==expArray.length) {
			for(int i=0;i<actArray.length;i++) {
				for(int j=0;j<expArray.length;j++) {
					if(actArray[i].equalsIgnoreCase(expArray[j])){
						status=true;
					}else {
						status=false;
					}
				}
			}
		}else {
			status=false;
		}
		return status;
	}



	public Set<String> popElement(Set<String> arrayObj, String item) {
		HashSet<String> items = (HashSet<String>) arrayObj;
		arrayObj.remove(item);				
		return items;
	}
	public boolean compareSet(Set<String> actSet, Set<String> expSet) {
		String[] actArray = actSet.toArray(new String[0]);
		String[] expArray= expSet.toArray(new String[0]);
		boolean status=false;
		if(actArray.length==expArray.length) {
			for(int i=0;i<actArray.length;i++) {
				for(int j=0;j<expArray.length;j++) {
					if(actArray[i].contains(expArray[j])) {
						status=true;
					}else {
						status=false;
					}
				}
			}
		}else {
			status=false;
		}
		return status;
	}


	public String getLastWord(String text, String condition) {
		String[] data=text.split(condition);
		return data[data.length-1];

	}

	public String getSubString(String text, int start, int end) {
		String data=text.substring(start, end);
		return data;
	}

	public void switchToNewWindow() {
		// Store and Print the name of all the windows open	
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		// Pass a window handle to the other window
		for (String handle1 : handles) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
	}

	public void closeNewWindow() {
		// Closing Pop Up window
		driver.close();
	}

	public void switchToParentWindow(String strFirstWindowHandle) {
		//Switch back to the parent browser window
		driver.switchTo().window(strFirstWindowHandle);
	}

	public void addToSet(Set<String> setItems, String item) {
		if(!item.isEmpty()) {
			setItems.add(item);
		}			
	}

	public void clear(By objLoc) {
		WebElement we = getObj(objLoc);
		we.clear();
		print("CLEARED DATA : The data " + " is cleared in input Element" + we.toString());
	}
	public boolean compareSet(String[] actArray, Set<String> expSet) {
		//String[] actArray = actSet.toArray(new String[0]);
		String[] expArray= expSet.toArray(new String[0]);
		boolean status=false;
		if(actArray.length==expArray.length) {
			for(int i=0;i<actArray.length;i++) {
				for(int j=0;j<expArray.length;j++) {
					status = containsString(actArray[i], expArray[j]);
				}
			}

		}else {
			status=false;
		}
		return status;
	}

	public int getNumber(String data){
		int number = Integer.parseInt(data);
		return number;
	}
	public String getFirstWord(String str) {
		String[] outArray = str.split(" ");
		return outArray[0];
	}

	public String getAttributeValue(By objLoc) {
		String value = driver.findElement(objLoc).getAttribute("text");
		return value;
	}
	public void waitE(By objLoc,int timeInSec) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver,timeInSec);
	wait.until(ExpectedConditions.visibilityOfElementLocated(objLoc));
	}

	public void waitEeTBC(By objLoc,int timeInSec) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,timeInSec);
		wait.until(ExpectedConditions.elementToBeClickable(objLoc));
	}	
	
	public void waitEpOEL(By objLoc,int timeInSec) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,timeInSec);
		wait.until(ExpectedConditions.presenceOfElementLocated(objLoc));
	}
	
	public void waitEvOEL(By objLoc,int timeInSec) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,timeInSec);
		wait.until(ExpectedConditions.visibilityOfElementLocated(objLoc));
	}
	
	public boolean verifyText(String expText, String actText) {
		return compareStrings(expText, actText);
	}
	public List<WebElement> getObjs(By objLoc) {
		List<WebElement> we = driver.findElements(objLoc);
		return we;
	}
	public List<WebElement> getAllElements(By objLoc) {
		List<WebElement> items = getObjs(objLoc);
		return items;
	}
	/*Starts - added By manju priya A on Jan-11-19*/
	public String getAttributeValueIos(By objLoc) {
		String value = driver.findElement(objLoc).getAttribute("value");
		return value;
	}
	/*End of - added By manju priya A on Jan-11-19*/
	public String getAttributeValuePassword(By objLoc) {
		String value = driver.findElement(objLoc).getAttribute("value");
		return value;
	}
	public void scrollToElement(By objPath) {
		WebElement element = driver.findElement(objPath);
		JavascriptExecutor jse = (JavascriptExecutor) driver;  wait(5);   
		jse.executeScript("arguments[0].scrollIntoView();", element);
	}
	//Added by Vignesh on 20/Oct/19 for Ignorecase (Updated on 28/Oct/19)
	public boolean verifyTextIgnorecase(String expText, By objLoc) {
		WebElement we = getObj(objLoc);
		return verifyTextIgnorecase(expText, we);
	}
	public boolean verifyTextIgnorecase(String expText, WebElement obj) {
		String actText = obj.getText();
		return compareStringsIgnorecase(expText, actText);
	}	
	//End- vignesh
	//Added by vignesh on 20/Oct/19 for Ignorecase
	public boolean compareStringsIgnorecase(String expValue, String actualValue) {
		if (expValue.equalsIgnoreCase(actualValue)) {
			print("PASSED : The expected string is " + expValue
					+ " , the actual string is " + actualValue);
			return true;
		} else {
			print("FAILED : The expected string is " + expValue
					+ " , the actual string is " + actualValue);
			// Assert.assertTrue(false);
			return false;
		}
	}
	//Added by vignesh on 03-Nov-19
	public int getItemsCount( String objBox,String objBoxtype,int searchResultCount) {
		boolean status = false;
		int count =0;
		int i=1;
		String wholeObjPath = "";
		do {
			if(searchResultCount>=i)
			{
				wholeObjPath =objBox+"["+(i)+objBoxtype;
				if(elementExist(By.xpath(wholeObjPath))) {
					count = count + 1;
					i = i+1;
					status = true;
				}
			}
			else {
				status = false;
			}

		}while(status);
		return count;
	}

	//Start - Vignesh (Wvi) on 16/May/20
	/*
	 * Method name: moveElementFocusandClick()
	 * Created by: Vignesh 
	 * Created date: 16/May/2020
	 * Return type: void
	 * Desc: Moves the focus to the specified element and clicks on the element
	 */		
	public void moveElementFocusandClick(By elementLoc) {
		WebElement element=driver.findElement(elementLoc);
		Actions actions= new Actions(driver);
		actions.moveToElement(element).perform();
		click(elementLoc);
		print("The element: "+elementLoc+" is Clicked.");
		wait(3);
	}
	/* Method name: moveElementFocus()
	 * Created by: Vignesh 
	 * Created date: 5/June/2020
	 * Return type: void
	 * Desc: Moves the focus to the specified element
	 */
	public void moveElementFocus(By elementLoc) {
		WebElement element=driver.findElement(elementLoc);
		Actions actions= new Actions(driver);
		actions.moveToElement(element).perform();
		wait(2);
	}
	//Ends - Vignesh (Wvi)

	/*
	 * Method name: getAttributeValue()
	 * Desc: Gets the attribute value
	 * Return type: String
	 * Created by: Veeresh 
	 * Created date: 5/June/2020
	 */
	public String getAttributeValue(By objLoc,String name) {
		String value = driver.findElement(objLoc).getAttribute(name);
		return value;
	}


	// Ends here - Vignesh (Wvi) on 16/May/20

	//Added by Vignesh on 04/Dec/19
	public boolean isClickable(By locater)      
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(locater));
			print("PASSED: The "+locater.toString()+" element is clickable");
			return true;
		}
		catch (Exception e)
		{
			print("FAILED: The "+locater.toString()+" element is NOT clickable");
			return false;
		}
	}
	//Ends- vignesh on 04/Dec/19
	//Added by Vignesh on 29/Jan/20
	public void fileUpload(String filePath, By uploadLink) {
		WebElement chooseFile = driver.findElement(uploadLink);
		chooseFile.sendKeys(filePath);
	}
	//Ends- vignesh on 29/Jan/20

	/* Method name: dragAndDrop()
	 * Created by: Vignesh
	 * Created date: 12/Sep/2020
	 * Return type: void
	 * Desc: Drag And Drop elements in one place other place
	 */
	public boolean dragAndDrop(By Loc1, By Loc2){
		try{
			//Element which we need to drag.
			WebElement From = driver.findElement(Loc1);

			//Element on which we need to drop.
			WebElement To = driver.findElement(Loc2);

			//Drag and drop action
			Actions act=new Actions(driver);
			act.dragAndDrop(From, To).build().perform();
			wait(5);

			return true;
		}catch(Exception e) {
			return false;
		}
	}
	//ends

}
