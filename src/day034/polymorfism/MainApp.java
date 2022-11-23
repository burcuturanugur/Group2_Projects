package day034.polymorfism;

public class MainApp {
    public static void main(String[] args) {
        /*

        Polimorfizm (Çok biçimlilik):
        abstract class: Soyut sınıflar kendisinden türeyen alt sınıfflara ne yapmaları gerektiğini söyler(alan hesapla cevre hesapla) ama nasıl
        yapmaları gerektiğini(nasıl hesaplayacaklarını) söylemez.
        Kendilerine bırakır.

        */

        Kare kare=new Kare(9);
        System.out.println("Karenin Alanı = "+kare.alanHesapla());
        System.out.println("Karenin çevresi = " +kare.cevreHesapla());

        Sekil sekil=new Daire(7);
        double yaricap=((Daire)sekil).getYaricap();
        System.out.println("Dairenin yarıçapı= "+yaricap);
        Sekil[] sekiller=new Sekil[5];
        //şekil sınıfının nesnesini değil dizi nesnesini oluşturmuş oluyoruz.
        sekiller[0]=new Daire(5);
        sekiller[1]=new Kare(6);
        sekiller[2]=new Dikdortgen(8,12);
        sekiller[3]=new Daire(9);
        sekiller[4]=new Sekil() {
            @Override
            public double alanHesapla() {
                return 100;
            }

            @Override
            public double cevreHesapla() {
                return 50;
            }
        };//ne olduğu belli olmayan alanı 100 çevresi 50 olan bir anonim nesne oluşturmuş oluyoruz.

        for (Sekil s:sekiller) {
            System.out.println("Alan: " +s.alanHesapla());
            System.out.println("Çevre: " +s.cevreHesapla());
            System.out.println();

        }


    }
    public static void sekilInfo(Kare kare){
        System.out.println("-".repeat(20));
        System.out.printf("Alan=%5.2f - Çevre= %5.2f\n",kare.alanHesapla(),kare.cevreHesapla());
        System.out.println("-".repeat(20));
    }
}
