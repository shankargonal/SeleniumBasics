package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		driver.manage().window().maximize();
		
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(1000);
	
	//driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
	//driver.findElement(By.partialLinkText("inputtext")).sendKeys("Test@gmail.com");
	//driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
	//driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
	//driver.findElement(By.cssSelector("#email_container>input")).sendKeys("Test@gmail.com");
	
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@gmail.com");
	
	//driver.findElement(By.linkText("Forgot password?")).click();
	
	driver.findElement(By.partialLinkText("Forgot ")).click();
	
	
	
	
	}

}
