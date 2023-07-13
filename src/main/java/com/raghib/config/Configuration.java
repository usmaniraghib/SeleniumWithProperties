package com.raghib.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
	File fileObject = null;
	FileInputStream fileInputStreamObject = null;
	
	Properties propertiesObject = new Properties();
	String propertyLocation = "./src/main/resources/application.properties";
	
	public Configuration() throws Exception {
		fileObject = new File(propertyLocation);
		fileInputStreamObject = new FileInputStream(fileObject);		
		propertiesObject.load(fileInputStreamObject);		
	}
	
	public String getBrowserChromeDriver() {
		return propertiesObject.getProperty("Browser.Chrome.Driver");
	}
	
	public String getChromeDriver() {
		return propertiesObject.getProperty("Chrome.Driver");
	}
	
	public String getApplicationURL() {
		return propertiesObject.getProperty("Application.URL");
	}
}
