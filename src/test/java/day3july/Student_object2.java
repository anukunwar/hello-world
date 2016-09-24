package day3july;


public class Student_object2 {

	public static void main(String[] args) {
		Student Dinesh = new Student();
		Dinesh.name = "Dinesh";
		Dinesh.chem = 80;
		Dinesh.phy= 81;
		Dinesh.math = 82;
		System.out.println(Dinesh.name+"  "+Dinesh.phy+"  "+Dinesh.math+ "  "+Dinesh.chem);
		Dinesh.add();
	}

}
