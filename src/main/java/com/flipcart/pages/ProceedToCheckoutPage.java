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
	
	@FindBy(xpath = "(//div[text()='Remove'])[1]")
	WebElement removeoption;
	
	@FindBy(xpath = "(//a[@class='_2Kn22P gBNbID'])[1]")
	WebElement itemname;
	
	@FindBy(xpath = "(//div[@class='_20RCA6'])[1]")
	WebElement itemsize;
	
	@FindBy(xpath = "(//span[@class='_2-ut7f _1WpvJ7'])[1]")
	WebElement itemprice;
	
	@FindBy(xpath = "(//div[text()='Remove'])[1]")
	WebElement remove;
	
	@FindBy(xpath = "//button/span[text()='Place Order']")
	WebElement placeorder;
	
	@FindBy(xpath = "//div[@class='_1psGvi _3BvnxG']")
	WebElement logoutoption;
	
	@FindBy(xpath = "//div[text()='Logout']")
	WebElement logoutbutton;
	
	public void getItemDetails() throws Exception {
		System.out.println("Item Name: "+web_Get_Data(itemname));
		System.out.println(web_Get_Data(itemsize));
		System.out.println("Item Price: "+web_Get_Data(itemprice));
		getScreenShot("Item Deatils");
		}

		public void removeItem() throws Exception{
			Thread.sleep(3000);
			web_Click(removeoption);
			Thread.sleep(2000);
			getScreenShot("Remove Item");
			web_Click(remove);
			Thread.sleep(5000);
		}
	
	public void clickonPlaceOrder() throws Exception{
		Thread.sleep(3000);
		web_Click(placeorder);
		Thread.sleep(6000);
		getScreenShot("Place Order");
	}
	
	
	public void clickonLogoutOption() throws Exception {
		web_Navigate_Back();
		Thread.sleep(3000);
		web_Mouse_Hover(logoutoption);
		getScreenShot("Logout Menu");
		
	}
	
	public void clickonLogoutButton() throws Exception {
		Thread.sleep(2000);
		web_Click(logoutbutton);
		Thread.sleep(5000);
		getScreenShot("Logged out");
	}
}

