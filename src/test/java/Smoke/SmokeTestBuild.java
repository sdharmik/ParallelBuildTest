package Smoke;

import org.testng.annotations.Test;

import Base.TestBase;



public class SmokeTestBuild extends TestBase{

	
	@Test(groups={"Smoke"})
	public void validateNavigations(){
		getDriver().get("http://www.yahoo.com");
		System.out.println("Yahoo");
	}
	
	
	@Test(groups={"Smoke"})
	public void validateLinks(){
		getDriver().get("http://www.msn.com");
		System.out.println("MSN");
	}
	
	
}
