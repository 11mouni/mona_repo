package jSe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions a= new Actions(driver);
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		By drag = By.xpath("//div[@id='draggable']");
		WebElement click_drag = driver.findElement(drag);
		
		By drop = By.xpath("//div[@id='droppable']//p[text()='Drop here']");
		WebElement click_drop = driver.findElement(drop);
		
		a.dragAndDrop(click_drag, click_drop).perform();

	}

}
