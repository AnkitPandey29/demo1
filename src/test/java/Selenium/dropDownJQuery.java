package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownJQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
//		Dimension d = new Dimension(1200,1500);
//		driver.manage().window().setSize(d);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("justAnInputBox")).click();
		getDrop(driver,"all");

	}
	
	public static void getDrop(WebDriver driver,String... value)
	{
		List<WebElement> li = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equals("all"))
		{
			for(WebElement item: li)
			{
				String text =  item.getText();
				for(String va : value)
				{
					if(va.equalsIgnoreCase(text))
					{
						item.click();
						break;
					}
				}
			}
		}
		else
		{
			for(WebElement xy : li)
			{
				xy.click();
			}
		}
		
	}

}
