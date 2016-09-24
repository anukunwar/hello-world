package day3july;

import java.util.Scanner;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		
		//http://www.google.com/ --Gmail
		//http://in.rediff.com/  -- Sign
		
		
		Scanner in = new Scanner(System.in);		
		System.out.println("Enter the URL");
		String URL = in.next();
		System.out.println("Enter the link to be clicked");
		String text = in.next();
		in.close();
		LearningMethodsusingGoogle obj = new LearningMethodsusingGoogle();
		obj.launchURL(URL);
		obj.ClickOnGmailLink(text);
		//obj.tear_down();

	}

}
