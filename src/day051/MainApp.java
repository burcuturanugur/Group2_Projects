package day051;

import java.util.ArrayList;
import java.util.Iterator;

public class MainApp {
    public static void main(String[] args) {
        int[] dizi={1,2,5,7};
        for (var item: dizi){

        }

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);

        for (var item:numbers){
            System.out.println(item);
        }




        Showrooom showrooom=new Showrooom();
       /* System.out.println("Capacity : "+showrooom.capacity());
        System.out.println("Size : "+showrooom.size());*/

        showrooom.add(new Car(1,"Araba 1 "));
        showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 3"));
       /* showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 2"));*/
        System.out.println("Capacity : "+showrooom.capacity());
        System.out.println("Size : "+showrooom.size());
     /*   showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 2"));
        showrooom.add(new Car(2,"Araba 2"));*/

     /*   System.out.println(showrooom.get(0));
        System.out.println(showrooom.get(1));
        System.out.println(showrooom.get(2));
        System.out.println(showrooom.get(10));*/


        /*for (var item:showrooom){
            System.out.println(item);
        }*/

       /* Iterator<Car> iterator= showrooom.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/

        /*showrooom.forEach(item-> System.out.println(item));*/

       // showrooom.forEach(System.out::println);

    }
}
