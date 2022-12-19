package day053;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainApp3 {
    public static void main(String[] args) {
        //Wrapper classes
        Iterable<String> gunler=new ArrayList<>(List.of("Pzt","Salı","Çarşamba"));//gunlerde add metodu olmadığı için bu şekilde yapıyoruz.
        gunler.forEach(item-> System.out.println(item+""));

        Collection<String> aylar=new ArrayList<>();
        aylar.add("Ocak");
        aylar.add("Şubat");
        System.out.println(aylar);

        List<String> isimler=List.of("Burcu","Arslan","Mert","Taylan");//Bu yapıyı çok göreceğiz.
        isimler.forEach(System.out::println);

        //ArrayList<int> numbers=new ArrayList<int>(); Temel tipler jenerik olarak kullanılamaz.
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(11);
        numbers.add(1,18);

        numbers.addAll(List.of(4,5,8));

       // numbers.remove(3); //Böyle yaptığımızda 3. indexi siler
        numbers.remove((Integer)3);//Bu şekilde istediğimiz sayıyı sileriz.
       // Integer x=new Integer(7); Bu şekilde kullanmıyoruz.
        System.out.println(numbers.get(2));
        Integer x=7; //Bu şekilde assign edebiliriz.
        String str="abcde";
        System.out.println(numbers);

        double toplam=0.0;
        for (var number:numbers){
        toplam+=number;
        }
        System.out.println("Toplam = "+toplam);
        //bu şekilde kullanım sağlayabiliriz.

        String str1="17";
       Integer num= Integer.parseInt(str1);
       int kare=num*num;
        System.out.println(kare);


    }
}
