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
		
		
		for(int c=0;c<n;c++) { // ��ü �ݺ��� ��� Ƚ��
			
			final int index;
			index = sc.nextInt();
			num = new int[index]; //�迭 ���� �Ҵ�
			
			// ���� �Է¹ޱ�
			for(int i=0; i<index; i++) {
				num[i] = sc.nextInt();
			}
			
			// gcd ����ϰ� ���� ���ϱ�
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
