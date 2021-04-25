package SeleniumPractice.SeleniumPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");

        driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("S");
       	Thread.sleep(2000);
        List<WebElement> ll=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
        Iterator<WebElement> llf= ll.iterator();
        while(llf.hasNext())
        {
        	WebElement ee= 	llf.next();
        if(	ee.getText().equalsIgnoreCase("Haskell"))
        		{
        	      ee.click();
        	      break;
        		}
        }
 
    	

	}

}
