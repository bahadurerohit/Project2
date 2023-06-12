package Basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsExecution1 {
@Test(groups="account")
public void createaccountTest() {
	System.out.println("Account is Created");
	Assert.assertEquals("pune", "banglore");
}
@Test(dependsOnMethods="createaccountTest")
public void modifyaccountTest()
{
	System.out.println("Account Is Modify");
}
@Test
public void deleteaccountTest() {
	System.out.println("Account Is Delete");
}
}
