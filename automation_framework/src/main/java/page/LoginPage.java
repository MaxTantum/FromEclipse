package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "username")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.NAME, using = "login")
	WebElement SUBMIT_BUTTON_FIELD;
	
	public void enterUsername(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	public void clickSubmitButton() {
		SUBMIT_BUTTON_FIELD.click();
	}

}
