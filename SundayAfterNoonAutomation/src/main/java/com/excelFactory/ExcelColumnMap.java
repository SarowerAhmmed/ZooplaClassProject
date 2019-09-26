package com.excelFactory;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelColumnMap {

	public static Map<String, String> columnValueMap(String path) throws Throwable
    {
		
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(0);
		Map<String,String> map= new HashMap<>();
		int RowCount= sheet.getPhysicalNumberOfRows();
		
		//System.out.println("Total Rows Number::"+ RowCount); 
		for(int rowindex=1;rowindex<RowCount;rowindex++) {
			Row row=sheet.getRow(rowindex);
			//System.out.println("Total Column Number::"+ row.getPhysicalNumberOfCells());
			if (row!=null) {		
		for(int colmindex=0;colmindex<row.getLastCellNum();colmindex++) {	
			
				Cell cell=row.getCell(colmindex);
				if(cell!=null) {				
					DataFormatter df= new DataFormatter();
					
					map.put(df.formatCellValue(row.getCell(0)),df.formatCellValue(row.getCell(1)));
				}}}}
		return map;	
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		Map<String,String> testData=ExcelColumnMap.columnValueMap("./TestData/ConfigData.xlsx");
		System.out.println(testData.get("URL"));
		System.out.println(testData.get("user"));
		System.out.println(testData.get("pass"));
	
	}

}
