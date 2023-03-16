package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\HP\\eclipse-workspace\\Cucum\\RerunText\\jeni.txt",
                 glue="org.stepdefinition", monochrome = true,
                 plugin= {"json:C:\\Users\\HP\\eclipse-workspace\\Cucum\\JsonReport\\JesoReport\\fb.json"}
                 )
        
public class TestRerunnerClass {
	
	@AfterClass
	public static void repoo() {
		
		JvmReport.repo("C:\\Users\\HP\\eclipse-workspace\\Cucum\\JsonReport\\JesoReport\\fb.json");

	}

}
