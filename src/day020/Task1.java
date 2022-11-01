package day020;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Ay isimlerini tutan String bir dizi oluşturunuz. Kullanıcı, 4. ay'ı istediğinde;
        //Seçilen ay : Nisan şeklinde çıktı alınmalıdır.

        String[] months={"january", "February", "March","April", "May","June", "July","August","September","October",
                "November","December"};
        System.out.print("Which month did you choose? [1-12]: ");
        Scanner input=new Scanner(System.in);
        int choose=input.nextInt();
        if (choose>0&choose<=12){
            System.out.printf("Your choose is %s",months[choose-1]);
        }else {
            System.out.println("You made the wrong choice");
        }
        }




      /*      String[] months=new String[12];
    months[0]="january";
    months[1]="February";
    months[2]="March";
    months[3]="April";
    months[4]="May";
    months[5]="June";
    months[6]="July";
    months[7]="August";
    months[8]="September";
    months[9]="October";
    months[10]="November";
    months[11]="December";*/

     /*   String[] months;
        months=new String[]{"january", "February", "March","April", "May","June", "July","August","September","October"
                ,"November","December"};*/

    }


