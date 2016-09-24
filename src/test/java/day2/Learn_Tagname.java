package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learn_Tagname {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
				FirefoxDriver driver = new FirefoxDriver();
				//maximise
				driver.manage().window().maximize();
				//Get the url
				driver.get("http://www.gmail.com");
				
				//Get total no: if links
				 List<WebElement> link_tags = driver.findElements(By.tagName("a"));
				int size = link_tags.size();
				System.out.println(" The total number of links are "+ size);
				
			/*	WebElement e1 = link_tags.get(0);
				String e1_text = e1.getText();
				System.out.println(e1_text);
				
				WebElement e2 = link_tags.get(1);
				String e2_text = e2.getText();
				System.out.println(e2_text);*/
				
			/*	for(int i=0;i<size;i++)
				{
					WebElement e1 = link_tags.get(i);
					String e1_text = e1.getText();
					System.out.println(e1_text);
				}*/
				
				//learn for each loop
				 
				for(WebElement e : link_tags)
				{
					System.out.println(e.getText());
				}
				Thread.sleep(4000);
				//Close the browser
				driver.close();

	}

}
