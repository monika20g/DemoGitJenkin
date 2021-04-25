package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImgLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com");
	 //  driver.get("https://orangehrm-demo-6x.orangehrmlive.com");
		//List<WebElement>ss= driver.findElements(By.xpath("//div[@class='col-md-12   pull-left social-buttons outer']/a"));
	
	   /*for(WebElement ele : ss)
	   {
		   System.out.println(ele.getAttribute("href"));
		   System.out.println(ele.getAttribute("class"));
		   
	   }*/
		//how to verify how many checkboxes,textbox,dropdown,links,images
		//how many password field are there?
		
	   System.out.println(driver.findElements(By.tagName("img")).size());
	   System.out.println(driver.findElements(By.tagName("a")).size());
	   System.out.println(driver.findElements(By.tagName("input")).size());
	  // System.out.println(driver.findElement(By.xpath("//input[@type='password']")) );
	   driver.quit();
	}

}
