package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import org.apache.poi.hssf.usermodel.examples.CellTypes;




public class Excelutil {
	
	static Object[][] data=null;

	public static Object[][] getData()
	{
		
		
			try {
				java.io.FileInputStream fin = new java.io.FileInputStream("//Users//Amit//Desktop//monika.xls");
				XSSFWorkbook book = new XSSFWorkbook(fin);
				XSSFSheet sheet = book.getSheetAt(0);
				int numberOfRows = sheet.getLastRowNum();
				data = new Object[numberOfRows][2];
				Row topRow = sheet.getRow(0);
				sheet.removeRow(topRow);
				Iterator<Row> rows = sheet.iterator();
				int i = 0;
				while(rows.hasNext())
				{
					int j = 0;
					Row row = rows.next();
					Iterator<Cell> cells = row.cellIterator();
					while(cells.hasNext())
					{
						Cell cell = cells.next();
						data[i][j] = cell.getStringCellValue();
						j++;
					}
					i++;
				}
				
				return data;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

	}

