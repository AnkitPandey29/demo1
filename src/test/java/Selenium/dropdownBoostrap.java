package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownBoostrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.hdfcbank.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
	List<WebElement> li = driver.findElements(By.cssSelector("ul[class*=dropdown1] li"));
	genericMethodBootstrap(li,"EMI");
	driver.findElement(By.xpath("//a[text()='Select Product']")).click();
	List<WebElement> li2 = driver.findElements(By.cssSelector("ul[class*=dropdown2] li"));
	genericMethodBootstrap(li2,"lifestyle");
	

	}
	
	public static void genericMethodBootstrap(List<WebElement> option,String str)
	{
		for(WebElement ab : option)
		{
			if(ab.getText().equalsIgnoreCase(str))
			{
				ab.click();
				break;
				
			}
		}
	}

}
