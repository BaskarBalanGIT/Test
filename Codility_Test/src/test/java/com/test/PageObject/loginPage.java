package com.test.PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.InitialiseDriver;
import org.utility.ReadProperty;

public class loginPage extends InitialiseDriver{

	ReadProperty ReadProp = new ReadProperty();
	WebElement element;

	// By BrokerId = By.id("brokerId");
	By Product1 = By.xpath("(//*[@href='?add_to_wishlist=20'])[1]");
	By Product2 = By.xpath("//*[@href='?add_to_wishlist=24']");
	By Product3 = By.xpath("//*[@href='?add_to_wishlist=23']");
	By Product4 = By.xpath("(//*[@href='?add_to_wishlist=14'])[1]");
	By Wishlist = By.xpath("(//*[@class='lar la-heart'])[1]");
	By Acceptcookies = By.xpath("//*[@class='cc-btn cc-accept-all cc-btn-no-href']");
	By Totalwishlist = By.xpath("//*[@class='item-wrapper']");
	By AddToCart = By.xpath("(//*[text()='Add to cart'])[1]");
	By Cart = By.xpath("(//*[@class='la la-shopping-bag'])[1]");
	By textassertion = By.xpath("//*[text()='Product added to cart successfully']");
	By Checkelement = By.xpath("//*[@class='remove']");
	By searchlowestprice = By.xpath("//*[@class='product-price']");

	public loginPage(WebDriver driver) {
		InitialiseDriver.driver = driver;
	}

	public void addProducts() throws IOException, InterruptedException {
		driver.findElement(Product1).click();
		Thread.sleep(3000);
		driver.findElement(Acceptcookies).click();
		driver.findElement(Product2).click();
		Thread.sleep(3000);
		driver.findElement(Product3).click();
		Thread.sleep(3000);
		driver.findElement(Product4).click();
		Thread.sleep(3000);

	}

	public void clickList() throws InterruptedException {
		driver.findElement(Wishlist).click();
		Thread.sleep(3000);

	}

}
