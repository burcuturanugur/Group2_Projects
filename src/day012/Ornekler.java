package day012;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {
        //Mantıksal operatörler için örnekler

        boolean b=!(4>3);
        //System.out.println(b);

        /*
        Klavyeden girilen üç sayının birbirlerine göre büyüklüklerini test ediniz.
        Ortaya çıkan sonuçları &,|,^ ve ! ile işleme sokup ekranda gösteriniz.
        */



       /* Scanner input=new Scanner(System.in);
        int sayi1= input.nextInt();
        System.out.print("Birinci sayıyı giriniz.");
        int sayi2=input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayi3=input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz.");
        if (sayi1>sayi2){
            System.out.println("1. sayı 2. sayıdan büyüktür.");
        }else if (sayi1>sayi3) {
            System.out.println("1. sayı 3. sayıdan büyüktür.");
        } else if (sayi2>sayi1) {
            System.out.println("2. sayı 1. sayıdan büyüktür.");
        }*/
        int n1,n2,n3;
        n1=105;
        n2=75;
        n3=35;
        boolean b1=n1>n2;
        boolean b2=n1>n2;
        boolean b3=n2>n3;
        System.out.println("Durum 1 ve Durum 2" +(b1&b2));



    }
}
