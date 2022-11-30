package day039;

public class MainApp6 {
    public static void main(String[] args) {
        //TASK:
        //1. Verilen bir metindeki kelime adedini döndüren metodu yazınız.Metodun ismi countWords
        //2. Örnek bir metnin kelimelerini saydırıp ekrana yazdırınız.

        String str= "Ben bugün hiç bu problemi çözebilirmişim gibi uyanmadım";
        System.out.println(countWords(str));
    }

    public static int countWords(String cumle){

        return cumle.split(" ").length;

    }




    }

