package day2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_bing {

	public static void main(String[] args)  {
		//Connection between the console and code
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the search word");
		//Get the string from the console
		String searchword = scan.next();
		//Close connection
		scan.close();
		
		FirefoxDriver driver =  new FirefoxDriver();
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
