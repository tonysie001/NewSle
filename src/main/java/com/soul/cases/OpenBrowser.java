package com.soul.cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.soul.objects.LoginPage;
import com.soul.util.Driver;
import com.soul.util.Property;

public class OpenBrowser {
	Driver dr = new Driver();
	Property pp = new Property();
	
	@Test(groups = {"init"})
	public void openBrowser() throws Throwable
	{
		
		WebDriver d = dr.getDriver();
		String path = pp.getValuebyName("BASE_URL");
		d.get(path);
		Thread.sleep(500);
		LoginPage lp = new LoginPage();
        Assert.assertTrue(lp.isPrestentLoginPage(), "Open Failed");
	}
	
	@Test(groups = "end")
	public void closeBrowser() throws IOException, InterruptedException
	{
		WebDriver d = dr.getDriver();
		d.close();
	}


}