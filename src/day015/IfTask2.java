package day015;

import java.util.Scanner;

public class IfTask2 {
    public static void main(String[] args) {
        //Klavyeden bir sayı okuyun. Bu girilen sayının tek sayı mı yoksa çift sayı mı olduğunu söyleyen bir program
         //yazınız

    /*    Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= input.nextInt();

        if (sayi%2==0){
            System.out.println("Sayı, çift sayıdır. ");
        }else{
            System.out.println("Sayı, tek sayıdır. ");
        }
*/

        //Thernary yöntemiyle çözümü

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= input.nextInt();
        /*String sonuc=false?"Birinci kısım":"İkinci kısım"; //True ise birinci kısım sonucu çıkar/false ise 2. kısım
        System.out.println(sonuc);*/
        String sonuc=sayi%2==0?"Çift sayıdır":"Tek sayıdır";
        System.out.println(sonuc);



    }
}
