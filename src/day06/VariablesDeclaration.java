package day06;

public class VariablesDeclaration {
    //double PI_SAYISI=3.14;
    public static void main(String[] args) {
        //Dikdörtgenin alan ve çevre hesabını yapan bir Java programı geliştiriniz.
        //Değişken tanımlamalarında Türkç
        //Türkçe karakterleri kullanmayınız: ığüşİö
        //Notasyonlar
        //1.Camel Notasyonu:Metod ve değişken tanımlamalarını yaparız. kisaKenar
        //2.Pascal Notasyonu: Sınıf isimlendirmelerini yaparız. VariableDeclaration
        //3.Snake Notasyonu: PI_SAYISI
        int kisaKenar=7;
        int uzunKenar=11;
        //Çevre hesabı: 2*(Kısa Kenar + Uzun Kenar)
        //Alan Hesabı: Kısa Kenar * Uzun Kenar
        int dikdortgeninCevresi= 2*(kisaKenar+uzunKenar);//statement
        int dikdortgeninAlani = kisaKenar*uzunKenar;

        //Concatenation
        System.out.println("Kısa Kenar:" +kisaKenar);
        System.out.println("Uzun Kenar:" +uzunKenar);
        System.out.println();
        System.out.println("Dikdörtgenin Çevresi= "+dikdortgeninCevresi);
        System.out.println("Dikdörtgenin Alanı= "+dikdortgeninAlani);



    }
}
