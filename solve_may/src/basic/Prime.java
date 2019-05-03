package basic;

import java.util.*;

public class Prime {
	
	static boolean prime(int n) {
		
		if(n<2) return false;
		// 소수면 1과 자기자신만 약수로 갖는다
		
		for(int i=2; i*i<=n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		int num=0;
		
		for(int i=0; i<n; i++) {
			num = sc.nextInt();
			//소수인지 판별
			if(prime(num))
				count++;
		}
		
		System.out.println(count);
		

	}

}
