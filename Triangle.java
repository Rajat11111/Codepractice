package octra;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int Triangle = a + b + c;
		if (Triangle==180){
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
