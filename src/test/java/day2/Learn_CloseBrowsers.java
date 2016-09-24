package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learn_CloseBrowsers {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://in.rediff.com/");
		
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		
		//driver.close();
		//Toclose all the browser opened by selenium webdriver
		//driver.quit();

	}

}
