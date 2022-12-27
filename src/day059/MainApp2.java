package day059;

import java.util.Map;
import java.util.TreeMap;

public class MainApp2 {
    public static void main(String[] args) {
        Map<String,String> personel=new TreeMap<>();
        //Anahtar(burcu) uniq - benzersiz olmalı. Değerler aynı olabilir.
        personel.put("Burcu","Pazarlama");
        personel.put("Arslan","Pazarlama");
        personel.put("Mert","Pazarlama");
        personel.put("Uğur","Pazarlama");
        personel.put("Mehmet","Pazarlama");
        personel.put("Turan","Satış");
                //Anahtar da eğer de string oluyor, her şey olabilir burada
        personel.put("Burcu","Satış"); //Bunu yazdırır çünkü yukarıdakini düzeltmişiz gibi oluyor. Yeni bir tane daha eklemez.
        System.out.println(personel); //Bu bir sözlük gibidir
        System.out.println(personel.entrySet());//Bu bir liste şeklinde olur
    }
}
