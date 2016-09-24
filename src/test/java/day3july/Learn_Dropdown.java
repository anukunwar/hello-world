package day3july;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Learn_Dropdown {
	
	FirefoxDriver driver ;
	public void  launchURL(String URL)
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	public void selectcity_bytext(String text)
	{
		WebElement dropdown = driver.findElement(By.id("DDSrchCities"));
		Select select = new Select(dropdown);
		select.selectByVisibleText(text);
	}
	
	public void selectcity_byvalue(String value)
	{
		WebElement dropdown = driver.findElement(By.id("DDSrchCities"));
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public void selectcity_byindex(int index)
	{
		WebElement dropdown = driver.findElement(By.id("DDSrchCities"));
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public void getdropdownList()
	{
		WebElement dropdown = driver.findElement(By.id("DDSrchCities"));
		Select select = new Select(dropdown);
		List<WebElement> list = select.getOptions();
		
		for(WebElement e : list)
		{
			System.out.println(e.getText());
		}
		
	}
	
	public void tear_down()
	{
		driver.quit();
	}

}
