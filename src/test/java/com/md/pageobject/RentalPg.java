package com.md.pageobject;


import org.openqa.selenium.WebDriver;

import com.md.reusablecomponents.WebDHelper;
import com.md.uistore.RentalUi;

public class RentalPg {
	
	WebDriver driver;
	WebDHelper helper;
	RentalUi ui;
	
	public RentalPg(WebDriver driver) {
		this.driver=driver;
		helper=new WebDHelper();
		ui=new RentalUi() ;
	}
	
	public void clickOnrental() {
		helper.clickOn(ui.rental,driver);
		System.out.println("Successfully clicked on rental");
	}

}
