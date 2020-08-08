package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MercuryTest {
	
	@Test
	
	public void logTest() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//waitForElement(driver,15,By.id("closeBtn"));
		//driver.findElement(By.id("closeBtn")).click();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		driver.manage().deleteAllCookies();
		
		//driver.close();
		//driver.quit();
		
		
	}
	
	public void waitForElement(WebDriver driver, int timeToWaitInSeconds, By elementLocator) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSeconds);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementLocator));
	}

	
	
}
