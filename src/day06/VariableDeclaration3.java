package day06;

import jdk.swing.interop.SwingInterOpUtils;

public class VariableDeclaration3 {
    public static void main(String[] args) {
        /*Veri Tipleri (Data Types):
            1. İlkel Tipler - Primitive Types
            2. Referans Tipler - Reference Types
        */

        //Tamsayı Veri Tipleri
       // int sayiMax=2_147_483_647;
       // int sayiMin=-2_147_483_648;
        /*int sayiMax=Integer.MAX_VALUE;
        int sayiMin=Integer.MIN_VALUE;
        System.out.println(sayiMax);
        System.out.println(sayiMin);*/


        //byte,short,long
        Byte sayiMax1=Byte.MAX_VALUE;
        Byte sayiMin1=Byte.MIN_VALUE;
        System.out.println(sayiMax1);
        System.out.println(sayiMin1);
        System.out.println();
        short sayiMax2=Short.MAX_VALUE;
        short sayiMin2=Short.MIN_VALUE;
        System.out.println(sayiMax2);
        System.out.println(sayiMin2);
        System.out.println();
        Long sayiMax3=Long.MAX_VALUE;
        Long sayiMin3=Long.MIN_VALUE;
        System.out.println(sayiMax3);
        System.out.println(sayiMin3);
        System.out.println();




    }

}
