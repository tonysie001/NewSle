package com.soul.cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.soul.data.ExcelDataProvider;
import com.soul.objects.LoginPage;
import com.soul.util.Util;

public class Register {
	
	
	/*@BeforeTest(alwaysRun=true)
	public void init() throws IOException, InterruptedException
	{   OpenBrowser ob = new OpenBrowser();
		ob.openBrowser();
	}*/
	Util tr = new Util();
	
	@Test(dataProvider = "YB", dataProviderClass = ExcelDataProvider.class)
	public void register(String username, String password) throws Throwable
	{
		LoginPage lp = new LoginPage();
		lp.clickRegisterLink();
        int radom = tr.testRandom(100000);
        String radomstring = String.valueOf(radom);
        String usernameplus = username + radomstring;
        System.out.print("×¢²áÃû³ÆÎª" + usernameplus);
		lp.typeRegisterNameInputBox(usernameplus);
		lp.typeRegisterPasswordInputBox(password);
		lp.clickRegisterButton();
		Assert.assertTrue(lp.isPrestentForgetPassword(), "Register Failed");
	}
	
	/*@AfterTest(alwaysRun=true)
	public void end() throws IOException, InterruptedException
	{   OpenBrowser ob = new OpenBrowser();
		ob.closeBrowser();
		Thread.sleep(2000);
	}*/

}
