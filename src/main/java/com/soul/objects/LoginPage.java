package com.soul.objects;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;

import com.soul.objects.Locator.ByType;
import com.soul.util.Driver;

public class LoginPage extends BasePage{
	
	Locator loginLink = new Locator("loginLink");
	
	Locator loginNameInputBox = new Locator("loginNameInputBox");
		
	Locator loginPasswordInputBox = new Locator("loginPasswordInputBox");
		
	Locator loginButton = new Locator("loginButton");
	
	Locator homeProfileText = new Locator("homeProfileText");
	
	Locator registerLink = new Locator("registerLink");
	
	Locator registerNameInputBox = new Locator("registerNameInputBox");
	
	Locator registerPasswordInputBox = new Locator("loginPasswordInputBox");
	
	Locator registerButton = new Locator("registerButton");
	
	Locator loginForgetPassword = new Locator ("loginForgetPassword");
	
	public void clickLoginLink() throws BiffException, IOException
	{
		click(loginLink);
	}
	
	public void typeLoginNameInputBox(String name) throws BiffException, IOException
	{
		type(loginNameInputBox, name);
	}
	
	public void typeLoginPasswordInputBox(String password) throws BiffException, IOException
	{
		type(loginPasswordInputBox, password);
	}
	
	public void clickloginButton() throws BiffException, IOException
	{
		click(loginButton);
	}
	
	public boolean isPrestentProfile() throws Throwable{
        return isElementPresent(homeProfileText, 20);
	}
	
	public boolean isPrestentLoginPage() throws Throwable {
        return isElementPresent(loginLink, 20);
	}
	
	public void clickRegisterLink() throws Exception
	{
		click(registerLink);
	}
	
	public void typeRegisterNameInputBox(String name) throws BiffException, IOException
	{
		type(registerNameInputBox, name);
	}
	
	public void typeRegisterPasswordInputBox(String password) throws BiffException, IOException
	{
		type(registerPasswordInputBox, password);
	}
	
	public void clickRegisterButton() throws BiffException, IOException
	{
		click(registerButton);
	}
	
	public boolean isPrestentForgetPassword() throws Throwable {
        return isElementPresent(loginForgetPassword, 20);
	}
	
}

