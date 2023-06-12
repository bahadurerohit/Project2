package Parralel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void actitime() {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.linkText("forgot your password")).click();
}
	@Test
	public void google() throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.google.com/doodles");
		    Thread.sleep(2000);
		    driver.findElement(By.linkText("Father's Day 2022 (December 05)")).click();
		}
	}

