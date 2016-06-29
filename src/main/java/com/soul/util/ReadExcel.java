package com.soul.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import jxl.*;
import jxl.read.biff.BiffException;


public class ReadExcel {
	public  Object[][] readExcel(String key, String sheetName) throws IOException, BiffException
	{
		
		Property pps = new Property();
		String filepath = pps.getValuebyName(key);
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(fis);
		//List<Object[][]> list = new ArrayList<Object[][]>();
		Sheet sheet = wb.getSheet(sheetName);
		Object[][] Contents = new Object[sheet.getRows()][sheet.getColumns()];
		
		
		for(int i =0;i < sheet.getRows();i++)
		{
			Object[] Column  = new Object[sheet.getColumns()];
			for(int j =0; j < sheet.getColumns();j++)
			{
				
				Column[j] = (Object)sheet.getCell(j,i).getContents();//获取第i行第j列数据
			}
			Contents[i] = Column;//二维数组Contents的第一维度是一个一维数组Column
		}
		return Contents;
		
	}
	
	public  String[][] readExcelString(String key, String sheetName) throws IOException, BiffException
	{
		
		Property pps = new Property();
		String filepath = pps.getValuebyName(key);
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(fis);
		//List<Object[][]> list = new ArrayList<Object[][]>();
		Sheet sheet = wb.getSheet(sheetName);
		String[][] Contents = new String[sheet.getRows()][sheet.getColumns()];
		for(int i =0;i < sheet.getRows();i++)
		{   
			String[] Column  = new String[sheet.getColumns()];
			for(int j =0; j < sheet.getColumns();j++)
			{
				Column[j] = (String)sheet.getCell(j,i).getContents();//获取第i行第j列数据
			}
			Contents[i] = Column;//二维数组Contents的第一维度是一个一维数组Column
		}
		return Contents;
	}
	
}
