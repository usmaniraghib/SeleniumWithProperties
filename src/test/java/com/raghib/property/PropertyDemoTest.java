package com.raghib.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.raghib.config.Configuration;

public class PropertyDemoTest {
	Configuration config;
	WebDriver webDriverObj = null;
	
	@BeforeTest
	public void setup() throws Exception {
		config = new Configuration();
		System.setProperty(config.getChromeDriver(),config.getBrowserChromeDriver());
		webDriverObj = new ChromeDriver();
		webDriverObj.get(config.getApplicationURL());
		webDriverObj.manage().window().maximize();
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
