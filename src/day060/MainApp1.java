package day060;

public class MainApp1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"başladı");
        Sayac sayac=new Sayac();
        sayac.setName("Sayaç");
        //sayac.run(); ASLA ÇALIŞTIRMA!!!
        sayac.start(); //Her zaman bununla çalıştır.
        System.out.println(Thread.currentThread().getName()+"bitti");

    }
}
