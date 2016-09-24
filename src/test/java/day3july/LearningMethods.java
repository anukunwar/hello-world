package day3july;

public class LearningMethods {	
	public static void main(String[] args) {
		LearningMethods obj = new LearningMethods();
		obj.add();
		obj.add(50, 60);
		obj.add(20, "Ramesh");
		int result = obj.add(100, 200, 300);
		System.out.println(result);
	}
	public void add()
	{
		System.out.println(10+20+30);
	}
	
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}
	
	public void add(int x, String y)
	{
		System.out.println(x+y);//will do the concatenation.
	}
	
	public int add(int x, int y , int z)
	{
		int t = x+y+z;
		return t ;
	}
	
	
	
	

}
