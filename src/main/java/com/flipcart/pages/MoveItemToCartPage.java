package com.flipcart.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipcart.utils.CommonMethods;

public class MoveItemToCartPage extends CommonMethods{

	public MoveItemToCartPage() {
		super();
	}
	
	@FindBy(xpath= "(//ul[@class='product_list grid row']/li)[1]")
	WebElement item;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-default btn-facebook')]")
	WebElement facebookshare;
	
	@FindBy(xpath= "//p[@id='add_to_cart']/button/span")
	WebElement addtocart;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedtocheckout;
	
	@FindBy(xpath="(//a[contains(text(),'Size : S')])[2]")
	WebElement editsize;
	
	@FindBy(xpath = "//select[@id='group_1']")
	WebElement modifysize;
	
	@FindBy(xpath = "(//p[@class='product-name']/a)[1]")
	WebElement productname;
	
	@FindBy(xpath = "(//span[@class='price'])[3]")
	WebElement productprice;
	
	@FindBy(xpath = "//a[contains(text(),'Size : S')]")
	WebElement productcolorandsize;
	
	@FindBy(xpath = "(//i[@class='icon-trash'])[1]")
	WebElement removeitem;
	
	@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
	WebElement proceed;
	
	public void ClickOnItem() throws Exception {
		Thread.sleep(4000);
		web_Click(item);
		takescreenshot("Item Page");
	}
	
	public void ShareItem() throws InterruptedException {
		Thread.sleep(4000);
		web_Click(facebookshare);
		Thread.sleep(4000);
		web_Switch_To_Window();
	}
	
	public void ClickOnAddToCart() throws Exception {
		Thread.sleep(4000);
		web_Click(addtocart);
		takescreenshot("Add to Cart");
	 }
	
	public void ClickOnProceedToChechOut() throws Exception {
		Thread.sleep(4000);
		web_Click(proceedtocheckout);
		takescreenshot("Proceed To Checkout");
	 }
	
	public void ClickOnSize() throws InterruptedException {
		Thread.sleep(4000);
		web_Click(editsize);
	}
	
	public void ModifyItemSize() throws Exception {
		Thread.sleep(4000);
		web_Drop_Down(modifysize, "M");
		takescreenshot("Modify Size");
	}
	
	public void FetchItemDetails() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Product Name: "+web_Get_Data(productname));
		Thread.sleep(4000);
		System.out.println("Product Price: "+web_Get_Data(productprice));
		Thread.sleep(4000);
		System.out.println("Product Color and Size: "+web_Get_Data(productcolorandsize));
	}
	
	public void RemoveItem() throws Exception {
		Thread.sleep(4000);
		web_Click(removeitem);
		takescreenshot("Remove Item");
	}
	
	public void ProceedToChechOut() throws Exception {
		Thread.sleep(4000);
		web_Click(proceed);
		takescreenshot("Checkout");
		
	 }
}
