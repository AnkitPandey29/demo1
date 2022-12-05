package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
	//	driver.navigate().to(https://rahulshettyacademy.com/angularpractice/);--URL-doubt

	}

}
