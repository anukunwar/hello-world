package day3july;

public class Learn_dropdown_driver {
	public static void main(String[] args) throws InterruptedException {
		Learn_Dropdown obj = new Learn_Dropdown();
		obj.launchURL("https://www.indiaproperties.com/");
		//obj.selectcity_bytext("Bangalore");//select by visible text
		
		//obj.selectcity_byvalue("11");//Select by value
		
		obj.selectcity_byindex(1);
		
		//obj.getdropdownList();//Get all text from the dropdown
		
		Thread.sleep(5000);
		//obj.tear_down();
	}
}
