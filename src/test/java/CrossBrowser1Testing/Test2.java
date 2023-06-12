package CrossBrowser1Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	public WebDriver driver;
@Test
@Parameters("Browser")
public void actitime(String Browser) {
	if(Browser.equals("Chrome")) {
		driver=new ChromeDriver();
	}
	else {
		if(Browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
	}
	  driver.get("https://www.flipkart.com/");
}
}
