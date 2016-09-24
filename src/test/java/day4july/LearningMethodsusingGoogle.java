package day4july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LearningMethodsusingGoogle {
	WebDriver driver;
	public   LearningMethodsusingGoogle()
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	public LearningMethodsusingGoogle(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Jim\\workspace\\Selenium_WorkSpace\\June_2016\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:/Jim/workspace/Selenium_WorkSpace/June_2016/src/test/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	

	public LearningMethodsusingGoogle(String browser, String URL)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Jim\\workspace\\Selenium_WorkSpace\\June_2016\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:/Jim/workspace/Selenium_WorkSpace/June_2016/src/test/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	public void ClickOnGmailLink(String link) throws InterruptedException
	{
		System.out.println(link);
			driver.findElement(By.linkText(link)).click();
			Thread.sleep(5000);
	}
	
	public void tear_down()
	{
		//driver.close();
		driver.quit();
	}

}
