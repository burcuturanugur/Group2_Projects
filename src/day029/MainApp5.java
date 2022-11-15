package day029;

public class MainApp5 {
    public static void main(String[] args) {
    Araba a1=new Araba();
    yarisAraba1 ya1=new yarisAraba1();
    Araba ya2=new yarisAraba2();

    a1.ilerle();
    ya1.ilerle();
    ya2.ilerle();

    ya1.turbo();
        ((yarisAraba2)ya2).turbo();

    }
}
