package day059;

import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainApp3 {
    public static void main(String[] args) {
        Map<String,Integer> aylar=new TreeMap<>(Collator.getInstance(new Locale("tr","TR")));
        //Hashmapte hash durumuna göre sort eder burda öyle değil
        aylar.put("Ocak",31);
        aylar.put("Şubat",28);
        aylar.put("Mart",31);
        aylar.put("Nisan",30);
        aylar.put("Mayıs",31);
        aylar.put("Haziran",30);
        aylar.put("Temmuz",31);
        aylar.put("Ağustos",31);
        aylar.put("Eylül",30);
        aylar.put("Ekim",31);
        aylar.put("Kasım",30);
        aylar.put("Aralık",31);

       Set<String> ayAdlari =aylar.keySet();
       ayAdlari.forEach(System.out::println); //Hashmapteki gibi sıralanmaz, alfabetik sıraya göre sıraladı.

        System.out.println();
        Set<Map.Entry<String,Integer>> entries=aylar.entrySet();
        entries.stream()
                .filter(item->item.getValue()==30).toList().forEach(System.out::println);
        //30 günlük ayları yazdırdık.

        //5 harfli olan ayları listele

        System.out.println();
        entries.stream().filter(item->item.getKey().length()==5).toList().forEach(System.out::println);

        //5 harfli ayların günleri toplamı
        System.out.println();
       int sum= entries.stream().filter(item->item.getKey().length()==5).mapToInt(item->item.getValue()).sum();
      // int sum= entries.stream().filter(item->item.getKey().length()==5).mapToInt(Map.Entry::getValue()).sum(); //Bu yöntemle de yapabiliriz

        System.out.println("5 karakterli ayların gün toplamı: "+sum);

    }
}
