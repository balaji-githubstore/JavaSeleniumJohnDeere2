package com.johndeere.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//using string
public class Demo3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//name or id as a String
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//come to main html //come out of frame
		driver.switchTo().defaultContent();
		
		
	}

}
