package com.johndeere.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());	
		
		for(String win  : windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			
			if(driver.getTitle().equals("Citibank India"))
			{
				break;
			}
			System.out.println("----------------------------");
		}
		
		
		driver.findElement(By.id("User_Id")).sendKeys("kin123");
	}

}
