package day025;

import day025.geometriksekiller.Daire;
import day025.geometriksekiller.Kare;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Kare kare1=new Kare();
        kare1.kenar=7;
        //kare1.bilgiGoster();

        Kare kare2=new Kare();
        kare2.kenar=5;

        int toplamAlan= kare1.alanHesapla()+ kare2.alanHesapla();
        int toplamCevre= kare1.cevreHesapla()+ kare2.cevreHesapla();
        System.out.println(toplamAlan);
        System.out.println(toplamCevre);


        Daire d=new Daire();


        //DRY : Dont repeat yourself!!! Kendini tekrar etme!! 1000 tane kare olursa bu yöntemle çok uzun sürer
      /*  int alan=kare1.kenar* kare1.kenar;
        System.out.println("Alan=" +alan);*/
    }
}
