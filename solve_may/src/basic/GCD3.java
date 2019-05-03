package basic;

import java.util.*;

public class GCD3 {
	
	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else return gcd(b, a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;//,a=0,b=0;
		int[] num;// = new int[100];
		
		
		for(int c=0;c<n;c++) { // 전체 반복할 계산 횟수
			
			final int index;
			index = sc.nextInt();
			num = new int[index]; //배열 공간 할당
			
			// 숫자 입력받기
			for(int i=0; i<index; i++) {
				num[i] = sc.nextInt();
			}
			
			// gcd 계산하고 누적 구하기
			for(int i=0;i<index;i++) {
				
				for(int j=i+1;j<index;j++) {
					sum += gcd(num[i],num[j]);
				}
			}
			System.out.println(sum);
			sum=0;
			
			
		}
		
	}

}
