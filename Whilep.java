package octra;

import java.util.Scanner;

public class Whilep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		
		while(count<num){
			sc.nextInt();
			count++;
			sum = sum + count;
			
			
		}
		System.out.println(sum);
		

	}

}
