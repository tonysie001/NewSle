package com.soul.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	static WebDriver driver;	
	static
	{
		driver = new FirefoxDriver();
	}
	public WebDriver getDriver() {
		return driver;
	}

}
