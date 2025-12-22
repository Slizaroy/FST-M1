package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumProjectActivity8and9 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        // Find the password field and enter the password
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        // Find the login button and click it
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        // Print the confirmation message
        System.out.println("login successful");
        driver.findElement(By.xpath("//div[text()='Job Listings']")).click();
        driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
        driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys("QA Analyst");
        driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
        driver.findElement(By.xpath("//button[text()='Publish']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View Job']")));
        //driver.findElement(By.xpath("//a[text()='View Job']")).click();
        element.click();
        driver.findElement(By.xpath("//a[text()='Job Dashboard']")).click();
    	WebElement job=driver.findElement(By.xpath("//td[@class='job_title']"));
    	String title=job.getText();
    	if(title.matches("QA Analyst")) {
    	System.out.println("job post success");
    	driver.quit();
    } else{
    	System.out.println("job post failed");
    }
    
        

        // Close the browser
        driver.quit();

}
}
