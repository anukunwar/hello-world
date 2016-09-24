package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learn_CssSelector_Contruct {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
		driver.findElement(By.cssSelector("input[name ='uamount'][class='textbox']")).sendKeys("100000");
		driver.findElement(By.cssSelector("input[name='uTime']")).sendKeys("60");
		driver.findElement(By.cssSelector("input[name = 'uRate']")).sendKeys("12");
		//driver.findElement(By.cssSelector("table[class = 'commontable'] tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) p:nth-child(1) input:nth-child(1)")).click();
		driver.findElement(By.cssSelector("table[class = 'commontable'] tbody tr:nth-child(3) td p input")).click();
		
		//String actual = driver.findElement(By.cssSelector("input[name ='uEmi']")).getAttribute("value");
		//Starts with '^'
		//String actual = driver.findElement(By.cssSelector("input[name ^='uEm']")).getAttribute("value");
		//end-with '$'
		String actual = driver.findElement(By.cssSelector("input[name $='Emi']")).getAttribute("value");
		System.out.println("The result is " +actual);
		
		driver.close();
	}

}
