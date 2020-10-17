package octra;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int total = 1;
		for (n = n; n==(n^r); n--){
			total = total * n;
			
		}
		//int factorial = (n*(n-1))/(r*(r-1));
		System.out.println(total);
		

	}

}
