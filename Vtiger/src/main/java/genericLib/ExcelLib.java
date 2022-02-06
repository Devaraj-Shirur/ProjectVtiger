package genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Devaraj Shirur
 *
 */
public class ExcelLib extends Constants  { //ExcelUtility

	
	static File Path = new File(EXCELPATH);

	/**
	 * 
	 * @param sheetName provide the Sheet name where you have test data
	 * @param rowNum provide the row number where you have test data
	 * @param cellNum provide cell number where you have testdata
	 * @return   
	 */

	public static String readStringData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook =null;	
		try {
			FileInputStream fis = new FileInputStream(Path);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();	
	}
	
	// To Get Boolean Values form Excel Library
	/**
	 * 
	 * @param sheetName provide the Sheet name where you have test data
	 * @param rowNum provide the row number where you have test data
	 * @param cellNum provide cell number where you have testdata
	 * @return   
	 */
	
	public static boolean readBooleanData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream(Path);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
		
	}
	
	// To Get Numeric Values form Excel Library
	/**
	 * 
	  * @param sheetName provide the Sheet name where you have test data
	 * @param rowNum provide the row number where you have test data
	 * @param cellNum provide cell number where you have testdata
	 * @return   
	 */
	
	public static double readNumericData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream(Path);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
	}
	
	// To Get Date form Excel Library
	/**
	 * 
	  * @param sheetName provide the Sheet name where you have test data
	 * @param rowNum provide the row number where you have test data
	 * @param cellNum provide cell number where you have testdata
	 * @return   
	 */
	
	public static Date readeDate(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream(Path);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getDateCellValue();
		
	}



}
