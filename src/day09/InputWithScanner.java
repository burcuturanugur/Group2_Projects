package day09;

import java.util.Scanner;

public class InputWithScanner {
    public static void main(String[] args) {
        //Klavyeden girilen iki tamsayının toplamını buldurup, ekrana yazdıran bir java programını yazınız.

        Scanner klavyeGirdisi = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : " );
        int sayi1 = klavyeGirdisi.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int sayi2 = klavyeGirdisi.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("Girilen sayıların toplamı : " +toplam);






    }
}
