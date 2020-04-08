package utils;

public class ExcelUtilTest {
	
	public static void main(String[] arg) {
		
		String  excelPath="./data/testcase.xlsx";
		String sheetName = "Sheet1";
		
		Excelutils excel =new Excelutils(excelPath, sheetName);
		
		excel.getRowcount();
		excel.getsheetdata(1, 0);
		excel.getsheetdata(1, 1);
		excel.getsheetdata(1, 2);
		excel.getsheetdata(1, 3);
		
	}

}
