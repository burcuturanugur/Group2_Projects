package day031.kutular;

import day031.Kitap;

public class MainApp {
    public static void main(String[] args) {

        kutu kutu1=new kutu();
        kutu1.setGenislik(5);
        int hacim = kutu1.getHacim();
        System.out.println(kutu1);
        System.out.println("Hacim= " +hacim);


        kutu kutu2=new kutu(-5,3,4);
        System.out.println(kutu2);

        RenkliKutu rk1=new RenkliKutu();
        rk1.setGenislik(10);
        rk1.setRenk("Kırmızı");
        System.out.println(rk1);

        System.out.println("Renkli kutunun hacmi= " +rk1.getHacim());
    }

}
