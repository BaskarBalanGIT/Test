package com.test.PageObject;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.utility.ReadProperty;

public class loginPage {

	WebDriver driver;
	ReadProperty ReadProp = new ReadProperty();

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

	public loginPage(WebDriver driver) throws IOException {

		this.driver = driver;
		driver.get(ReadProp.returnvalue("URL"));
		driver.manage().window().maximize();
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

	public void clickWishList() throws InterruptedException {
		driver.findElement(Wishlist).click();
		Thread.sleep(3000);
	}

	public void totalWishList() throws InterruptedException {
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='item-wrapper']"));
		int si = element.size();
		Thread.sleep(3000);

	}

	public void addToCart() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AddToCart).click();
		Thread.sleep(3000);
		
//		//assertEquals("Product added to cart successfully", driver.findElement(textassertion));

	}

	public void clickCart() {
		driver.findElement(Cart).click();
		if (driver.findElement(Checkelement).isDisplayed())
			{
			System.out.println("Test is successfull");
			};
		
//		assertEquals("Product added to cart successfully", textassertion);

	}

}
