package day011;

import java.util.Scanner;

public class RelationalTask {
    public static void main(String[] args) {
        //Klavyeden yaşını öğrendiğiniz bir kişiye yetişkin olup olmadığını söyleyen Java programını yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınız: ");
        int yas = input.nextInt();
        if (yas>=18){
            System.out.println("Siz yetişkinsiniz.");
        }else {
            System.out.println("Siz yetişkin değilsiniz.");

        }


    }

}
