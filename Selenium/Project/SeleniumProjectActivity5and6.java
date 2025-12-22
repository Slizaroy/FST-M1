package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumProjectActivity5and6 {
	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--enable-javascript");
		WebDriver driver = new FirefoxDriver(options);
		//driver = new FirefoxDriver(options);

	    // Open the page
	    driver.get("https://alchemy.hguy.co/jobs/");
	    driver.findElement(By.xpath("//a[text()='Jobs']")).click();
	    String job=driver.getTitle();
	    System.out.println(job);
	    driver.findElement(By.xpath("//input[@placeholder='Keywords']")).sendKeys("Banking");
	    driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement a = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Search completed. Found 6 matching records.']//following::img[1]")));
	    //WebElement a=driver.findElement(By.xpath("//span[text()='Search completed. Found 6 matching records.']//following::img[1]"));
	    a.click();
	    driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
	    WebElement email=driver.findElement(By.xpath("//strong[text()='email your details to']//following::a[1]"));
	    String emailid=email.getText();
	    System.out.println("email id is :"+emailid);
	    driver.quit();
	    }

}
