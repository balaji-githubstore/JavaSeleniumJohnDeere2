package com.johndeere.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6js {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phptravels.net/");
		
		//document.querySelector('#checkin').value='25-12-2022'

		//DO NOT UPLOAD PROJECT FILES
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.querySelector('#checkin').value='25-12-2022'");
		
	
	}

}
