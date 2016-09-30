package testNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class gmailTest {
	private WebDriver driver;
  @Test
  public void f() {
	driver.get("https://mail.google.com");
	driver.findElement(By.id("Email")).sendKeys("hai.gf001@gmail.com");
	driver.findElement(By.id("next")).click();	
	driver.findElement(By.id("Passwd")).sendKeys("hoanghai123");
	driver.findElement(By.id("signIn")).click();
	
	Assert.assertTrue(driver.findElement(By.id(":4r")).isDisplayed());
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
