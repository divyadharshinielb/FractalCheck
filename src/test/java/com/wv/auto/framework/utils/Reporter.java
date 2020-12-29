package com.wv.auto.framework.utils;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class Reporter {
	private static CSVWriter repWriter;
	private static CSVWriter repWriterDetail;
	private static CSVWriter repWriterFailure;
	private static String strBrowserAppOS = "Chrome";
	private static String strEnv = "OriginFractal - WebSite";
	public static int jenkinsMail=0;// added on 22/Dec/20
	public static void createReports() throws IOException {
		createReport();
		createDetailReport();
		createFailureReport();
	}

	public static void createReport() throws IOException {

		// This will create the report file call this before start of testing
		String reportFile = "target/TestReport.csv";
		//		File file=new File(reportFile);
		//		if(file.exists()) {
		if (repWriter == null) {
			repWriter = CSVManager.getCSVWriter(reportFile);
			writeHeader();
		}else {
			repWriter = new CSVWriter(new FileWriter(reportFile));
			repWriter = CSVManager.getCSVWriter(reportFile);
			writeHeader();
			//			}
		}
	}

	public static void createDetailReport() throws IOException {

		// This will create the report file call this before start of testing
		String reportFile = "target/TestDetailReport.csv";
		//		File file=new File(reportFile);
		//		if(file.exists()) {
		if (repWriterDetail == null) {
			repWriterDetail = CSVManager.getCSVWriter(reportFile);
			writeDetailHeader();
		}else {
			repWriter = new CSVWriter(new FileWriter(reportFile));
			repWriter = CSVManager.getCSVWriter(reportFile);
			writeHeader();
			//			}
		}
	}

	public static void createFailureReport() throws IOException {

		// This will create the report file call this before start of testing
		String reportFile = "target/TestFailureReport.csv";
		//		File file=new File(reportFile);
		//		if(file.exists()) {
		if (repWriterFailure == null) {
			repWriterFailure = CSVManager.getCSVWriter(reportFile);
			writeFailureHeader();
			//			}
		}else {
			repWriter = new CSVWriter(new FileWriter(reportFile));
			repWriter = CSVManager.getCSVWriter(reportFile);
			writeHeader();
		}
	}

	private static void writeHeader() {
		// Create record
		String[] record = "BROWSER, ENVIRONMENTAL, TCID/AREA, TEST DESCRIPTION, LOADING TIME (Sec), TEST RESULT ,TIME STAMP".split(",");
		TimeManager.setTimeAtEvent();
		// Write the record to file
		if (repWriter != null)
			repWriter.writeNext(record);
	}

	private static void writeDetailHeader() {
		// Create record
		String[] record = "TCID/AREA, TEST DESCRIPTION, LOAEDING TIME (Sec), TEST RESULT".split(",");
		// Write the record to file
		if (repWriterDetail != null)
			repWriterDetail.writeNext(record);
	}

	private static void writeFailureHeader() {
		// Create record
		String[] record = "BROWSER, ENVIRONMENTAL, TCID/AREA, TEST DESCRIPTION, LOADING TIME (Sec), TEST RESULT, TIME STAMP".split(",");

		// Write the record to file
		if (repWriterFailure != null)
			repWriterFailure.writeNext(record);
	}

	public static void writeSummary(String strLine) {

		String strReportWithBrowserEnvDetails = strBrowserAppOS + "," + strEnv + "," + strLine+","+TimeManager.getCurrentDateTime();
		TimeManager.setTimeAtEvent();
		// This is report test result
		String[] record = strReportWithBrowserEnvDetails.split(",");
		repWriter.writeNext(record);	
		if (strReportWithBrowserEnvDetails.contains("FAILED")) {
			writeFailure(strReportWithBrowserEnvDetails);
			jenkinsMail++;
		}
	}

	public static void writeSummary(String strLine,String TimeTaken,String TimeStamp) {
		String strReportWithBrowserEnvDetails = strBrowserAppOS + "," + strEnv + ","+ strLine+","+TimeTaken+","+TimeStamp;

		// This is report test result
		String[] record = strReportWithBrowserEnvDetails.split(",");
		repWriter.writeNext(record);		
		if (strLine.endsWith("FAILED"))
			writeFailure(strLine);

	}

	public static void writeDetail(String strLine) {
		// This is report test result
		String[] record = strLine.split(",");
		repWriterDetail.writeNext(record);
	}

	public static void writeFailure(String strLine) {
		// This is report test result
		String[] record = strLine.split(",");
		repWriterFailure.writeNext(record);
	}

	public static void closeReport() {
		if (repWriter != null)
			try {
				repWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static void closeReports() {
		closeReport(repWriter);
		closeReport(repWriterDetail);
		closeReport(repWriterFailure);
	}

	public static void closeReport(CSVWriter cSVW) {
		if (cSVW != null)
			try {
				cSVW.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void setBrowserAppOS(String strBrwAppOS) {
		strBrowserAppOS = strBrwAppOS;
	}


}
