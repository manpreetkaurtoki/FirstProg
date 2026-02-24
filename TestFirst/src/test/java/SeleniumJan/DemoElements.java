package SeleniumJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.HomePage;

public class DemoElements {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://eaapp.somee.com");

		HomePage homePage = new HomePage(driver);
		//homePage.clickEmployeeList();
		
		var loginPage= homePage.clickLogin();
		
		homePage =loginPage.performLogin("admin", "password");
		
		var employeeList=homePage.clickEmployeeList();	
		
		var createEmployeePage=employeeList.clickCreateNew();
		createEmployeePage.createNewEmployee("AutoUser2", "45", "As@gmail.com", "100002", "Junior");
		
		
		//Login(driver);
		//createUser(driver);
		//loggOff(driver);

	}

	public static void Login(WebDriver driver) {
		driver.findElement(By.id("loginLink")).click();

		/*
		 * By txtUserName = By.name("UserName");
		 * driver.findElement(txtUserName).sendKeys("admin");
		 */

		driver.findElement(By.name("UserName")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("password");

		driver.findElement(By.cssSelector(".btn")).submit();
	}

	public static void createUser(WebDriver driver) {
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.id("Name")).sendKeys("AutoUser1");
		// driver.findElement(By.id("Salary")).sendKeys("10000");

		driver.findElement(By.id("DurationWorked")).sendKeys("40");

		Select selectGrade = new Select(driver.findElement(By.id("Grade")));
		selectGrade.selectByVisibleText("Middle");
		driver.findElement(By.id("Email")).sendKeys("AutoUser1@ea.com");

		driver.findElement(By.cssSelector(".btn")).submit();
		
		if (driver.findElement(By.xpath("//span[text()='The Salary field is required.']")).isDisplayed()) {
			driver.findElement(By.id("Salary")).sendKeys("10000");
			driver.findElement(By.cssSelector(".btn")).submit();
		} else {

		}
	}

	public static void loggOff(WebDriver driver) {
		driver.findElement(By.linkText("Log off")).submit();
	}
}
