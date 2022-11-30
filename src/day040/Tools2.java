package day040;

public class Tools2 {
    public static void main(String[] args) {
     /*   Task 2: Verilen bir tamsayı dizisini (int[]) metne çevirip döndüren metodu yazınız.
        Method: String convertToString(int[] values)*/

        int[] sayilar={1,2,3,4};

        System.out.println(convertToString(sayilar));

    }

    private static String convertToString(int[] sayilar) {
       /* String str="";
        for (int in:sayilar
             ) {str+=in;

        }
        return str;*/
        String str="";
        for (int i = 0; i < sayilar.length; i++) {
            str+=sayilar[i];
            
        }
        return str;
    }

}
