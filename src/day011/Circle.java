package day011;

public class Circle {
    public static void main(String[] args) {
        // Yarıçapı verilen bir dairenin alanını ve çevresini hesaplayınız.

        double r1=7.0;
        System.out.printf("Alan= %5.2f\n" ,alanHesapla(r1));
        System.out.printf("Çevre= %5.2f\n" ,cevreHesapla(r1));
        //alanHesapla-cevreHesapla öncesine virgül koyup tırnak içine %5.2f\n yazarak çıkacak sonucun virgülden sonraki
        // sadece iki basamağını göstermesini sağlamış oluyoruz.

    }
    public static double alanHesapla(double yariCap){
        return Math.PI*Math.pow(yariCap,2);

    }
    public static double cevreHesapla(double yariCap){
        return 2*Math.PI*yariCap;
    }
}
