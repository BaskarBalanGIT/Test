package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitialiseDriver {

	public static WebDriver driver;

	public static void initiatedriverinstance(String Browser) {

		if (Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.geckodriver.driver",
					System.getProperty("user.dir") + "//src//test//java//driver//geckodriver.exe");
			System.out.println("Browser is Firefox");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		else if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//test//java//driver//chromedriver.exe");
			System.out.println("Browser is Chrome");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (Browser.equalsIgnoreCase("IE")) {
			System.out.println("Browser is IE");

		}

		else if (Browser.equalsIgnoreCase("Edge")) {
			System.out.println("Browser is Edge");
		}

		else {
			System.out.println("Browser is Edge");
		}
	}

}
