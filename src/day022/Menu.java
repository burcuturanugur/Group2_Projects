package day022;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int secim=-1;
        do {
            System.out.println("1. Topla");
            System.out.println("2. Çıkar");
            System.out.println("3. Çarp");
            System.out.println("4. Böl");
            System.out.println("5. Kapat");
            System.out.println("Seçim : ");
            secim=new Scanner(System.in).nextInt();


        }while (true);//Bizim istediğimiz bir şey seçilmediğinde döngü tekrar edilecek ta ki bizim istediğimiz şey
        //seçilip breakle çıkılana kadar.
    }
}
