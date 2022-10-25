package com.flipcart.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipcart.utils.CommonMethods;

public class ApplicationSignInPage extends CommonMethods{

	public ApplicationSignInPage(){
		super();
		}
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	WebElement contactnumber;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath ="//div[@class='_2YsvKq o8qAfl']//following-sibling::span[text()='Login']")
	WebElement loginbutton;
	
	@FindBy(xpath="(//div[@class='_1psGvi _3BvnxG'])[1]")
	WebElement logoutoption;
	
	@FindBy(xpath = "//div[text()='Logout']")
	WebElement logout;

	public String validateApplicationTitle() throws Exception {
		takescreenshot("SignInPage");
		return web_Get_Title();
	}
	
	public void clickOnSignInOption() throws Exception {
		Thread.sleep(4000);
		web_Click(login);
		Thread.sleep(6000);
		takescreenshot("LoginPage");

	}
	
	public void signIntoApp(String contact,String pass) throws Exception {
	web_Send_Keys(contactnumber,contact);
	Thread.sleep(4000);
	web_Send_Keys(password, pass);
	Thread.sleep(4000);
	

	}
	
	public void clickOnSignInButton() throws Exception {
		Thread.sleep(4000);
		takescreenshot("Entered Credentials");
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbutton);
		Thread.sleep(4000);
	}

	public String validateHomePage() throws Exception {
		takescreenshot("Home Page");
		return web_Get_Title();
	
	}
	
	public String validateOrderPage() throws Exception {
		takescreenshot("Order Page");
		return web_Get_Title();
	}
	
	public void signOutFromTheOption() throws Exception {
		Thread.sleep(4000);
		web_Click(logoutoption);
		Thread.sleep(4000);
	}

	public String validateSinInPage() throws Exception {
		takescreenshot("SignIn Page");
		return web_Get_Title();
	}
}