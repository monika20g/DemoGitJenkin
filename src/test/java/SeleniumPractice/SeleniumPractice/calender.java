package SeleniumPractice.SeleniumPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> ll=driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])/tbody//td"));
		Iterator<WebElement> list=   ll.iterator();
           while(list.hasNext())
           {
        		   WebElement ele= list.next();
        		   if(ele.getText().equalsIgnoreCase("25"))
        		   {
        	        ele.click();
        	        break;
        	        }
        	   
           }

	}
	
	
	
}
