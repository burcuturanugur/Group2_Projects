package day036;

public class MainApp4 {
    public static void main(String[] args) {
        int x=9;
        System.out.println("x= "+x);
        degistir(x);
        System.out.println("x= " +x);

        Kitap k1=new Kitap("Suç ve ceza");

        System.out.println(k1.getAdi());
        degistir(k1);
        System.out.println(k1.getAdi());
    }

    public static void degistir(Kitap kitap){
        kitap.setAdi("Kaşağı");
    }

    public static void degistir(int x){
        x+=5;
        System.out.println("Metot içi"+x);

    }

}

class Kitap {
    private String adi;


    public Kitap(String adi) {
        this.adi=adi;
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}