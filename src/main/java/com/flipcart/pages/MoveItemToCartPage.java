package com.flipcart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipcart.utils.CommonMethods;

public class MoveItemToCartPage extends CommonMethods{

	public MoveItemToCartPage() {
		super();
	}
	
	@FindBy(xpath = "//a[text()='S']")
	WebElement itemsmallsize;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement addtocart;
	
	@FindBy(xpath = "//div[@class='CXW8mj']")
	WebElement item;
	
	public void switchtoItemDetailsscreen() throws Exception{
		Thread.sleep(2000);
		web_Switch_To_Window();
		getScreenShot("Item Deatils");
	}
	
	public void selectItemSize(String size) throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='"+size+"']")).click();
	}
	
	public void clickOnAddToCart() throws Exception{
		Thread.sleep(2000);
		web_Click(addtocart);
		getScreenShot("Item in Cart");
	}
	
	public void clickOnItem() throws Exception {
		Thread.sleep(2000);
		web_Click(item);
	}
}

