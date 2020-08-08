package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddBankAccunt {
	
	@Test

	public void userShouldAbleToAddBankAccount() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		WebElement EMAIL_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement SING_IN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
		
		EMAIL_FIELD_ELEMENT.sendKeys("techfiosdemo@gmail.com");
		PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
		SING_IN_BUTTON_ELEMENT.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By BANK_LINK_LOCATOR = (By.xpath("//span[contains(text(), 'Bank')]"));
		driver.findElement(BANK_LINK_LOCATOR).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'New Account')]")).click();
		
		
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(9999);
		String account = "SpyderMan" + randomNumber;
		String description = String.valueOf(randomNumber * 3);
		String balance = String.valueOf(randomNumber * 2);

		driver.findElement(By.id("account")).sendKeys(account);
		driver.findElement(By.id("description")).sendKeys(description);
		driver.findElement(By.id("balance")).sendKeys(balance);
		
		
		
		
		
	}
}
