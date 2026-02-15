package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.TakesScreenshot;

import Utility.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public TestContextSetup ts;
	
	public Hooks(TestContextSetup ts)
	{
		this.ts = ts;
	}
	
	@After
	public void tearDown() throws IOException
	{
		ts.driversetup.returnDriver().quit();
	}
	
	@AfterStep
	public void takeScreenShot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed() == true)
		{
			TakesScreenshot ss = (TakesScreenshot)ts.driversetup.returnDriver();
			byte[] snap = ss.getScreenshotAs(OutputType.BYTES);
			scenario.attach(snap, "image/png", scenario.getName());
		}
	}

}
