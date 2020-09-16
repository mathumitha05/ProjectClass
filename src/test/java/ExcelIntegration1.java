import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration1 {

	public static String getData(int rowno, int cellno) throws IOException {
		System.out.println("hello");
		File file = new File("D:\\Selenium6768\\Excelsheet\\excel.xlsx");
		// System.out.println(file);
		FileInputStream fis = new FileInputStream(file);
		// System.out.println(fis);
		Workbook w = new XSSFWorkbook(fis);
		String name = "";
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		// System.out.println("rowno" +rowno+ "cellno" +cellno+"Type : "+type);
		if (type == 1) {
			name = c.getStringCellValue();
			// System.out.println(name);
		} else if (type == 0) {

			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
				name = sf.format(date);
			} else {
				// numeric
				double d = c.getNumericCellValue();
				// typecasting
				Long l = (long) d;
				name = String.valueOf(l);
			}
		}
		return name;
	}

}
