package day048;

public class MainApp {
    public static void main(String[] args) {
        /*
        1. Keywords: try-catch-finally-throw-throws
        2. Classes: Exception - NullPointerException-ArrayIndexOutOfBoundsException...
        3. Hata Durumları
            a. Errors: Sistem hataları
            b. Exceptions
                1.Checked Exceptions: Compile -Design Time Eceptions
                2.Unchecked Exceptions: Runtime Exceptions

        */

      /*  int[] d={1,2};
        System.out.println(d[5]);*/


        try {
            Kare k=new Kare(-7);
        } catch (LengthException e) {
        e.printStackTrace();
        }

        /*
        1.Geometrik şekillerde uzunluk için
        2.Yetersiz bakiye
        3.Parola,kullanıcı adı
        4.Hatalı iban
        5.hatalı tck no
        6. Aralık dışı değer girilmesi
        7. Stokta ürün bulunmama hatası
        8.

        */


    }
}
