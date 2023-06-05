package testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class Tc3 {
	@Test
	public void tc3()
	{
		Reporter.log("Hello Data",true);
		Reporter.log("ATE1 Update");
		
	}

}
