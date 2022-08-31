package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {
	public static void generateJVMReport(String jsonFile) {

		File reportLoc = new File(System.getProperty("user.dir")+
				"\\src\\test\\resources\\Reports");
		Configuration configuration =
				new Configuration(reportLoc, "FaceBookWebApplication");
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Platform Version", "10");
		configuration.addClassifications("SprintNo", "01");
		configuration.addClassifications("Build No", "ABc12545");
		List<String> l = new ArrayList<String>();
		l.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(l, configuration);
		builder.generateReports();
				
	}
	
	
}
