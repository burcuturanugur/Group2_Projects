package day013;

public class Tekrar5 {
    public static void main(String[] args) {
        //Şifrelemede xor kullanımı--> Tersine çevirmiş oluyor.

        int data=25;
        int key=11;

        int sifreliData=data^key;
        System.out.println(sifreliData);
        int cozulenData=18^key;
        System.out.println(cozulenData);
        //Simetrik ve asimetrik kripto

    }
}
