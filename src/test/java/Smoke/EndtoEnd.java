package Smoke;

import org.testng.annotations.Test;

import Base.TestBase;

public class EndtoEnd extends TestBase{
	
	@Test
	public void e2e(){
		getDriver().get("http://www.licindia.in");
		System.out.println("LIC");
	}
	
	@Test
	public void e2e1(){
		getDriver().get("http://www.gmail.com");
		System.out.println("GMail");
	}

}
