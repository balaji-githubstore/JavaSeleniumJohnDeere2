package com.johndeere.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		By locator= By.id("email");
//		WebElement element= driver.findElement(locator);
//		element.sendKeys("hel@fkk.com");
		
		WebElement element= driver.findElement(By.cssSelector("#email"));
		element.sendKeys("hel@fkk.com");
		
		//driver.findElement(By.id("email")).sendKeys("bala123456@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Welcome234");
		
		//click on login
		driver.findElement(By.name("login")).click();
		
		
	}
}
