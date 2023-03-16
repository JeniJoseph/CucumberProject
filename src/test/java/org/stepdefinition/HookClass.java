package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.test.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass{

		
		@Before
		public void preCondition() {
	         
			browserLaunch();
			maxWin();
		}
		
		
		
			@After
			public void postCondition(Scenario s) {
				if (s.isFailed()) {
					TakesScreenshot ts = (TakesScreenshot)driver;
					byte[] sc = ts.getScreenshotAs(OutputType.BYTES);
					s.embed(sc, "image/png");
					System.out.println("Failed:" + s.getName());
				}

			
		//closeWindow();
		}
		

}
