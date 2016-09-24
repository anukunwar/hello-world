package day3july;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningMethodsusingGoogle {
	
	
	
/*	
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		driver.close();
	}*/
	FirefoxDriver driver ;
	public void  launchURL(String URL)
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	public void ClickOnGmailLink(String link) throws InterruptedException
	{
		System.out.println(link);
			driver.findElement(By.partialLinkText(link)).click();
			Thread.sleep(5000);
	}
	
	public void tear_down()
	{
		//driver.close();
		driver.quit();
	}

}
