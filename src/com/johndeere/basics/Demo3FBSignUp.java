package com.johndeere.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		driver.findElement(By.linkText("Create New Account")).click(); //checks for presence of element in 0.5s 
		
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//mobile number as 7878887
		driver.findElement(By.name("reg_email__")).sendKeys("78878878");
		
		//enter password - welcome123
		driver.findElement(By.id("password_step_input")).sendKeys("welcome123");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();

		// 20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		
//		driver.findElement(By.id("day")).sendKeys("30");
		
		//select Dec 
		Select selectMon=new Select(driver.findElement(By.id("month")));
		selectMon.selectByVisibleText("Dec");
		
		//select 2000 
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		//click on signup
		driver.findElement(By.name("websubmit")).click();
	
	}
}
