package praveen;

import java.util.Scanner;

public class Positivenegative {
	public static void main(String[] args) {
		System.out.print("Enter number :");
		Scanner sc= new Scanner(System.in);
		int inp=sc.nextInt();
		if(inp<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}
		
	}

}
