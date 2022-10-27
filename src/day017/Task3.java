package day017;

public class Task3 {
    public static void main(String[] args) {
//60 ile başlayarak 130 km'ye kadar listeleyeceğiz.Km-mil kıyaslaması yapacağız.

        System.out.println("  KPH\t\t MPH");
        for (int i = 60; i <= 130; i=i+10) {
            double MPH = i* 0.6214;
            System.out.printf("%5d\t\t%5.1f", i, MPH);
            System.out.println("");

        }
    }
}
