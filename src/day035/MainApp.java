package day035;

public class MainApp {
    public static void main(String[] args) {
        //interfface

        /*
        1. Javada çoklu kalıtım yoktur. Yani sadece bir sınıftan extend edilebilir.
        2.Bir interface kendisini implemente edecek alt sınıflara ne yapacaklarını söyler ama nasıl yapacaklarına
        karışmaz.
        3.
        */

        Kartal k1=new Kartal();
        Ucucu ucucu1=new Kirlangic();
        Avci avci1=new KopekBaligi();

        Ucucu[] ucanlar=new Ucucu[3];
        ucanlar[0]=new Kirlangic();
        ucanlar[1]=new Kartal();
        ucanlar[2]=new Kirlangic();

        for (Ucucu u:ucanlar) {
            u.uc();
        }
        String[] gunler={"Pzt","Salı","Çar","Per","Cuma","Ctesi","Paz"};
        for (String gun:gunler) {
            System.out.println(gun);

        }



    }
}
