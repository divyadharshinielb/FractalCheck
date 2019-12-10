package com.origin.fractal.testauto.pages;

import com.origin.fractal.testauto.FractalBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBasePage;

public class GlobalPage extends FractalBasePage{
	private By Search = By.xpath(".//input[contains(@class,'cat_search')]");
    private By verificationText = By.xpath(".//div[contains(@class,'course_cnt  ml-3')]/../div/h6/span");
    private By homepage = By.xpath(".//button[contains(@class,'btn btn active2')]/../button/a/span");
    private By verificationText2 = By.xpath(".//div[contains(@class,'course_cnt ml-3 padding-t-6')]/../div/h6");
    private By noItem = By.xpath(".//span[@class='no-records-found']");//span[contains(text(),'No catalog items available at the moment!')]
    private By eLearning = By.xpath(".//span[contains(text(),'eLearning')]");
    private By video = By.xpath(".//div[contains(@class,'course_cnt ml-3 padding-t-6')]/../div/h6");
    private By automationLearningpath = By.xpath(".//a[contains(text(),'Automation Learningpath')]");
    private By automaionLearningpath=By.xpath(".//a[contains(text(),'Automation Learningpath')]");
    private By automationclassroom=By.xpath(".//h1[contains(text(),'Automation classroom')]");
    private By AutomationLearningpath=By.xpath(".//span[contains(text(),'Automation Learningpath')]");
    private By mylearning=By.xpath(".//a[contains(text(),'MY LEARNING')]");
    
	public GlobalPage(WebDriver driver) {
		super(driver);
		pageName ="ForgotPasswordPage";
	}
	//Added by Dhanushiya
		public void backButtonCheckClassroomEvent() {
			click(mylearning);
			wait(5);
			JavascriptExecutor je =(JavascriptExecutor)driver;
			je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(".//a[contains(text(),'Automation Learningpath')]")));
			wait(5);
			click(automaionLearningpath);
			wait(5);
			je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(".//h1[contains(text(),'Automation classroom')]")));
			wait(5);
			click( automationclassroom);
			wait(5);
			driver.navigate().back();
			wait(5);
			//verifyText("Automation Learningpath",AutomationLearningpath);
			wait(5);
			
		}
		
		
		//added by dhanushiya

		public void GlobalSearchforClassroomandClassroomsKeyword() {
			
			enterData("classroom",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Classroom",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("classrooms",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Classroom",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			wait(5);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforimageandimages() {
			wait(5);
			enterData("image",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Image",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("images",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Image",verificationText);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforAudioandAudios() {
			wait(5);
			enterData("audio",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Audio",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("audios",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Audio",verificationText);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforVideoandVideos() {
			wait(5);
			enterData("video",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Video",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("videos",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Video",verificationText);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforDocumentandDocuments() {
			wait(5);
			enterData("document",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Document",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("documents",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Document",verificationText);
		}
		//Added by Dhanushiya
		public void GlobalSearchforVlabsandVlabs() {
			wait(5);
			enterData("vlab",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("vLab",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("vlabs",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("vLab",verificationText);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforAssessmentandAssessments() {
			wait(5);
			enterData("assessment",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Assessment",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("assessment",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog item available at the moment!",noItem);
				
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforElearningandElearnings() {
			wait(5);
			enterData("elearning",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("eLearning",eLearning);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("elearnings",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("eLearning",eLearning);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforBundleandBundles() {
			wait(5);
			enterData("bundle",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Bundle",verificationText2);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("bundles",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Bundle",verificationText2);
			}
		//Added by Dhanushiya
		public void GlobalSearchforPodcastandPodcasts() {
			wait(5);
			enterData("podcast",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Podcast",verificationText2);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("podcasts",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Podcast",verificationText2);
		}	
		//Added by Dhanushiya
		public void GlobalSearchforLearningpathandLearningpaths() {
			wait(5);
			enterData("learningpath",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Learning Path",verificationText2);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("learningpaths",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Learning Path",verificationText2);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchforCourseandCourses() {
			wait(5);
			enterData("Course",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Course",verificationText2);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("courses",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Course",verificationText2);
			}
		//Added by Dhanushiya
		public void GlobalSearchforResourceandResources() {
			wait(5);
			enterData("resource",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Video",video);//resource only have videos
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("resources",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Video",video);
			
		}
		//Added by Dhanushiya
		public void GlobalSearchwithRandomcharacterandIntegers() {
			wait(5);
			enterData("gggg",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("No catalog items available at the moment!",noItem);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("123456",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog items available at the moment!",noItem);	
			
		}
		//Added by Dhanushiya
		public void GlobalSearchwithSpecialcharacters() {
			wait(5);
			enterData("classroom*&",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Classroom",verificationText);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("***images",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog items available at the moment!",noItem);	
			
		}
		//Added by Dhanushiya
		public void GlobalSearchwithUnavailableKeyword() {
			wait(5);
			enterData("machinelearning",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("No catalog items available at the moment!",noItem);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData("cloud",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("No catalog items available at the moment!",noItem);	
			
		}
		//Added by Dhanushiya
		public void GlobalSearchwithDoubleandTabspace() {
			wait(5);
			enterData("automation  learningpath",Search);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			wait(5);
			verifyText("Automation Learningpath",automationLearningpath);
			wait(5);
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).clear();
			enterData(" automation    learningpath",Search);;
			driver.findElement(By.xpath(".//input[contains(@class,'cat_search')]")).sendKeys(Keys.ENTER);
			verifyText("Automation Learningpath",automationLearningpath);	
		}
	}
