package com.test.PageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.InitialiseDriver;

public class clickWishList extends InitialiseDriver {

	WebElement Element;

	// By BrokerId = By.id("brokerId");
	By Wishlist = By.xpath("(//*[@class='lar la-heart'])[1]");
	By Totalwishlist = By.xpath("//*[@class='product-name']");
	By ReadLowest = By.xpath("//*[@class='product-price']");
	By AddToCart = By.xpath("(//*[text()='Add to cart'])[1]");

	public clickWishList(WebDriver driver) {
		InitialiseDriver.driver = driver;
	}

	public void totalWishList() throws InterruptedException {
		List<WebElement> elem = driver.findElements(Totalwishlist);
		if (elem.size() == 5) {
			System.out.println("The products added in the homepage is available in the Wishlist");
		}

	}

	public void searchLowestPrice() throws InterruptedException {

		int up = 0;
		String correctamount = null;
		int uplint = 0;

		List<WebElement> allElements = driver.findElements(ReadLowest);
		// System.out.println(allElements.size());
		for (int i = 2; i <= allElements.size(); i++) {
			// System.out.println(i);

			WebElement str = driver.findElement(By.xpath("(//*[@class='product-price'])[" + i + "]"));
			String unitprice = str.getText();

			// Finding out Length

			up = unitprice.length();
			// System.out.println("length is " + up);

			// Finding out the correct amount using subsrting option
			correctamount = unitprice.substring(up - 5);
			// System.out.println("Substring: " + unitprice.substring(up - 5));

			// Casting the string to double and moving to array;
			Double d = Double.parseDouble(correctamount);
			ArrayList<Double> ara = new ArrayList<Double>();
			ara.add(d);
			Collections.sort(ara);
			// System.out.println("List after the use of" + " Collection.sort() :\n" + ara);
		}

		WebElement lowestPrice = driver
				.findElement(By.xpath("//*[@class='product-price'] //*[text()='" + correctamount + "']"));
		System.out.println("***********Lowest Price is " + lowestPrice.getText() + "********************");

	}

	public void addToCart() throws InterruptedException {
		int up = 0;
		String correctamount = null;

		List<WebElement> allElements = driver.findElements(ReadLowest);
		// System.out.println(allElements.size());
		for (int i = 2; i <= allElements.size(); i++) {
			// System.out.println(i);

			WebElement str = driver.findElement(By.xpath("(//*[@class='product-price'])[" + i + "]"));
			String unitprice = str.getText();

			// Finding out Length

			up = unitprice.length();
			// System.out.println("length is " + up);

			// Finding out the correct amount using subsrting option
			correctamount = unitprice.substring(up - 5);
			// System.out.println("Substring: " + unitprice.substring(up - 5));

			// Casting the string to double and moving to array;
			Double d = Double.parseDouble(correctamount);
			ArrayList<Double> ara = new ArrayList<Double>();
			ara.add(d);
			Collections.sort(ara);
			// System.out.println("List after the use of" + " Collection.sort() :\n" + ara);
		}

		WebElement lowestPrice = driver
				.findElement(By.xpath("//*[@class='product-price'] //*[text()='" + correctamount + "']"));
		// System.out.println(lowestPrice.getText());

		driver.findElement(AddToCart).click();
		Thread.sleep(3000);

	}

}
