package com.stepDefinitions;

import org.junit.Assert;

import com.md.pageobject.AvoidPG;
import com.md.pageobject.BaseClass;
import com.md.pageobject.ContactPg;
import com.md.pageobject.FAQPg;
import com.md.pageobject.FreePostingPg;
import com.md.pageobject.HomeServicesPg;
import com.md.pageobject.LinkedInPg;
import com.md.pageobject.MenuPg;
import com.md.pageobject.PrivacyPg;
import com.md.pageobject.RentalPg;
import com.md.pageobject.SitemapPg;
import com.md.utility.BrowseFactory;
import com.md.utility.ReadPropertyFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainClass extends BaseClass {
	public ReadPropertyFile read;

	@Given("user on website")
	public void user_on_website() throws InterruptedException {
		read = new ReadPropertyFile();
		driver = BrowseFactory.startApplication(driver, read.getBrowser(), read.getUrl(), read.getDriver());
		System.out.println(driver.getTitle());
	}

	@When("click on Menu")
	public void click_on_Menu() throws Exception {
		MenuPg m = new MenuPg(driver);
		m.clickOnMenu();
		m.clickOnProp();
		Assert.assertEquals(m.getPropTitle(), "Sell or Rent your Property For Free");
		driver.navigate().back();

	}

	@When("click on Avoid Broker")
	public void click_on_Avoid_Broker() throws Exception {
		AvoidPG AP = new AvoidPG(driver);
		AP.clickOnAvoid();
		AP.clickOnAboutUs();
		Assert.assertEquals(AP.getAboutTitle(), "About Us");
	}
	
	public void avoidP() throws Exception {
		AvoidPG AP = new AvoidPG(driver);
		AP.clickOnAvoid();
	}

	@When("click on Contact Us")
	public void click_on_Contact_Us() throws Exception {
		avoidP();
		ContactPg CP = new ContactPg(driver);
		CP.clickOnContact();
		//close_the_page();

	}

	@When("click on FAQ")
	public void click_on_FAQ() throws Exception {
		avoidP();
		FAQPg FP = new FAQPg(driver);
		FP.clickOnFAQ();
		//close_the_page();
	}

	@When("click on Home Services")
	public void click_on_Home_Services() throws Exception {
		avoidP();
		HomeServicesPg HS = new HomeServicesPg(driver);
		HS.clickOnHomeS();
		//close_the_page();
	}

	@When("click on Rental Agreement")
	public void click_on_Rental_Agreement() throws Exception {
		avoidP();
		RentalPg RP = new RentalPg(driver);
		RP.clickOnrental();
		//close_the_page();
	}

	@When("click on Privacy Policy")
	public void click_on_Privacy_Policy() throws Exception {
		avoidP();
		PrivacyPg PP = new PrivacyPg(driver);
		PP.clickOnPrivacy();
	}

	@When("click on Sitemap")
	public void click_on_Sitemap() throws Exception {
		avoidP();
		FreePostingPg FP = new FreePostingPg(driver);
		FP.clickOnFreeP();

	}

	@When("click on Free Posting")
	public void click_on_Free_Posting() throws Exception {
		avoidP();
		SitemapPg SP = new SitemapPg(driver);
		SP.clickOnSiteMap();
	}

	@When("click on LinkedIn")
	public void click_on_LinkedIn() throws Exception {
		LinkedInPg LP = new LinkedInPg(driver);
		LP.clickOnLinkedIn();
	}

	@Then("close the page")
	public void close_the_page() throws Exception {
		BrowseFactory.quitBroswer(driver);

	}

}