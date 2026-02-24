package SeleniumJan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class TestNGExample {
	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;

	@BeforeTest
	public void runBeforeTest() {
		driver = new ChromeDriver();
		// PageFactory.initElements( driver,this);
		driver.get("http://eaapp.somee.com");
	}

	@BeforeMethod
	public void runBeforeMethod() {
		System.out.println("Executing before every single test");
	}

	@Test
	public void testALogin() {
		System.out.println("Testing login operation");
		homePage = new HomePage(driver);
		loginPage = homePage.clickLogin();

	}

	// we can add parameters too throgh xml
	@Parameters({ "UserName", "Password" })
	@Test
	public void testBCreateEmployee(String username, String password) {
		homePage = loginPage.performLogin(username, password);

		var employeeList = homePage.clickEmployeeList();
		var createEmployeePage = employeeList.clickCreateNew();
		createEmployeePage.createNewEmployee("AutoUser2", "45", "As@gmail.com", "100002", "Junior");

		System.out.println("Testing create user operation");
	}
	//passing data dynamically

	
	@Test(dataProvider= "CreateEmployee")
	public void testWithDataProviderCreateEmployee(String name, String Durationworked, String email, String salary,String role) {
		
		var homePage = new HomePage(driver);
		var loginPage = homePage.clickLogin();
		homePage = loginPage.performLogin("admin", "password");
		var employeeList = homePage.clickEmployeeList();
		var createEmployeePage = employeeList.clickCreateNew();
		createEmployeePage.createNewEmployee(name, Durationworked,email, salary, role);

		System.out.println("Testing create user operation");
	}
	@DataProvider(name = "CreateEmployee")
	public static Object[][] createEmployeeData() {

		return new Object[][] { new Object[] { "DDTUser", "46", "ddtU@gmail.com", "9000", "Middle" } };
	}

	@Test
	public void testCLogOff() {

		homePage.clickLogOff();
		System.out.println("Testing logoff operation");
	}

// we can write all in method to reduce dependencies

	@AfterTest
	public void afterTestExecution() {
		driver.quit();
		System.out.println("After Test execution operation");
	}
}
