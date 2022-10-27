package day016;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the
        // power of another. (Do not use Java built-in method)

       /* Scanner input=new Scanner(System.in);
        System.out.print("Pozitif sayı giriniz.");
        int sayi=input.nextInt();*/

        int base=5;
        int power=2;
        int r=1;

        for (int i = 1; i<=power; i++) {

            r*=base;
        }
        System.out.println(r);
    }
}
