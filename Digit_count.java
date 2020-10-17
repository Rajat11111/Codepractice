package octra;

import java.util.Scanner;

public class Digit_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt(); 
		int counter = 0;
		int sum = 0;
		while(inp!=0){
			inp = inp%10;
			sum = sum + 1;
			
			
			}
		
        System.out.println(sum);
        
	}

}
