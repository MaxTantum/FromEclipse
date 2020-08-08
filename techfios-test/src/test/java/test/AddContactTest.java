package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddContactTest {
	
	@Test
	public void userShouldBeAbleToAddContact () {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//span[text()='CRM']")).click();
		
		
		//driver.close();
		//driver.quit();
	}

}
