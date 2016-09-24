package day8;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngIntro11 {
	@BeforeMethod
	 void login(){
		System.out.println("Login into my system");
	}
	@Test
	 void check(){
		System.out.println("check email");
	}
	@AfterMethod
	 void logout(){
		System.out.println("Logout from my system");
	}

}
