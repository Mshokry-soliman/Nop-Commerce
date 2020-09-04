package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static FileInputStream fis = null;

	public FileInputStream getfileFileInputStream() {
		String filepath = System.getProperty("user.dir") + "/src/test/java/data/UserData.xlsx";
		File srcfile = new File(filepath);

		try {
			fis = new FileInputStream(srcfile);
		} catch (FileNotFoundException e) {

			System.out.println("Test Data file not found : check file path of TestData");
			System.exit(0);
		}
		return fis;
	}

	public Object[][] getExcelData() throws IOException {

		fis = getfileFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int TotalNumberOfRows = (sheet.getLastRowNum() + 1);
		int TotalNumberOFCols = 4;

		String[][] arrayExcelData = new String[TotalNumberOfRows][TotalNumberOFCols];

		for (int i = 0; i < TotalNumberOfRows; i++) {
			for (int j = 0; j < TotalNumberOFCols; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i][j] = row.getCell(j).toString();
			}
		}

		wb.close();
		return arrayExcelData;
	}
}
