package quiz;
import java.util.Scanner;

public class SunStrudyQ01 {
	
	//3개의 수 입력받아 최대값과 최소값, 둘의 차(양수) 구하기
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a=0; int b=0;
	        for(int count=1;count<=5;count=count+1) {
	            
	            System.out.print(count+"번째 점수입력: ");
	            int num=sc.nextInt();
	            if(count==1) {
	                a=num;
	                b=num;
	            }
	            if(num>a) {
	                a=num;
	            }
	            if(num<b) {
	                b=num;
	            }
	        }
	        sc.close();
	        System.out.println("최대값: "+a);
	        System.out.println("최소값: "+b);
	        System.out.println("차: "+(a-b));
	    }
	}
