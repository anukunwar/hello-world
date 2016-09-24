package day4july;

public class AccessModifer_outsideclass {

	public static void main(String[] args) {
		AccessMoifier_withClass obj = new AccessMoifier_withClass();
		//private stuffs cannot be accessed outside the class
		
		System.out.println(obj.y);
		obj.getdefaultmethod();
		System.out.println(obj.z);
		obj.getprotectedmethod();
		System.out.println(obj.a);
		obj.getpublicmethod();
	}

}

