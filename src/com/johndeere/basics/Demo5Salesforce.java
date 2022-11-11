package com.johndeere.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5Salesforce {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");

		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("J");
		driver.findElement(By.name("UserEmail")).sendKeys("J");
		
		driver.findElement(By.name("CompanyName")).sendKeys("JohnDeere");
		
		Select selectJobTitle1 = new Select(driver.findElement(By.name("CompanyEmployees")));
		selectJobTitle1.selectByValue("250");
		
		driver.findElement(By.name("UserPhone")).sendKeys("1122334455");
		
		Select selectJobTitle2 = new Select(driver.findElement(By.name("CompanyCountry")));
		selectJobTitle2.selectByValue("IN");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

		driver.findElement(By.name("start my free trial")).click();
	}

}
