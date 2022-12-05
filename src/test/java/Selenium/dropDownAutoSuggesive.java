package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownAutoSuggesive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> seaches = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		System.out.println(seaches.size());
		
		for(WebElement search : seaches)
		{
			if(search.getText().contains("interview questions"))
			{
				search.click();
				break;
			}
			
		}
		
		
		
		
	}

}
