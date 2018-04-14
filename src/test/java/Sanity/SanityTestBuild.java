package Sanity;

import org.testng.annotations.Test;

import Base.TestBase;

public class SanityTestBuild extends TestBase{
	
	@Test(groups={"Sanity"})
	public void courseCreation(){
		getDriver().get("http://www.facebook.com");
		System.out.println("Course created");
	}
	
	@Test(groups={"Sanity"})
	public void userCreated(){
		getDriver().get("http://www.twitter.com");
		System.out.println("User created");
	}

}
