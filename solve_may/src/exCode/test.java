package exCode;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 보편적으로 소수 찾는 함수
	boolean prime(int n) {
		
		if(n<2) return false;
		
		for(int i=2; i<n-1; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

}
