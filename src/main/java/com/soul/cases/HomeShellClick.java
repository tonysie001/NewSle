package com.soul.cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.soul.objects.HomePage;


public class HomeShellClick {
	
	HomePage hp = new HomePage();
	@Test
	public void homePagePhotoBook() throws Throwable
	{
		hp.clickPhotoBook();
		Assert.assertTrue(hp.isPrestenthomePagePhotoBookLinkVerify(),"PhotoBook Bad Link!");
	}
	
	@Test
	public void homePageStore() throws Throwable
	{
		hp.clickStore();
		Assert.assertTrue(hp.isPrestenthomePageStoreLinkVerify(),"Store Bad Link!");
	}
	
	@Test
	public void homePageTeamBook() throws Throwable
	{
		hp.clickTeamBook();
		Assert.assertTrue(hp.isPrestenthomePageTeamBookLinkVerify(),"TeamBook Bad Link!");
	}
	
	@Test
	public void homePagePromotion() throws Throwable
	{
		hp.clickPromotion();
		Assert.assertTrue(hp.isPrestenthomePagePromotionLinkVerify(),"Promotion Bad Link!");
	}
	
	@Test
	public void homePagePhotoWash() throws Throwable
	{
		hp.clickPhotoWash();
		Assert.assertTrue(hp.isPrestenthomePagePhotoWashLinkVerify(),"Wash Bad Link!");
	}
	
	@Test
	public void homePageGuide() throws Throwable
	{
		hp.clickGuide();
		Assert.assertTrue(hp.isPrestenthomePageGuideLinkVerify(),"Guide Bad Link!");
	}
	

}
