package day6;

public class xlDriver1 {
	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\Pavilion\\Desktop\\Selenium\\selenium-new\\day6\\day6\\Age.xlsx";
		ExcelReader xl = new ExcelReader(path);
		int totalRow = xl.getrowcount("Sheet1");
		System.out.println(totalRow);
		int totalCount = xl.getcolumncount("Sheet1", 0);
		System.out.println(totalCount);
		for(int i=0;i<=totalRow;i++){
			for(int j=0;j<totalCount;j++){
				System.out.print(xl.readcellvalue("Sheet1", i, j));
				System.out.print("  ");
				}
			System.out.println();
					}
	}

}
