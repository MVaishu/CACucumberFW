package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomponents.WebDHelper;
import com.md.uistore.FreePostingUi;

public class FreePostingPg {
	WebDriver driver;
	WebDHelper helper;
	FreePostingUi ui;

	public FreePostingPg(WebDriver driver) {
		this.driver = driver;
		helper = new WebDHelper();
		ui = new FreePostingUi();
	}

	public void clickOnFreeP() {
		helper.clickOn(ui.post, driver);
		System.out.println("Successfully clicked on Free Posting");
	}


}
