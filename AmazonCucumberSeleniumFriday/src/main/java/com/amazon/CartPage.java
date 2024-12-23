package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {

	WebDriver driver;
	
	By addToCartButton=By.xpath("//button[@id='a-autoid-1-announce']");
	By CartIcon=By.xpath("//span[@class='nav-cart-icon nav-sprite");
	
	public CartPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addToCart()
	{
		driver.findElement(addToCartButton).click();
	}
	public void goToCart()
	{
		driver.findElement(CartIcon).click();
	}
}
