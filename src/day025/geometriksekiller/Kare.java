package day025.geometriksekiller;

public class Kare {


    //Access Modifiers:
    // 1. Class:
    //a.public: import edildiği her yerden erişilebilir
    //b.<default>: Sadece tanımlandığı package içindeki sınıflardan erişim sağlanır.

    //2.Member:
    //a.public: Her yerden erişim sağlanır
    //b.private: Sadece tanımlandığı class'ın içinden erişim sağlanır.
    //c.protected:tanımlandığı package ve atası olduğu alt sınıflardan erişim sağlanır.
    //d.<default>: tanımlandığı package içindeki sınıflardan erişim sağlanır.

    //public> protected>default>private


    public int kenar;

    public int alanHesapla(){
        return kenar*kenar;
    }

    public int cevreHesapla(){
        return 4*kenar;
    }

    public void bilgiGoster(){

        System.out.println(alanHesapla());
        System.out.println(cevreHesapla());
    }

}


