package day021;

public class NestedFor {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) { //Tam 100 kez çalışır
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j);
                System.out.print("\t");
            }
            System.out.println();

        }

    }
}
