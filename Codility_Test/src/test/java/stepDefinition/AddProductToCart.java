package stepDefinition;

import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.PageObject.loginPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductToCart {
	public WebDriver driver;
	loginPage lpage;

	@Given("I add four different products to my Wishlist")
	public void i_add_four_different_products_to_my_wishlist() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//java//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		lpage = new loginPage(driver);
		lpage.addProducts();

	}

	@When("I view my wishlist table")
	public void i_view_my_wishlist_table() throws IOException, InterruptedException {

		lpage.clickWishList();

	}

	@Then("I find total four selected items in my Wishlist")
	public void i_find_total_four_selected_items_in_my_wishlist() throws IOException, InterruptedException {
		// lpage = new loginPage(driver);
		lpage.totalWishList();

	}

	@When("I search for lowest price product")
	public void i_search_for_lowest_price_product() {

	}

	@When("I am able to add the lowest price item to my cart")
	public void i_am_able_to_add_the_lowest_price_item_to_my_cart() throws IOException, InterruptedException {
		// lpage = new loginPage(driver);
		lpage.addToCart();

	}

	@Then("I am able to verify the item in my cart")
	public void i_am_able_to_verify_the_item_in_my_cart() throws IOException {
		// lpage = new loginPage(driver);
		lpage.clickCart();
	}

}
