package day050;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //COLLECTIONS


        //SEZGİSEL ALGORİTMALAR

        ArrayList liste=new ArrayList();
        liste.add("Ahmet");
        liste.add("Osman");
        liste.add("Cengiz");
        //Temel tipler kullanılmaz normal şartlarda.add() içine object ekliyoruz.
        liste.add(5);
        liste.add(new Scanner(System.in));
        //Burda istediğimiz gibi her şey verebiliyoruz add içine çünkü object olarak tanımladık.

        String str=(String) liste.get(0);//(String yazmasak kabul etmezdi) (String) yazarak kutudan çıkarma işlemi yapmış oluyoruz.
        System.out.println(str.toUpperCase());


       // System.out.println(" Size: " +liste.size());
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

    }
}
