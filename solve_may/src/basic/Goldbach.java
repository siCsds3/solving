package basic;

import java.util.*;

class Structure{
	int n,a,b;
	public Structure(int n,int a, int b) {
		this.n=n; this.a=a; this.b=b;
	}
}
	
class MyArray{
	Vector<Structure> vector = new Vector<>();
	public MyArray() {}
	public void append(Structure s) {
		vector.add(s);
	}
}

public class Goldbach {
	// 기법.
	// 소수 판별은 루트N
	// 범위 내 모든 소수 구하는 문제는 에라토스
	
	
	
	static boolean isPrime(int num) {
		if(num<2) return false;
		for(int i=2;i<num;i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num[] = new int[100000]; // 십만개 가능?
		int index=0;
		
		
		while(true) {// 숫자 입력받는다
			
			num[index] = sc.nextInt();
			
			if(num[index] == 0) {break;}
			index++;
			
		}
		MyArray[] arrays = new MyArray[index];
		
		// 소수는 2부터
		for(int i=0;i<index;i++) {// 숫자 개수. 반복 횟수.
			
			arrays[i] = new MyArray();
			for(int j=2;j<num[i]/2;j++) {// 숫자의 소수 조합 찾기
				// 절반만 찾아도 된다
				
				if(!isPrime(j)) {// 소수가 아니면
					continue;
				}
				// j는 소수
				if(isPrime(num[i]-j)) { // 짝궁도 소수. 출력.
					//System.out.println(num[i] +"="+ j +"+"+ (num[i]-j));
					// 출력 대신에 저장
					arrays[i].append(new Structure(num[i],j,(num[i]-j)));
				}
/*				else {
					System.out.println("Goldbach's conjecture is wrong.");
				}
*/
			}
			
		}// end 모든 숫자 반복 완료
		int max=0; int gap=0, tag=0;
		for(int i=0;i<index;i++) {
			if(arrays[i].vector.size()==1) {// 한 개면 그냥 출력
				System.out.println(arrays[i].vector.get(0).n 
						+"="+ 
						arrays[i].vector.get(0).a +"+"+ 
						arrays[i].vector.get(0).b);				
				
			}else {//여러개면 차이의 최댓값 찾는다
				max=0;
				for(int s=0; s<arrays[i].vector.size();s++) {
					gap = arrays[i].vector.get(s).a-arrays[i].vector.get(s).b;
					
					if(max<gap) {
						max = gap;
						tag = s; // 인덱스도 저장
					}
				}//end for
				// 출력
				System.out.println(arrays[i].vector.get(tag).n 
						+"="+ 
						arrays[i].vector.get(tag).a +"+"+ 
						arrays[i].vector.get(tag).b);	
			}
		}

	}

}
