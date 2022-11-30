package day040;

import java.util.Arrays;

public class Tools {
    public static void main(String[] args) {
        //Task1: Verilen bir karakter dizisini metne döööndüren metodu yazınız.
        //Method: String convertToString(char[] values)


        char[] dizi={'A','L','İ'};
        int[] nums={1,3,5,7};
        System.out.println(dizi);
        System.out.println(nums);
        System.out.println(convertToString(dizi));

        System.out.println(Arrays.toString(dizi));
    }
    private static String convertToString(char[] dizi){
        String str="";
        for (char ch:dizi
             )
        {str+=ch;

        }
        return str;
    }
}
