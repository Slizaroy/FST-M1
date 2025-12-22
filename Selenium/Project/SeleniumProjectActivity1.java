package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumProjectActivity1 {
	public static void main(String[] args) {
        // Initialize the Firefox Driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/jobs/");
        String a= driver.getTitle();

        // Verify the page title
        System.out.println("Page title is: " + a);
        if (a.matches("Alchemy Jobs – Job Board Application")){
        	System.out.println("title matched");
        	driver.quit();
        }else {
        	System.out.println("title did not match");
        
        }
        
    }

}
