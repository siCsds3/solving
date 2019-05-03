package exCode;

public class Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 에라토스테네스의 체
		
		int prime[] = new int[100];
		// 소수를 저장
		
		int pn=0; // 소수 개수
		
		boolean check[] = new boolean[101];
		// 지워졌으면=소수이면 true
		// 소수가 아니면 false
		
		int n = 100; // 100까지 범위의 수
		
		for(int i=2; i<=n; i++) {
			
			if(check[i] == false) {
				pn++;
				
				for(int j = i*i; j<=n; j+=i)
					check[j] = true;
				// i의 배수를 지운다는 의미에서
				// i+i 또는 i*2
				// 오버플로우를 대비
			}
		}
		
		
		
		
	}

}
