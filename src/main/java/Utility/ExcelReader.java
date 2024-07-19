package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass{
	static XSSFWorkbook workbook;
	//static XSSFSheet sheet;
	public List<Map<String, String>> getAllSheetTestData(String excelsheetPath, String SheetName) throws IOException
	{
		try {
			FileInputStream fis = new FileInputStream(excelsheetPath);
			workbook= new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet = workbook.getSheet(SheetName);
		int rowCount = sheet.getLastRowNum();
		
		List<Map<String, String>> rowTestData = new ArrayList<Map<String, String>>();
		
		for(int i=1; i<=rowCount ; i++)
		{
			int cellCount = sheet.getRow(0).getLastCellNum();
			LinkedHashMap<String, String> columnTestData = new LinkedHashMap<String, String>();
			for(int j=0; j<cellCount ; j++)
			{
				String columnHeading = sheet.getRow(0).getCell(j).getStringCellValue();
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				columnTestData.put(columnHeading, cellValue);
			}
			
			rowTestData.add(columnTestData);
		}
		
		return rowTestData;
	}
}
