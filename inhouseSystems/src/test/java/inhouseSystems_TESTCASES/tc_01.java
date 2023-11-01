package inhouseSystems_TESTCASES;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PO.phpGroupware;

public class tc_01 extends base_class{
	@Test
	public void f() throws InterruptedException {

		phpGroupware pg=new phpGroupware(d);

		pg.username_input();
		Thread.sleep(1000);
		pg.password_input();
		Thread.sleep(1000);
		pg.click_login();		

		System.out.println("logged in");

		Thread.sleep(3000);

		String expected_user= d.findElement(By.xpath("(//b)[1]")).getText();
		String  actual_user="Nandu A K";
		Assert.assertEquals(expected_user, actual_user);

		System.out.println("CONDITION PASSED");

		d.quit();

	}
}
