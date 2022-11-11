package com.johndeere.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		
		//click on Login
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		//Enter your User ID as test123 
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("User_Id")).sendKeys("kin123");
		
		driver.quit();
		
	}

}
