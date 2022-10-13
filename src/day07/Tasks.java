package day07;

public class Tasks {
    public static void main(String[] args) {
        //Benim adım Burcu ve 26 yaşındayım.
        //Önce bu şekliyle ekrana yazdırılacak.Daha sonra isim ve yaş değiştirilip tekrar yazdırılacak.

        /*String metin="Benim adım Burcu ve 26 yaşındayım";
        System.out.println(metin);

        String metin2="Benim adım Arslan ve 25 yaşındayım";
        System.out.println(metin2);*/

        String isim="Burcu";
        int yas=26;
        System.out.println("Benim adım "+isim +" ve " +yas+ " yaşındayım");
        isim="Arslan";
        yas=25;
        System.out.println("Benim adım "+isim +" ve " +yas+" yaşındayım");

        double agirlik=3.4;
        float agirlik2=1.3F;

        boolean buyukMu=5>3;
        System.out.println(buyukMu);

        buyukMu=2>8;
        System.out.println(buyukMu);


        //Char veri tipi tek tırnakla gösterilir.
        char ch=0x41;
        int x=0x41;
        System.out.println(x);
        System.out.println(ch);


        int a,b,c;
         a=6;
         b=12;
         c=a+b;
        System.out.println(c);


    }
}
