package saengcoStartJava;
 
class C {
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
        this.setOprands(left, right);
        System.out.println("setOprands(int left, int right, int third)");
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
  
public class Code91 {
      
    public static void main(String[] args) {
          
        C c1 = new C();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}