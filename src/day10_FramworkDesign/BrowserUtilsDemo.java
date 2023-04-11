package day10_FramworkDesign;

import pages.IndeedPage;
import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;

public class BrowserUtilsDemo {

	public static void main(String[] args) {

		

	}
	
	static IndeedPage indeedpage;
	static BrowserUtils utils = new BrowserUtils();
	
	public static void indeedTest() throws InterruptedException {
		indeedpage = new IndeedPage();
		Driver.getDriver().get(DataReader.getProperty("indeedUrl"));
		Thread.sleep(1000);
		utils.waitForElementVisible(indeedpage.whereField);
		utils.clearText(indeedpage.whereField);

	}

}
