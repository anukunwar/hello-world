package day3july;

public class Student {

	String name ;
	int phy ;
	int math;
	int chem;
	int total;
	static String school = "St.joseph";
	
	public void add()
	{
		total=phy+math+chem;
		System.out.println("The total is "+ total);
	}
	
	public static void getschoolDetails()
	{
		System.out.println("THe SchoolName is St.Joseph and located in Residency Road");
	}
	

}
