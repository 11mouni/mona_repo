package jSe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		By calDate = By.xpath("//input[@id='first_date_picker']");
		WebElement cal_date = driver.findElement(calDate);
		cal_date.click();
		
	//	String date = "20";			
	//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='20']")).click();
		String date = "25";
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+date+"]")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()='15']")).click();
		
		
		
		
		

	}

}
