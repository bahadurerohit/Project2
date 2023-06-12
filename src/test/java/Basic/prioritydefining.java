package Basic;

import org.testng.annotations.Test;

public class prioritydefining {
	@Test(priority=1)
	public void creatAccountTest() {
		System.out.println("Account Created");
	}
	@Test(priority=2)
	public void modifyAccountTest() {
		System.out.println("Account Is Modified");
	}
	@Test(priority=3)
	public void deletAccountTest() {
		System.out.println("Delete Account");
	}
}
