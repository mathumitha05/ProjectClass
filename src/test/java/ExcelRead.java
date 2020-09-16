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

public class ExcelRead {

	public static void main(String[] args) throws IOException {


		File file = new File("D:\\Selenium6768\\Excelsheet\\excel.xlsx");

		FileInputStream fis = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(fis);
		
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(1);
	    Cell c = r.getCell(1);
	 // To Get Row count

	 		int rowcount = s.getPhysicalNumberOfRows();

	 		System.out.println(rowcount);
	 		// To get Cell count

	 		int cellcount = r.getPhysicalNumberOfCells();
	 		System.out.println(cellcount);

		for(int i =0;i< s.getPhysicalNumberOfRows();i++)
		{
			Row rt = s.getRow(i);
	
			
			for (int j=0;j<rt.getPhysicalNumberOfCells();j++)
			{
				Cell cr = rt.getCell(j);
				int type = cr.getCellType();
			//	System.out.println("i = " + i + " j= "+ j + " type  " + type);
				if(type == 1)
				{
					
					String name = cr.getStringCellValue();
					System.out.println(name);
				}
				else if (type == 0) {
					
					
					if(DateUtil.isCellDateFormatted(cr))
					
					{
						Date date = cr.getDateCellValue();
						SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
						String name = sf.format(date);
                        System.out.println(name);						
					}
					else
					{
						//numeric
					double d = cr.getNumericCellValue();
					//typecasting
					
					Long l =(long) d;
					String name = String.valueOf(l);
					System.out.println(name);
						
					}
					
					
				}
			
			}
		}
		

	}

}
