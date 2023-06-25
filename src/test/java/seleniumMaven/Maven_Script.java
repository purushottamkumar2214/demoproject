package seleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Maven_Script {
	
	@Test
	
	public void CheckLogin()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("1234");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	@Test
	public void checkTitle()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("1234");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
