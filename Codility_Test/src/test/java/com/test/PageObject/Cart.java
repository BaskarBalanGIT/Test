package com.test.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

	private WebDriver driver;

	By Cart = By.xpath("(//*[@class='la la-shopping-bag'])[1]");
	By textassertion = By.xpath("//*[text()='Product added to cart successfully']");
	By Checkelement = By.xpath("//*[@class='remove']");
	By searchlowestprice = By.xpath("//*[@class='product-price']");

	public Cart(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickCart() {

		driver.findElement(Cart).click();
		if (driver.findElement(Checkelement).isDisplayed()) {
			System.out.println("Test is successfull");

			driver.close();
		}

	}
}
