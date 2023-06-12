package Assert1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
@Test
public void actitime() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement box=driver.findElement(By.id("keepLoggedInCheckBox"));
	Assert.assertTrue(box.isDisplayed());
	String ele=driver.getTitle();
	System.out.println(ele);
}
}
