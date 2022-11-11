package com.johndeere.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4GotoMeeting {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.goto.com/meeting/");

		driver.findElement(By.id("truste-consent-button")).click();

//			2.	Click on Try Free
		driver.findElement(By.partialLinkText("Try Free")).click();

//			3.	Enter first name as “John”
		driver.findElement(By.id("first-name")).sendKeys("john");
//			4.	Enter last name as “wick”
		driver.findElement(By.id("last-name")).sendKeys("wick");
//			5.	Enter work email as “john@gmail.com”
		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");

//			6.	Company size – 10-99
		Select selectCompanySize = new Select(driver.findElement(By.id("CompanySize")));
		selectCompanySize.selectByVisibleText("10 - 99");

//			7.	Click on signup
		driver.findElement(By.xpath("//button[contains(text(),'Trial')]")).click();
		
		String actualError= driver.findElement(By.xpath("//div[@class='inputField__requirements']")).getText();
		System.out.println(actualError);

	}

}
