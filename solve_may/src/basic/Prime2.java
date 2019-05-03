package basic;

import java.util.*;

public class Prime2 {
	
/*	static boolean isPrime(int n) {
		
		if(n<2) return false;

		for(int i=2; i*i<=n; i++) {// 루트 n까지만 확인
			if(n%i == 0)
				return false;
		}
		return true;
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // 작은 수
		int n = sc.nextInt(); // 큰 수
		
		// 소수를 저장하는 배열 + 개수
		int prime[] = new int[n];
		int pn=0;
		
		// 인덱스=소수 체크하는 boolean 배열
		boolean check[] = new boolean[n+1]; // true로 초기화?
		// 숫자가 인덱스 임에 주의한다. n+1. outofindex.
//		System.out.println(check[0]);
		
		// n이하의 소수를 찾고 (에라소트테네스)
		for(int i=2; i<=n; i++) {
			
			
//			if(check[i]==false) // 이미 아닌걸 계산할 필요는 없다
//				continue;
			
			// i가 소수인지 판별
			if(check[i] == false) { // i는 소수
				// boolean 배열은 디폴트가 false
				// 범위의 제일 작은 수는 소수라고 했으니까
				
				//check[i] = true; // 이미 기본 true
				prime[pn++] = i; 
				//소수 모으는 배열에 추가
				
				for(int j=i*2; j<=n; j+=i) {
					if(j>n) break;
					check[j] = true;
					// 소수가 아님을 표시
				}
			}			
			// 소수이면 배수 지우기. 소수=true
		}
		
		
		// m이상인 수만 출력한다.
		for(int i=0; i<pn; i++) {
			
			if(prime[i] >= m) {
				System.out.println(prime[i]);
			}
		}
		
		sc.close();
	}

}
