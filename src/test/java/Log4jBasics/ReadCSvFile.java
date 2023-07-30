package Log4jBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSvFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String csfFile= ".\\MyCsvfile.csv";
		
		File f = new File(csfFile);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
//		System.out.println("Line1="+ br.readLine());
//		System.out.println("Line1="+ br.readLine());
		
 String  x="";
		// read all lines
		while((x=br.readLine())!=null)
		{
//			System.out.println("all lines ="+ br.readLine());
			System.out.println("all lines ="+ x);
			String sArr[]  = x.split(",");
			System.out.println("sarr[0]="+ sArr[0]);
			System.out.println("sarr[1]="+ sArr[1]);
			System.out.println("sarr[2]="+ sArr[2]);
			System.out.println("sarr[3]="+ sArr[3]);
			
		}
		
		

	}

}
