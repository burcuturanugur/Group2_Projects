package day018;

import java.util.Scanner;

import static day10.task2.alanHesapla;

public class Task1 {
    public static void main(String[] args) {
        /*
        Klavyeden veri okumak üzere aşağıdaki istenilenleri gerçekleştiriniz.
        1.Matematik işlemleri
        2.Alan ve çevre hesaplamaları
        3.Çıkış

        Alt Menü | Matematik İşlemleri
        1. Faktoriyel Hesaplama
        2. Mutlak Değer Alma
        3. Çıkış

        Alt Menü | Alan ve Çevre Hesaplama
        1. Dikdörtgen
        2. Kare
        3. Daire
        4.Çıkış
        * */

         //main static olmasa bu mainde çağıramazdık.



        String secim=showMainMenu().toUpperCase();
       switch (secim){
           case "1":
               String mathSecim=showSubMenuMath().toUpperCase();
               if (mathSecim.equals("1")){
                   //Faktoriyel hesaplama
                   System.out.print("Faktoriyeli hesaplanacak sayı: ");
                   System.out.println("Sonuç= " +faktoriyel(new Scanner(System.in).nextInt()));
               } else if (mathSecim.equals("2")) {
                   //Mutlak değer
                   System.out.print("Mutlak değeri hesaplanacak sayı: ");
                   int sayi=new Scanner(System.in).nextInt();
                   //System.out.printf("Sonuç=%d",sayi>=0?sayi:-sayi);
                   //System.out.printf("Sonuç=%5d",Math.abs(sayi));
                   System.out.printf("Sonuç=%5d",mutlakDeger(sayi));//Yukarıdaki 2 açıklama satırındaki şeyle aynı
                   // şeydir.İstediğimiz şekilde yazabiliriz.
                   System.out.println();

               }else if (mathSecim.equals("Q")){
                   System.out.println("Programdan çıkıldı.");
               }else {
                   System.out.println("Yanlış seçim yaptınız.");
               }break;
           case "2":
              String geoSecim=showSubMenuGeoCounting().toUpperCase();
              switch (geoSecim){
                  case "1":
                      //Dikdörtgen
                      System.out.println("Dikdörtgen için: ");
                      System.out.println("Uzun kenar = ");
                      int uKenar=new Scanner(System.in).nextInt();
                      System.out.println("Kısa kenar = ");
                      int kKenar=new Scanner(System.in).nextInt();
                     /* System.out.printf("Alan =%5d\n",kKenar*uKenar);
                      System.out.printf("Alan =%5d\n",2*(kKenar+uKenar));*/
                      int alan=alanHesapla(uKenar,kKenar);
                      System.out.printf("Alan =%5d\n",alan);
                      int cevre=cevreHesapla(uKenar,kKenar);
                      System.out.printf("Çevre=%5d\n",cevre);

                      break;
                  case "2":
                      //Kare
                      System.out.print("Kenar bilgisi giriniz: ");
                      int kenar1=new Scanner(System.in).nextInt();
                      int alan1=alanHesapla(kenar1,kenar1);
                      System.out.printf("Alan=%5d\n",alan1 );
                      int cevre1=cevreHesapla(kenar1,kenar1);
                      System.out.printf("Çevre=%5d\n",cevre1);

                      break;
                  case "3":
                      //Daire
                      System.out.print("Yarıçap bilgisi giriniz: ");
                      int yaricap=new Scanner(System.in).nextInt();
                      System.out.printf("Alan=%5.2f\n",(Math.PI*yaricap*yaricap) );
                      System.out.printf("Çevre=%5.2f\n",(Math.PI*2*yaricap));

                      break;
                  case "Q":
                      System.out.println("Programdan çıkıldı.");
                      break;
                  default:
                      System.out.println("Yanlış seçim yaptınız.");
                      break;
              }
               break;
           case "Q":
               System.out.println("Programdan çıkıldı.");
               break;
           default:
               System.out.println("Yanlış seçim yaptınız.");
               break;
       }

    }

    public static int cevreHesapla(int uK, int kK) {
        return 2*(uK+kK);
    }

    public static String showMainMenu(){
        System.out.println("Ana Menü");
        System.out.println("1. Matematik İşlemleri");
        System.out.println("2. Alan ve Çevre Hesaplamaları");
        System.out.println("Q. Çıkış");
        System.out.print("Seçiminiz: ");
        /*return new Scanner(System.in).nextLine();//String olduğu için nextLıne dememiz gerekir.*/
        Scanner input = new Scanner(System.in);
        String choice=input.nextLine();
        return choice;


    }
    public static String showSubMenuMath(){
        System.out.println("Alt Menü | Matematik İşlemleri");
        System.out.println("1. Faktoriyel Hesaplama");
        System.out.println("2. Mutlak Değer Alma");
        System.out.println("Q. Çıkış");
        System.out.print("Seçiminiz: ");
        /*Scanner input = new Scanner(System.in);//Bu 3 satır aşağıdaki nextLınelı satırla aynı görevi görüyor.
        String choice=input.nextLine();
        return choice;*/
        return new Scanner(System.in).nextLine();
    }
    public static String showSubMenuGeoCounting(){
        System.out.println("Alt Menü | Alan ve Çevre Hesaplama");
        System.out.println("Dikdörtgen");
        System.out.println("Kare");
        System.out.println("Daire");
        System.out.println("Q. Çıkış");
        System.out.print("Seçiminiz: ");
       /* Scanner input = new Scanner(System.in);
        String choice=input.nextLine();
        return choice;*/
        return new Scanner(System.in).nextLine();

    }

    public static int faktoriyel(int deger){

        if (deger<2) return 1;

        int carpim=1;
        for (int i = 2; i <=deger ; i++) {
            carpim*=i; //carpim=carpim*i; ile aynı şey
        }
        return carpim;
    }
    public static int mutlakDeger(int deger){
        return deger>=0?deger:-deger;
        }

}
