package log4jfrm;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class frameworktesting {
	
	WebDriver driver;
	
  @Test
  public void logfiles() throws Exception {
	  Logger file=Logger.getLogger("Shopping");
	  PropertyConfigurator.configure("record.properties");
	  
	  driver.get("https://www.amazon.in/");
	  file.info("Website successfully launched");
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/a"))).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
	  
	  file.info("Signin clicked");
	  
	  driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("1234567890");
	  file.warn("Entered only numerical value");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
