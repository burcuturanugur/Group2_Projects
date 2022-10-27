package day017;

public class ForLoop1 {
    public static void main(String[] args) {

        int enterSayaci=0;
        for (int i = 5; i < 140; i+=2) {
            System.out.print(i+"\t");
            if (++enterSayaci%10==0){
                System.out.println();
            }//Sonucu düzgün bir şekilde yazdırmak için enterSayaci giriyoruz.

        }

    }
}
