package stepDefinition;

import java.io.IOException;
import org.utility.InitialiseDriver;
import org.utility.ReadProperty;
import com.test.PageObject.Cart;
import com.test.PageObject.clickWishList;
import com.test.PageObject.loginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductToCart extends InitialiseDriver {

	public loginPage lpage;
	public clickWishList wlist;
	public Cart crt;

	@Given("I add four different products to my Wishlist")
	public void i_add_four_different_products_to_my_wishlist() throws IOException, InterruptedException {
		// driver.get(ReadProperty.returnvalue("URL"));
		System.out.println("driver before initiallisation" + driver);
		InitialiseDriver.initiatedriverinstance("Chrome");
		System.out.println("driver after invoking the class" + driver);

		loginPage lpage = new loginPage(driver);

		System.out.println("driver passing to different class" + driver);
		driver.get(ReadProperty.returnvalue("URL"));
		lpage.addProducts();
		lpage.clickList();

	}

	@When("I view my wishlist table")
	public void i_view_my_wishlist_table() throws IOException, InterruptedException {
		// loginPage lpage = new loginPage(driver);
		// lpage.clickWishList();

	}

	@Then("I find total four selected items in my Wishlist")
	public void i_find_total_four_selected_items_in_my_wishlist() throws IOException, InterruptedException {
		// lpage = new loginPage(driver);
		wlist = new clickWishList(driver);
		wlist.totalWishList();
		wlist.addToCart();

	}

	@When("I search for lowest price product")
	public void i_search_for_lowest_price_product() throws InterruptedException {

	}

	@When("I am able to add the lowest price item to my cart")
	public void i_am_able_to_add_the_lowest_price_item_to_my_cart() throws IOException, InterruptedException {
		// wlist = new WishList(driver);

	}

	@Then("I am able to verify the item in my cart")
	public void i_am_able_to_verify_the_item_in_my_cart() throws IOException {
		// lpage = new loginPage(driver);
		crt = new Cart(driver);
		crt.clickCart();
	}

}
