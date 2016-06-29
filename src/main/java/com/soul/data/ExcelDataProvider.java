package com.soul.data;

import java.io.IOException;
import java.lang.reflect.Method;

import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;

import com.soul.util.ReadExcel;

public class ExcelDataProvider {
	@DataProvider(name = "YB")
	public static Object[][] testYB(Method m) throws BiffException, IOException
	{
		Object[][] o = null ;//?
		if(m.getName().equals("register"))
		{
			o = new ReadExcel().readExcel("TestData","register");
		}
		else if(m.getName().equals("login"))
		{
			o = new ReadExcel().readExcel("TestData","login");
		}
		return o;
	}
	
	

}
