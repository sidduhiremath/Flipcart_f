package com.flipcart.pages;


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
	
	@FindBy(xpath = "//span[contains(text(),'incorrect')]")
	public	WebElement incorrectcredential;

	public String validateApplicationTitle() throws Exception {
		getScreenShot("SignInPage");
		return web_Get_Title();
	}
	
	
	public void signIntoApp(String contact,String pass) throws Exception {
	web_Send_Keys(contactnumber,contact);
	Thread.sleep(4000);
	web_Send_Keys(password, pass);
	Thread.sleep(4000);
	getScreenShot("Entered Credentials");
	}
	
	public String validateMessage() throws InterruptedException {
		String message = null;
		try {
		if(incorrectcredential.isDisplayed()) {
		message=web_Get_Data(incorrectcredential);
		Thread.sleep(4000);
		}
		else {
			System.out.println("Correct Credentials");	
		}}
		catch(Exception e) {
			System.out.println("Handled NoSuchElement Exception");
		}
		
		return message;
	}
	
	public void clickOnLoginButton() throws Exception {
		Thread.sleep(4000);
	    executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbutton);
		Thread.sleep(4000);
	}

			
	public String validateLoginPage() throws Exception {
		getScreenShot("Login Page");
		return web_Get_Title();
	}
	
	
}