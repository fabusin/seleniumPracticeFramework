package day1_seleniumLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/farisabusin/Documents/SeleniumTools/chromedriver/chromedriver_mac64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		System.out.println("Home page title is: " + driver.getTitle());
		System.out.println("Home page URL is: " + driver.getCurrentUrl());
		
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coffee mug");
		// if a function returns something, we can either store that returned data in a variable,
		// or we can do a chain action
		// if the return type us void, we can not do any action after because there is no data returned
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		
		//find by name
		//driver.findElement(By.name("q")).sendKeys("software test engineer")
		
		// find by linktext
		driver.findElement(By.linkText("Customer Service")).click();
		
		// chain action
		String str = " Hello World! ";
		str.substring(3).trim().concat("Love Java");
	}

}
