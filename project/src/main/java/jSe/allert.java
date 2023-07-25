package jSe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		//ALERTS
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		By alert_clickBtn_xpath=By.xpath("(//button[text()='Click me'])[1]");
		WebElement alert_clickBtn=driver.findElement(alert_clickBtn_xpath);
		alert_clickBtn.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); 
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		System.out.println("...............");

		//CONFIRM BOX-CLICK 0K BUTTON
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		System.out.println("...............");

		//CONFIRM BOX-CLICK CANCEL BUTTON
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		System.out.println("...............");
		//PROMPT BOX
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("hyr tutorials");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		System.out.println("...............");

		//PROMPT BOX
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("hyr tutorials");
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		System.out.println("...............");

	}

}
