package day4july;

public class LearnContructor {
	int x;
	int y ;
	
	public LearnContructor()
	{
		x=10;
		y=20;
	}
	
	public LearnContructor(int a, int b)
	{
		x=a;
		y=b;
	}
	
	public void add()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
	//	LearnContructor obj = new LearnContructor();
		LearnContructor obj = new LearnContructor(50,60);
		
		obj.add();
	}
	
	/*public LearnContructor()
	{
		System.out.println("Establish connection to the server and DB");
	}
	
	public void searchtable(String query)
	{
		System.out.println("Enter some query to get data");
		System.out.println(query);
	}

	public static void main(String[] args) {
		LearnContructor obj = new LearnContructor();
	
	//	obj.searchtable("select * from employees");
	}*/
}
