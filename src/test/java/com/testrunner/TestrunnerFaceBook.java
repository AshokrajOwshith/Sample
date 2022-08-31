package com.testrunner;

import com.report.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FaceBookFeatures",
glue ="com.facebookstepdifinition",dryRun = false,
plugin = {"pretty","junit:src\\test\\resources\\Reports\\sample.xml","html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\output.json"},monochrome = true)

public class TestrunnerFaceBook {
	@AfterClass
	public static void afterClass()
	{
		JVMReport.generateJVMReport(System.getProperty("user.dir")+
				"\\src\\test\\resources\\Reports\\output.json");
		
	}

}
