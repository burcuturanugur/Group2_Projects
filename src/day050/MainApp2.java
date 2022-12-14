package day050;

import java.util.ArrayList;

public class MainApp2 {
    public static void main(String[] args) {
        ArrayList<String> liste=new ArrayList<>();
        //Burda add sadece string alıyor geriye string döndürüyor.Yani jenerik tip olarak ne yazarsak o tip olarak
        // hareket ediyor sadece
      //  liste.add(5); //Kabul edilmez çünkü sadece string olarak tanımladık.
        liste.add("Ayşe");
        liste.add("Şule");
        liste.add("Betül");




        System.out.println(liste.get(0).toUpperCase());//Burada direkt uppercase yapabiliriz string old. için

    //Bir sınıf jenerik tip olarak tanımlanıyorsa artık geriye tüm metotlarda o tip olarak döner.
    }
}
