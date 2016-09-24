package day3july;

public class Student_obj1 {

	public static void main(String[] args) {
		//Enter ramesh student details
		
		Student ramesh = new Student();
		
		ramesh.chem =90;
		ramesh.math= 91;
		ramesh.phy=92;
		ramesh.name= "Ramesh";
		System.out.println(ramesh.name+"  "+ramesh.phy+"  "+ramesh.math+ "  "+ramesh.chem);
		ramesh.add();
		//System.out.println(ramesh.school);
		System.out.println(Student.school);
		Student.getschoolDetails();
	//ramesh.school = "St.Antony's";
		
	/*	System.out.println(Student.school);
		Student.getschoolDetails();*/
		
		Student Dinesh = new Student();
		Dinesh.name = "Dinesh";
		Dinesh.chem = 80;
		Dinesh.phy= 81;
		Dinesh.math = 82;
		System.out.println(Dinesh.name+"  "+Dinesh.phy+"  "+Dinesh.math+ "  "+Dinesh.chem);
		Dinesh.add();
		//System.out.println(Dinesh.school);
		System.out.println(Student.school);
		Student.getschoolDetails();

	}

}
