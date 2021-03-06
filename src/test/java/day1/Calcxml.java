package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calcxml {
	public static void main(String[] args) throws InterruptedException {
		String expected = "$2,224.44";
        //	Open the browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get("http://www.calcxml.com/calculators/mortgage-calculator?skn=#top");
		//Identify Amount text box and enter value
		WebElement amount = driver.findElement(By.name("loanAmount"));
		amount.clear();
		amount.sendKeys("100000");
		//Identify Interest text box and enter value
		WebElement interest = driver.findElement(By.id("interestRate"));
		interest.clear();
		interest.sendKeys("12");
		//Identify months text box and enter value
		WebElement months = driver.findElement(By.id("termMonths"));
		months.clear();
		months.sendKeys("60");
		//Identify Submit button and click action
		//WebElement submit = driver.findElement(By.xpath("//button[@ class='btn calculate']"));
		WebElement submit = driver.findElement(By.cssSelector(".btn.calculate"));
		System.out.println("Hello");
		submit.click();
		System.out.println("hi");
		Thread.sleep(1000);
		//Get result from the browser
		//WebElement resultset = driver.findElement(By.className("resultText"));
		WebElement resultset = driver.findElement(By.xpath("//p[@ class='resultText']"));
		String result = resultset.getText();
		System.out.println(result);
		String[] result_array = result.split(" ");
		System.out.println(result_array[5]);
		System.out.println(expected);
		//VAlidate
		if(expected.equals(result_array[5]))
		{
			System.out.println("The testcase has passed");
		}
		else
		{
			System.out.println("The testcase has failed, the actual is "+ result_array[5]);
		}
		//Close the browser
		//driver.close();
		
		
	}


}
