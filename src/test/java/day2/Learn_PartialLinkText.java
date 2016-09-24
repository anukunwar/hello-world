package day2;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learn_PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		//Open the browser
				FirefoxDriver driver = new FirefoxDriver();
				//maximise
				driver.manage().window().maximize();
				//Get the url
				driver.get("http://www.gmail.com");
				//Click on the sign in using locator LinkText
				driver.findElement(By.partialLinkText("help?")).click();
				
				Thread.sleep(4000);
				//Close the browser
				driver.close();

	}

}
