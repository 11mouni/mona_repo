package windowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class goibibTwoChild extends common{

	public static void main(String[] args) {
		common.launchBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	common.openurl("https://www.goibibo.com/bus/");
		driver.manage().window().maximize();
		validationtoget.valiadteAsSameOrNo("https://www.goibibo.com/bus/", "https://www.goibibo.com/bus/", "the website is open");
		By holiday = By.xpath("//a[text()='Holidays']");
		WebElement holiD = driver.findElement(holiday);
		holiD.click();
		String parentWindowHandl = driver.getWindowHandle(); //get the single browser window id
		System.out.println("parentWindowHandl" + parentWindowHandl);

		Set<String> windows = driver.getWindowHandles();   //get the multiple browser windows id  	
		System.out.println(windows);

		List<String> windowsidlist = new ArrayList(windows);
		String ParentwinId = windowsidlist.get(0);
		String ChildwindId = windowsidlist.get(1);
		System.out.println("parent window id  " + ParentwinId);
		System.out.println("child window id  " + ChildwindId);
		driver.switchTo().window(ParentwinId);
		System.out.println("parent window id  " + driver.getTitle());
		driver.switchTo().window(ChildwindId);
		System.out.println("child window id  "  + driver.getTitle());
		By destination = By.xpath("//span[text()='Destinations']");
		WebElement destiNation = driver.findElement(destination);
		destiNation.click();
		driver.close();
		
		


	}

}
