package saengcoStartJava;

public class Code80 {
	public static void ex() {
		int i = 0;//i 선언, 이 메소드 안에서만 유효한 지역변수
	}
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			//여기서 i를 또 선언, 지역변수 만들기2
			ex();
			System.out.println(i);
		}
	}
}