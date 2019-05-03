package basic;

import java.util.*;

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("세 수를 입력하세요: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int[] answer = new int[4];
		
		answer[0] = (a+b)%c;
		answer[1] = (a%c+b%c)%c;
		answer[2] = (a*b)%c;
		answer[3] = ((a%c) * (b%c))%c;
		
		for(int i=0;i<answer.length;i++)
			System.out.println(answer[i]);
		
		
	}

}
