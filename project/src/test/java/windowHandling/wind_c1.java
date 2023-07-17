package windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class wind_c1 extends commonClass{
	
	public static void openWebsite()
	{
		commonClass.launchBrowser();
		commonClass.openurl("https://www.goibibo.com/bus/");
	}
	@Test
	public static void goibibo() throws InterruptedException 
	{
		commonClass.launchBrowser();
		commonClass.openurl("https://www.goibibo.com/bus/");
		By holiday = By.xpath("//a[text()='Holidays']");
		Thread.sleep(3000);
		WebElement holiD = driver.findElement(holiday);
		holiD.click();
		Set<String> windows1 = driver.getWindowHandles();
		List<String>win = new ArrayList<String>(windows1);
		driver.switchTo().window(win.get(1));
		By destination = By.xpath("//span[text()='Destinations']");
		Thread.sleep(3000);
		WebElement destiNation = driver.findElement(destination);
		Thread.sleep(3000);
		destiNation.click();
		driver.switchTo().window(win.get(0));
		By forex = By.xpath("//a[text()='Forex']");
		Thread.sleep(3000);
		WebElement forEx = driver.findElement(forex);
		Thread.sleep(3000);
		forEx.click();
		Set<String> windo = driver.getWindowHandles();
		System.out.println(windo);
		List<String>win1 = new ArrayList<String>(windo);
		Thread.sleep(3000);
		driver.switchTo().window(win1.get(0));
		By exchange = By.xpath("//a[text()=' Care']");
		String title =driver.getTitle();
		WebElement exChange2  =driver.findElement(exchange);
		Thread.sleep(3000);
		exChange2.click();
	}
 
}
