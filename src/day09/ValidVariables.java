package day09;

public class ValidVariables {
    public static void main(String[] args) {
        String firstName="Burcu";
        // int 5.Sayi=10; geçersiz
        int sayi5=10;

       /* String dayOfWeek="Monday";
        String 3dGraph="beş"; Sayı ile başlayamaz. dim3Graph olmalı
        int June1997=5;  doğru kullanım
        int mixture#3=7; # yerine _ koyulabilir çünkü #nin farklı bir görevi var
        String week day="one"; boşluk olamaz
        String A$B="random"; doğru kullanım
        String _helloWorld="hi"; doğru kullanım
        boolean true=true;  Javada true anahtar kelimelerden biri olduğu için böylece kullanamayız True olarak
        yazabiliriz
        String Public="Hi"; Küçük harfle yazılsaydı kabul edilmezdi ancak bu kullanımı doğru
        int 1980_s=5;   s_1980; şeklinde kullanımı doğru*/

        String burcuUgur= "Burcu Ugur";
        System.out.println(burcuUgur);

        final double PI_SAYISI=3.14;
        System.out.println(PI_SAYISI);
        // PI_SAYISI=3.0; dersek yapamayız. Final olarak bildirilen PI değişmez bir değişken olmuştur artık.
        //Final kısmında 3.0 olarak tanımlamamız gerekir.







    }
}
