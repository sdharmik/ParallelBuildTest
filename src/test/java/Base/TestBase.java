package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();
	
	
	
	@BeforeMethod
	public void startBrowser(){
		
		WebDriver driver=new FirefoxDriver();
		tl.set(driver);
		
	}
	
	public WebDriver getDriver(){
		return tl.get();
	}
	
	@AfterMethod
	public void closeBrowser(){
		getDriver().close();
	}

}
