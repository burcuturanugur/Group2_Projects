package day015;

import java.util.Scanner;

public class AlanveCevreHesaplamaTask {
    public static void main(String[] args) {

        //Task 2:
        //Alan ve Çevre Hesaplama
        //1. Kare
        //2. Daire
        //Seçiminiz:
        //
        //Yukarıdaki menüyü tasarlayınız.
        //Gerekli diğer kodlamaları yaparak alan ve çevre sonucunu gösteren Java programını yazınız.


        System.out.println("1. Kare: ");
        System.out.println("2. Daire: ");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
        Scanner input = new Scanner(System.in);
        int secim=input.nextInt();
        boolean kontrol=true;

        switch (secim){
            case 1:
                System.out.print("Lütfen karenin kenar uzunluğunu giriniz: ");
                int kenar=input.nextInt();
                if (kenar<0){
                    kontrol=false;
                    break;
                }
                int alan=kenar*kenar;
                System.out.println("Karenin alanı: " +alan);
                int cevre=4*kenar;
                System.out.println("Karenin çevresi: " +cevre);
                break;

            case 2:
                System.out.print("Lütfen dairenin yarıçap uzunluğunu giriniz: ");
                double yaricap=input.nextDouble();
                if (yaricap<0){
                    kontrol=false;
                    break;
                }
                double daireAlani=Math.PI*yaricap*yaricap;
                System.out.println("Dairenin alanı: " +daireAlani);
                double daireCevresi=2*Math.PI*yaricap;
                System.out.println("Dairenin çevresi: " +daireCevresi);
                break;

            default:
                System.out.println("Yanlış seçim yaptınız.");
        }
        if (kontrol==false){
            System.out.println("Negatif değer giremezsiniz.");
        }

    }
}
