package jSe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class practics_javaScript {

	
	@Test
	public void mouseactions() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		By xpath_why_orange = By.xpath("//a[text()='Why OrangeHRM']");
		By xpath_outcustomes =By.xpath("//li[normalize-space(text()) = 'Our Customers']");
		By xpath_testmonial =By.xpath("(//a[text()='Testimonials'])[1]");
		
		WebElement why_org_web =driver.findElement(xpath_why_orange);
		WebElement our_cus_web =driver.findElement(xpath_outcustomes);
		WebElement test_web = driver.findElement(xpath_testmonial);
		
		Actions act = new Actions(driver);
		act.moveToElement(why_org_web)
		.moveToElement(our_cus_web)
		.moveToElement(test_web)
		.click()
		.perform();
		
	}

}
