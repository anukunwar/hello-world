package day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnionbankClass1 {
	public static void main(String args[]){
		String a,b,c;
		int d;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Amount :");
		a=scanner.next();
		System.out.println("Enter the Interest rate:");
		b=scanner.next();
		System.out.println("Enter the Periods:");
		c=scanner.next();
		System.out.println("Enter the Expected value:");
		d=scanner.nextInt();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		driver.manage().window().maximize();
		 
		WebElement amount = driver.findElement(By.id("loanamount"));
		amount.sendKeys(a);
		WebElement rate = driver.findElement(By.name("rate"));
		rate.sendKeys(b);
		WebElement time = driver.findElement(By.name("pmonths"));
		time.sendKeys(c);
		WebElement calculate = driver.findElement(By.name("Button1"));
		calculate.click();
		String emi = driver.findElement(By.id("EMI")).getAttribute("value");
		System.out.println("Actual Emi value is:"+emi);
		System.out.println("Expected value is:"+d);
		if(emi.equals(d))
			System.out.println("TestCase has Passed");
		else
			System.out.println("TestCase has Failed");
		
		}

}
