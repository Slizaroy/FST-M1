package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumProjectActivity4 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

	    // Open the page
	    driver.get("https://alchemy.hguy.co/jobs/");
	    WebElement header=driver.findElement(By.xpath("//h2[text()='Quia quis non']"));
	    String header2=header.getText();
	    if (header2.matches("Quia quis non")){
	    	System.out.println("header matched-Quia quis non");
	    	driver.quit();
	    }else {
	    	
	    	System.out.println("header not matched");
		
	    	}
	    }

}
