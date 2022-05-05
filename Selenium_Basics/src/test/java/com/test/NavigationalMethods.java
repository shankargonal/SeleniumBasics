package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("mvnrepository");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("Maven Repository:")).click();

		driver.navigate().to("https://qbank.accelq.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("qb-username")).sendKeys("john.todd");
		driver.findElement(By.id("qb-password")).sendKeys("pass123");
		Thread.sleep(1000);
		driver.findElement(By.className("qb-signin-button")).click();
		
		System.out.println(driver.getTitle());
		
					
		driver.navigate().back();
		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("mvnrepository");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
