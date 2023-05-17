package Innomate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Automate {
	public WebDriver driver;
	@Test(priority=1)

	  public void login() throws InterruptedException {

	    Thread.sleep(500);

	    driver.get("http://10.21.21.210/Innomate_UBL/");

	 

	    driver.manage().window().maximize();

	    driver.findElement(By.id("UserID")).sendKeys("Hammad");

	    driver.findElement(By.id("Password")).sendKeys("Pakistan12345@");

	    driver.findElement(By.id("TestLogin")).click();

	    Thread.sleep(100);

	driver.findElement(By.id("endSession")).click();

	 

	    String actualurl="http://10.21.21.210/Innomate_UBL/User/UserDashBoard";

	     String expectedurl= driver.getCurrentUrl();

	     if(actualurl.contains(expectedurl)) {

	         System.out.println("Login Passed");

	    

	     }     else {

	         System.out.println("login Failed");

	     }

	 

	  }





