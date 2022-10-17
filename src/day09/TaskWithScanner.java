package day09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskWithScanner {
    public static void main(String[] args) {
        /* TASK: Klavyeden girilen iki sayının çarpımını bulup, ekrana yazdıran bir Java programı tasarlayınız.
         */
        //ctrl+alt+v kısa yoluyla int sayi1i kısa yoldan yapabiliriz
        Scanner input= new Scanner(System.in);
        System.out.print("Birinci sayı : ");
        int sayi1= input.nextInt();
        System.out.print("İkinci sayı : ");
        int sayi2= input.nextInt();
        int carpim= sayi2*sayi1;
        System.out.println("Girilen sayıların çarpımı: " +carpim);




    }
}
