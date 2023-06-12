package Basic;

import org.testng.annotations.Test;

public class CountInvocation {
@Test
public void creatAccountTest() {
	System.out.println("Account Created");
}
@Test
public void modifyAccountTest() {
	System.out.println("Account Is Modified");
}
@Test
public void deletAccountTest() {
	System.out.println("Delete Account");
}
}
