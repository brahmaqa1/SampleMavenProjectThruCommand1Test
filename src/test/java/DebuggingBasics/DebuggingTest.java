package DebuggingBasics;

public class DebuggingTest {

	public static void main(String[] args) {
		System.out.println("hi ");
		String pwd="mypwd";
		int a=10;
		int b=20;
		int c= a+b;// 10 + 20 ==30
		// c= 30
		System.out.println("Testing from main="+ c);
		
		// call add () from test class
		 test  t = new test();
		 
		 t.add();
		 
		 t.sub();
		 t.mul();
		 
		 System.out.println("Testing from debug expression windows");


	}

}
