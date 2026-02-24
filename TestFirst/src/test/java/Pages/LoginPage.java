package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumJan.UIElementExtensions;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}

	@FindBy(name = "UserName")
	WebElement txtUserName;

	@FindBy(name = "Password")
	WebElement txtPassword;

	@FindBy(css = ".btn")
	WebElement btnLogin;

	/*
	 * private By txtUserName = By.name("UserName"); private By txtPassword =
	 * By.name("Password"); private By btnLogin = By.cssSelector(".btn");
	 */

	// Page navigation
	public HomePage performLogin(String Username, String password) {
		UIElementExtensions.performEnterText(txtUserName, Username);
		UIElementExtensions.performEnterText(txtPassword, password);
		UIElementExtensions.performClick(btnLogin);
		/*
		 * driver.findElement(txtUserName).sendKeys(Username);
		 * driver.findElement(txtPassword).sendKeys(password);
		 * driver.findElement(btnLogin).click();
		 */
		return new HomePage(driver);

	}

}
