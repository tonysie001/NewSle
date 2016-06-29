package com.soul.cases;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.soul.data.ExcelDataProvider;
import com.soul.objects.LoginPage;
import com.soul.util.Driver;
import com.soul.util.Property;

public class Login {
	/*
	public void init() throws IOException, InterruptedException
	{   OpenBrowser ob = new OpenBrowser();
		ob.openBrowser();
	}*/
	
//	Driver dr = new Driver();
//	Property pp = new Property();
//	@Test(groups = {"init"})
//	public void openBrowser() throws Throwable
//	{
//		
//		WebDriver d = dr.getDriver();
//		String path = pp.getValuebyName("BASE_URL");
//		d.get(path);
//		Thread.sleep(500);
//		LoginPage lp = new LoginPage();
//        Assert.assertTrue(lp.isPrestentLoginPage(), "Open Failed");
//	}
//	
	@Test(dataProvider = "YB", dataProviderClass = ExcelDataProvider.class, 
			 groups = {"base"}, dependsOnGroups = {"init"})
	public void login(String username, String password)throws Throwable 
	{
		LoginPage lp = new LoginPage();
		lp.clickLoginLink();
		lp.typeLoginNameInputBox(username);
		lp.typeLoginPasswordInputBox(password);
		lp.clickloginButton();
		Assert.assertTrue(lp.isPrestentProfile(), "Login Failed");
	}
	
	/*
	public void end() throws IOException, InterruptedException
	{   OpenBrowser ob = new OpenBrowser();
		ob.closeBrowser();
        Thread.sleep(3000);
	}*/
}
