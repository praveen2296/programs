package com.selenium.tests;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import jxl.read.biff.BiffException;

import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class Excel_Reading_Writing {


public static void main(String[] args) 
	      throws BiffException, IOException, WriteException
	   {
		//Writing into excel
	
		  //Creating a new workbook
	      WritableWorkbook wworkbook = Workbook.createWorkbook(new File("C:\\Users\\Visalakshi\\Desktop\\test.xls"));
	      
	      // Creating the new Sheet
	      WritableSheet wsheet = wworkbook.createSheet("MyFirstSheet", 0);
	      
	      //Create Cells with contents of different data types. 
	      Label label = new Label(0, 0, "Vasudev");
	      Number number = new Number(1, 0, 28);
	      
	      //Add the created Cells to the sheet
	      wsheet.addCell(label);
	      wsheet.addCell(number);
	     
	      //Write and close the workbook
	      wworkbook.write();
	      wworkbook.close();

	      //Reading the same file
	      Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\Visalakshi\\Desktop\\test.xls"));
	      
	      //Getting the sheet
	      Sheet sheet = workbook.getSheet(0);
	      
	      //Getting the cells and printing them
	      Cell cell1 = sheet.getCell(0, 0);
	      System.out.println(cell1.getContents());
	      Cell cell2 = sheet.getCell(1, 0);
	      System.out.println(cell2.getContents());
	     
	      //Closing the work book
	      workbook.close();
	   }
	}