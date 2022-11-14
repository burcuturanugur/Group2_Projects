package day024;

public class Kopek {


        //Önlerine public yazarsak istediğimiz package'tan ulaşabiliriz.
        String cinsi;
        int yasi;
        double agirligi;

        void bilgiGoster(){
                System.out.printf(" Cinsi : %s [Yaşı : %d - Ağırlığı : %5.1f Kg.]",cinsi,yasi,agirligi);
        }


}
