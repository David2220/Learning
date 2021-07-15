package saengcoStartJava;

public class Code82 {
	static int a = 2;
	public void B() {
		int a = 5;
		System.out.println(a);
		System.out.println(this.a);//this로 전역변수 static int a를 불러옴
	}
	
}