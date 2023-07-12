package w3sch;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase extends common {

	@BeforeMethod
	public void beforeMethod()
	{
		common.openurl();
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		driver.close();
	}

	


   //1
	@Test
	public static void openbrowser() throws InterruptedException
	{
		login1.Logo();
		validationtoget.logoDisplay(true);
		login1.loginButton();
		validationtoget.clickp(true);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
	}
	//2
	@Test
	public static void validate_login_with_the_credentials() throws InterruptedException
	{
		
		openbrowser();
		login1.enterUserName("deardad100@gmail.com");
		validationtoget.valiadteAsSameOrNo("deardad100@gmail.com", "deardad100@gmail.com", "Given user name is correct");
		login1.enterPassword("Vijay@100");
		validationtoget.valiadteAsSameOrNo("Vijay@100", "Vijay@100", "the given password is correct");
		login1.enterLogin();
		validationtoget.clickp(true);
	}
	//3
	@Test
	public static void login_with_valid_username_and_invalid_password() throws InterruptedException
	{
		
		openbrowser();
		login1.enterUserName("deardad100@gmail.com");
		validationtoget.valiadteAsSameOrNo("deardad100@gmail.com", "deardad100@gmail.com", "Given user name is correct");
		login1.enterPassword("Vijay100");
		validationtoget.valiadteAsSameOrNo("Vijay@100", "Vijay100", "the given password is not correct");
		login1.enterLogin();
		validationtoget.clickp(true);
	}

	//4
	@Test
	public static void login_with_Invaliduser_name_and_valid_password() throws InterruptedException
	{
		
		openbrowser();
		login1.enterUserName("deardad1@gmail.com");
		validationtoget.valiadteAsSameOrNo("deardad100@gmail.com", "deardad1@gmail.com", "Given user name is not correct");
		login1.enterPassword("Vijay@100");
		validationtoget.valiadteAsSameOrNo("Vijay@100", "Vijay@100", "the given password is correct");
		login1.enterLogin();
		validationtoget.clickp(true);
	}

	//5
	@Test
	public static void login_with_Invalid_username_and_Invalid_password() throws InterruptedException
	{
		
		openbrowser();
		login1.enterUserName("deardad1@gmail.com");
		validationtoget.valiadteAsSameOrNo("deardad100@gmail.com", "deardad1@gmail.com", "Given user name is not correct");
		login1.enterPassword("Vijay@0");
		validationtoget.valiadteAsSameOrNo("Vijay@100", "Vijay100", "the given password is not correct");
		login1.enterLogin();
		validationtoget.clickp(true);
	}

	//6
	@Test
	public static void login_with_only_user_name_without_password() throws InterruptedException
	{
		
		openbrowser();
		login1.enterUserName("deardad100@gmail.com");
		validationtoget.valiadteAsSameOrNo("deardad100@gmail.com", "deardad100@gmail.com", "Given user name is correct");
		login1.enterLogin();
		validationtoget.clickp(true);
	}

	//7
	@Test
	public static void login_with_no_user_name_password() throws InterruptedException
	{
		
		openbrowser();
		login1.enterLogin();
		validationtoget.clickp(true);
	}

	//8
	@Test
	public static void login_with_only_password() throws InterruptedException
	{
		
		openbrowser();
		login1.enterPassword("Vijay@100");
		validationtoget.valiadteAsSameOrNo("Vijay@100", "Vijay@100", "the given password is correct");
		login1.enterLogin();

	}
	
	@Test
	public static void scrolling() throws InterruptedException
	{
		openbrowser();
		login1.enterUserName("deardad100@gmail.com");
		validationtoget.valiadteAsSameOrNo("deardad100@gmail.com", "deardad100@gmail.com", "Given user name is correct");
		login1.enterPassword("Vijay@100");
		validationtoget.valiadteAsSameOrNo("Vijay@100", "Vijay@100", "the given password is correct");
		login1.enterLogin();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
	}




}
