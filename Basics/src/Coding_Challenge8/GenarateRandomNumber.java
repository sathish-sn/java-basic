package Coding_Challenge8;
import java.security.*;
public class GenarateRandomNumber {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		for(int i=0; i<100; i++) {
		int num1 = random.nextInt(10);
		System.out.println("num1=" + num1);
		int num2 = random.nextInt(10)+1;
		System.out.println("num2=" + num2);
		}
	}

}
