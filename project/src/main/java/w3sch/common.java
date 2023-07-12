package w3sch;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common {
	public static WebDriver driver;
//	public static WebDriver launchBrowser()
//	{
//		return driver = new ChromeDriver();
//	}
    
	public static void openurl()
	{	
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	
}
