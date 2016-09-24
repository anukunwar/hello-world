package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleClass {
	WebDriver driver;
	void OpenBrowser(String url){
		 driver = new FirefoxDriver();
		// driver.get("http://google.com/");
		 driver.get(url);//http:www.google.com/
		 driver.manage().window().maximize();
	}
	void GetAllLinks(){
		 List<WebElement> list = driver.findElements(By.tagName("a"));
		 int size = list.size();
		 System.out.println("Total Number of Element in the List:"+size);
		 for(WebElement wc:list){
			 System.out.println(wc.getText());
		 }
		 for(int i=0;i>=size;i++){
			 System.out.println(list.get(i).getText());
		 }
		 
	}
	void TearDown(){
		//driver.close();
	}
	void CommonMethod(String url){
	  OpenBrowser(url);
	  GetAllLinks();
	  TearDown();
	  }

}

