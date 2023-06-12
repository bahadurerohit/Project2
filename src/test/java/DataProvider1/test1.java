package DataProvider1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test1 {
@Test(dataProvider="travelling")
public void bookticket(String source,String destination) {
	System.out.println("Source="+source+",drop point="+destination);
}
@DataProvider
public Object[][] travelling(){
	Object[][] data=new Object[3][2];
	data[0][0]="pune";
	data[0][1]="Banglore";
	data[1][0]="pune";
	data[1][1]="Japan";
	data[2][0]="pune";
	data[2][1]="Goa";
	return data;
}
}
