package day10_FramworkDesign;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9_actionsClassHomework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/farisabusin/Documents/SeleniumTools/chromedriver/chromedriver_mac64/chromedriver");
		dragdrop();

	}
	public static void dragdrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Actions letsdo = new Actions(driver);
		
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop\n");
		if(driver.findElement(By.xpath("//h3[contains(text(), 'Drag And Drop')]")).isDisplayed()){
			System.out.println("Text is there");	
		}
		else {
			System.out.println("Text is not there");
		}
		
		WebElement sourceText = driver.findElement(By.id("text"));
		WebElement targetZone = driver.findElement(By.id("dropzone"));
		
		letsdo.dragAndDrop(sourceText, targetZone).build().perform();
		
		WebElement sourceTextArea = driver.findElement(By.id("text"));
		letsdo.dragAndDrop(sourceTextArea, targetZone).build().perform();
		
		WebElement sourceNumber = driver.findElement(By.id("Number"));
		letsdo.dragAndDrop(sourceNumber, targetZone);
		
		List<WebElement> removeButton = driver.findElements(By.cssSelector(".remove"));
		for (WebElement webElement : removeButton) {
			webElement.click();
			Thread.sleep(500);
		}
		

		
	}

}
