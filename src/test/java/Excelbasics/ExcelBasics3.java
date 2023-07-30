package Excelbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBasics3 {
	
	// getRowsCnt()
	public static int getRowsCnt(String fname, String sheetName) throws EncryptedDocumentException, IOException
	{

		//String fname= "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\TestData.xlsx";
		FileInputStream  fis = new FileInputStream(fname);
		Workbook wb = WorkbookFactory.create(fis);
		// EncryptedDocumentException, IOException 

		//Sheet sh =wb.getSheet("Sheet1");
		Sheet sh =wb.getSheet(sheetName);

		// get rows cnt
		int rowsCnt= sh.getLastRowNum();
		System.out.println("rowsCnt="+rowsCnt);
		// rowsCnt=8  but actual rows cnt= 9
		return rowsCnt;		
	}
	
	public static void isSheetExist(String fname,String sheet) throws EncryptedDocumentException, IOException
	{
		
		//String fname= "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\TestData.xlsx";
				FileInputStream  fis = new FileInputStream(fname);
				Workbook wb = WorkbookFactory.create(fis);
				// EncryptedDocumentException, IOException 

				//Sheet sh =wb.getSheet("Sheet1");
				int indexno= wb.getSheetIndex(sheet);
						////  return index no of given sheet name 
						// sheet1 index no =0
						// sheet 2 index no = 1
						// if sheet name is not there in excel, it returns -1
				System.out.println("Get index no ="+ indexno);	
				if(indexno>=0)
				{
					System.out.println("given sheet="+ sheet + " exist in excel file");
				}
				else{
					System.out.println("given sheet="+ sheet + "is not exist in excel file");
				}
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//		Xl>  Wb> Wsh ->  rows and Cells

		String fname= "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\TestData.xlsx";
//		FileInputStream  fis = new FileInputStream(fname);
//		Workbook wb = WorkbookFactory.create(fis);
//		// EncryptedDocumentException, IOException 
//
//		Sheet sh =wb.getSheet("Sheet1");
//
//		// get rows cnt
//		int rowsCnt= sh.getLastRowNum();
//		System.out.println("rowsCnt="+rowsCnt);
//		// rowsCnt=8  but actual rows cnt= 9
		
		int rcnt= getRowsCnt(fname,"Sheet1");
		System.out.println("rcnt="+rcnt);
		
		
		int  rowscnt2 = getRowsCnt(fname, "CreateUsers");
		System.out.println("rowscnt2="+rowscnt2);//8 


		// gte columns cnt from sheet1

				// gte columns cnt from 'CreateUsers'		

				

				// Develop Reusable Method to Read Data 0,0 from given sheet and given file 
				

		// data00=ProductName

		//  read data from 0,1
				
		// data01=Qty


		//  read data from 0,2
				


		//  read data from 1,0 

			

				//		HW  Read all rows and and cells Data  from excel file ?
				//		Note:  use 2 for loops 
				//		0,0   0,1   0,2
				//		1,0   1,1	1,2
				//		2,0	  2,1   2,2

				//HW Develop generic method to get Get Column no   based on Column name
				//
				//   getColumnNoBasedOnColumnName("ProductName") ;
				//   //  1
				// getColumnNoBasedOnColumnName("Qty") ; //  2 
				//
				// getColumnNoBasedOnColumnName("Price") ; //  3
				//
				// getColumnNoBasedOnColumnName("QtyInvlaidColumn") ; 
		//  -1, Display proper msg "Given column name is not found in sheet".
				//		

		
		isSheetExist( fname,"Sheet1");// 1	
		isSheetExist(fname, "Sheet2");	//2
		isSheetExist(fname, "CreateUsers");//0

		isSheetExist(fname, "CreateUsersInvalid");// -1
		
				

					//  return index no of given sheet name 
					// sheet1 index no =0
					// sheet 2 index no = 1
					// if sheet name is not there in excel, it returns -1
				


	}

}
