package day014;

public class Task2 {
    public static void main(String[] args) {

        /*
            Önce bunları isimleri ve değerleriyle birlikte ekrana yzadırınız.
            Daha sonra iki değişkenin değerlerini yer değiştirip ekrana tekrar yazdırınız.
         */

    int tamsayi1=5;
    int tamsayi2=10;
        System.out.println("1. sayı " +tamsayi1 + " ve 2. sayı " +tamsayi2);

    int tamsayi=tamsayi1;
    tamsayi1=tamsayi2;
    tamsayi2=tamsayi;
        System.out.println("1. sayı " +tamsayi1 + " ve 2. sayı " + tamsayi2);


    }


}
