import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.*;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");

		// Xpath with single attribute
		// driver.findElement(By.xpath("//input[@name='Search']")).sendKeys("Tshirts");

		// Xpath with multiple attribut
		// driver.findElement(By.xpath("//input[@name='Search']
		// [@placeholder='Search']")).sendKeys("Tshirts");

		// Xpath with and or operator
		// driver.findElement(By.xpath("//input[@name='Search' and
		// @placeholder='Search']")).sendKeys("Tshirts");
		// driver.findElement(By.xpath("//input[@name='Search' or
		// @placeholder='Search']")).sendKeys("Tshirts");

		// xpath with inner text
		driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		driver.findElement(By.xpath("//h3[text()='Featured']")).click();

		// xpath with contains method
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea]")).sendKeys("Tshirts");

		// xpath with startwith method
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea]")).sendKeys("Tshirts");

		// xpath with chained xpath method
		driver.findElement(By.xpath("//div[@id='logo']/a/img]")).isDisplayed();

		driver.quit();
	}
}
