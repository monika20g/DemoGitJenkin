package SeleniumPractice.SeleniumPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAdsPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.naukri.com/");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();	
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("Total popup "+ allWindows.size());	
		for(String child :allWindows ) 
		{
			driver.switchTo().window(child);
			System.out.println("Title of ads "+driver.getTitle());
			System.out.println("Url of ads "+driver.getCurrentUrl());
			
			Thread.sleep(3000);
			
			driver.close();
			
		}

	}

}
