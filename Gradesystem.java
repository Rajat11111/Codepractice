package octra;

import java.util.Scanner;

public class Gradesystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char operator = sc.next().charAt(0);
		if (operator=='A'){
			System.out.println("Excellent");
		}
		else if (operator=='B'){
			System.out.println("Good");
			
			
		}
		else if(operator=='C'){
			System.out.println("Average");
			
			
		}
		else if(operator=='D'){
			System.out.println("Defecient");
		}
		else if(operator=='F'){
			System.out.println("failing");
		}

	}

}
