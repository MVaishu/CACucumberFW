package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomponents.WebDHelper;
import com.md.uistore.SitemapUi;

public class SitemapPg {
	WebDriver driver;
	WebDHelper helper;
	SitemapUi ui;
	
	public SitemapPg(WebDriver driver) {
		this.driver=driver;
		helper=new WebDHelper();
		ui=new SitemapUi() ;
	}
	
	public void clickOnSiteMap() {
		helper.clickOn(ui.site,driver);
		System.out.println("Successfully clicked on sitemap");
	}

}
