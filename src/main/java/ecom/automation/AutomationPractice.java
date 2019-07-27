package ecom.automation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;

public class AutomationPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Opening URL
		driver.get("http://automationpractice.com");
		System.out.println("URL opened successfully");
		
		//Checking for title " My Store "
		Assert.assertEquals("My Store", driver.getTitle());
		
		// Clicking on contact-us button
		WebElement label = driver.findElement(By.id("contact-link"));
		label.click();

		// Typing "Hello World"
		WebElement messageTextbox = driver.findElement(By.id("message"));
		messageTextbox.sendKeys("Hello World");

		// Waiting for 5 seconds
		Thread.sleep(5000);

		// Closing the Browser
		driver.quit();

	}

}
