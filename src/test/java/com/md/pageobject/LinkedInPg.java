package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomponents.WebDHelper;
import com.md.uistore.LinkedInUi;

public class LinkedInPg {
	WebDriver driver;
	WebDHelper helper;
	LinkedInUi ui;

	public LinkedInPg(WebDriver driver) {
		this.driver = driver;
		helper = new WebDHelper();
		ui = new LinkedInUi();
	}

	public void clickOnLinkedIn() {
		helper.clickOn(ui.link, driver);
		System.out.println("Successfully clicked on LinkedIn");
	}

}
