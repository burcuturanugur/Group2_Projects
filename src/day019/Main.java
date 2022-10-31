package day019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Arrays and Strings

        //Tüm arrayler, stack'te tanımlanır, heap'te tutulur.Heap'teki değere nesne denir.Temel tipler stack'te
        // tanımlanıp stack'te tutulur. Referans tipler stack'te tanımlanıp heap'te oluşturulur.

        //int [] sayilar; bu şekilde yazılır.
        //ya da int numbers[]; ya da bu şekilde de yazılabilir ama pek kullanılmaz.

        int x=9;
        int [] sayilar={1,3,5,7,9}; //sayılar değişkeninin tipi int array olmuş oluyor.İlkel bir tip değil. Yani object
        Scanner input=new Scanner(System.in);
        double [] notlar;//double bir array. 100 elemanlı bir double dizisi oluşturmuş oluyoruz.
        double[] fizikNotlari=new double[100];
        System.out.println("" +x);
        System.out.println(""+sayilar);

        //Bütün nesneler oluşturulurken o nesnelere ait (temel tiplerdeyse) varsayılan değerleriyle initialize edilir.
        //Double'ın varsayılar değeri: 0.0'dır.
        //Varsayılan değerler:
        /*
        byte:0
        short:0
        int: 0
        long:0

        float: 0.0F
        double: 0.0
        boolean: false
        char: \u0000

        String: null
        Object: null
        Arrays: null
        //Yani referans tipler initialize edilmediği takdirde null olur.
        */



    }
}
