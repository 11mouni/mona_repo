 package jSe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShort {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		TakesScreenshot takescreenShot = (TakesScreenshot)driver;
		File sourcefile = takescreenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\FH_m\\screenShort/screenshot.jpg");
		FileUtils.copyFile(sourcefile, destFile);
		System.out.println("Screenshot shaved Successfully");
		String name = "Rob Gravelle";
	    String str  = String.format("My name is %s", name);
	    System.out.println(str); // My name is Rob Gravelle
		
		
	}

}
