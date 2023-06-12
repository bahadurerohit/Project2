package Basic;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AsserIntro {
	@Test
	public void creatAccountTest() {
		System.out.println("Account Created");
		Assert.assertEquals("Pune", "Banglore");
	}
	@Test
	public void modifyAccountTest() {
		System.out.println("Account Is Modified");
	}
	@Test(dependsOnMethods="creatAccountTest")
	public void deletAccountTest() {
		System.out.println("Delete Account");
	}
}
