package Exceptions;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class example1 {
	public static void main(String[] args) {
		readFile("C:/Users/Sathisha Narayana/Desktop/example.txt");
	
}

	
	private static void readFile(String filePath) {
		
	//String filePath = "";
		try {
			FileInputStream fis = new FileInputStream(filePath);
			System.out.println("File found start reading");
			int i = fis.read();
			while(i!=-1) {
				System.out.print((char)i);
				i = fis.read();
				
			}
			System.out.println();
			System.out.println("Finished reading");
			fis.close();
			System.out.println("file closed");
		}catch(FileNotFoundException ex) {
			System.out.println(ex);
			ex.getMessage();
			//ex.printStackTrace();
		}catch(IOException ex) {
			System.out.println("cannot read the file"); }
	}

	
}
