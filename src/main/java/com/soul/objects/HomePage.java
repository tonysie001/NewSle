package com.soul.objects;

public class HomePage extends BasePage {
	Locator homePagePhotoBookLink = new Locator("homePagePhotoBookLink");
	
	Locator homePageTeamBookLink = new Locator("homePageTeamBookLink");
	
	Locator homePagePhotoWashLink = new Locator("homePagePhotoWashLink");

	Locator homePagePromotionLink = new Locator("homePagePromotionLink");
	
	Locator homePageGuideLink = new Locator("homePageGuideLink");
	
	Locator homePageStoreLink = new Locator("homePageStoreLink");
	
	Locator homePagePhotoBookLinkVerify = new Locator("homePagePhotoBookLinkVerify");
	
	Locator homePageTeamBookLinkVerify = new Locator("homePageTeamBookLinkVerify");
	
	Locator homePagePhotoWashLinkVerify = new Locator("homePagePhotoWashLinkVerify");

	Locator homePagePromotionLinkVerify = new Locator("homePagePromotionLinkVerify");
	
	Locator homePageGuideLinkVerify = new Locator("homePageGuideLinkVerify");
	
	Locator homePageStoreLinkVerify = new Locator("homePageStoreLinkVerify");
	
	public void clickPhotoBook() throws Exception
	{
		click(homePagePhotoBookLink);
	}
	public void clickTeamBook() throws Exception
	{
		click(homePageTeamBookLink);
	}
	public void clickPhotoWash() throws Exception
	{
		click(homePagePhotoWashLink);
	}
	public void clickPromotion() throws Exception
	{
		click(homePagePromotionLink);
	}
	public void clickGuide() throws Exception
	{
		click(homePageGuideLink);
	}
	public void clickStore() throws Exception
	{
		click(homePageStoreLink);
	}
	
	public boolean isPrestenthomePagePhotoBookLinkVerify() throws Throwable {
        return isElementPresent(homePagePhotoBookLinkVerify, 20);
	}
	
	public boolean isPrestenthomePageTeamBookLinkVerify() throws Throwable {
        return isElementPresent(homePageTeamBookLinkVerify, 20);
	}
	
	public boolean isPrestenthomePagePhotoWashLinkVerify() throws Throwable {
        return isElementPresent(homePagePhotoWashLinkVerify, 20);
	}
	
	public boolean isPrestenthomePagePromotionLinkVerify() throws Throwable {
        return isElementPresent(homePagePromotionLinkVerify, 20);
	}
	
	public boolean isPrestenthomePageGuideLinkVerify() throws Throwable {
        return isElementPresent(homePageGuideLinkVerify, 20);
	}
	
	public boolean isPrestenthomePageStoreLinkVerify() throws Throwable {
        return isElementPresent(homePageStoreLinkVerify, 20);
	}
}
