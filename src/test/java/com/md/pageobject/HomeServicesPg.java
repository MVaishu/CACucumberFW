package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomponents.WebDHelper;
import com.md.uistore.HomeServicesUi;

public class HomeServicesPg {
	WebDriver driver;
	WebDHelper helper;
	HomeServicesUi ui;

	public HomeServicesPg(WebDriver driver) {
		this.driver = driver;
		helper = new WebDHelper();
		ui = new HomeServicesUi();
	}
	public void clickOnHomeS() {
		helper.clickOn(ui.homes, driver);
		System.out.println("Successfully clicked on Home Services");
	}
}
