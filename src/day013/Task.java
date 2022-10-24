package day013;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //Klavyeden userName ve password bilgisi alınacaktır. Eğer her iki veri doğru ise
        // "Yönetim sayfasına hoşgeldiniz" mesajı verilecektir. Eğer parola yanlış ise "Yanlış parola girdiniz.
        // Lütfen tekrar deneyiniz." mesajı verilecektir. Eğer kullanıcı adı yanlış girilmiş ise "Lütfen Sistem
        // yöneticisi ile irtibat kurunuz" mesajı verilecektir.


        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        String userName = input.next();
        System.out.print("Lütfen şifrenizi giriniz: ");
        String password = input.next();


        String userName1="Burcu";
        String password1="abcdef123";
        if ((userName1.equals(userName)) & (password1==password)){
            System.out.println("Yönetim sayfasına hoşgeldiniz.");
        }else if (!(password1.equals(password))) {
            System.out.println("Yanlış parola girdiniz.Lütfen tekrar deneyiniz.");
        }else{
            System.out.println("Lütfen sistem yöneticisi ile irtibat kurunuz.");
        }

        }


    }






