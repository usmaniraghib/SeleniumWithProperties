package com.raghib.property;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.raghib.config.Configuration;

public class PropertyDemoTest {
	Configuration config;
	WebDriver webDriverObj = null;
	ChromeOptions chromeOptions;
	public static String browserArguments1 = "--disable-notifications";
	public static String browserArguments2 = "--remote-allow-origins=*";
	
	@BeforeTest
	public void setup() throws Exception {
		config = new Configuration();
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments(browserArguments1,browserArguments2);
		webDriverObj = new ChromeDriver(chromeOptions);
		webDriverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		webDriverObj.manage().window().maximize();
		webDriverObj.get(config.getApplicationURL());
	}
	
	@Test
	public void readPropertyTest() throws Exception {		
		System.out.println("Testing");
	}
	
	@AfterTest()
	public void setDown() {
		webDriverObj.quit();
	}
}
