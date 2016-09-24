package day7;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngIntro11 {
	@BeforeMethod
	 public void login(){
		System.out.println("Login into a system");
	}
	@Test()
	void checkMail(){
		System.out.println("Check mail");
	}
	@Test
	void sendMail(){
		System.out.println("Send mail");
	}
	@AfterMethod
	void logout(){
		System.out.println("Logout");
	}

}

