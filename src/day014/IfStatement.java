package day014;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        //Akış (Flow) kontrol ifadeleri
        /*
        if:
        switch:
        for:
        while:
        */

        /*
            if statement
            1. if (condition/s) statement; Bu şekilde yazıyorsak tek bir statement (tek bir komut) yazabiliriz.
            Genelde tercih edilmez.

            2. if (condition/s) { Burda blokun içerisine hiçbir şey de yazmayabiliriz birden fazla statement da yazabiliriz.
                    statement1;
                    statement2;
                    ..
            }
            3. if(condition/s){ Bu şekilde kullanıp süslü parantezsiz de kullanabiliriz ama hata payımız artar.
                statement1;
             }else{
                statement2;
                ..
             }
             4. if (condition/s){
                statement1;
                ..
             }else if(condition/s) {
                statement2;
                ..
             }
             5. if (condition/s){
                statement1;
                ..
             }else if (condition/s) {
                statement2;
                ..
             }else {
                statement3;
                ..
             }
             6. if (condition/s){
                statement1;
                ..
             }else if (condition/s) {
                statement2;
                ..
             }else if{
                statement3;
                ..
                else if (condition/s) {
                statement4;
                ..
             }else {
                statement_n;
                ..
             7. if (condition/s) { Burda blokun içerisine hiçbir şey de yazmayabiliriz birden fazla statement da yazabiliriz.
                    statement1;
                    statement2;
                    ..
            }

                if (condition/s) { Burda blokun içerisine hiçbir şey de yazmayabiliriz birden fazla statement da yazabiliriz.
                    statement1;
                    statement2;
                    ..
            }

                if (condition/s) { Burda blokun içerisine hiçbir şey de yazmayabiliriz birden fazla statement da yazabiliriz.
                    statement1;
                    statement2;
                    ..
            } Bu şekilde istediğimiz kadar kullanabiliriz

       */

        // x ve y iki adet tamsayı değişkeni tanımlayınız. x'i 0 ile ve y değişkenini 20 ile initializa ediniz.
        // Eğer y'nin değeri 20'ye eşit ise x'i 5 yapınız.
       /* int x=1;
        int y=20;

        if (y==20){
            x=5;
        }
        System.out.println(x);*/


        //TASK 2
      /*  int hours=45;
        double payrate=1.0;

        if (hours>40){
            payrate*= 1.5;
        }
        System.out.println(payrate);*/

//        //TASK3: Eğer max değişkeninin değeri true ise fees değişkeninin değerini 50 yapınız.
//        int fees=50;
//        boolean max=true;
//
//        if (max){
//            fees=50;

        //Max false ise 50 yapalım

  /*  boolean max=false;
    int fees=20;
    if (!max){
        fees=50;
    }*/

    //Task 4

   // Eğer c değişkeni 100 eşit veya 100'den büyük ise (büyük eşittir 100 ise) ve b değişkeni 50'ye eşit ise a değişkeni
   //20 değerini atayınız.

      /*  int a=0;
        int b=50;
        int c=100;

        if (c>=100&b==50){
            a=20;
        }*/

        //Task 5

      /*  int temp=78;
        if (80>=temp & temp>=70) {
            System.out.println("Ideal Temp");
        }*/

      /*  int temp=75;
        if (70<temp&temp<80){
            System.out.println("Ideal temp");
        } //Bu şekilde kullanım da doğru*/

        // userAge diye bir değişken tanımlanacak ve bunu initialize edeceğiz. Seçmenlik yetisi var mı ona bakacağız.
        //18 yaşında ve daha büyük olan kişilere seçmendir diyeceğiz.

      /*  Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int age=input.nextInt();

        if (age>=18){
            System.out.println("Oy kullanabilirsiniz.");
        }else{
            System.out.println("Oy kullanamazsınız");
        }*/

        //TASK 5

       int a=4;
        int b=8;
        int c=1;


    /*    if (a>=b & a>=c){
            System.out.println(a + " is the largest number");
        } else if (b>=a & b>=c) {
            System.out.println(b + " is the largest number");
        }else{
            System.out.println(c+ " is the largest number");
        }*/




    }

        }






