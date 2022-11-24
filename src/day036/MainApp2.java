package day036;

public class MainApp2 {
    public static void main(String[] args) {

        //String Pool

        String str1="Python";
        String str2="Data Science";
        String str3="Python";

        String str4=new String("Java");
        String str5=new String("C++");
        String str6=new String("Data Science");
        String str7=new String("Data Science").intern();
        //interni görünce havuzu kontrol etti ve metnin aynısından var ise yeni bir nesne oluşturmadan mevcut nesneye
        // adresi assign eder.
        String str8=new String("Python");

        if (str1==str2){
            System.out.println("str1 ve str2 aynıdır.");
        }else {
            System.out.println("str1 ve str2 farklıdır.");
        }

        if (str1==str3){
            System.out.println("str1 ve str3 aynıdır.");
        }else {
            System.out.println("str1 ve str3 farklıdır.");
        }

        if (str1==str8){
            System.out.println("str1 ve str8 aynıdır.");
        }else {
            System.out.println("str1 ve str8 farklıdır.");
        }//Burada nesne olarak aynılığından ve farklılığından bahsediyor.

        if (str1.equals(str8)){
            System.out.println("str1 ve str8 içerik olarak aynıdır.");
        }else {
            System.out.println("str1 ve str8 içerik olarak farklıdır.");
        }

        if (str2==str6){
            System.out.println("str2 ve str6 aynıdır.");
        }else {
            System.out.println("str2 ve str6 farklıdır.");
        }//farklıdır diye sonuçlanır çünkü biri havuzda biri heapte.Havuzdaki de heaptedir ama tırnak işareti
        // kullanıldığında farklı oluyor

        if (str2==str7){
            System.out.println("str2 ve str7 aynıdır.");
        }else {
            System.out.println("str2 ve str7 farklıdır.");
        }//aynıdır çünkü intern kullandık.








    }
}
