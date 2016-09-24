package day3july;

public class AccessiblityofVariableMethods {
	String carmodel ;
	int price ;
	static int wheel;
	
	public void cardetails()
	{
		System.out.println(wheel);
		System.out.println(price);
		System.out.println(carmodel);
	}
	
	
	public static void getwheelinfo()
	{
		System.out.println("The number of wheels are " +wheel);
	}
	

	public static void main(String[] args) {
		
		System.out.println(wheel);
		
		getwheelinfo();
		
		AccessiblityofVariableMethods obj = new AccessiblityofVariableMethods();
		obj.carmodel="Benz";
		obj.price = 8000000;
		
		obj.cardetails();
	}

}

