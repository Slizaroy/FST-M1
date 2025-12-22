package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumProjectActivity2 {
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();

    // Open the page
    driver.get("https://alchemy.hguy.co/jobs/");
    String header1="//h1[text()='Welcome to Alchemy Jobs']";
    WebElement header=driver.findElement(By.xpath(header1));
    String header2=header.getText();
    if (header2.matches("Welcome to Alchemy Jobs")){
    	System.out.println("header matched");
    	driver.quit();
    }else {
    	
    	System.out.println("header not matched");
	
    	}
    }
        // Verify the page title
    
  
}



