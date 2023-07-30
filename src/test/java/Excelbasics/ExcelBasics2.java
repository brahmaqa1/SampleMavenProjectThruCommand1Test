package Excelbasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBasics2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//		Xl>  Wb> Wsh ->  rows and Cells

		String fname= "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\TestData.xlsx";
		FileInputStream  fis = new FileInputStream(fname);
		Workbook wb = WorkbookFactory.create(fis);
		// EncryptedDocumentException, IOException 

		Sheet sh =wb.getSheet("Sheet1");

		// get rows cnt
		int rowsCnt= sh.getLastRowNum();
		System.out.println("rowsCnt="+rowsCnt);
		// rowsCnt=8  but actual rows cnt= 9

		// get columns cnt 
		int colsCnt= sh.getRow(0).getLastCellNum();
		System.out.println("colsCnt="+colsCnt);
		// colsCnt=7 avtual cols cnt -= 7


		// Read data from row, cell -  0,0  -ProductName
//		String data00 = sh.getRow(0).getCell(0).toString();
		String data00 = sh.getRow(0).getCell(0).toString();
		System.out.println("data00="+data00);// ProductName


		// Read data from row, cell -  0,1 --Qty
		String data01 =sh.getRow(0).getCell(1).toString();
		System.out.println("data01="+data01);//-Qty



		// HW Read data from 0,2 - Price

		// Read data from 1,0
		String data10= sh.getRow(1).getCell(0).toString();
		System.out.println("data10="+data10);//data10=Lux


		// Read data from 1,1	
		String data11= sh.getRow(1).getCell(1).toString();
		System.out.println("data11="+data11);//data11=4.0



		// Read data from 1,2 cell
		String data12= sh.getRow(1).getCell(2).toString();
		System.out.println("data12="+data12);//data12=200.0

		// HW Read data from  3,1 cell
		
		// HW Read data from  3,2 cell
		
		
		// HW Read data from  3,3 cell
		
			
		// HW read  all rowsdata - from first column?
//		0,0  0,1 0,2

		//HW  Read all rows  from 2nd columns ?
		// 0,1  1,1  2,1 , 3,1   

		/// Hw Develop some generic methods to get rows cnt
		//HW Develop some generic methods to get columns cnt




	}

}
