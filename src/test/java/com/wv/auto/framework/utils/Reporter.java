package com.wv.auto.framework.utils;

import java.io.IOException;

import com.opencsv.CSVWriter;

public class Reporter {
	private static CSVWriter repWriter;
	
	public static void createReport() {
		
		// This will create the report file call this before start of testing
		String reportFile = "target/TestReport.csv";
		if (repWriter == null)		
				repWriter=CSVManager.getCSVWriter(reportFile);
			writeHeader();
	}
	
	private static void writeHeader() {
        //Create record
        String [] record = "TCID, TEST DESCRIPTION, TEST RESULT".split(",");
        //Write the record to file
        if (repWriter!= null)
        repWriter.writeNext(record);
	}
	
	public static void writeSummary(String strLine) {
		// This is report test result
		String [] record = strLine.split(",");
		repWriter.writeNext(record);
	}
	
	public static void reportTestDetail() {
		
	}
	
	public static void closeReport() {
		if (repWriter!= null)
			try {
				repWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
