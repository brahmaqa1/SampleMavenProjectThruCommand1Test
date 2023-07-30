package Excelbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataFromXssf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\TestData.xlsx";
		


		// create obj for HSSFWorkbook   -class and pass fis ref var
		FileInputStream fis  =  new FileInputStream(xlFile);
		XSSFWorkbook hwb= new XSSFWorkbook(fis);

		// access sheet -
		XSSFSheet sh =  hwb.getSheet("Sheet1");
	

		//   get data from row no =0  cell no =0

		String data00 = sh.getRow(0).getCell(0).toString();
		System.out.println("data00="+data00);

		// HW read data from .xls format file using class- hssfWorkbook


	}

}
