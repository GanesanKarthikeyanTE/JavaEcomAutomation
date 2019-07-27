package ecom.automation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationAdvanse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Opening URL
				driver.get("http://automationpractice.com");
				System.out.println("URL opened successfully");
		
		// Clicking on contact-us button
				//WebElement label = driver.findElement(By.id("contact-link"));
				//label.click();
				
				Actions action =new Actions(driver);
				WebElement menuAction = driver.findElement(By.xpath("//li/a[.='Women']"));
				action.moveToElement(menuAction).perform();
				
				WebElement findTshirt = driver.findElement(By.xpath("//li[1]/a[.='T-shirts']"));
				findTshirt.click();
				
				//Checking for title " My Store "
				Assert.assertEquals("T-shirts - My Store", driver.getTitle());
				
				WebElement clickTshirt = driver.findElement(By.className("product_img_link"));
				action.moveToElement(clickTshirt).perform();
				
				WebElement clickAddToCart = driver.findElement(By.cssSelector(".button.ajax_add_to_cart_button.btn.btn-default"));
				clickAddToCart.click();
				
				Thread.sleep(5000);

				
				
				driver.quit();
		
				
		
}
}
