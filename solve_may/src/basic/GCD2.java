package basic;

import java.util.*;

public class GCD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,gcd;
		
		for(int i=0;i<n;i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			gcd = GCD_answer.gcd(a, b);
			
			System.out.println(a*b/gcd);
			
		}
		
		sc.close();
		
	}

}
