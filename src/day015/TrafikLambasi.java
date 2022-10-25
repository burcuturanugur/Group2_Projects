package day015;

import java.util.Locale;
import java.util.Scanner;

public class TrafikLambasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Renk seçiniz [K,S,Y] :  ");
        String renk=input.next();
        renk=renk.toLowerCase(); //Küçük harfe çevirmek için bu şekilde yapıyoruz.


        switch (renk){

            case "k":
                System.out.println("Kırmızı");
                break;
            case "s":
                System.out.println("Sarı");
                break;
            case "y":
                System.out.println("Yeşil");
                break;

        }


    }
}
