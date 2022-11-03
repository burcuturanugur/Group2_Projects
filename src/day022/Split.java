package day022;

public class Split {
    public static void main(String[] args) {
        String cumle= "Video, size görüşünüzü kanıtlamak için güçlü bir yol sunar.";
        String [] kelimeler=null;
        /*for (String kelime:kelimeler){ // : ile for kullanıyorsak buna foreach diyoruz. tanımlanan dizinin tipi neyse
            //o şekilde tanımlıyoruz.
            System.out.println(kelime);
        }
        System.out.println();*/

        //& ve |
        //&& ve || -----> short circuit

        for (int i = 0; kelimeler!=null && i < kelimeler.length; i++) { //Buradan gelen kelimeler false gelir ve
            // döngüden çıkar gider böylelikle program kırılmamış olur.
            System.out.println(kelimeler[i]);
        }
        System.out.println();
        int counter=0;
        while (kelimeler!=null &&  counter<kelimeler.length){
            System.out.println(kelimeler[counter++]);

        }
    }
}
