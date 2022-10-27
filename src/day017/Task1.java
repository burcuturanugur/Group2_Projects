package day017;

public class Task1 {
    public static void main(String[] args) {
//Birden yüze kadar hem tek hem çift sayıların toplamını bulunuz.
        int tekToplam=0;
        int ciftToplam=0;
        for (int i = 1; i <100 ; i++) {
            if (i%2==0){
                ciftToplam+=i;
            }else {
                tekToplam+=i;//tekToplam=tekToplam+i diyebiliriz.
            }
        }
        System.out.println("Tek sayılar toplamı: " +tekToplam);
        System.out.println("Çift sayılar toplamı: " +ciftToplam);
    }
}
