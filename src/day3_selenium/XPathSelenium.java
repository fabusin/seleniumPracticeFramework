package day3_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"/Users/farisabusin/Documents/SeleniumTools/chromedriver/chromedriver_mac64/chromedriver");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://etsy.com");
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/nav/ul/li[1]/button")).click();
	}

}
