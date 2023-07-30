package Excelbasics;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBasics1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		String filepath = "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\src\\test\\java\\Excelbasics\\TestData.xlsx";
		File  f =  new File(filepath);
		Workbook  wb  = WorkbookFactory.create(f);
		
//		Sheet wsh = wb.getSheet("sheet1");
		Sheet wsh = wb.getSheet("Sheet1");
		
		// get rows cnt 
		int RowsCnt = wsh.getLastRowNum();//RowsCnt=3
		System.out.println("RowsCnt="+RowsCnt);
		
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "org.apache.poi.ss.usermodel.Sheet.getLastRowNum()" because "wsh" is null
//		at Excelbasics.ExcelBasics1.main(ExcelBasics1.java:23)

		
		// get columns cnt
		int colsCnt= wsh.getRow(0).getLastCellNum();
		System.out.println("colsCnt="+colsCnt);
//		colsCnt=2
		
		wsh.getRow(0).getCell(0);

	}

}
