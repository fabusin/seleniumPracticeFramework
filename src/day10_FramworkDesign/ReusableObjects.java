package day10_FramworkDesign;

import org.openqa.selenium.By;

import pages.FacebookPage;
import utils.DataReader;
import utils.Driver;

public class ReusableObjects {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/farisabusin/Documents/SeleniumTools/chromedriver/chromedriver_mac64/chromedriver");
		ReusableObjects obj = new ReusableObjects();
		obj.testcase1();
		//obj.testcase2();
		//obj.getTextPractice();
		
	}
	
	FacebookPage fbPage;
	
	public void testcase1() {
		fbPage = new FacebookPage();
		Driver.getDriver().get("https://www.facebook.com");
		fbPage.FBemailField.sendKeys(DataReader.getProperty("facebookUsername"));
		fbPage.FBpassField.sendKeys(DataReader.getProperty("faceboookPassword"));
		fbPage.FBloginBtn.click();
		Driver.quitDriver();
	}

	public void testcase2() throws InterruptedException {
		
		Driver.getDriver().get(DataReader.getProperty("testingUrl"));
		Driver.getDriver().findElement(By.linkText("Creat new account")).click();
		Thread.sleep(1000);
		Driver.getDriver().findElement(By.name("firstname")).sendKeys("automation");
		Driver.getDriver().findElement(By.name("lastname")).sendKeys("automation");
		Driver.getDriver().findElement(By.name("reg_email__")).sendKeys("automation");
		Driver.getDriver().findElement(By.name("reg_passwd__")).sendKeys("automation");
		Driver.getDriver().findElement(By.name("websubmit")).click();
		Driver.quitDriver();

		
		}
	
	public void getTextPractice() {
		Driver.getDriver().get(DataReader.getProperty("testingUrl"));
		String loginText = Driver.getDriver().findElement(By.name("login")).getText();
		System.out.println("Login button text is: " + loginText);
		
		if (loginText.equals("Log In")) {
			System.out.println("Test Pass!");
		} else {
			System.out.println("Test Fail! Text doesn't equal");
		}
		Driver.quitDriver();
	}
}
