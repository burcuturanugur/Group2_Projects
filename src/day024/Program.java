package day024;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Kopek k1=new Kopek();
       /* k1 = {
            "cinsi" : "",
            "yasi" : 0 ,
            "agirlik" : 0.0
        }*/


        //Aynı package içinde olduklarından import etmeden kopek nesnesini kullanabiliyoruz
        //Object sınıfı: Oluşturulan (tasarlanan) veya tasarlayacağımız ne kadar sınıf var ise hepsi ata.sınıf
        // object'ten kalıtım yoluyla oluşmaktadır.

        //Bunlar durum belirten yapılardır.Sınıf daha üst bir yapıdır. Sınıfın bazı üyeleri vardır. Sınıfın üyeleri
        //metodlardan oluşur.

        k1.cinsi="Kangal";
        k1.yasi=3;
        k1.agirligi=11.1;

        k1.bilgiGoster();

        //System.out.printf(" Cinsi : %s [Yaşı : %d - Ağırlığı : %5.1f Kg.]",k1.cinsi,k1.yasi,k1.agirligi);
        //Bnular işlemi gereksiz yere uzatır

        System.out.println();
        Kopek k2=new Kopek();
        k2.cinsi="Doberman";
        k2.yasi=1;
        k2.agirligi=3.5;

       // System.out.printf(" Cinsi : %s [Yaşı : %d - Ağırlığı : %5.1f Kg.]",k2.cinsi,k2.yasi,k2.agirligi);

        //Nesnelerin özelliklerine nokta operatörüyle erişiyoruz.
        //

        k2.bilgiGoster();

        System.out.println();
        Car c1 = new Car();
        c1.renk = "mavişim";
        c1.bilgiCar();


    }
}
