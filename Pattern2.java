package octra;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i =0; i<=n; i++){
			int k = 1;
			for (int j=0; j<i; j++){
				System.out.print(k);
				//k = k+1;
			}
			System.out.println();
		}

	}

}
