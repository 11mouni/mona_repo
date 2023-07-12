package w3sch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class login1 extends common {

    //x.path
	static By logo = By.xpath("//i[@class='fa fa-logo ws-hover-text-green']");
	static By loginbutton = By.xpath("//a[@class='w3-bar-item w3-btn bar-item-hover w3-right ws-light-green ga-top ga-top-login']");
	static By username = By.xpath("//input[@id='modalusername']");
	static By password = By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']");
	static By login = By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']");
	
	
	//WebElements
	public static WebElement logo()
	{
		return driver.findElement(logo);
	}
	
	public static WebElement loginB()
	{
		return driver.findElement(loginbutton);
	}
	public static WebElement Username()
	{
		return driver.findElement(username);	
	}

	public static WebElement Password() 
	{
		return driver.findElement(password);	
	}

	public static WebElement Login()
	{
		return driver.findElement(login);
	}

    //action
	
	public static void Logo() throws InterruptedException
	{
		Thread.sleep(3000);
		logo().isDisplayed();
	}
	
	public static void loginButton() throws InterruptedException
	{
		Thread.sleep(3000);
		loginB().click();
	}
	
	public static void enterUserName(String s) throws InterruptedException
	{
		Thread.sleep(3000);
		Username().sendKeys(s);
	
//		WebElement user = username();
//		user.click();
//		user.sendKeys(s);
	}

	public static void enterPassword(String s) throws InterruptedException
	{
		Thread.sleep(3000);	
		 Password().sendKeys(s);
	}

	public static void enterLogin() throws InterruptedException
	{
		Thread.sleep(3000);
		Login().click();
//		WebElement user = Login();
//		user.click();
	}

	public String getUserName()
	{
		WebElement user = Username();
		return user.getText();
	}

	public String getPassword()
	{
		WebElement user = Password();
		return user.getText();

	}

}
