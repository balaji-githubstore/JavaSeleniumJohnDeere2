package com.johndeere.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();

		//switch to 2nd tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());	
		driver.switchTo().window(windows.get(1));
		
		
		driver.findElement(By.linkText("Travel")).click();
		driver.findElement(By.id("Email_Id")).sendKeys("jack123@gmail.com");
		
		//switch to 1st tab
		driver.switchTo().window(windows.get(0));
		
	}

}
