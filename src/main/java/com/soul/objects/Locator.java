package com.soul.objects;

//import org.openqa.selenium.By;

//import com.dbyl.libarary.utils.StringTools;

public class Locator {

	private String element;
	private int waitSec;
	public enum ByType{
		xpath, id, linktext, name, classname, cssSelector, partialLinkText, tagName
	}
	private ByType byType;
	
	public Locator()
	{
		
	}
	public Locator(String element)
	{
		this.element = element;
		this.waitSec = 3;
		this.byType = ByType.xpath;
	}
	
	public Locator(String element,int waitSec)
	{
		this.element = element;
		this.waitSec = waitSec;
		this.byType = ByType.xpath;
	}
	
	public Locator(String element,ByType byType)
	{
		this.element = element;
		this.waitSec = 3;
		this.byType = byType;
	}
	
	public Locator(String element,int waitSec,ByType byType)
	{
		this.element = element;
		this.waitSec = waitSec;
		this.byType = byType;
	}
	
	public String getElement()
	{
		return element;
	}
	public ByType getByType()
	{
		return byType;
	}
	public int getWaitSec()
	{
		return waitSec;
	}
	public void setByType(ByType byType)
	{
		this.byType = byType;
	}
	
	/*public void setReplace(String rep, String rex)
	{
		StringTools.replaceAll(element, rex, rep);
	}*/
}
