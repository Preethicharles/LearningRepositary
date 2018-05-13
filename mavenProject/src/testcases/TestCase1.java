package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
public void testcase1()

{
	
	System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("tc1");
	driver.findElement(By.name("pass")).sendKeys("tc1");
	//Thread.sleep(2000);
	System.out.println("This is testcase1 result");
	//Thread.sleep(5000);
	driver.quit();
	
}


}
