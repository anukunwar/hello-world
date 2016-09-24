package day4july;

import java.util.Scanner;

public class GoogleDriver_contructor {
//"http://www.google.com" Gmail
	//http://in.rediff.com/ Sign in
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the browsertype");
		String browser = scan.nextLine();
		System.out.println("Enter the URL");
		String URL = scan.nextLine();
		System.out.println("Enter the link to be clicked");
		String link = scan.nextLine();
		/*LearningMethodsusingGoogle obj = new LearningMethodsusingGoogle();
		obj.ClickOnGmailLink("Gmail");*/
		/*LearningMethodsusingGoogle obj = new LearningMethodsusingGoogle("Chrome");
		obj.ClickOnGmailLink("Gmail");
		Thread.sleep(5000);
		obj.tear_down();*/
		scan.close();
		LearningMethodsusingGoogle obj = new LearningMethodsusingGoogle(browser, URL);
		obj.ClickOnGmailLink(link);
		Thread.sleep(2000);
		obj.tear_down();
	}

}
