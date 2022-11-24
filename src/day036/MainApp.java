package day036;

public class MainApp {
    public static void main(String[] args) {
        //Strings - Metin dizeleri
        //basitce bir char dizisidir denilemez.
        //Stringler immutable yani değiştirilemezler


        String str1="Java";
        System.out.println(str1);
        //String s = str1.toUpperCase();
        //Metnin büyük halini geriye döndürüyor. Orjinalini değiştirmiyor.

        str1=str1.toUpperCase();


        System.out.println(str1);
       // System.out.println(s);

    }
}
