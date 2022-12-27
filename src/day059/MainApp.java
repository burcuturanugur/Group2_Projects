package day059;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        //Maps,
        //Anahtar=Değer
        //key=value

        //Örnek:
        // il=Ankara
        //Ankara=5M
        //İstanbul=16 M


        /*int[] sayilar=new int[5];
        sayilar[0]=5;
        sayilar[0]=3;
        sayilar[0]=7; //Bura anlamsız bir şey yapmış oluyoruz*/


        Map<Integer,String> aylar=new HashMap<>(); //Sözlük yapısı gibi de düşünebiliriz. mesela red kelimesinin karşılığı olarak kırmızı yazıyordur
        //Aylar hashmapi anahtarlar ve değerlerden oluşuyor.
        aylar.put(1,"Ocak");
        aylar.put(2,"Şubat");
        aylar.put(3,"Mart");
        aylar.put(4,"Nisan");
        aylar.put(5,"Mayıs");
        aylar.put(6,"Haziran");
        aylar.put(7,"Temmuz");
        aylar.put(8,"Ağustos");
        aylar.put(9,"Eylül");
        aylar.put(10,"Ekim");
        aylar.put(11,"Kasım");
        aylar.put(12,"Aralık");

        System.out.println(aylar);


        System.out.println();
        Set<Integer> keys=aylar.keySet();// anahtarları buradan temin ediyoruz.
        //System.out.println(keys); //Bu bir dizi gibi gsterir
        keys.forEach(k-> System.out.println(k)); //Ama bu bir söözlük gib gösterir
        System.out.println();
        Collection<String> values=aylar.values();
        //System.out.println(values); //Bu şekilde de yine string dizisi gibi yazddırır
        values.forEach(System.out::println); //Ama burada karşılıklı yazdırmmış olur. Söözlük gibi
        Set<Map.Entry<Integer,String>> entries=aylar.entrySet(); //Anahtar değer ikiliisi
        System.out.println(entries); //Bu da anahtar -değer şeklinde bir liste oluyor
        //entry: Girdi-ürün bilgisi gibi düşünebiliriz.
        /*entries.forEach(e->{
            System.out.printf("%d--->%s\n",e.getKey(),e.getValue());
        });*/

    }



}
