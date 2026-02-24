package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumJan.UIElementExtensions;

public class CreateEmployeePage {
	// locators of name,duration,salary etc

	private WebDriver driver;

	public CreateEmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "Name")
	private WebElement txtName;

	// private By txtName = By.id("Name");

	@FindBy(id = "DurationWorked")
	private WebElement txtDurationWorked;

	// private By txtDurationWorked = By.id("DurationWorked");
	@FindBy(name = "Email")
	private WebElement txtEmail;

	@FindBy(name = "Salary")
	private WebElement txtSalary;

	@FindBy(name = "Grade")
	private WebElement ddlGrade;

	@FindBy(css = ".btn")
	private WebElement btnCreateEmp;

	/*
	 * private By txtEmail = By.id("Email"); private By ddlGrade = By.name("Grade");
	 * private By txtEmail = By.name("Salary"); private By btnCreateEmp =
	 * By.cssSelector(".btn");
	 */

	public EmployeeListPage createNewEmployee(String name, String durationWork, String email, String salary,
			String grade) {
		UIElementExtensions.performEnterText(txtName, name);
		UIElementExtensions.performEnterText(txtDurationWorked, durationWork);
		UIElementExtensions.performEnterText(txtEmail, email);
		UIElementExtensions.performEnterText(txtSalary, salary);
		UIElementExtensions.performDropDownSelection( ddlGrade, grade);
		UIElementExtensions.performClick( btnCreateEmp);
		return new EmployeeListPage(driver);
	}

}
