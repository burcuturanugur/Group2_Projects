package day020;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Gün isimlerinden ibaret TR-EN sözlük hazırlayınız. Türkçe arama yapılmış ise ingilizcesini, ingilizce
        // arama yapılmış ise Türkçesini ekrana yazdırınız.

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String[] gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
        System.out.print("Gün adı giriniz / Enter the name of day : ");
        String gun=new Scanner(System.in).nextLine();

        for (int i = 0; i < days.length; i++) {
           // System.out.printf("%s---->%s\n",days[i],gunler[i]);

        if (gun.equalsIgnoreCase(days[i])){
            System.out.println(gunler[i]);
            break; //yazmasak da olur ama masrafı/maliyeti azaltmak adına break koyarız.
        }else if (gun.equalsIgnoreCase(gunler[i])){
            System.out.println(days[i]);
            break;
        }
        }
    }


    }

