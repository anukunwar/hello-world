package day1;

import org.apache.xmlbeans.impl.schema.SoapEncSchemaTypeSystem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calcxmal1 {
	static String expected = "$2,224.44";

	public static void main(String args[]) throws InterruptedException{
		WebDriver browser = new FirefoxDriver();
		browser.get("http://www.calcxml.com/calculators/mortgage-calculator?skn=#top");
		browser.manage().window().maximize();
		WebElement amount= browser.findElement(By.name("loanAmount"));
		amount.clear();
		amount.sendKeys("100000");
		WebElement interest= browser.findElement(By.id("interestRate"));
		interest.clear();
		interest.sendKeys("12");
		WebElement month = browser.findElement(By.cssSelector("#termMonths"));
		month.clear();
		month.sendKeys("60");
		WebElement submit = browser.findElement(By.xpath("html/body/div[2]/div[2]/a/button"));
		submit.click();
		Thread.sleep(3000);
		String result = browser.findElement(By.className("resultText")).getText();
		System.out.println(result);
		String[] results = result.split(" ");
		String actual_result = results[5];
		System.out.println("Expected result:"+expected);
		System.out.println("Actual result:"+actual_result);
		if(actual_result.equals(expected))
			System.out.println("Testcase has passed");
		else
			System.out.println("Testcase has failed");
		
		
	}
		
		
	

}
