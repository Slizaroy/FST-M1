package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumProjectActivity3 {
	
		public static void main(String[] args) {
	        // Initialize the Firefox Driver
	        WebDriver driver = new FirefoxDriver();

	        // Open the page
	        driver.get("https://alchemy.hguy.co/jobs/");
	        
	        String image="//h1[text()='Welcome to Alchemy Jobs']//preceding::img";
            WebElement imageurl=driver.findElement(By.xpath(image));
	        // Verify the page title
	        String headerimageurl=imageurl.getAttribute("src");
	        System.out.println("url of the header image is "+headerimageurl);
	        driver.quit();
	    }


}
