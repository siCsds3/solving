package basic;

import java.util.*;

public class GCD_answer {
	
	public static int gcd(int x, int y) {
		if(y==0)
			return x;
		else return gcd(y,x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = gcd(a,b);
		int l = a*b/g;
		System.out.println(g);
		System.out.println(l);
	}

}
