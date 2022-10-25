package com.flipcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipcart.utils.CommonMethods;

public class CheckItemAvailabilityPage extends CommonMethods{

	
	public CheckItemAvailabilityPage(){
		super();
		}
	
	@FindBy(xpath="//span[text()='My personal information']")
	WebElement mypersonalinfo;
	
	@FindBy(xpath="//input[@name='id_gender']")
	WebElement gender;
	
	@FindBy(name = "days")
	WebElement day;
	
	@FindBy(name="months")
	WebElement month;
	
	@FindBy(name="years")
	WebElement year;
	
	@FindBy(id = "old_passwd")
	WebElement confirmpassword;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement saveinfo;
	
	@FindBy(name = "search_query")
	WebElement searchbar;
	
	@FindBy(name = "submit_search")
	WebElement searchicon;
	
	@FindBy(id = "selectProductSort")
	WebElement sortitem;
	
	@FindBy(xpath = "(//span[@class='available-now'])[1]")
	WebElement isitemavaialable;
	
	
	
	public void clickOnMyPersonalInfo() throws InterruptedException {
		Thread.sleep(4000);
		web_Click(mypersonalinfo);
	}
	
	public void selectGender() throws Exception {
		Thread.sleep(4000);
		web_Click(gender);
		takescreenshot("Gender");
	}
	
	public void selectDay() throws InterruptedException {
		Thread.sleep(4000);
		web_Drop_Down(day, "22  ");
	}
	
	public void selectMonth() throws InterruptedException {
		Thread.sleep(4000);
		web_Drop_Down(month, "March ");
	}
	
	public void selectYear() throws Exception {
		Thread.sleep(4000);
		web_Drop_Down(year, "1997  ");
		takescreenshot("Date of Birth");
	}
	
	public void eneterConfirmPassword() throws Exception {
		web_Click(confirmpassword);
		Thread.sleep(4000);
		web_Send_Keys(confirmpassword, property.getProperty("Password"));
		takescreenshot("Confirm Password");
	}
	
	public void saveInfo() throws Exception {
		Thread.sleep(4000);
		web_Click(saveinfo);
		takescreenshot("Save Info");
	}
	
	public void clickOnSearchBar() throws InterruptedException {
		Thread.sleep(4000);
		web_Click(searchbar);
	}

	public void enperItemName() throws Exception  {
		Thread.sleep(4000);
		String productname=readFromExcel(1);
		Thread.sleep(3000);
		web_Send_Keys(searchbar, productname);
		takescreenshot("Enetr Item in Searchbar");
	}
	
	public void clickOnSearchIcon() throws InterruptedException {
		Thread.sleep(6000);
		web_Click(searchicon);
	}
	
	public void sortTheItem() throws Exception {
		Thread.sleep(8000);
		web_Drop_Down(sortitem, "Product Name: A to Z");
		takescreenshot("Sort the Item");
	}
	
	public String isItemAvailable() throws InterruptedException {
		String itemavailable=isitemavaialable.getText();
		Thread.sleep(4000);
		return itemavailable;
	}
}
