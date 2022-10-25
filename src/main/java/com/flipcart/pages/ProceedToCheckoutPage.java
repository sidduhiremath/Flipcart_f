package com.flipcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipcart.utils.CommonMethods;

import cucumber.api.java.After;

public class ProceedToCheckoutPage extends CommonMethods {

	public ProceedToCheckoutPage() {
		super();
	}

	@After("@Logout")
	public void teardown(){
		driver.quit();
	}
	@FindBy(xpath = "//label[contains(text(),'terms of service')]")
	WebElement termsandservice;

	@FindBy(xpath = "//a[@title='Close']")
	WebElement closepopup;

	@FindBy(xpath = "(//span[contains(text(),'Proceed')])[2]")
	WebElement proceed;
	
	public String VerifyAddresssPage() throws Exception {
		Thread.sleep(4000);
		takescreenshot("Address Page");
		return web_Get_Title();
	}

	public void SelectTermsAndService() throws Exception {
		Thread.sleep(4000);
		web_Click(termsandservice);
		takescreenshot("Terms of Service");
	}


	public void ClickProceedCheckOut() throws InterruptedException {
		Thread.sleep(4000);
		web_Reload_Screen();
		Thread.sleep(4000);
//		Web_Accept_Alert();
		web_Click(proceed);
		Thread.sleep(4000);
		web_Click(closepopup);
		Thread.sleep(4000);
		web_Click(termsandservice);
		Thread.sleep(4000);
	}

}
