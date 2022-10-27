package day016;

public class Task {
    public static void main(String[] args) {


        //Task 1:0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)
        for (int i = 0; i <= 20; i=i+2) {
            System.out.print(i+  "  ");
        }
        //Task 2:0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazınız.
        int toplam=0;
        for (int i = 1; i < 20; i=i+2) {
            toplam=toplam+i;
        }
        System.out.println();
        System.out.print("Tek sayıların toplamı: " +toplam);
        //Task 3:0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran
        // Java programını yazınız.(Sıfır ve yüz dahil)
        System.out.println();
        for (int i = 0; i <= 100; i=i+10) {
            System.out.print(i+" ");
        }



    }
}
