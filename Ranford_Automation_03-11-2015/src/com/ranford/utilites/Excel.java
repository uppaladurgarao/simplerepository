package com.ranford.utilites;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
//import jxl.write.WriteException;
//import jxl.write.biff.RowsExceededException;

public class Excel 
{
    public static String folderPath="D:\\sindhu1\\Ranford_Automation_03-11-2015\\TestData\\";
	public static Workbook objWorkbook;
	public static Sheet objSheet;
	public static WritableWorkbook objWritableWorkbook;
	public static WritableSheet objWritableSheet;
	
	//connection setup to excel
	public static void setExcelConnection(String fileName)
	{
	   try {
		   objWorkbook=Workbook.getWorkbook(new File(folderPath+fileName));
	} catch (BiffException | IOException e) {
		e.printStackTrace();
	}	   	   
	}
	
	//get sheet
	public static void selectSheet(String sheetName)
	{
		objSheet=objWorkbook.getSheet(sheetName);
	}

	//get data from sheet
	public static String getCellData(int colNumber,int rowNumber)
	{
		return  objSheet.getCell(colNumber,rowNumber).getContents();
	}
	

	//get Row Count
	public static int getRowCount()
	{
		return  objSheet.getRows();
	}
	
	//Converting Excel to Writable Mode
	public static void setWritableWorkbook(String fileName)
	{
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(new File(folderPath+fileName));
			objWritableWorkbook = Workbook.createWorkbook(fos, objWorkbook);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}	
		
	//Selecting Sheet from workbook
	public static void selectWritableSheet(String SheetName)
	{
		objWritableSheet = objWritableWorkbook.getSheet(SheetName);
	}
	
	//Writing Data into Cell
	public static void writeToCell(int ColNumber, int RowNumber, String Result)
	{
		Label label=new Label(ColNumber, RowNumber, Result);
		try {
			objWritableSheet.addCell(label);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	//Saving Workbook
	public static void saveWorkBook()
	{
		try {
			objWritableWorkbook.write();
			objWritableWorkbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

