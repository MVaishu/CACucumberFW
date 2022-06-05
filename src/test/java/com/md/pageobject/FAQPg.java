package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomponents.WebDHelper;
import com.md.uistore.FAQUi;

public class FAQPg {
	WebDriver driver;
	WebDHelper helper;
	FAQUi ui;
	
	public FAQPg(WebDriver driver) {
		this.driver=driver;
		helper=new WebDHelper();
		ui=new FAQUi() ;
	}
	
	public void clickOnFAQ() {
		helper.clickOn(ui.faq,driver);
		System.out.println("Successfully clicked on FAQ");
	}

}
