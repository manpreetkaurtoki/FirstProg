import java.awt.Window;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.JavascriptExecutor;
//@Listeners(TestNGListener.class)
public class Selenium {

	@Test
	public static void main(String[] arg) throws InterruptedException {
		
		
		//open chrome
		//System.getProperty("webdriver.chrome.driver","/Users/monty/Selenium/chromedriver-mac-x64/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		
		//hit url you want to open
	/*	driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
	Thread.sleep(4000);
		//WebElements
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		Thread.sleep(4000);
//	driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("a-expander-prompt")).click();
		driver.manage().window().maximize();
	Thread.sleep(4000);
		driver.navigate().back();
	driver.quit(); */
	
		
		//CSS Selector
	/*driver.get("http://ebay.com");
	driver.manage().window().maximize();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus6T");
	driver.findElement(By.cssSelector("#gh-search-btn")).click();
	js.executeScript("window.scrollBy(0,300)");
	driver.quit();*/
	
		
		
	//XML Path
		/*driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://ebay.com");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Guitar");
		driver.findElement(By.xpath("//button[@id='gh-search-btn']")).click();*/
	
		//Selenium Exception
		
	/*	driver.get("https://google.com");
		Thread.sleep(2000);
		try
		{
			driver.findElement(By.name("fake")).click();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		driver.quit(); */
		
		//Listener
		driver.get("http://edureka.co");
		
		for(String handle: driver.getWindowHandles())
		{
			System.out.println( handle);
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.findElement(By.linkText("All Courses")).click();
		//js.executeScript("windor.scrollBy(0,500)");
		Thread.sleep(3000);
		
driver.quit();

	}
	@Test
	public void TestToFail()
	{
		System.out.println("This method t test fail");
		//Assert.assertTrue(false);
	}

}
