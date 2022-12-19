package day053;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp2 {
    public static void main(String[] args) {
        List<String> aylar=new ArrayList<>(Arrays.asList("Ocak","Şubat","Mart"));
        List<String> gunler=List.of("Pazartesi","Salı","Çarşamba"); //Immutable
       // gunler.add("Perşembe"); //gunler immutuable old. için bu şekilde ekleyemedik
        aylar.add("Nisan");

        ArrayList<String> liste=new ArrayList<>(gunler);
        liste.add("Perşembe");
        System.out.println(liste);
       // liste.add("Perşembe");
        System.out.println();
        System.out.println(aylar);
    }
}
