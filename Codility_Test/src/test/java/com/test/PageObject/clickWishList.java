package com.test.PageObject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickWishList {

	private WebDriver driver;

	// By BrokerId = By.id("brokerId");
	By Wishlist = By.xpath("(//*[@class='lar la-heart'])[1]");
	By Totalwishlist = By.xpath("//*[@class='product-name']");
	By AddToCart = By.xpath("(//*[text()='Add to cart'])[1]");

	public clickWishList(WebDriver driver) {
		this.driver = driver;
	}

	public void totalWishList() throws InterruptedException {
		List <WebElement> elem = driver.findElements(Totalwishlist);
		if(elem.size()==5)
		{
			System.out.println("The products added in the homepage is available in the Wishlist");
		}

	}

	public void addToCart() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(AddToCart).click();
		Thread.sleep(3000);

	}

}
