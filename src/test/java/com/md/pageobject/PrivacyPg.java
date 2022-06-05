package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomponents.WebDHelper;
import com.md.uistore.PrivacyUi;

public class PrivacyPg {
	WebDriver driver;
	WebDHelper helper;
	PrivacyUi ui;

	public PrivacyPg(WebDriver driver) {
		this.driver = driver;
		helper = new WebDHelper();
		ui = new PrivacyUi();
	}

	public void clickOnPrivacy() {
		helper.clickOn(ui.privacy, driver);
		System.out.println("Successfully clicked on Privacy Policy");
	}

}
