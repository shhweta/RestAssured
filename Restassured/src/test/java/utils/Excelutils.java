package utils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet ;

	public Excelutils(String excelpath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet("Sheet1");

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	
}


//public static void main (String[] args) {
//	getRowcount();
//	getsheetdata();
//
//}

public static void getsheetdata(int rowNum, int colNum)  {


	DataFormatter formatter = new DataFormatter();
	Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));

	//String value = sheet.getRow(1).getCell(0).getStringCellValue();
	System.out.println(value);

}





public static void getRowcount()  {

	int row= sheet.getPhysicalNumberOfRows();
	System.out.println("No of rows "+row);


}

}
