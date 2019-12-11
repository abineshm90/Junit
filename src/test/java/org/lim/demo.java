package org.lim;

import java.awt.Robot;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	static WebDriver driver;
	static Robot r; 
	@AfterClass
	
	public static void closeBroswer() {
		driver.close();

	}
	
	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\eclipse-workspace\\Kiruba\\AbiJUnit\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
			
	}
	
	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1() {
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("abinesh@gmail.com");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("123456");
	
	}
	
	@Test
	public void tc2() {
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		btn.click();

	}
}
