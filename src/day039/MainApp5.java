package day039;

import java.util.Arrays;

public class MainApp5 {
    public static void main(String[] args) {
        //Split metodu
        String str="Ben bir garip keloğlanım.";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println("Dizinin length'i : "+kelimeler.length);
        System.out.println();
        for (String kelime: kelimeler){
            System.out.println(kelime);
        }


    }
}
