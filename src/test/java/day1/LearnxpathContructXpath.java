package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnxpathContructXpath {

	public static void main(String[] args) {
		String expected = "2224.44";
		/*Open the
		browser firefox*/
		FirefoxDriver driver = new FirefoxDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//Enter the URL
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
		//Enter the loan amount
		driver.findElement(By.xpath("//input[@name = 'uTime']/../../p[1]/input[1]")).sendKeys("100000");
		//Enter the period
		driver.findElement(By.xpath("//input[@name = 'uTime']")).sendKeys("60");
		//Enter the interest
		driver.findElement(By.xpath("//input[@name = 'uRate']")).sendKeys("12");
		//Click on the calculate button
		//absolute xpath for webelement
		driver.findElement(By.xpath("//table[@class = 'commontable']/tbody/tr[3]/td/p/input")).click();
		
		//Get the emi
		
		//String actual = driver.findElement(By.xpath("//input[@name = 'uEmi']")).getAttribute("value");
		//String actual = driver.findElement(By.xpath("//input[starts-with(@name ,'uE')]")).getAttribute("value");
		String actual = driver.findElement(By.xpath("//input[contains(@name ,'Em')]")).getAttribute("value");
		System.out.println("The Emi is " +actual);
		//Validate
		if (actual.equals(expected))
		{
			System.out.println("The test case has passed");
		}
		else
		{
			System.out.println("The test case has failed");
		}
		//Close the browser
		//driver.close();

	}

}
