package inhouseSystems_TESTCASES;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_01 extends base_class{
	@Test
	public void f() throws InterruptedException {



		d.findElement(By.xpath("//input[@name='login']")).sendKeys("nandu.ak");
		d.findElement(By.xpath("//input[@name='passwd']")).sendKeys("test@123");

		d.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println("login");
		
		Thread.sleep(3000);

		String expected_user= d.findElement(By.xpath("(//b)[1]")).getText();
		String  actual_user="Nandu A K";
		Assert.assertEquals(expected_user, actual_user);

		System.out.println("CONDITION PASSED");

		d.quit();

	}
}
