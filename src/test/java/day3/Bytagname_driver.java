package day3;
/*Let’s say we want to find all the links present on google.com. 
 * The html tag which is used for link is “a” (without double quotes). 
 * So, to find multiple elements we need to use findElements method instead of findElement.
 */
public class Bytagname_driver {
	public static void main(String[] args) {
		Bytagname obj = new Bytagname();
		String URL = "http://google.com/";
		/*obj.launchbrowser(URL);
		obj.getlinktext();
		obj.tear_down();*/
		//OR
		obj.common_method(URL);
	}

		
	}


