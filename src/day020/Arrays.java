package day020;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers={2,4,6,8};
        for (int i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //DEĞER DEĞİŞTİRME
        System.out.println();
      /*  int x=4; bu durum aşağıdaki durumla aynı şey
        x=5;*/

        numbers[1]=5;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //Var olan diziye ekleme yapamayız. Ama yapma yöntemleri geliştirebiliriz.Değerler değişebilir ama eleman
        // sayısı değişmez.



    }
}
