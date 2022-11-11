package com.johndeere.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//using webelement
public class Demo1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//come to main html 
		driver.switchTo().defaultContent();
		
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='modalframe']")));
//		//click on create new patient
//		driver.switchTo().defaultContent();
//		
		
	}

}
