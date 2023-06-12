package Assert1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
@Test
public void actitime() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	String actualtitle=driver.getTitle();
	String expectedtitle="actiTIME-Login";
	Assert.assertEquals("actualtitle","actualtitle");
	System.out.println(actualtitle);
}
}
