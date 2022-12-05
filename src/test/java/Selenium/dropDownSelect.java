package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement sel = driver.findElement(By.id("dropdown-class-example"));
//		
//		Select drop = new Select(sel);
//		drop.selectByIndex(2);
//		Thread.sleep(3000);
//		drop.selectByVisibleText("Option3");
//		drop.selectByValue("option1");
		
		genericMethodSelect(sel,"option2");
		
		

	}
	
	public static void genericMethodSelect(WebElement we, String text)
	{
		Select drop = new Select(we);
		//drop.selectByVisibleText(text);
		
		List<WebElement> ab = drop.getOptions();
		for(WebElement xy : ab)
		{
			if(xy.getText().equalsIgnoreCase(text))
			{
				xy.click();
				break;
			}
		}
		
		
	}
	

}
