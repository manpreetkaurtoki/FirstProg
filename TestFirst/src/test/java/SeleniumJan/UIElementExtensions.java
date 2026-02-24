package SeleniumJan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UIElementExtensions {
	public static void performEnterText(WebElement locator, String value) {
		locator.click();
		locator.clear();
		locator.sendKeys(value);
	}

	/*
	 * public static void performEnterText(WebDriver driver, By locator, String
	 * value) { driver.findElement(locator).click();
	 * driver.findElement(locator).clear();
	 * driver.findElement(locator).sendKeys(value); }
	 */

	public static void performClick(WebElement locator) {
		locator.click();
	}

	public static void performDropDownSelection(WebElement locator, String dropdownvalue) {
		var select = new Select(locator);
		select.selectByVisibleText(dropdownvalue);
	}
}
