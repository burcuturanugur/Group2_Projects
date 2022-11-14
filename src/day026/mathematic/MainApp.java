package day026.mathematic;

public class MainApp {
    public static void main(String[] args) {
        int toplam = Islem.topla(5, 7);
        System.out.println("Toplam= " +toplam);

        System.out.println("Çarpım = " +Islem.carp(5,7));

        short b1=5; //Short ve byte yazdığımızda int e gider. Long ise double'a gider çünkü long intten geniş
        // doubledan küçüktür. Derleyici çalışma zamanında hangisini çalıştırması gerektiğini biliyor.

        short b2=7;
        Islem.topla(b1,b2);

    }
}
