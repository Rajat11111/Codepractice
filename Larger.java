package octra;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		int count = 0;
		int large = 0;
		while(count<numb){
			large = sc.nextInt();
			count++;
			if (large > count){
				System.out.println(large);
			}
			
		}
	
		

	}

}
