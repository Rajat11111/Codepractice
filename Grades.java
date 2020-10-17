package octra;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Math = sc.nextInt();
		int Science = sc.nextInt();
		int English = sc.nextInt();
		int Avg = (Math + Science + English)/3;
		
		
		if (Avg>=90 ){
			
			System.out.println("A");
			
			
		}
		else if (Avg > 80){
			System.out.println("B");
		}
		
		 else if (Avg>70 && Avg<=80){
			 
			 System.out.println("c");
			
		}
		
		 else if (Avg>60 && Avg<=70){
			 System.out.println("D");
		 }
		 else if (Avg>50 && Avg<=60){
			 System.out.println("e");
		 }
		 else if (Avg>40 && Avg<=50){
			 System.out.println("F");
		 }
         
	}

}
