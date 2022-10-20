package day012;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //TODO: Aşağıdaki Java programını geliştiriniz.
        //Verilen bir sayının hem 5 ve hem 2'ye tam bölünüp bölünmediğini bulan Java programı yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1-100 arasında bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi%2==0 & sayi%5==0){
            System.out.printf("%d, hem 2'ye hem de 5'e tam bölünür.\n",sayi );
        }else {
            System.out.printf("%d, hem 2'ye hem de 5'e tam bölünmez.\n",sayi );
        }


    }
}
