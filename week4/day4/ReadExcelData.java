package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {

		// Step:1 set the path of the excel file
		XSSFWorkbook book = new XSSFWorkbook("./data/Lead.xlsx");
		// Step:2 From excelbook identify the sheet

		XSSFSheet sheet = book.getSheetAt(0);// index 0 represents the first sheet
		// Step:3 identify the row to read the data
		XSSFRow row = sheet.getRow(0);
		// Step:4 identify the cell
		XSSFCell cell = row.getCell(2); // first colummn (1,0) -->2nd row first col
		// book -->sheet-->row-->cell-->read Data from the respective cell
		String CellValue = cell.getStringCellValue();
		System.out.println(CellValue);
		// to get the size of the row

		int rowCount = sheet.getLastRowNum(); // returns size of the rows having data
		// by default it eliminates the first row of the excel sheet

		int colCount = row.getLastCellNum();// returns the size of the column having data
		for (int i = 1; i <= rowCount; i++) {// outer loop for the rows
			for (int j = 0; j < colCount; j++) { // inner loop for the columns
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);

			}
		}

	}

}
