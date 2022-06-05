package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomponents.WebDHelper;
import com.md.uistore.ContactUi;

public class ContactPg {

	WebDriver driver;
	WebDHelper helper;
	ContactUi ui;

	public ContactPg(WebDriver driver) {
		this.driver = driver;
		helper = new WebDHelper();
		ui = new ContactUi();
	}

	public void clickOnContact() {
		helper.clickOn(ui.contact, driver);
		System.out.println("Successfully clicked on Contact Us");
	}
	
	public String getContactTitle() {
		String data=helper.getText(ui.contact,driver);
		return data;
	}

}
