package day053;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {
    public static void main(String[] args) {
         /*   Task 1:
            1. 1-10 arası sayıları tutan numbers isimli bir ArrayList oluşturunuz.

            2. Tek sayıları oddNumbers isimli ArrayList'e çift sayıları evenNumbers isimli
    başka bir ArrayList'e yerleştiren Java kodunu yazınız.

            3. Üç ArrayList'i de farklı yöntemlerle ekrana yazdırınız.
    numbers : foreach
    oddNumbers: while
    evenNumbers: sout

4. numbers'tan tek sayıları silen kodu yazınız.*/

        //ArrayList<Integer> numbers=new ArrayList<>();
        List<Integer> numbers=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<Integer> oddNumbers=new ArrayList<>();
        List<Integer> evenNumbers=new ArrayList<>();

        for (var number: numbers){
            if (number%2==0){
                evenNumbers.add(number);
            }else {
                oddNumbers.add(number);
            }
        }

        numbers.forEach(System.out::print);
        System.out.println();
        Iterator<Integer> iterator=oddNumbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(evenNumbers);



    }

}
