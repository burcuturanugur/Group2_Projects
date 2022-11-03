package day022;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
      /*  System.out.println("Cümle : ");
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            System.out.println(input.next());
        }
        */
        String cumle="V i d e o, size görüşünüzü kanıtlamak için güçlü bir yol sunar.";

        Scanner input=new Scanner(cumle);
        while (input.hasNext()){
            System.out.println(input.next());
        }
    }
}
