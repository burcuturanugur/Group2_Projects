package day055.Kafeterya;

import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {
    Stok stok1=new Stok();
    stok1.addAll(Urun.stokHazirla());
    stok1.listele();
        System.out.println();
        stok1.isimSiraliListele();
        stok1.fiyataGoreListele();
        stok1.fiyataGoreTersSiraliListele();
        stok1.fiyataGoreTersveMiktaraGoreTersSiraliListele();
        System.out.println(stok1.head(3));
        List<Urun> head= stok1.head();
        System.out.println();

        List<Urun> tail2= stok1.tail(-2);
        System.out.println(tail2);
    }
}
