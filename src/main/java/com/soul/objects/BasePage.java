package com.soul.objects;

import java.io.IOException;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.soul.util.Driver;
import com.soul.util.ReadExcel;
public class BasePage {

    Driver d = new Driver();
	WebDriver driver = d.getDriver();
	//Get locator defined by excel data.
	public Locator getLocator(String locatorName) throws BiffException, IOException
	{
		ReadExcel re = new ReadExcel();
		String[][]  arr= re.readExcelString("LocatorPath","Sheet1") ;		
		for(int i = 0; i < arr.length; i++)
		{
			if ((arr[i][0]).endsWith(locatorName))
			{
				if(arr[i][2] =="" && arr[i][3] =="")
				{
					Locator locator = new Locator(arr[i][1]);//switch Locator(Name), to Locator(element)
					return locator;
				}
				else if(arr[i][2] != "" && arr[i][3] == "")
				{
					int waitSec = Integer.parseInt(arr[i][2]);
					Locator locator = new Locator(arr[i][1], waitSec);//switch Locator(Name), to Locator(element)
					return locator;
				}
				else if(arr[i][2] == "" && arr[i][3] != "")
				{
					Locator.ByType bt = Locator.ByType.valueOf(arr[i][3]);
					Locator locator = new Locator(arr[i][1], bt);//switch Locator(Name), to Locator(element)
					return locator;
				}
				else if(arr[i][2] != "" && arr[i][3] != "")
				{
					int waitSec = Integer.parseInt(arr[i][2]);
					Locator.ByType bt = Locator.ByType.valueOf(arr[i][3]);//switch String to enum
					Locator locator = new Locator(arr[i][1], waitSec,bt);//switch Locator(Name), to Locator(element)
					return locator;
				}
				else
				{
					System.out.println("Wrong Locator data format!!");
			    }
			}
		}
		return null;
	}
	
	 public WebElement getElement(Locator locator) throws IOException, BiffException 
	 {
	        return getElement(driver, locator);
	 }
	 

	public WebElement getElement(WebDriver driver,Locator loc) throws BiffException, IOException
	{   
		WebElement we = null;
		loc = getLocator(loc.getElement());
		
		switch(loc.getByType()){
		case xpath:
		{
			we = driver.findElement(By.xpath(loc.getElement()));
			break;
		}
		case linktext:
		{
			we = driver.findElement(By.linkText(loc.getElement()));
			break;
		}
		case name:
		{
			we = driver.findElement(By.name(loc.getElement()));
			break;
		}
		case classname:
		{
			we = driver.findElement(By.className(loc.getElement()));
			break;
		}
		case cssSelector:
		{
			we = driver.findElement(By.cssSelector(loc.getElement()));
			break;
		}
		case id:
		{
			we = driver.findElement(By.id(loc.getElement()));
			break;
		}
		case partialLinkText:
		{
			we = driver.findElement(By.partialLinkText(loc.getElement()));
			break;
		}
		case tagName:
		{
			we = driver.findElement(By.tagName(loc.getElement()));
			break;
		}
		default:
			we = driver.findElement(By.id(loc.getElement()));
		}
		return we;
		
	}
	
	public void type(Locator loc, String key) throws BiffException, IOException
	{
		WebElement we = this.findElement(driver, loc);
		we.clear();
		we.sendKeys(key);
	}
	
	public void click(Locator loc) throws BiffException, IOException
	{
		WebElement we = this.findElement(driver, loc);
		we.click();
	}
	
	 public boolean isElementPresent(WebDriver driver, final Locator myLocator,
	            int timeOut) throws IOException, BiffException
	{
	       // final Locator locator = getLocator(myLocator.getElement());
	        boolean isPresent = false;
	        WebDriverWait wait = new WebDriverWait(driver, timeOut);
	        isPresent = wait.until(new ExpectedCondition<WebElement>() {
	            public WebElement apply(WebDriver d) {
	                try {
						return getElement(d, myLocator);
					} catch (BiffException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
	            }
	        }).isDisplayed();
	        return isPresent;
	 }
	 
/*		public boolean isElementPresent1(WebDriver driver, Locator myLocator,
				int timeOut) throws IOException, Throwable {
			final Locator locator = getLocator(myLocator.getElement());
			boolean isPresent = false;
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			isPresent = wait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver d) {
					try {
						return findElement(d, locator);
					} catch (BiffException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				}
			}).isDisplayed();
			return isPresent;
		}
	 */
	 public boolean isElementPresent(Locator locator, int timeOut)
	            throws Throwable {
	        return isElementPresent(driver,locator, timeOut);
	    }
	 
	 
	 public WebElement findElement(WebDriver driver, final Locator locator) throws BiffException, IOException {
		      Locator locator1 = getLocator(locator.getElement());
	          WebElement element = (new WebDriverWait(driver, locator1.getWaitSec()))
	                .until(new ExpectedCondition<WebElement>() {

	                    public WebElement apply(WebDriver driver) {
	                        try {
	                            return getElement(driver, locator);
	                        } catch (Exception e) {
	                            System.out.println("No Such Element!");
	                            return null;
	                        }
						}
	                });
	        return element;

	    }
}

