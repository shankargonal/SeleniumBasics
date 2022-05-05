package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSample {

	public static void main(String[] args) throws Exception {
		
		/*
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		*/
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("mvnrepository");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		
	}
		
}
