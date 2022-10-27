package day017;

public class Task2 {
    public static void main(String[] args) {

       /* for (int i = 1; i <= 10; i++) {
            int sayi=i*i;
            System.out.println(i+ "--->" + sayi );
        }*/

        //2. yöntem

        System.out.println("Number\tSquared");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d\t\t%5d" ,i,i*i );
            System.out.println();
        }

    }
}
