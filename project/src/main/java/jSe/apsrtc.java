package jSe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class apsrtc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("vijayawada");
				
		Thread.sleep(2000);
		By vija = By.xpath("//span[text()='VIJAYAWADA']");
		WebElement  vija_web = driver.findElement(vija);
		act.moveToElement(vija_web).perform();
		vija_web.click();
	
		driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("hyderabad");
		
		By hyd = By.xpath("//span[text()='Hyderabad Hyderabad Rangareddy Telangana 500001 ']");
		WebElement hyd_web = driver.findElement(hyd);
		act.moveToElement(hyd_web).perform();
		hyd_web.click();
		
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[text()='28']")).click();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		

	}

}
