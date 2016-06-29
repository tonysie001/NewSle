package com.soul.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	
	String value;

	public String getValuebyName(String key) throws IOException
	{
		String path = "D:\\JAVA\\yb3.13\\src\\main\\resources\\313.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties pps = new Properties();
		pps.load(fis);
		String value = pps.getProperty(key);
		return value;
	}
	
}
