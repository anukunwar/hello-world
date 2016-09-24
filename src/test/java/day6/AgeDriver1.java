package day6;

public class AgeDriver1 {
	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\Pavilion\\Desktop\\Selenium\\selenium-new\\day6\\day6\\Age.xlsx";
		ExcelReader xl = new ExcelReader(path);
		int totalRow = xl.getrowcount("Sheet1");
		System.out.println(totalRow);
		//int totalcol = xl.getcolumncount("Sheet1", 0);
		for(int i=1;i<=totalRow;i++){
	    String st = xl.readcellvalue("sheet1", i, 1);
		System.out.println(st);
		Double age = Double.parseDouble(st);
		if(age>18.0){
			xl.writecellvalue("Sheet1", i, 2, "Major");
			xl.saveexcel(path);
		}else{
			xl.writecellvalue("Sheet1",i, 2, "Minor");
		xl.saveexcel(path);
		
		}
		
		}
		
	}

}
