package mukOt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='u_0_3']")).sendKeys("Learning");
		WebElement rdDay = driver.findElement(By.xpath("//select[@ id='day']"));
		Select sc1=new Select(rdDay);
		sc1.selectByVisibleText("5");
		WebElement rdMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select sc2=new Select(rdMonth);
		sc2.selectByIndex(4);
		WebElement rdYear = driver.findElement(By.xpath("//select[@id='year']"));
		Select sc3=new Select(rdYear);
		sc3.selectByValue("1990");
		driver.findElement(By.xpath("//input[@id='u_0_e']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_j']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/a")).click();
		driver.navigate().back();
	}

}
