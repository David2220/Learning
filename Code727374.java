package saengcoStartJava;

class Calculator{
    int left, right;//left, right변수 선언
    //객체 전역에서 접근가능
      
    public void setOprands(int left, int right){
    	//()parameter/매개변수<다른 곳에서 접근 못함, 밑의 left, right에 담긴 값을 보냄
        this.left = left;
        this.right = right;
      //위의 int left, right에 담기도록 하는 this.left, right
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
        //class내용 맨 처음인 int left, right가 바로 위의 this."들
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
} //객체를 생성하기 위한 설계도: class내부  

public class Code727374 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        //new붙어있는거: 객체->c1이란 변수에 담기, 변수의 데이터형은 객체명
        //변수c1, 객체 Calculator에 담겨있는 실제내용(밑에내용같은): 인스턴스(instance)
        c1.setOprands(10, 20);//인스턴스 안의 변수는 값(상태)을 가지고 있음
        //이 상태를 통해 이 객체에게 메소드를 호출하는 것이 이 객체가 가진 행위
        //setOprands: 메소드, (10,20):인자
        c1.sum(); //sum, avg: 메소드      
        c1.avg();       
          
        Calculator c2 = new Calculator();//인스턴스 또 생성
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }
  
}