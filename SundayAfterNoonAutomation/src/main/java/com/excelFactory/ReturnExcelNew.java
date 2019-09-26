package com.excelFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class ReturnExcelNew {
	

	
	String url;
	String user;
	String pass;
	
	List<String[]> returnExcel(String directory, String sheetName) {

		// Get Excel
		try {
			// Create our Workbook Object
			Workbook workbook;

			workbook = WorkbookFactory.create(new File(directory));

			// Go to Our Sheet
			assert workbook != null;
			Sheet sheet = workbook.getSheet(sheetName);

			// Create our DataFormatter
			DataFormatter df = new DataFormatter();

			List<String[]> returningValue = StreamSupport.stream(sheet.spliterator(), false)
					 .filter(e -> !df.formatCellValue(e.getCell(0)).equals("URL"))
					.map(row -> new String[] { df.formatCellValue(row.getCell(0)), df.formatCellValue(row.getCell(1)),
							df.formatCellValue(row.getCell(2)) })
					.collect(Collectors.toList());

			workbook.close();
			System.gc();
			return returningValue;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
}
