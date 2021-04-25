package SeleniumPractice.SeleniumPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.quit();    
	  String parent=  driver.getWindowHandle();
	  System.out.println(parent);
	  driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on Facebook')]")).click();
	  Set<String>allWindows=	driver.getWindowHandles();
	  System.out.println(allWindows);
	  for(String child:allWindows)
	  {
		  System.out.println(child);
		  if(!parent.equals(child))
		  {
			   driver.switchTo().window(child);
			   System.out.println("Title of the child window is "+driver.getTitle());
			   driver.findElement(By.name("email")).sendKeys("Selenium");
		       Thread.sleep(5000);
			   driver.close();
			  
		  }  
			  
		  
	  }
	  
	  driver.switchTo().window(parent);
	  System.out.println(driver.getTitle());

	}

}
