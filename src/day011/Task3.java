package day011;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // TASK: Klavyeden iki ayrı kareye ait kenar bilgisi girilecektir.Her iki karenin alanını hesaplayan metodu
        // yazınız. Elde edilen sonuçları kıyaslayıp hangi karenin alanının büyük olduğunu belirtiniz.
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci karenin kenarını giriniz:");
        int kenar1=input.nextInt();
        System.out.print("İkinci karenin kenarını giriniz:");
        int kenar2=input.nextInt();
        int alan1 = alanHesapla(kenar1);
        int alan2 = alanHesapla(kenar2);
        if (alan1<alan2){
           System.out.println("İkinci karenin alanı daha büyüktür.");
       }else if (alan1>alan2){
           System.out.println("Birinci karenin alanı daha büyüktür.");
       }else {
           System.out.println("İki karenin alanı eşittir.");
       }


    }
    public static int alanHesapla (int kenar){

        return kenar*kenar;
    }
}
