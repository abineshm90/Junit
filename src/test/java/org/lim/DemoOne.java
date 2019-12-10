package org.lim;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.Select;
=======
>>>>>>> 57d62f4425b6e44646bfcc7e017db03fe1c8ff58

import junit.framework.Assert;

public class DemoOne {
	static WebDriver driver;
static Actions a;
static Select a;
static Robot r;
@AfterClass
public static void close() {
	driver.close();
}
	
@BeforeClass
public static  void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\eclipse-workspace\\Kiruba\\AbiMaven\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 String u = driver.getCurrentUrl();
	 Assert.assertTrue(u.contains("facebook"));
	 Assert.assertEquals("https://www.facebook.com/", u);
}

@Test
public void tc1() {
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("abul");
	String s = user.getAttribute("value");
	System.out.println(s);
	Assert.assertEquals("abinesh",s);
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("789");
	String a = pass.getAttribute("value");
	System.out.println(a);
	Assert.assertEquals("789", a);
}




@Test
public void tc2() {
	
	WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
	btn.click();

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
