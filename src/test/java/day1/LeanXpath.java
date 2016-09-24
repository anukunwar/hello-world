package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeanXpath {

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
		driver.findElement(By.name("uamount")).sendKeys("100000");
		//Enter the period
		driver.findElement(By.name("uTime")).sendKeys("60");
		//Enter the interest
		driver.findElement(By.name("uRate")).sendKeys("12");
		//Click on the calculate button
		//absolute xpath for webelement
		driver.findElement(By.xpath("html/body/div[1]/div[4]/div[2]/div[2]/table/tbody/tr/td[2]/div/div[2]/div/div/div/div[1]/div/form/table/tbody/tr[3]/td/p/input[1]")).click();
		
		//Get the emi
		
		String actual = driver.findElement(By.name("uEmi")).getAttribute("value");
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
		driver.close();

	}

}

