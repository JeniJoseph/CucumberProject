package org.stepdefinition;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void repo(String jsonPathRepo) {
		
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\Cucum\\JsonReport");
		
		Configuration c = new Configuration(f, "Facebook");
		
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Browser Version", "89.0");
		c.addClassifications("OS Name", "Windows");
		
		List<String> l = new LinkedList<String>();
		l.add(jsonPathRepo);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		

	}
	
}
