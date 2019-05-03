package basic;

import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요: ");
		int a_init = s.nextInt();
		int b_init = s.nextInt();
		
		int temp=0;
		if(a_init<b_init) {
			temp = a_init;
			a_init = b_init;
			b_init = temp;
		}
		
		int a = a_init, b = b_init; //값 복제
		
		int gcd=1,lcm=0; //최대공약수, 최소공배수
		int r=0; //나머지
		
		while(true) {
			
			System.out.println("before_a,b: "+a+" "+b);
			r = a%b;
			a = b;
			b = r;
			System.out.println("after_a,b: "+a+" "+b);
			
			if(b==0) {
				System.out.println("b: "+b);
				gcd = a;
				break; //최대공약수 구함	
			}
		}
		
		lcm = a_init * b_init / gcd;
		
		System.out.println("answer: "+gcd+" "+lcm);
		s.close();
	}

}
