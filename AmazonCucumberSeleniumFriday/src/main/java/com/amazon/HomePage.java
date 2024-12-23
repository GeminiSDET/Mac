package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	By searchbox= By.id("twotabsearchtextbox");
	By searchButton=By.id("nav-search-submit-button");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchItem(String item) {
		driver.findElement(searchbox).sendKeys("Skybags");
		driver.findElement(searchButton).click();
	}
}
