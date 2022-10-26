package day016;

public class Loops6 {
    public static void main(String[] args) {
        // 1'den 10'a kadar (1 ve 10 dahil) olan sayıların toplamını bulan java programını yazınız.
        int toplam=0;
        int i;
        for ( i = 1; i <=10 ; i++) {
            toplam=toplam+i;
        }
        System.out.println("Toplam= " +toplam); //Döngünün dışına yazılır

    }
}
