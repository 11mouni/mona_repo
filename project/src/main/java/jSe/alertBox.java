package jSe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertBox {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        driver.get("https://www.nopcommerce.com/en/demo");
	        driver.manage().window().maximize();
	        
	        // Execute JavaScript code to display an alert box with message 'Hello World'
	        js.executeScript("alert('Hi mouni');");
		
	}

}
