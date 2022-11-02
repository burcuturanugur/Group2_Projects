package day021;

public class Task1 {
    public static void main(String[] args) {

        //Farklı yöntemler

       /* for (int i = 0; i <=7 ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*" );



            }
            System.out.println("");*/

            final int numberOfStars=7;
    /*        for (int i = 0; i < numberOfStars; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("* ");

                }
                System.out.println();

            }*/

        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                if (j>i) {
                    continue;
                }
                System.out.print(" * ");
            }
            System.out.println(); //maliyeti : O(n*n)
        }


        }
    }
/*}*/
