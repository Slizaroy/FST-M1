package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumProjectActivity7 {
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs/");
	driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
	driver.findElement(By.xpath("//label[text()='Your email']//following::input[1]")).sendKeys("tultul@gmail.com");
	driver.findElement(By.xpath("//label[text()='Job Title']//following::input[1]")).sendKeys("QA");
	WebElement desc=driver.findElement(By.xpath("//div[@id='wp-job_description-wrap']"));
	desc.click();
	WebElement iframeElement = driver.findElement(By.xpath("//iframe[@id='job_description_ifr']"));
	driver.switchTo().frame(iframeElement);
	driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("hi");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//label[text()='Application email/URL']//following::input[1]")).sendKeys("alchemy@gmail.com");
	driver.findElement(By.xpath("//label[text()='Company name']//following::input[1]")).sendKeys("IBM");
	driver.findElement(By.xpath("//input[@value='Preview']")).click();
	driver.findElement(By.xpath("//input[@value='Submit Listing']")).click();
	driver.findElement(By.xpath("//a[text()='Job Dashboard']")).click();
	WebElement job=driver.findElement(By.xpath("//td[@class='job_title']"));
	String title=job.getText();
	if(title.matches("QA")) {
	System.out.println("job post success");
	driver.quit();
} else{
	System.out.println("job post failed");
}
}}
