package stepDefinition;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.utility.ReadProperty;

import com.test.PageObject.Cart;
import com.test.PageObject.clickWishList;
import com.test.PageObject.loginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductToCart {
	public WebDriver driver;

	public loginPage lpage;
	public clickWishList wlist;
	public Cart crt;

	@Given("I add four different products to my Wishlist")
	public void i_add_four_different_products_to_my_wishlist() throws IOException, InterruptedException {
		// driver.get(ReadProperty.returnvalue("URL"));
		if (driver == null) {
			System.out.println("Line 21 - CreateInstance - Driver is null");
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//src//test//java//driver//geckodriver.exe");
			//this.driver = driver;
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Line 21 - CreateInstance - Driver is not null");
		}

		loginPage lpage = new loginPage(driver);

		driver.get(ReadProperty.returnvalue("URL"));
		lpage.addProducts();
		

	}

	@When("I view my wishlist table")
	public void i_view_my_wishlist_table() throws IOException, InterruptedException {

		loginPage lpage = new loginPage(driver);
		lpage.clickList();

	}

	@Then("I find total four selected items in my Wishlist")
	public void i_find_total_four_selected_items_in_my_wishlist() throws IOException, InterruptedException {
		// lpage = new loginPage(driver);
		wlist = new clickWishList(driver);
		wlist.totalWishList();
	

	}

	@When("I search for lowest price product")
	public void i_search_for_lowest_price_product() throws InterruptedException {

	}

	@When("I am able to add the lowest price item to my cart")
	public void i_am_able_to_add_the_lowest_price_item_to_my_cart() throws IOException, InterruptedException {
		wlist = new clickWishList(driver);
		wlist.addToCart();

	}

	@Then("I am able to verify the item in my cart")
	public void i_am_able_to_verify_the_item_in_my_cart() throws IOException {
		// lpage = new loginPage(driver);
		crt = new Cart(driver);
		crt.clickCart();
	}

}
