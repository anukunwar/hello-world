package day4july;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Bing_com {
	public static void main(String[] args) {
		//Connection between the console and code
		Scanner scan = new Scanner(System.in);	
	System.out.println("Enter the browser in which you would want to open the URL");
	String browser = scan.next();
	System.out.println("Enter the search word");
	//Get the string from the console
	String searchword = scan.next();
	//Close connection
	scan.close();
	WebDriver driver = null;
	if(browser.equalsIgnoreCase("firefox"))
	{
		 driver =  new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Jim\\workspace\\Selenium_WorkSpace\\June_2016\\src\\test\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", "D:/Jim/workspace/Selenium_WorkSpace/June_2016/src/test/resources/IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
	}	
	driver.manage().window().maximize();
	driver.get("http://www.bing.com/");
	//driver.findElement(By.cssSelector("input[id = 'sb_form_q']")).sendKeys("Selenium");
	driver.findElement(By.cssSelector("#sb_form_q")).sendKeys(searchword);
	//driver.findElement(By.cssSelector("input[class='b_searchboxSubmit']")).click();
	driver.findElement(By.cssSelector(".b_searchboxSubmit")).click();
	//String actual = driver.findElement(By.cssSelector("span[class = 'sb_count']")).getText();
	String actual = driver.findElement(By.cssSelector(".sb_count")).getText();
	System.out.println("The number of hits "+actual);
	driver.close();
	}

}

