package day4july;
public class CarwaleDriver {

	public static void main(String[] args) throws InterruptedException {
		Carwale carwale = new Carwale();
		carwale.launchURL("http://www.carwale.com/");
		carwale.Getalldropdownvalue();
		//carwale.tear_down();
	}

}

