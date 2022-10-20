package day10;

public class Methods2 {
    public static void main(String[] args) {
        //Hiçbir metodun içinde metot yazmıyoruz. İstisnai durumlar hariç.Metotları sınıfların içinde yazıyoruz.
        cevreHesapla(7);
        cevreHesapla(8);
        cevreHesapla(9);
        cevreHesapla(3);
        cevreHesapla(5);
        cevreHesapla(1);

    }
    //Parametreler tanımlanırken aralarına ; koyulmaz virgül koyulur.(int kenar1,int kenar2) gibi.Bir metodun
    // parametresi o metodun lokal değişkenleri gibidir.
    public static void cevreHesapla(int kenar){
        int cevre=4*kenar;
        System.out.println("Çevre = " +cevre);


    }

}
