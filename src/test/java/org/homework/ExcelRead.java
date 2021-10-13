package org.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Framework\\target\\ExcelData\\TestData.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s = w.getSheet("greens");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell cell = r.getCell(j);
			System.out.println(cell);
			
		}
		
	}

}
}
