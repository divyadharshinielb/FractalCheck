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
		Reporter.writeSummary("TCID_DELNOTI_001, Verify clicking the Classroom icon displays the Classroom page, " +  menuSteps.getResult() );
		menuSteps.clickMenu();
		Reporter.writeSummary("TCID_DELNOTI_002, Verify whether Admin should be able to view the CLASS ROOM page , " +  menuSteps.getResult() );
		menuSteps.gotoClassroomCreation();
		Reporter.writeSummary("TCID_DELNOTI_003, Verify clicking the Add Classroom button displays Classroom creation page , " +  menuSteps.getResult() );
		ClassroomSteps cSteps=new ClassroomSteps(driver);
	//	cSteps.addClassroomPage();
		DeleteEventandClassroomSteps delevnt = new DeleteEventandClassroomSteps(driver);
   delevnt.Classroomcreate();
	Reporter.writeSummary("TCID_DELNOTI_004, Verify whether classroom is created or not , " +  delevnt.getResult() );
	delevnt.eventCreation();
	Reporter.writeSummary("TCID_DELNOTI_005, Verify whether event is created or not , " +  delevnt.getResult() );
	delevnt.logoutAdmin();
		wait(10);
		login(driver);
		delevnt.instructorAccept();
		Reporter.writeSummary("TCID_DELNOTI_006, Check whether the instructor accepts the event , " +  delevnt.getResult() );
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.accepteventDelete();
		Reporter.writeSummary("TCID_DELNOTI_007, Event gets deleted after accepted by instructor , " +  delevnt.getResult() );
		login(driver);
	    delevnt.instructorLogin();
	    Reporter.writeSummary("TCID_DELNOTI_008, The notification for event deletion occurs , " +  delevnt.getResult() );
	    //testcase for deleting before accepting the event
		loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.eventCreation();
		delevnt.eventDeletebeforeaccept();
		Reporter.writeSummary("TCID_DELNOTI_009, The event is deleted before accepstance of instructor , " +  delevnt.getResult() );
		login(driver);
	    delevnt.instructorLogin();
	    wait(10);
	    Reporter.writeSummary("TCID_DELNOTI_010, Check for the notification for event deletion occurs before accepted , " +  delevnt.getResult() );
	    //testcase for deleting the classroom and check for notification
	    print("classroomdeletion testcase");
	    loginToContentAdmin(driver);
		menuSteps.clickMenu();
		menuSteps.gotoClassroomCreation();
		delevnt.eventCreation();
		delevnt.classroomDelete();
		Reporter.writeSummary("TCID_DELNOTI_011, The Classroom is deleted after creating one event , " +  delevnt.getResult() );
		login(driver);
	    delevnt.instructorLogin();
	    Reporter.writeSummary("TCID_DELNOTI_012, Check for the notification for classroom deletion , " +  delevnt.getResult() );
}
}
