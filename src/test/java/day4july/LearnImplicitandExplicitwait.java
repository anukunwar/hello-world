package day4july;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnImplicitandExplicitwait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.bigbasket.com/choose-city/?next=/");
		driver.findElement(By.id("skip_explore")).click();
		driver.findElement(By.id("id_q")).sendKeys("Orange");
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[id = 'uiv2-autosearch-list'] li a")));
		driver.findElement(By.cssSelector("ul[id = 'uiv2-autosearch-list'] li a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		driver.findElement(By.linkText("Gmail")).click();
		driver.close();
	}

}




