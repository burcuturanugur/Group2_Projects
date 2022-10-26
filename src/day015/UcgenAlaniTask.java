package day015;

import java.util.Scanner;

public class UcgenAlaniTask {
    public static void main(String[] args) {

        //Task 1: Kullanıcıdan bir geometrik şeklin iç açı (3 adet) değerlerini alınız. Verilen açılara göre;
        // "Bu şekil bir üçgendir", "Bu şekil bir üçgen değildir" mesajı veren Java programını yazınız.

       Scanner input = new Scanner(System.in);
        System.out.print("Birinci açıyı giriniz: ");
        int aci1=input.nextInt();
        System.out.print("İkinci açıyı giriniz: ");
        int aci2=input.nextInt();
        System.out.print("Üçüncü açıyı giriniz: ");
        int aci3=input.nextInt();

        if (aci1+aci2+aci3==180){
            System.out.println("Bu şekil bir üçgendir. ");
        }else {
            System.out.println("Bu şekil bir üçgen değildir. ");
        }

 /*       Scanner input = new Scanner(System.in);
        System.out.print("Lütfen açıyı giriniz: ");
        int aci=input.nextInt();
        int sonuc=0;


        switch (aci) {
            case 1:
                System.out.println("Birinci açıyı giriniz: ");
                int aci1=input.nextInt();
                System.out.println("İkinci açıyı giriniz: ");
                int aci2=input.nextInt();
                System.out.println("Üçüncü açıyı giriniz: ");
                int aci3=input.nextInt();
                sonuc=aci1+aci2+aci3;
                if (sonuc==180){
                    System.out.println("Bu şekil bir üçgendir.");
                }else {
                    System.out.println("Bu şekil bir üçgen değildir. ");
                }

                break;
                }
*/



    }
}
