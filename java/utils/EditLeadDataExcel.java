package utils;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EditLeadDataExcel {

	public static String[][] readData(String filename) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");
		XSSFSheet ws = wb.getSheet("EditLead");

		int RowCount = ws.getLastRowNum();
		System.out.println(" No Of Rows: " + RowCount);
		
		int CellCount = ws.getRow(0).getLastCellNum();
		System.out.println(" Cell Count Value is : " + CellCount);
		String[][] Data= new String [RowCount] [CellCount];
		for (int i = 1; i <= RowCount; i++) {
			for (int j = 0; j < CellCount; j++) {
				String ExcelData = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(ExcelData);
				Data[i-1][j]=ExcelData;
			}
		}
		wb.close();
		return Data;
	}

	}