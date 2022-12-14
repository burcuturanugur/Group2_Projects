package day050;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp3 {
    public static void main(String[] args) {
        Kitap k1 = new Kitap(1, "Kitap 1");
        //System.out.println(k1);
        ArrayList<Kitap> kitapListesi = new ArrayList<>();
        //System.out.println(kitapListesi.size());
        kitapListesi.add(new Kitap(5, "Kitap 5"));
        kitapListesi.add(k1);//Burdaki k1 referanstır
        //Kaç tnae new operatöörüyle oluşturulmuşsa o kadar nesne vardır. Yani 2 tane.


        k1 = null;

       /* for(var k:kitapListesi){
            System.out.println(k); //for each de arka planda ıteratoru kullanır. view--> show bytecode ile görüntüleyebiliriz.
        }
*/


        //var k=new Kitap(3,"Kitap 3"); //Var variablenin varı demek

        kitapListesi.forEach(item-> System.out.println(item)); //item yerine k da diyebiliriz.
        //Bütün nesneler üzerinde gezinir. Bu sefer bytecodda ıterator görmeyiz, functional programming denir.


/*
        Iterator<Kitap> iterator = kitapListesi.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        } //Bu işlemle for döngüsünün yaptığı işi yapmış olduk.*/

/*
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i));

        }*/
    }
}
