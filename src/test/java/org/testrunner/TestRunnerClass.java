
package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.stepdefinition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Facebook.feature",
                 glue="org.stepdefinition",monochrome=true,
                 plugin= {"pretty","html:C:\\Users\\HP\\eclipse-workspace\\Cucum\\target",
                		 "junit:C:\\Users\\HP\\eclipse-workspace\\Cucum\\JunitReport\\junitRepo.xml",
                		 "json:C:\\Users\\HP\\eclipse-workspace\\Cucum\\JsonReport\\JesoReport\\fb.json",
                		 "rerun:C:\\Users\\HP\\eclipse-workspace\\Cucum\\RerunText\\jeni.txt"})




public class TestRunnerClass {
	
	@AfterClass
	public static void postReport() {
		
		JvmReport.repo("C:\\Users\\HP\\eclipse-workspace\\Cucum\\JsonReport\\JesoReport\\fb.json");

	}
	
	
	

}
