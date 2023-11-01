package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class phpGroupware {

	WebDriver ld;

	public phpGroupware(WebDriver rd)
	{
		ld=rd;
		PageFactory.initElements(rd, this);
	}

	//Page location	

	@FindBy(xpath="//input[@name='login']")
	WebElement usernamefield;

	@FindBy(xpath="//input[@name='passwd']")
	WebElement passwordfield;

	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;



	//Actions


	public void username_input(){
		usernamefield.sendKeys("nandu.ak");	
	}


	public void password_input() {
		passwordfield.sendKeys("test@123");	
	}

	public void click_login() {
		loginbutton.click();
	}











}
