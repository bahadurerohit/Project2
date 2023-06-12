package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void actitime() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@Test
	public void bookMyShow() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
	}
}
