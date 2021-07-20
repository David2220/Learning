package saengcoStartJava;
public class Code92 {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    void A (double arg1){System.out.println("void A(double arg1)");}
    //type 다르게 하면 오류발생
    public static void main(String[] args) {
        Code92 od = new Code92();
        od.A();
        od.A(1);
        od.A(2.5);
        od.A("coding everybody");
    }
}