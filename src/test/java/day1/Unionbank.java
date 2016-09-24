package day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Unionbank {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Amount : ");
		String n1 = scanner.next();
		System.out.print("Enter the Interest : ");
		String n2 = scanner.next();
		System.out.print("Enter the Periods : ");
		String n3 = scanner.next();
		System.out.print("Enter the Expected amount : ");
		String expecValue = scanner.next();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='loanamount']")).sendKeys(n1);;
		driver.findElement(By.xpath("//input[@id='rate']")).sendKeys(n2);
		driver.findElement(By.xpath("//*[@id='pmonths']")).sendKeys(n3);
		driver.findElement(By.xpath("//input[@id='Button1']")).click();
		Thread.sleep(3000);
		String actualValue = driver.findElement(By.xpath("//input[@id='EMI']")).getAttribute("value");
		System.out.println("Expected Value : "+expecValue);
		System.out.println("Actual EMI : "+actualValue);
		if(expecValue.equals(actualValue))
			System.out.println("This TestCase has passed");
			else
				System.out.println("This TestCase has failed");
		
		
	}

}
