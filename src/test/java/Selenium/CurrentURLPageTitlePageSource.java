package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CurrentURLPageTitlePageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Title
		System.out.println(driver.getTitle());
		//Current URL
		String st =driver.getCurrentUrl();
		System.out.println(st);
		//PageSource
		System.out.println(driver.getPageSource());
		//is Enabled
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='radio1']"));
		System.out.println(radio.isEnabled());
		radio.click();
		System.out.println(radio.isSelected());
		
	
		
		
	
	}

}
