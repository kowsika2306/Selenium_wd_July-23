package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	// converting main to normal method
	public static String[][] readExcel(String filename) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = row.getLastCellNum();

		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {// outer loop for the rows
			for (int j = 0; j < colCount; j++) { // inner loop for the columns
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				// single data from each cell
				// convert into [row][col]->value [0][0]
				data[i - 1][j] = stringCellValue; // dat[0][0]=first cell value
				// data[1][1]=seccol value
				// data[1][2]=thrd col
			}
		}
		book.close(); // close the xcel book
		return data;

	}

}
