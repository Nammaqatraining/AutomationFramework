package com.AutomationFramework.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibraries {

	public static int getNumberOfRows(String fileName, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		return sh.getLastRowNum();
	}
	
	public static int getNumberOfColumns(String fileName, String sheetName, int rowNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		return sh.getRow(rowNum).getLastCellNum();
	}
	
	public static String readCellValue(String fileName, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		return sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	public static void writeValueIntoCell(String fileName, String sheetName, int rowNum, int cellNum, String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		sh.getRow(rowNum).createCell(cellNum).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(fileName);
		wb.write(fos);
		wb.close();
	}
	
	
	public static int getActiveSheetIndex(String fileName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getActiveSheetIndex();
	}
	
	
	public static void setSheetName(String fileName, String originalSheetName, String newSheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		wb.setSheetName(wb.getSheetIndex(originalSheetName), newSheetName);
		FileOutputStream fos = new FileOutputStream(fileName);
		wb.write(fos);
		wb.close();
	}
	
	public static void createSheet(String fileName, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		wb.createSheet(sheetName);
		FileOutputStream fos = new FileOutputStream(fileName);
		wb.write(fos);
		wb.close();
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		//System.out.println(System.getProperty("user.dir")+"\\testData\\testData.xlsx");
		String fileName = System.getProperty("user.dir")+"\\testData\\userListTestData.xlsx";
		String sheetName = "Sheet1";
		
		
		//System.out.println(ExcelLibraries.getNumberOfRows(fileName, sheetName));
		//System.out.println(ExcelLibraries.getNumberOfColumns(fileName, sheetName, 0));
		//System.out.println(ExcelLibraries.readCellValue(fileName, sheetName, 6, 1));
		//ExcelLibraries.writeValueIntoCell(fileName, sheetName, 0, 2, "Status");
		//ExcelLibraries.writeValueIntoCell(fileName, sheetName, 6, 2, "PASS");
		
		//System.out.println(ExcelLibraries.getActiveSheetIndex(fileName));
		
		//ExcelLibraries.setSheetName(fileName, sheetName, "Sheet1");
		//ExcelLibraries.createSheet(fileName, "Sheet2");
		
		int lastRowNum = ExcelLibraries.getNumberOfRows(fileName, sheetName);
		
		for(int i=1;i<=lastRowNum;i++) {
			System.out.println(ExcelLibraries.readCellValue(fileName, sheetName, i, 0));
			System.out.println(ExcelLibraries.readCellValue(fileName, sheetName, i, 1));
			ExcelLibraries.writeValueIntoCell(fileName, sheetName, i, 2, "PASS");
		}
		
		
	}

}
