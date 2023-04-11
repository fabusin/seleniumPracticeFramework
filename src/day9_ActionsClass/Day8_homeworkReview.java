package day9_ActionsClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day8_homeworkReview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/farisabusin/Documents/SeleniumTools/chromedriver/chromedriver_mac64/chromedriver");

	}
	
	public static void guru99Homework() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.get("demo.guru99.com/popup.php");
		String mainPageTitle = driver.getTitle();
		String mainPageWindowId = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windowIds = driver.getWindowHandles();
		for (String str : windowIds) {
			if(!str.equals(mainPageWindowId)) {
				driver.switchTo().window(str);
			}
		}
		
		driver.findElement(By.name("emailid")).sendKeys("jon.dow@gmail.com");
		driver.findElement(By.name("btnlogin")).click();
		
		
	}

}
