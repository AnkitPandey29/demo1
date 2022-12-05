package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.id("speed"));
		
		Select drop = new Select(ele);
		ArrayList actual = new ArrayList();
		ArrayList temp = new ArrayList();
		List<WebElement> options=drop.getOptions();
		
		for(WebElement option : options)
		{
			String str = option.getText();
			actual.add(str);
			temp.add(str);
		}
		
		

		Collections.sort(temp);
		//Collections.sort(temp,Collections.reverseOrder());
		if(temp.equals(actual))
		{
			System.out.println("Sorted");
		}
		else
		{
			System.out.println("not sorted");
		}
		 
		

	}

}
