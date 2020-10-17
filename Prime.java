package octra;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 0;
		int count = num-1; 
		
		while(count<num){
			if (num%count==0){
			System.out.println("Not prime");
			}
			
			count++;
		
				
		   
			
		}

	}

}
