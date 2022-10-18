package day010;

public class Methods3 {
    public static void main(String[] args) {
        int c1=cevreHesapla(3);
        int c2=cevreHesapla(8);
        int cevrelerToplami=c1+c2;
        int cevrelerFarki=c2-c1;
        System.out.println(cevrelerToplami);
        System.out.println(cevrelerFarki);
       /* int cevrelerToplami=cevreHesapla(3)+cevreHesapla(8);
        System.out.println(cevrelerToplami);*/


    }
    //Eğer bir metodun çağrıldığı yere bir değer döndürmesini istiyorsak buraya bir tip yazarız. Ama iş yapıp
    // bıraksın değer döndürmesini istemezsek void yazarız.
    public static int cevreHesapla(int kenar){
       //  int c=4*kenar; yerine
        return 4*kenar;


    }


}
