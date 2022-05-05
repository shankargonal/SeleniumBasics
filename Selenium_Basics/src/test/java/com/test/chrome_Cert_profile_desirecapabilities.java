package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome_Cert_profile_desirecapabilities {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// Need to create a desired capabilities after launching browsers

		// DesiredCapabilities caps = new DesiredCapabilities();

		// caps.setAcceptInsecureCerts(true); // This will accept the insucured sites to
		// bypass and proceed with next process.

		// "--incognito"

		// caps.setBrowserName("--incognito");

		ChromeOptions options = new ChromeOptions();

		// options.setAcceptInsecureCerts(true);

		options.addArguments("start-maximized");

		options.addArguments("incognito");
		options.addArguments("ignore-certificate-errors");

		/*
		 * var options = new ChromeOptions(); options.AddArgument("--start-maximized");
		 * options.AddArgument("--ignore-certificate-errors");
		 * options.AddArgument("--disable-popup-blocking");
		 * options.AddArgument("--incognito"); options.addArguments("test-type");
		 * options.addArguments("start-maximized");
		 * options.addArguments("--window-size=1920,1080");
		 * options.addArguments("--enable-precise-memory-info");
		 * options.addArguments("--disable-popup-blocking");
		 * options.addArguments("--disable-default-apps"); ChromeOptions options = new
		 * ChromeOptions(); options.addArguments("test-type");
		 * options.addArguments("start-maximized");
		 * options.addArguments("--window-size=1920,1080");
		 * options.addArguments("--enable-precise-memory-info");
		 * options.addArguments("--disable-popup-blocking");
		 * options.addArguments("--disable-default-apps");
		 * options.addArguments("test-type=browser");
		 * 
		 */

		// options.merge(caps);

		WebDriver driver = new ChromeDriver(options); // Using this still it will work but it is deprecated, we can use
														// ChromeOptions Class

		// driver.get("https://google.com/");

		driver.get("https://cacert.com/");

		// driver.manage().window().maximize();

		// pluggins will not be there in ther browser for default one

	}

}
