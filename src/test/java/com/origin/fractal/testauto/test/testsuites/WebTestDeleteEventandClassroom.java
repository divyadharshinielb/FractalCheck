package com.origin.fractal.testauto.test.testsuites;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.ClassroomSteps;
import com.origin.fractal.testauto.steps.DeleteEventandClassroomSteps;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.MyScreenRecorder;
import com.wv.auto.framework.utils.Reporter;

public class WebTestDeleteEventandClassroom extends FractalBaseWebTest {
	@DataProvider
	public  Object[][] browers() {
		return new Object[][] {
		 new Object[] { "1", "chrome" }
//     ,  new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		  new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
	public void ClassroomCreation(String row, String strBrowserName) throws Exception {
		driver = BrowserFactory.getBrowser(strBrowserName);
	//	MyScreenRecorder.startRecording("navigationTest");
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		Reporter.writeSummary("TCID_CLASS_001, Verify clicking the Classroom icon displays the Classroom page, " +  menuSteps.getResult() );
		menuSteps.clickMenu();
//		Reporter.writeSummary("TCID_CLASS_002, Verify whether Admin should be able to view the CLASS ROOM page , " +  menuSteps.getResult() );
		menuSteps.gotoClassroomCreation();
		Reporter.writeSummary("TCID_CLASS_003, Verify clicking the Add Classroom button displays Classroom creation page , " +  menuSteps.getResult() );
		ClassroomSteps cSteps=new ClassroomSteps(driver);
		cSteps.addClassroomPage();
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
		delevnt.Classroomcreate();
	//	delevnt.eventCreation();
		wait(10);
	//	login(driver);
	//delevnt.instructorLogin();
}
}
