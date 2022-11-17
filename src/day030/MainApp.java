package day030;

import day030.kutuphanepro.Kitap;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //Encapsulation:Paketleme,saklama,sarmalama,
        //public: Sınıfın içinden sınıfın dışına doğru her yerden ulaşılabilir.
        //protected: Aynı package ve (alt sınıf başka packageta olsa bile )atası olduğu alt sınıflardan erişim sağlanır.
        // <default> : Aynı package içerisinden erişim sağlanır.
        //private: Sadece sınıf içerisinden erişim sağlanır.


        System.out.println("Kitap Giriş Ekranı");
        Scanner input = new Scanner(System.in);
        System.out.println("Kitabın adını giriniz: ");
        String adi=input.nextLine();

        System.out.println("Yazarı: ");
        String yazari=input.nextLine();

        System.out.println("Sayfa Sayısı: ");
        int sayfaSayisi=input.nextInt();

        Kitap kitap=new Kitap(adi,yazari,sayfaSayisi);

        kitap.kaydet();
       // kaydet(kitap);

    }



}
