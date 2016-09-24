package day4july;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Carwale {
	
	FirefoxDriver driver ;
	public void  launchURL(String URL)
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	public void Getalldropdownvalue() throws InterruptedException
	{
		driver.findElement(By.id("btnYes")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class = 'cw-tabs home-tabs'] ul li:nth-child(2)")).click();
		
		WebElement ul = driver.findElement(By.id("minPriceList"));
		List<WebElement> li = ul.findElements(By.tagName("li"));
		System.out.println(li.size());
		for(WebElement e :li)
		{
			System.out.println(e.getText());
		}
		
		
	}
	public void tear_down()
	{
		//driver.close();
		driver.quit();
	}
	

}
