package GenericUtilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *@author DivyaPrakashAmar
 */
public class ExcelUtility {

	/**
	 *This method is use to read data from excel file
	 *@param sheetName ,take's Sheet name where the data is stored  
	 *@param rowNum , take's excat row number from where it have to fetch the value
	 *@param columnNum ,take's excat cloumn number from where it have to fetch value
	 */
		public String readDataFromExcel(String sheetName, int rowNum, int columnNum) {
	        // Using try-with-resources to automatically close resources
	        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\testing.engineer\\git\\repository3\\Agrovet.Samadhan.Operator\\testData\\SamadhanTestData.xlsx");
	             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

	            // Get the sheet
	            Sheet sheet = workbook.getSheet(sheetName);

	            if (sheet == null) {
	                System.out.println("Sheet " + sheetName + " not found.");
	                return null;
	            }

	            // Get the row
	            Row row = sheet.getRow(rowNum);
	            if (row == null) {
	                System.out.println("Row " + rowNum + " not found.");
	                return null;
	            }

	            // Get the cell
	            Cell cell = row.getCell(columnNum);
	            if (cell == null) {
	                System.out.println("Cell " + columnNum + " not found.");
	                return null;
	            }

	            // Get the value from the cell
	            String value = cell.getStringCellValue();
	            System.out.println("Value from row " + rowNum + ", column " + columnNum + ": " + value);
	            return value;

	        } catch (IOException e) {
	            e.printStackTrace();
	            return null; // Return null if an exception occurs
	        }
	    }
	}

