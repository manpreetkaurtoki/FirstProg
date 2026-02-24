package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}

	// Locator for login
	@FindBy(linkText = "Login")
	WebElement lnklogin;
	// private By lnklogin= By.linkText("Login");

	@FindBy(linkText = "Log off")
	WebElement lnklogoff;
	// locator for employee list

	@FindBy(linkText = "Employee List")
	WebElement lnkEmployeeList;
	// private By lnkEmployeeList= By.linkText("Employee List");

	public LoginPage clickLogin() {
		//UIElementExtensions.performClick(lnklogin);
		lnklogin.click();
		return new LoginPage(driver);
	}

	public EmployeeListPage clickEmployeeList() {
		lnkEmployeeList.click();
		//UIElementExtensions.performClick(lnkEmployeeList);
		return new EmployeeListPage(driver);
	}
	
	public void clickLogOff()
	{
		lnklogoff.click();
	}
}
