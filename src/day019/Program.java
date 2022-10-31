package day019;

public class Program {
    public static void main(String[] args) {

/*        int[] sayilar=new int [5];
        sayilar=new int[3]; //Bu şekilde kullanabiliriz.
        // sayilar={1,4,7,9}; böyle alt satırda initialize edemeyiz. ilk satırda tanımlamalıyız.*/


        int[] sayilar={1,3,5,9,11};
      /*  System.out.println(sayilar[0]); //ilk elemanın index numarası 0'dır. O nedenle birinci eleman için sıfır yazarız.
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        System.out.println(sayilar[3]); //3. index olmadığı için hata alırız. */

       /* int toplam=sayilar[0]+sayilar[1]+sayilar[2];
        System.out.println("Toplam = " +toplam);*/

        /*for (int i = 0; i < 3; i++) {
            System.out.print(sayilar[i]+ " ");
        }*/
        for (int i = 0; i < sayilar.length; i++) { //eleman sayısı kaçsa onu verir.
        System.out.print(sayilar[i]+" ");
        }

        System.out.println();

        for (int i = sayilar.length-1; i >=0 ; i--) { //0. index de olduğu için büyük eşit 0 yazarız.
            System.out.print(sayilar[i]+" ");

        }


    }
}
