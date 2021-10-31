import java.util.Scanner;

public class trycatch {
	static void checkAge(int age) { 
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
		} else {
			System.out.println("Access granted - You are old enough!"); 
		}
	} 
		 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre Age:");
		int age= sc.nextInt();
		trycatch result= new trycatch();
		trycatch.checkAge(age); 
	} 
}