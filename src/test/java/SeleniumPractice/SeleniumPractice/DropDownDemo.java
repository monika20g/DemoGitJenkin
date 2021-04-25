package SeleniumPractice.SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class DropDownDemo {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//*[@id='month']"));
		Select select=new Select(ele);
		List<WebElement>gg=select.getOptions();
		List Actual=new ArrayList();
		for(WebElement e:gg)
		{
			System.out.print(e.getText());
			Actual.add(e.getText());
		}
		List expected=new ArrayList();
		expected.add("Month");
		expected.add("Jan");
		expected.add("Feb");
		expected.add("Mar");
		expected.add("Apr");
		expected.add("May");
		expected.add("Jun");
		expected.add("Jul");
		expected.add("Aug");
		expected.add("Sep");
		expected.add("Oct");
		expected.add("Nov");
		expected.add("Dec");

		for(int i=0;i<Actual.size();i++)
		{
			System.out.println("Actual"+Actual.get(i)+"Expect"+expected.get(i));
			Assert.assertTrue(Actual.get(i).equals(expected.get(i)));	
		}


	}

}
