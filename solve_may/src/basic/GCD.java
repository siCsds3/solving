package basic;

import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���: ");
		int a_init = s.nextInt();
		int b_init = s.nextInt();
		
		int temp=0;
		if(a_init<b_init) {
			temp = a_init;
			a_init = b_init;
			b_init = temp;
		}
		
		int a = a_init, b = b_init; //�� ����
		
		int gcd=1,lcm=0; //�ִ�����, �ּҰ����
		int r=0; //������
		
		while(true) {
			
			System.out.println("before_a,b: "+a+" "+b);
			r = a%b;
			a = b;
			b = r;
			System.out.println("after_a,b: "+a+" "+b);
			
			if(b==0) {
				System.out.println("b: "+b);
				gcd = a;
				break; //�ִ����� ����	
			}
		}
		
		lcm = a_init * b_init / gcd;
		
		System.out.println("answer: "+gcd+" "+lcm);
		s.close();
	}

}
