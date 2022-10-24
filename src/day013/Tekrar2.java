package day013;

public class Tekrar2 {
    public static void main(String[] args) {
        //Öncelik sırası
        //int sonuc=(2+4)*(7-3)/(2+5);
        //System.out.println(sonuc);


        //double x=7/2.0;
        //System.out.println(x); //Sonuç 3.5 olması gerekirken 3.0 oluyor. İki int değerinin işleme sokulduğu yerde
        // sonuç hep int çıkar. Doğru sonuç istiyorsak yazdığımız değerlerden en az birinin double olarak yazılması
        // gerek. Örneğin 7 yerine 7.0 yazmamız gerek.

        /*int k=5;
        int m=2;*/

       // double result=(double) k/m; //Bu şekilde k'nın başına (double) yazarak k'yı cast etmiş olduk.Tam sonuç için
        // iki değerden birini cast etmemiz yeterli.
        //double result= (double)(k/m); //Komple işlemi cast etmeye çalışırsak doğru bir dönüşüm olmaz. Çünkü int bir
        //değeri int bir değere bölme işlemi yapmış oluruz.Sonuç 2.0 çıkar.
        //System.out.println(result);

        //int result=(int) (2+7+1.0); //Sonuç zaten int olduğu için rahatlıkla int ile cast yapabiliyoruz.Cast yapmasak
        // direkt işleme girmez.
        //System.out.println(result);

       /* char ch='A';
        int c=(int)ch;
        System.out.println(c);*/ //A'nın sayısal karşılığı olan 65 sonucu çıkar.

       /* float b=2.5F;
        int result=(int) b;
        System.out.println(result);*/ //sonuç 2.5 olması gerekirken 2 oluyor. Dolayısıyla cast edebiliyoruz ama
        // veri kaybı yaşamış oluyoruz.

        /*int sayi=65;
        System.out.println((char)sayi); *///Cast etmeden de yazdırabiliyoruz çünkü otomatik cast etmiş oluyor.

      /*  double d=(double)4/5;
        System.out.println(d);*/
        //sonuç 0 olur ama otomatik olarak double'a dönüştürerek

        double pi=22d/7; //buradaki d---> double'ın d
        System.out.println(pi);
        System.out.println(Math.PI);
        //Herhangi bir büyüklükteki çemberin çapına oranıdır=Pi

        }

    }
