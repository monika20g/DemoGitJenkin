package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDnDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//*[@id='month']"));
		Select month=new Select(ele);
		List<WebElement>ListOfMonths=month.getOptions();    
		//month.selectByVisibleText("Jan"); //always use 
		WebElement selectedMonth=month.getFirstSelectedOption();
		String textValue= selectedMonth.getText();
		System.out.println("Last selected value"+textValue);
		
	}

}
