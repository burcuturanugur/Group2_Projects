package day016;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Write a program to find the factorial value of any number entered through the keyboard.
        Scanner input=new Scanner(System.in);
        System.out.print("Pozitif sayı giriniz: ");
        int sayi=input.nextInt();

        int fact=1;
        for (int i = 1; i <=sayi ; i++) {
          fact*=i;

        }
        System.out.println(fact);

    }
}
