package day10;

public class task2 {
    public static void main(String[] args) {
    //Dikdörtgenin alanını bulan ve alanını geriye döndüren bir metot tasarlayınız. Daha sonra bu metodu main metodu
        // içerisinden çağırarak iki farklı dikdörtgenin alanlarını toplayınız. Metot ismi alanHesapla olacaktır.
        int alan1=alanHesapla(4,5);
        int alan2=alanHesapla(5,6);
        System.out.println(alan1+alan2);
        //System.out.println("İki dikdörtgenin alanları toplamı = " +(alan1+alan2));

    }
    public static int alanHesapla(int kenar1,int kenar2){
       return kenar1*kenar2;
    }


}
