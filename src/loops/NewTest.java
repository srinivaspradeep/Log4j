package loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void whileloop() throws Exception {
	  driver.get("https://www.spicejet.com/");
	  driver.findElement(By.xpath("//div[normalize-space()='Passengers']")).click();
	  Thread.sleep(2000);
	  int i=1;
	  while(i<9)
	  {
	  driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
	  i++;
	  }
  }
  @Test
  public void forloop() throws Exception {
	  driver.get("https://www.spicejet.com/");
	  driver.findElement(By.xpath("//div[normalize-space()='Passengers']")).click();
	  Thread.sleep(2000);
	  for(int i=1;i<5;i++)
	  {
	  driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
	  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  

}
