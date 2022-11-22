package day034.polymorfism;

public class Kare extends Sekil{


    public Kare() {
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    private double kenar;
    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }

    //override ın amacı gövdesiz bir metodu gövdeli hale getirmek
    @Override
    public double cevreHesapla() {
        return 4*kenar;
    }
}
