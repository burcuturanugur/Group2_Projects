package day034.polymorfism;

public abstract class Sekil {
    //Bir sınıf abstract olabilir. Abstract olunca kendisinden türeyen sınıflara ne yapacağını söyler ama nasıl
    // yapacağını söylemez.
    //abstract sınıflara gövdeli metodlar(private,public, protected) da yazabiliriz.
    // Ama aşağıda yazılan tüm metodlarla ortak bir şekilde çalışacağını  söylemiş olur.

   public abstract double alanHesapla();
    public abstract double cevreHesapla();


}
