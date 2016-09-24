package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bytagname {
	FirefoxDriver driver;
	
	
	private void launchbrowser(String URL) {
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		}
	
    private void getlinktext() {
    	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for(WebElement element : links)
	{
		System.out.println(element.getText());
	}
	
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
	}

		
		
	}

	public void common_method(String URL) {
		launchbrowser(URL);
		getlinktext();
		tear_down();
		}

	private void tear_down() {
		
	}

	

	
	

}
