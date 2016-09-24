package day4july;

public class AccessMoifier_withClass {
	
	private int x =10;
	int y = 20;
	
	protected int z = 30;
	
	public int a = 40;
	
	
	private void getprivatemethod()
	{
		System.out.println("This is a private method");
	}
	
	void getdefaultmethod()
	{
		System.out.println("This is a default method");
	}
	
	protected void getprotectedmethod()
	{
		System.out.println("This is a protected method");
	}
	
	public void getpublicmethod()
	{
		System.out.println("This is a public  method");
	}
	
	public static void main(String[] args) {
		AccessMoifier_withClass obj = new AccessMoifier_withClass();
		System.out.println(obj.x);
		obj.getprivatemethod();
		System.out.println(obj.y);
		obj.getdefaultmethod();
		System.out.println(obj.z);
		obj.getprotectedmethod();
		
		System.out.println(obj.a);
		obj.getpublicmethod();
	}

}

