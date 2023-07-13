package jSe;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		By clickOnCal = By.xpath("//input[@id='datepicker']");
		WebElement clickOnCalRef = driver.findElement(clickOnCal);
		clickOnCalRef.click();

		String month = "August 2024";
		String day = "1";


		while (true)
		{
			By getText = By.className("ui-datepicker-title");
			WebElement getTextRef = driver.findElement(getText);
			String text = getTextRef.getText();
			System.out.println(text);

			if (month.equals(text)) 
			{
				break;
			}
			else 
			{
				By clickOnNext = By.xpath("//span[text()='Next']");
				WebElement clickOnNextRef = driver.findElement(clickOnNext);
				clickOnNextRef.click();
			}
		}
     
		List<WebElement> date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a\""));

		for (WebElement i:date) 
		{
			if (i.getText().equals(day))
			{
				i.click();
				break;
			}
		}

		

	}

}
