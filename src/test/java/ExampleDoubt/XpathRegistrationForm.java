package ExampleDoubt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathRegistrationForm {
	WebDriver driver;
	public static void main(String[] args) {
		String url="http://demo.automationtesting.in/Register.html";
		XpathRegistrationForm xrf=new XpathRegistrationForm();
	
		xrf.openBrowser(url);
		xrf.registrationForm();
		
	}

	private void registrationForm() {
		driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Preeti");
		driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("Singh");
		driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Btm-2nd phase");
		driver.findElement(By.xpath("//*[text()='Email address*']//following::div[@id='eid']/input")).sendKeys("preeti12345ss@gmail.com");
		driver.findElement(By.xpath("//*[text()='Phone*']//following::div[1]/input")).sendKeys("1234567897");
		driver.findElement(By.xpath("//div[@class='form-group'][5]/div/label[2]/input")).click();
		driver.findElement(By.xpath("//div[@class='form-group'][6]/div/div[2]/input")).click();
		driver.findElement(By.xpath("//div[@class='form-group'][7]/div/multi-select/div")).sendKeys("English");
		WebElement skillsBox = driver.findElement(By.xpath("//*[text()='Skills']//following::div/select[@id='Skills']"));
		Select selectSkill = new Select(skillsBox);
		selectSkill.selectByVisibleText("Java");
		
		WebElement countryBox = driver.findElement(By.xpath("//*[text()='Country*']//following::div/select[@id='countries']"));
		Select selectCountry = new Select(countryBox);
		selectCountry.selectByVisibleText("India");
		
	    WebElement yearBox = driver.findElement(By.xpath("//*[text()='Password']//preceding::select[3]"));
		Select selectYear = new Select(yearBox);
		selectYear.selectByVisibleText("1987");
		
		WebElement monthBox = driver.findElement(By.xpath("//*[text()='Password']//preceding::select[2]"));
		Select selectMonth= new Select(monthBox);
		selectMonth.selectByVisibleText("1");
		
		WebElement dayBox = driver.findElement(By.xpath("//*[text()='Password']//preceding::select[1]"));
		Select selectDay= new Select(dayBox);
		selectDay.selectByVisibleText("2");
		
		driver.findElement(By.xpath("//*[text()='Password']//following::input[1]")).sendKeys("selenium12");
		driver.findElement(By.xpath("//*[text()='Confirm Password']//following::input[1]")).sendKeys("selenium12");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		//driver.w
		
	}

	private void openBrowser(String url) {
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//driver.t
		}

}
