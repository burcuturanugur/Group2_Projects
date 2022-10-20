package day10;

public class Methods {
    public static void main(String[] args) {
        //Hiçbir metot çağrılmazsa çalışmaz.!!!!
        //Verilen bir sayının karesini hesaplayan Java programı yazınız.

        int sayi=7;
        int kare=sayi*sayi;
        System.out.println("Sayının karesi = " +kare);
        kareAl(9); //main ile kareAl aynı hiyerarşide olduğu için kareAl'ı çağırıp çalıştırabiliyoruz.

    }

    public static void kareAl(int sayi){
        int kare=sayi*sayi;
        System.out.println("Sayının karesi= " +kare );
    }

}
