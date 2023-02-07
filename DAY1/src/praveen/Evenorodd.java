package praveen;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		System.out.print("Enter number :");
		Scanner sc= new Scanner(System.in);
		int inp=sc.nextInt();
		if(inp%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}

	}
}
